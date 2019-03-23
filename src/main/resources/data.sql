/*insert into course(id,name) values(10001,'JPA with Hibernate');
insert into course(id,name) values(10002,'Micro-Services');
insert into course(id,name) values(10003,'Learning Sparql');

insert into Passport(id,passportnumber) values(30001,'123IUL');
insert into Passport(id,passportnumber) values(30002,'JQL345');
insert into Passport(id,passportnumber) values(30003,'JUP908');
insert into Passport(id,passportnumber) values(30004,'JUK666');

insert into student(id,name,passport_id) values(20001,'Praven Kumar',30001);
insert into student(id,name,passport_id) values(20002,'Abdul Zahid',30002);
insert into student(id,name,passport_id) values(20003,'Pavan Swaroop',30003);
insert into student(id,name,passport_id) values(20004,'Jeevan Kohli',30004);

insert into review(id,rating,description,course_id,student_id) values(40001,'4.5','Great Course',10001,20001);
insert into review(id,rating,description,course_id,student_id) values(40002,'5','Good....',10001,20001);
insert into review(id,rating,description,course_id,student_id) values(40003,'3','Deal dhamaka',10003,20003);
insert into review(id,rating,description,course_id,student_id) values(40004,'1.5','Fuckin awfullll',10002,20004);

insert into student_course(student_id,course_id) values(20001,10001);
insert into student_course(student_id,course_id) values(20002,10001);
insert into student_course(student_id,course_id) values(20003,10001);
insert into student_course(student_id,course_id) values(20001,10003);

select * from student,course,student_course where student_course.student_id=student.id and student_course.course_id=course.id
*/
--insert into system_admin(id,user_id,password,name) values(40009876,'admin','admin','admin');