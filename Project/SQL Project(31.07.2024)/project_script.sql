use Sports_yuva

--"profile" table creation

create table profile(CUSTOMER_ID varchar(26) PRIMARY KEY,
CUSTOMER_NAME varchar(26),
DOB date,
EMAIL_ID varchar(26), 
CONTACT_NUMBER bigint);


insert into profile values('customer1','Yuvaraj','2002-04-03','yuva@gmail.com',1234567809);
insert into profile values('customer2','Tapan','2002-02-27','asraf@gmail.com',9087654321);
insert into profile values('customer3','Swathi','2002-11-04','swathi@gmail.com',1122334455);
insert into profile values('customer4','Sanjeev','2001-06-23','sanjeev@gmail.com',6677880099);
insert into profile values('customer5','Keerthana','2003-08-12','keerthana@gmail.com',1112223334);
insert into profile values('customer6','Broose','2002-05-29','broose@gmail.com',9878765412);





select * from profile;





--"account" table creation

create table account(CUSTOMER_ID VARCHAR(26),
CUSTOMER_NAME varchar(26),
ACCOUNT_NUMBER BIGINT PRIMARY KEY,
BANK_NAME VARCHAR(26),
ACCOUNT_TYPE VARCHAR(26),
BALANCE DECIMAL,
BRANCH VARCHAR(25),
IFSC_CODE VARCHAR(26),FOREIGN KEY(CUSTOMER_ID)REFERENCES profile(CUSTOMER_ID));


insert into account values('customer1','Yuvaraj',1111111,'HDFC','Savings',5000,'Kumbakonam','HDFC111');
insert into account values('customer2','Tapan',2222222,'IOB','Current',6000,'Tidel','IOB222');
insert into account values('customer3','Swathi',3333333,'Indian','Savings',7000,'Thanjavur','INDIAN333');
insert into account values('customer4','Sanjeev',4444444,'CUB','Current',8000,'Kadapa','CUB444');
insert into account values('customer5','Keerthana',5555555,'SBI','Savings',9000,'Coimbatore','SBI555');





select * from account;






--"transactions" table creation

create table transactions(TRANSACTION_ID varchar(26) PRIMARY KEY,
CUSTOMER_ID varchar(26),
ACCOUNT_NUMBER bigint,
SENDER_CUSTOMER_ID varchar(26),
SENDER_ACCOUNT_NUMBER bigint,
AMOUNT decimal,
TRANSACTION_DATE date,
STATUS varchar(27),
FOREIGN KEY(CUSTOMER_ID) references profile(CUSTOMER_ID));


insert into transactions values('trans1','customer1',1111111,'customer3',3333333,4000,'2024-07-23','Success');
insert into transactions values('trans2','customer2',2222222,'customer4',4444444,3000,'2024-07-22','Failed');
insert into transactions values('trans3','customer3',3333333,'customer5',5555555,1000,'2024-07-20','Failed');
insert into transactions values('trans4','customer4',4444444,'customer1',1111111,2000,'2024-07-21','Success');
insert into transactions values('trans5','customer5',5555555,'customer2',2222222,3000,'2024-07-26','Success');





select * from transactions;







--"checkbookrequest" table creation

create table checkbookrequest(REQUEST_ID varchar(26) PRIMARY KEY,
CUSTOMER_ID varchar(26),
CUSTOMER_NAME varchar(26),
ACCOUNT_NUMBER bigint,
REQUEST_DATE date, FOREIGN KEY(CUSTOMER_ID) REFERENCES profile(CUSTOMER_ID));


insert into checkbookrequest values('req1','customer1','Yuvaraj',1111111,'2024-07-23');
insert into checkbookrequest values('req2','customer2','Tapan',2222222,'2024-07-23');
insert into checkbookrequest values('req3','customer3','Swathi',3333333,'2024-07-23');
insert into checkbookrequest values('req4','customer4','Sanjeev',4444444,'2024-07-23');
insert into checkbookrequest values('req5','customer5','Keerthana',5555555,'2024-07-23');





select * from checkbookrequest;







--1.Retrieve All Records from a Table

select * from profile;
select * from account;
select * from transaction;
select * from checkbookrequest;







--2.Filter Records Based on a Condition

--Retrieve the customerid,customername,accountno,balance from account table and balance is above 6000?

select CUSTOMER_ID,CUSTOMER_NAME,ACCOUNT_NUMBER,BALANCE from account where BALANCE>6000;





--Retrieve the transactionid,customerid,accountno,amount from transaction table and transaction date is above 2024-07-23?

select TRANSACTION_ID,CUSTOMER_ID,ACCOUNT_NUMBER,AMOUNT from transactions where TRANSACTION_DATE>'2024-07-23';






--retrieve the customer details the customer name starts with 'S'

select * from profile where CUSTOMER_NAME like 'S%';







--retrieve the details balance range is 7000 to 10000

select * from account where BALANCE between 7000 and 10000;







--AND,OR operator

select * from account where (CUSTOMER_ID='customer1' and CUSTOMER_NAME='Yuvaraj') or (ACCOUNT_NUMBER=1111111);








--NOT IN operator

select * from account where BRANCH NOT IN('Kumbakonam','Tidel');







--3.Join Two Tables

--retrieve the customer details who have the account

select p.CUSTOMER_ID,p.CUSTOMER_NAME,a.ACCOUNT_NUMBER from profile p INNER JOIN account a
on p.CUSTOMER_ID=a.CUSTOMER_ID;








--left join

select p.CUSTOMER_ID,p.CUSTOMER_NAME,a.ACCOUNT_NUMBER from profile p LEFT JOIN account a
on p.CUSTOMER_ID=a.CUSTOMER_ID;








--right join

select p.CUSTOMER_ID,p.CUSTOMER_NAME,a.ACCOUNT_NUMBER from profile p RIGHT JOIN account a
on p.CUSTOMER_ID=a.CUSTOMER_ID;








--4.Aggregate Data Using Group By

--count of savings and current account customer using group by

select ACCOUNT_TYPE,count(CUSTOMER_ID)as Customer_Count from account 
group by ACCOUNT_TYPE;








--account type wise maximum balance in account table 

select ACCOUNT_TYPE,max(BALANCE)as MAXIMUM from account
group by ACCOUNT_TYPE;






--account type wise minimum balance in account table 

select ACCOUNT_TYPE,min(BALANCE)as MINIMUM from account
group by ACCOUNT_TYPE;









--5.Filter Groups Using HAVING

--which account type having maximum customer 
select ACCOUNT_TYPE,count(CUSTOMER_ID)as Customer_Count from account 
group by ACCOUNT_TYPE
having count(CUSTOMER_ID)>2;


use Sports_yuva




--6.Order Results Using ORDER BY

--customer details in descending order
select * from profile order by CUSTOMER_NAME desc;






--7.Retrieve Data with a Subquery

--find who are having account using subquery

select CUSTOMER_ID,CUSTOMER_NAME from profile where
     CUSTOMER_ID in (select CUSTOMER_ID from account); 







--find customer details having maximum balance

select CUSTOMER_ID,CUSTOMER_NAME,ACCOUNT_NUMBER from account where BALANCE=(select max(BALANCE) from account);








--8.Use CASE Statements

select CUSTOMER_ID,CUSTOMER_NAME,
case when ACCOUNT_TYPE='Savings' then concat('In your Savings Account balance is :',BALANCE)
when ACCOUNT_TYPE='Current' then concat('In your Current Account balance is :',BALANCE)
end as Balance
from account;


