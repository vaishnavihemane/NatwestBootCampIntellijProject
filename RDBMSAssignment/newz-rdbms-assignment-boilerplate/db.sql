
create database Assignment;

use Assignment;

CREATE TABLE News  
(
    NewsId int not null primary key,
    Title nvarchar(100) not null,
    Content nvarchar(1000) not null,
    PublishedAt datetime not null,
    CreatedBy nvarchar(50) not null,
    Url nvarchar(100),
    UrlToImage nvarchar(100)
);

select * from News;

Create table Reminders
(
ReminderId int not null,
Schedule datetime not null,
NewsId int not null,
 constraint pk3 primary key(ReminderId),
constraint fk3 foreign key (NewsId) references News(NewsId)
);


Create table UserProfile
(
UserId nvarchar(50) not null primary key,
FirstName nvarchar(100) not null,
LastName nvarchar(100) not null,
Contact nvarchar(100) ,
Email nvarchar(100),
CreatedAt datetime not null
);

select * from UserProfile;


create table User
(
UserId nvarchar(50) not null,
Password nvarchar(50) not null,
constraint fk4 foreign key (UserId) references UserProfile(UserId)
);



select* from News;

insert into News(NewsId,Title,Content,PublishedAt,CreatedBy,Url,UrlToImage) values
(101,'IT industry in 2020' , 'IT industry was facing disruptive changes in 2019.It is expected to have positive growth in 2020' , '2019-12-01', 'Jack', null, null),
(102,'2020 FIFA U-17 Women World Cup', 'The tournament will be held in India between 2 an 21 November 2020.It will mark the first time that India has hosted a FIFA women football tournament.', '2019-12-05','Jack', null , null),
(103,'chandrayaan2-spacecraft','The Lander of Chandrayaan-2 was named Vikram after Dr Vikram A Sarabhai, the Father of the India space Programme.It was designed to function for one lunar day.','2019-12-05','John',null,null),
(104,'NEFT transactions to be available 24x7','Bank customers will be able to transfer funds through NEFT around the clock on all days including weekends and holidays from December 16.','2019-12-07','John',null, null);



select * from Reminders;

insert into Reminders values 
(1,'2019-12-04', 101),
(2,'2019-12-10',102),
(3,'2019-12-10',104);


select * from UserProfile;

insert into UserProfile values
('Jack','Jackson','James','8899776655','jack@ymail.com','2019-12-07'),
('John','Johnson','dsouza','7869543210','john@gmail.com','2019-12-25'),
('Kevin','Kevin','Lloyd','9878685748','kevin@gmail.com','2019-12-01');

 
 select * from User;

insert into User value 
('Jack','pass@123'),
('John', 'something#121'),
('Kevin' , 'test@123');



Select * from UserProfile
where CreatedAt >= 2019-12-10;



select e.UserId,e.FirstName,e.LastName,e.Contact,e.Email,e.CreatedAt, n.NewsId, n.Title, n.Content, n.PublishedAt, n.Url, n.UrlToImage
from UserProfile e 
join News n 
on 
e.UserId = n.CreatedBy 
where e.UserId = 'Jack';



select UserId,FirstName,LastName,Contact,Email,CreatedAt
from UserProfile
join 
News 
on Userid = CreatedBy
Where NewsId = 103;


 

select UserId,FirstName,LastName,Contact,Email,CreatedAt
from UserProfile
 left join
News on Userid = CreatedBy
where NewsId is null;



select n.NewsId, n.Title
from News n
inner join
Reminders r on 
n.NewsId = r.NewsId;




select UserId, count(n.NewsId) as CountOfTotalNoOfNews
from UserProfile u
Join
News n 
on u.UserId = n.CreatedBy
Group by UserId;



update UserProfile
set Contact = '9192939495'
where UserId = 'John';

select * from UserProfile;


update News
set Title = 'IT industry growth can be seen in 2020'
where newsId = 101;

select * from News;



delete from Reminders
where NewsId In
(
select NewsId From News 
Where CreatedBy = 'Jack');

select * from reminders;



insert into Reminders Values(4,'2020-01-01',103);

