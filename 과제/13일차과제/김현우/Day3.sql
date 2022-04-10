create table tb_vocabulary(
	vo_idx bigint auto_increment primary key,
	vo_eng varchar(100) not null,
    vo_kor varchar(50) not null,
    vo_level int not null,
    vo_regdate datetime default now()
);

select * from tb_vocabulary;


-- Day13 homework 학생 테이블
create table tb_student(
	st_idx bigint auto_increment primary key,
    st_num varchar(20) not null,
    st_name varchar(30) not null,
    st_ph varchar(50) not null,
    st_sex varchar(20) not null,
    st_regdate datetime default now()
    );
    
    select * from tb_student;
