use aiclass;

create table tb_student (
	stu_idx bigint auto_increment primary key,
    stu_num bigint not null,
    stu_name varchar(100) not null,
    stu_hp int not null,
    stu_gender enum('남자', '여자') not null,
    stu_register datetime default now()
);
    
select * from tb_student;
