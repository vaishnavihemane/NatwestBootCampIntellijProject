create database movies;

use movies;


create table employee
(
id int,
name varchar(10),
dept varchar(30),
salary float,
age int 
); 

desc employee;

insert into employee values(1,'manish','hr',56000.67,24);

select * from employee; 

select id,name,dept,salary,age from employee;

insert into employee(id,name,dept,age) values
(2,'Ram','Manager',29);



insert into employee values
(3,'shyam','devloper',745.5674,34),
(4,'manas','devloper',562.798,83),
(5,'mohan','hr',2345.786,56);


update employee set salary=70000.00 
where id=2;


select id, name, salary as sal, salary+500 from employee;


select * from employee
where salary > 40000 and age < 35;


insert into employee values
(7,"ramesh","tester",25000.0,25);

select * from employee
where dept = 'devloper';

select* from employee 
where dept <> 'devloper';

select * from employee 
where salary between 40000 and 70000;

select * from employee 
order by salary;

select * from employee 
where dept = 'hr'
order by salary desc;  

select id,name,length(name), upper(name),lower(name) from employee;

select sum(salary) from employee;

select * from employee;

update employee set salary = 54000 
where id=5;





select dept,sum(salary),count(id) from employee group by dept;

select dept, sum(salary),count(id) 
from employee
group by dept 
having count(id) >= 2
order by sum(salary);


rename table employee to emp1;

select * from emp1;

rename table emp1 to employee;


alter table employee
add column (designation varchar(30));

select * from employee;

update employee set designation='trainee'
where id >= 1;



alter table employee drop designation;


alter table employee rename column dept to dept1;


alter table employee modify dept1 varchar(50);


insert into emp2 values(2,'saourabh',22);

select * from emp2;

insert into emp2(id,age) values(3,21);


drop table emp2;


create table emp2
(
id int primary key,
name varchar(30) not null,
age int check(age>20),
contactNo varchar(10) unique,
email varchar(40) unique
);

select * from emp2;



select * from emp2;


create table dept
(
id int primary key,
name varchar(30),
manager varchar(30)
);

insert into dept values(2,'operations','ramesh');


select * from dept;







create table employee2
(
id int primary key,
name varchar(30),
salary int,
deptid int,
constraint fk foreign key(deptid) references dept(id)
);


select * from dept;
select * from employee2;


alter table employee2
add designation varchar(30) default 'bench';




 insert into employee2 
 (id,name,salary,deptid) values (104,'raj',87300,2);
 
 
 use movies;
 
 select * from employee;
 
 select salary from employee where name = 'manas';
 
 select * from employee 
 where salary > 
 ( select salary from employee where name = 'manas') AND salary > 50000;
 
 
 select * from employee 
 where salary > all
 (select salary from employee  where dept1 ='hr')
 and dept1<>'hr';
 
 
 select * from employee 
 where salary in
 (select salary from employee  where dept1 ='hr');
 
 select * from employee 
 where salary in(70000,54000,25000);
 
 select * from employee where name like 'r%';
 
 select * from employee where name like '_a%';
 
 select * from employee where name like '%a_';
 
 
 
 create database company;
 use company;
 
 create table bangaloreoffice
 ( 
 id int,
 name varchar(30),
 dept varchar(30)
 );
 
 
 
 create table chennaioffice
 ( 
 id int,
 name varchar(30),
 dept varchar(30)
 );
 
 
 
 insert into bangaloreoffice values(1,'arjun','hr');
 
 insert into bangaloreoffice values(2,'rahul','developer');
 
 update bangaloreoffice set id =4 where name = 'nikita';
 
 insert into bangaloreoffice values(1,'mahesh','developer');
 
 insert into bangaloreoffice values(1,'nikita','hr');
 
 
 
 insert into chennaioffice values(1,'mohit','hr');
 
  insert into chennaioffice values(2,'rahul','developer');
 
 insert into chennaioffice values(3,'suraj','tester');
 
 insert into chennaioffice values(4,'nikita','hr');
 
 select * from bangaloreoffice
 union 
 select * from chennaioffice;
 
 
  select * from bangaloreoffice;
 
 select * from chennaioffice;
 
 
 
 create table dept
 (
  id int primary key,
  name varchar(30),
  manager varchar(30)
  );
  
  
 create table employee
 (
 id int ,
 name varchar(30),
 designation varchar(30),
 deptid int,
 constraint pk2 primary key(id),
 constraint fk2 foreign key (deptid) references dept(id)
 );
 
 
 
 insert into dept values(104,'learning','rk');
 update dept set name = 'technology' where id = 103;
 insert into employee values(1,'sumit','trainee',100);
  insert into employee values(2,'kiran','trainee',101);
   insert into employee values(3,'manoj','trainee',100);
    insert into employee values(4,'raj','engineer',100);
     insert into employee values(5,'rashmi','trainee',102);
    insert into employee values(6,'bob','manager',102);
    
    insert into employee(id,name,designation) values(8,'rajesh','intern');
    
    select* from employee;

    select* from dept;
    
    
    select * from employee e
    inner join 
    dept d
    on e.deptid=d.id;
    
    
    select e.id,e.name,e.deptid, d.name,d.manager
    from employee e
    inner join 
    dept d
    on e.deptid=d.id;
    
    
    
    select * from employee e
    right  join
    dept d 
    on e.deptid = d.id;
    
    select * from employee e
    left outer join
    dept d 
    on e.deptid = d.id
    union 
    select * from employee e
    right outer join
    dept d 
    on e.deptid = d.id;
    
    
     select * from employee e
    left outer join
    dept d 
    on e.deptid = d.id
    order by d.manager;
    
    
    
    
    select current_date();
    select current_time();
    
    
    alter table employee add column(doj date, dob datetime);
    
    select * from employee;
    
    update employee set doj='2022-08-18', dob='1983-11-29 11:23:56'
    where id<3;   
    
    select id,name,doj, datediff(current_date,doj) from employee;
    
    
    select id,name,doj,date_format(doj,'%M %d')
    from employee;
    