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

