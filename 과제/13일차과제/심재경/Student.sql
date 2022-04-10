create table tb_student(
		st_idx bigint auto_increment primary key,
        st_num varchar(100) not null,
        st_name varchar(50) not null,
        st_hp varchar(50) not null,
        st_gender enum ('남자' ,'여자'),
        st_regdate datetime default now()
);

drop table tb_student;
select *from tb_student;