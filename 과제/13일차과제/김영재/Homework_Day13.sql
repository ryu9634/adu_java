use aiclass;
create table tb_student(
	st_idx bigint auto_increment primary key,
    st_stnum int,
    st_name varchar(20),
    st_pnum varchar(20),
    st_gender varchar(10),
	st_regdate datetime default now()
);

select * from tb_student;