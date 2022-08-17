-- Querying Practice --
-- 1. Employees record --
select * from "Employee"; 

-- 2. Employees with the last name King --
select * from "Employee" where "LastName" = 'King';

-- 3. Employees FirstName is Andrew andResportsto is NULL --
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" ISNULL; 

-- 4. Select all albums and sort result set in descending order by title --
select  * from "Album" order by "Title";

-- 5. Select FirstName from Customer and sort result set in ascending order by city --
select "FirstName", "City" from "Customer" order by "City";

-- 6. Select all invoices w/billing address like %T -- 
select * from "Invoice" where "BillingAddress" like 'T%';

-- 7. Select invoices that have total between 15 & 50
select "Total" from "Invoice" where "Total" > 15 and "Total" < 50;

-- 8. Select employees hired between 1st of june 2003 and 1st of march 2004 --
select "HireDate" from "Employee" where "HireDate" > '01-06-2003' and "HireDate" < '01-03-2004';

-- Insert Practice --
-- 1. Insert two records into genre table --
insert into "Genre" values (26, 'Alternative rock');
insert into "Genre" values (27, 'Opera');

-- 2. Insert two records into employee table --
insert into "Employee" values (9, 'Lopez', 'Ana', 'Intern', 2, '05-23-1999', '08-01-2022', '1111 adress', 'Los Angeles', 'CA', 'US', 'THG 109', '11111111','222222', 'EMAIL@GMAIL.COM');
insert into "Employee" values (10, 'Lopez', 'Maria', 'Intern', 2, '05-23-1999', '08-01-2022', '1111 adress', 'Los Angeles', 'CA', 'US', 'THG 109', '11111111','222222', 'EMAIL@GMAIL.COM');

-- 3. Insert two records into Customer table --
insert into "Customer" values (60, 'Lopez', 'Ana', 'revature', '1111 adress','city', 'CA', 'US', 'THG 109', '11111111','222222', 'EMAIL@GMAIL.COM', 5);
insert into "Customer" values (61, 'Lopez', 'Maria', 'revature', '1111 adress','city', 'CA', 'US', 'THG 109', '11111111','222222', 'EMAIL@GMAIL.COM', 7);

-- Update Practice --
-- 1. Update Aaron Mitchell in Customer table to Robert Walter -- 
select * from "Customer" where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';
update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walter';

-- 2. Update name of artist creedence clearwater revial to ccr --
select * from "Artist" where "Name" = 'Creedence Clearwater Revival';
update "Artist" set "Name" = 'CRR';

