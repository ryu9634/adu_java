create table tb_student(
	st_idx bigint auto_increment primary key,
    st_name varchar(30),
    st_hp varchar(50),
    st_gd enum ('남자' ,'여자'),
    st_regdate datetime default now()
);

select * from tb_student;
