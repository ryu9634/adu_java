USE aiclass;

create table tb_student (
	st_index bigint auto_increment primary key,
    st_ID varchar(10) not null,
    st_name varchar(50) not null,
    st_ph varchar(50) not null,
    st_sex varchar(10) not null,
    st_regdate datetime default now()
);
select * from tb_student;

select st_ID, st_name, st_ph, st_sex,st_regdate  from tb_student;