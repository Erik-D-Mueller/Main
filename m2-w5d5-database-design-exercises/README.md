# Database Design Exercise

### Implement a database to hold the contents of simple Project Organizer.

The Project Organizer tracks what department and individual employees are working on a given project.

Each employee has the following attributes:

* employee number
* job title
* lastname
* firstname
* gender
* birthday
* hiredate
* works for a department

Each department has the following attributes:

* department number
* name
* has zero-to-many employees

Each project has the following attributes:

* project number
* name
* startdate
* has zero-to-many employees

**Requirements**

All tables are required to have a primary key.

Populate the tables with data for at least four projects, three departments, and eight employees. 

Make sure each project has at least one employee assigned to it, and each department has at least two employees in it.

**Design Tips:**
	
Questions you should ask yourself.

* Is a natural key available for the primary key, or will you need a surrogate?
* What data type should be used for each column?
* What attribues are required? Which are optional?
* Are there additional constraints such as length, data format, or restricted values for any columns?
* What table columns will the user likely search?
* Is there an official list of valid job titles?

Don't forget to normalize.


//////////////////////////////////////////////////////////////////////////////////////////////////////////////


drop table if exists projectdetails;
drop table if exists employee;
drop table if exists project;
drop table if exists department;



create table department(
departmentNumber serial not null,
name varChar(100),
numberOfEmployees int,
constraint pk_departmentNumber primary key (departmentNumber)
);


create table employee(
 
 employeeNumber serial not null,
 title varchar(200),
 lastName varChar(100),
 firstName varChar(100),
 isWoman boolean,
 birthDate timeStamp null,
hireDate timeStamp Null,
deptNumberOfEmployment int,
constraint pk_employeeNumber primary key (employeeNumber),
constraint fk_employeeemployeeNumber foreign key (deptNumberOfEmployment) references department(departmentNumber)

);


create table project (
projectNumber serial not null,
name varChar(100),
startDate timestamp Null,
NumberOfemployees int,
deptNumberWorkingOnIt int,
constraint pk_projectNumber primary Key (projectNumber),
constraint fk_projectdeptNumberWorkingOnIt foreign key (deptNumberWorkingOnIt) references department (departmentNumber)

);

create table projectDetails (

employeeNumber int,
projectNumber int,
Primary Key ( employeeNumber, projectNumber),
constraint fk_projectDetailsprojectNumber foreign key (projectNumber) references project(projectNumber)

);



insert into department (name, numberofemployees) values ('excavating',7);

insert into department (name, numberofemployees) values ('archaeology',2);

insert into department (name, numberofemployees) values ('philosophy', 2);



insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('CEO', 'miller', 'Carly', true, '2010-04-04','2005-02-02',2);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('CTO', 'johnson', 'Gina', true, '2005-03-03','2001-04-04',1);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('developer', 'Bogart', 'Jennifer', true, '2012-03-04', '2001-04-02',3);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('developer', 'Thoreou', 'Shannon', true, '2001-05-05', '2008-01-01',1);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('developer', 'Faygo', 'Tina', true, '2009-03-03', '1996-04-04',2);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('developer', 'Rayseon', 'Ralph', false, '1964-09-09', '1983-05-05',3);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('Dirt Digger', 'JoHansen', 'Katie', true, '1943-12-12', '1943-09-09', 1);

insert into employee (title, lastname, firstname, iswoman, birthdate,hiredate,deptnumberofemployment) values ('Navigator', 'Swartzel', 'Shawn', false, '1973-04-04', '1945-04-04', 3);



insert into project (name, startdate, numberofemployees,deptnumberworkingonit) values ('Operation Colonize the moon', '1983-05-05', 4, 2 );

insert into project (name, startdate, numberofemployees, deptnumberworkingonit) values ('Operation Hack Argentina', '2016-05-05', 5, 2);

insert into project (name, startdate, numberofemployees, deptnumberworkingonit) values ('Black Swan', '2014-02-05', 3, 1);

insert into project (name, startdate, numberofemployees, deptnumberworkingonit) values ('Moon Shot', '2012-02-12', 3,3);


insert into projectdetails (employeenumber, projectnumber) values (1,4);
insert into projectdetails (employeenumber, projectnumber) values (8,1);
insert into projectdetails (employeenumber, projectnumber) values (6,3);
insert into projectdetails (employeenumber, projectnumber) values (7,2);
insert into projectdetails (employeenumber, projectnumber) values (5,3);
insert into projectdetails (employeenumber, projectnumber) values (4,2);
insert into projectdetails (employeenumber, projectnumber) values (3,1);
insert into projectdetails (employeenumber, projectnumber) values (2,4);
insert into projectdetails (employeenumber, projectnumber) values (1,1);
insert into projectdetails (employeenumber, projectnumber) values (1,2);
insert into projectdetails (employeenumber, projectnumber) values (8,4);
insert into projectdetails (employeenumber, projectnumber) values (3,3);
insert into projectdetails (employeenumber, projectnumber) values (2,3);
insert into projectdetails (employeenumber, projectnumber) values (6,2);
insert into projectdetails (employeenumber, projectnumber) values (3,2);
insert into projectdetails (employeenumber, projectnumber) values (4,4);
insert into projectdetails (employeenumber, projectnumber) values (6,4);
