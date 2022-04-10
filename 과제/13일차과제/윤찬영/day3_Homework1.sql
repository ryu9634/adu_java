create table tb_student(
	st_num bigint auto_increment primary key,
    st_name varchar(100) not null,
    st_hp varchar(50) not null,
    st_gender enum('남자','여자') not null,
    st_regdate datetime default now()
);
select * from tb_student;