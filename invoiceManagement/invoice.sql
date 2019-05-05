create user invoice identified by system
/
grant dba to invoice
/
conn invoice/system
/
create table admin
(pwd varchar(30))
/
insert into admin values('mona12345')
/
create table cashlog
(pswd varchar(30))
/
insert into cashlog values('login1234')
/
create table automatic
(p_id number(5),
c_id number(5),
cs_id number(5),
invoice_no number(5))
/
insert into automatic
values(0,0,0,0)
/
create table customer
(c_id varchar(30),
 c_name varchar(30),
 c_email varchar(30),
 c_phone varchar(30),
 c_address varchar(30))
/
create table cashier
(cs_id varchar(30),
 cs_name varchar(30),
 cs_email varchar(30),
 cs_phone varchar(30),
 cs_address varchar(30))
/
create table product
(p_id varchar(30),
 p_name varchar(30),
 p_brand varchar(30),
 p_quantity varchar(30),
 p_weight varchar(30),
 p_price varchar(30),
 p_mfg varchar(30),
 p_exp varchar(30),
 p_discount varchar(30))
/
create table temp
(p_id varchar(30),
 p_quantity varchar(30))
/
create table invoice
(invoice_no varchar(30),
 invoice_date varchar(30),
 c_id varchar(30),
 p_id varchar(1000),
 sub_total varchar(30),
 tax varchar(30),
 total varchar(30))
/
commit
/