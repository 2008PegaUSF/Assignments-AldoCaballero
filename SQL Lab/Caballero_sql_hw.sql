-- sql Lab
-- Aldo Caballero


-- 1 SQL Queries

-- 1.1
	-- Part 1 Select the employeeId, last name, and email for records in the Employee table where last name is King
select "EmployeeId", "LastName" , "Email" from "Employee" e where "LastName"='King'; 
	-- Part 2 Select the city and state for the records in the Employee table where first name is Andrew and REPORTSTO is null
select "City", "State" from "Employee" e where "FirstName"='Andrew' and "ReportsTo" is null;

-- 1.2 Select all records from the Album table where the composer is AC/DC
select "Title" from "Album" a where "ArtistId"=1;

-- 1.3 
	-- Part 1 Select all albums in Album table and sort result set in descending order by title.
select * from "Album" a order by "Title" desc;
	-- Part 2 Select first name from Customer and sort result set in ascending order by city
select "FirstName" from "Customer" c order by "City" asc; 

-- 1.6 Select all invoices with a billing address like “T%” .
select * from "Invoice" i2 where "BillingAddress" like 'T%';

-- 1.7 
	-- Part 1 Select all invoices that have a total between 15 and 50.
select * from "Invoice" i where "Total" between 15 and 50;
	-- Part 2 Select all employees hired between 1st of June 2003 and 1st of March 2004.
select * from "Employee" e where "HireDate" between '2003-06-01' and '2004-03-01';

-- 2 DML Statements

-- 2.1 
	-- Part 1 Insert two complete new records into Genre table
insert into "Genre" values(26,'Alternative Pop');
insert into "Genre" values(27,'New Genre');
	-- Part 2  Insert two complete new records into Employee table
insert into "Employee" values(9,'LastName','FirstName','Title',3,'2003-04-30','2020-06-03','Address','City','CA','USA','92174','5093674454','5093674454','email@email.com' );
insert into "Employee" values(10,'Last','First','NewTitle',5,'2003-04-30','2020-06-03','Addresss','Ciity','CA','USA','92174','5093674454','5093674454','email@email.com' );
	-- Part 3  Insert two complete new records into Customer table
insert into "Customer" values(60,'ViewName','LastView','CompanyName','Addresss','CIty','CA','USA','91745','3058038456','2305966445','email.email@email.com',4);
insert into "Customer" values(61,'ViewName2','LastView2','CompanyName','Addresss2','CIty2','CA','USA','91245','3058038456','2305966445','email.email@email.com',1);

-- 2.2
	-- Part 1 Update Aaron Mitchell in Customer table to Robert Walter.
update "Customer" set "FirstName"='Robert', "LastName"='Walter' where "FirstName"='Aaron';
	-- Part 2 Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”	
update "Artist" set "Name"='CCR' where "Name"='Creedence Clearwater Revival';

-- 2.3  Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them)
ALTER TABLE "Invoice"
   DROP CONSTRAINT "FK_InvoiceCustomerId", ADD  CONSTRAINT "FK_InvoiceCustomerId"
   FOREIGN KEY ("CustomerId") REFERENCES "Customer" ("CustomerId") ON DELETE CASCADE;
ALTER TABLE "InvoiceLine"
   DROP CONSTRAINT "FK_InvoiceLineInvoiceId", ADD  CONSTRAINT "FK_InvoiceLineInvoiceId"
   FOREIGN KEY ("InvoiceId") REFERENCES "Invoice" ("InvoiceId") ON DELETE CASCADE;
delete from "Customer" where "FirstName"='Robert' and "LastName"='Walter';

-- 3 SQL Functions

-- 3.1 
	-- Part 1 Create a query that returns the current time.
select localtime;
	-- Part 2 Create a query that returns the length of name in MEDIATYPE table
		-- I interpreted this as how many names in the Name column for MediaType Table
select length("Name") from "MediaType";
-- 3.2
	-- Part 1 Create a function that returns the average total of all invoices
create or replace function Invoiceaverage()
returns numeric as $$
declare sumInvoice numeric ;
declare counter numeric ;
declare average numeric;
begin
	select count("Total") into counter from "Invoice";
	select sum("Total") into sumInvoice from "Invoice";
	select div(suminvoice,counter) into average;
	return average;
end;
$$ language plpgsql;

select Invoiceaverage();
		-- I created my own function, but here is using the avg() function,
		-- I originally thought we had to make our own functions (User defined) but I realized it was too late
		-- After I had finished creating the function
select avg("Total") from "Invoice";
	-- Part 2 Create a function that returns the most expensive track
drop function expensiveTrack;
create or replace function expensiveTrack()
returns varchar
as $$
declare maxp numeric;
declare maxT varchar;
begin
	select max("UnitPrice") into maxp from "Track";
	select "Name" into maxT from "Track" where "UnitPrice"=maxp;
	return maxT;
end
$$ language plpgsql;

select expensiveTrack();
select max("UnitPrice") from "Track"; -- Found out that the max Unit Price is 1.99 so input it down
select "Name","UnitPrice" from "Track" where "UnitPrice" = '1.99';

-- 3.3 User Defined Functions
	-- Part 1 Create a function that returns the average price of invoiceline items in the invoiceline table.
create or replace function avgPrice()
returns numeric 
as $$
declare averageP numeric;
begin 
	select avg("UnitPrice") into averageP from "InvoiceLine";
	return averageP;
end
$$ language plpgsql;
select avgPrice();
	-- Part 2 Create a function that returns all employees who are born after 1968.
select * from "Employee" where "BirthDate" > '12-31-1968';

-- 4 Triggers

-- 4.1 Insert after Trigger 
	-- Create an after insert trigger on the employee table fired after a new record is inserted into the table to set the phone number to 867-5309.
create or replace function em_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."Phone" = '867-5309';
	end if; 
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
after insert on "Employee"
for each row
execute function em_insert();

insert into "Employee"("EmployeeId", "LastName", "FirstName", "Phone") values(11,'Billy','Bob','000-0000');
insert into "Employee"("EmployeeId", "LastName", "FirstName") values(12,'Bill','Bobby');

-- 4.2 
	-- Create a before trigger on the customer table that fires before a row is inserted from the table to set the company to Revature.
create or replace function cus_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."Company" = 'Revature';
	end if; 
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
before insert on "Customer"
for each row
execute function cus_insert();

insert into "Customer"("CustomerId", "FirstName", "LastName", "Company", "Email" ) values(89, 'Aldo', 'C', 'Compnay', 'a@a');

-- 5 Joins

-- 5.1 Inners 
	-- Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
select "FirstName", "LastName", "InvoiceId" from "Customer" inner join "Invoice" on "Customer"."CustomerId" = "Invoice"."InvoiceId"; 


-- 5.2 Full Outer
	--  Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total
select "Customer"."CustomerId", "FirstName", "LastName", "InvoiceId", "Total" from "Customer" full join "Invoice" on "Customer"."CustomerId" = "Invoice"."InvoiceId";

-- 5.3 Right Join
	-- Create a right join that joins album and artist specifying artist name and title
select "Artist"."Name", "Title" from "Album" right join "Artist" on "Album"."ArtistId" = "Artist"."ArtistId"; 

-- 5.4 Cross Join
	-- Create a cross join that joins album and artist and sorts by artist name in ascending order.
select "Artist"."Name","Album"."Title" from "Artist" cross join "Album" order by "Name" asc; 

-- 5.5 Self Join
	-- Perform a self-join on the employee table, joining on the reportsto column.
select "Employee"."EmployeeId", "Employee"."FirstName"||' '||"Employee"."LastName" as "Supervisor", A."FirstName"||' '||A."LastName" as "Works", A."ReportsTo" from "Employee" inner join "Employee" A on "Employee"."EmployeeId"=A."ReportsTo"; 

-- 6 Set Operations
	-- 6.1 Union
		-- Create a UNION query for finding the unique records of last name, first name, and phone number for all customers and employees.
select "LastName", "FirstName", "Phone" from "Employee" 
union 
select "LastName","FirstName","Phone" from "Customer";
	-- 6.2 Except All
		-- Create an EXCEPT ALL query for finding the all records of the city, state, and postal codes for all customers and all records of employees that have a different  city, state, and postal codes of any customer.
select "City","State","PostalCode" from "Customer"
except all select "City", "State", "PostalCode" from "Employee";