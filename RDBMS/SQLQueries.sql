
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