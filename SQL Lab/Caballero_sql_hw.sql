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
