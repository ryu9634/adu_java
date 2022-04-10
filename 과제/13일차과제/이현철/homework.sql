create table tb_student(
	st_num bigint auto_increment primary key,
    st_name varchar(10) not null,
    st_phone varchar(15)unique not null,
    st_gender varchar(4) not null,
    st_regdate datetime default now()
);

select * from tb_vocabulary;
