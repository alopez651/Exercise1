drop table if exists table1;
drop table if exists table2;
drop table if exists table3;
drop table if exists table4;
drop table if exists table5;
drop table if exists table6;
drop table if exists table7;
drop table if exists table8;
drop table if exists table9;
drop table if exists table10;

-- 1. Select each nummber as its positive --
create table table1 (id integer, value integer);
insert into table1 values(1, -56);
insert into table1 values(2, 76);
insert into table1 values(3, -84);
insert into table1 values(4, 96);
insert into table1 values(5, -47);

update table1 set value = (value * -1);

-- 2. Slect all the division that have had revenue this year --
create table table2 (id integer, year1 integer, revenue integer);
insert into table2 values(1, 2018, 60);
insert into table2 values(1, 2021, 40);
insert into table2 values(1, 2020, 70);
insert into table2 values(2, 2021, -10);
insert into table2 values(3, 2018, 20);
insert into table2 values(3, 2016, 40);
insert into table2 values(4, 2021, 50);

select * from table2 where year1 = 2021 and revenue > 0; 

-- 3. Find the century for the year --
create table table3(id integer, year3 integer);
insert into table3 values(1, 1777);
insert into table3 values(2, 2001);
insert into table3 values(3, 1643);
insert into table3 values(4, 1865);
insert into table3 values(5, 1969);

--select * from table3 where year3 = ((year3/100) + 1);
select year3 from table3 where year3 = ((year3/100) + 1);

-- 4. Even or Odd --
create table table4(id integer, value2 integer);
insert into table4 values (1, 4);
insert into table4 values (2, 11);
insert into table4 values (3, 57);
insert into table4 values (4, 24);
insert into table4 values (5, 47);

--select value2 % 2 =0 as even, value2 % 2 = 1 as odd from table4;
--select value2 from table4 where value2 % 2 = 0 then 'even';
select case when value2 % 2 = 0 then 'even' when value2 % 2 != 0 then 'odd' end as even_odd from table4;

-- 5. Group by age --
create table table5(id integer, name varchar(10), age integer);
insert into table5 values(1, 'bob', 21);
insert into table5 values(2, 'sam', 19);
insert into table5 values(3, 'jill', 18);
insert into table5 values(4, 'jim', 21);
insert into table5 values(5, 'sally', 19);
insert into table5 values(6, 'jess', 20);
insert into table5 values(7, 'will', 21);

select age, count(*) from table5 group by age order by age asc;
-- create table counts as select count(age), counts from table5 group by age order by count(age) desc;

--select count(age) from table5 group by age order by count (age) desc;
--create table table5(count integer)

-- 6. Return a greeting string --
create table table6(id integer, names varchar(20));
insert into table6 values(1, 'bob');
insert into table6 values(2, 'sam');
insert into table6 values(3, 'jill');
insert into table6 values(4, 'jim');
insert into table6 values(5, 'sally');
insert into table6 values(6, 'jess');
insert into table6 values(7, 'will');

select id, names, concat('Hi', names, '! How are you toay?') as Greeting from table6;

-- 7. Find the best selling products --
create table table7(id integer, name2 varchar(10), "amount" integer);
insert into table7 values(1, 'cup', 11);
insert into table7 values(2, 'saucer', 22);
insert into table7 values(3, 'plate', 46);
insert into table7 values(4, 'fork', 34);
insert into table7 values(5, 'spoon', 45);
insert into table7 values(6, 'knoife', 78);
insert into table7 values(7, 'mug',23);
insert into table7 values(8, 'glass', 64);
insert into table7 values(9, 'tumbler', 24);

select name2, amount from table7 order by amount desc limit 5;


-- 8. Who needs a passport --
create table table8(id integer, name8 varchar(10), country varchar(15));
insert into table8 values (1, "Bob Smith", "United States");
insert into table8 values (2, "Jim Jones", "China");
insert into table8 values (3, "Sam White", "Japan");
insert into table8 values (4, "Jess Black", "Canada");
insert into table8 values (5, "Will Wilson", "Germany");
insert into table8 values (6, "Wilson Scott", "England");
insert into table8 values (7, "Scott Daniels", "France");
insert into table8 values (8, "Daniels Jackson", "Canada");
insert into table8 values (9, "Jack Johnson", "United States");

select name8, country from table8 where country not in ('Canada', 'United States');

-- 9. Just the unique values -- 
create table table9(id integer, name9 varchar(10), age9 integer);
insert into table9 values (1, 'Bob', 21);
insert into table9 values (2, 'Sam', 19);
insert into table9 values (3, 'Jill', 18);
insert into table9 values (4, 'Jim', 21);
insert into table9 values (5, 'sally', 19);
insert into table9 values (6, 'Jess', 20);
insert into table9 values (7, 'Will', 21);
select * from table9;
select distinct age9 from table9 order by age9;

-- 10. Add the ages -- 
create table table10(id integer, name10 varchar(8), age10 integer);
insert into table10 values (1, 'Bob', 21);
insert into table10 values (2, 'Sam', 19);
insert into table10 values (3, 'Jill', 18);
insert into table10 values (4, 'Jim', 21);
insert into table10 values (5, 'sally', 19);
insert into table10 values (6, 'Jess', 20);
insert into table10 values (7, 'Will', 21);
select sum(age10) from table10;


