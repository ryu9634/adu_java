use aiclass;

create table tb_student(
	stu_idx bigint auto_increment primary key,
    stu_num varchar(20) not null,
    stu_name varchar(20) not null,
    stu_hp varchar(20) not null,
    stu_gender enum('남','여'),
	stu_regdate datetime default now()
);

select*from tb_student;