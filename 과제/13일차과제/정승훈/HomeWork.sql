create table tb_student(
	st_idx bigint auto_increment primary key,
    st_num int not null,
    st_name varchar(20) not null,
    st_hp varchar(20) not null,
    st_gender varchar(10),
    st_regdate datetime default now()
);
select * from tb_student;