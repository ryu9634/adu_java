create table tb_student(
	st_idx bigint auto_increment primary key,
    st_num int not null,
    st_name varchar(50),
    st_phone varchar(11),
    st_gender enum('남자', '여자'),
    st_regdate datetime default now()
);

-- 테이블 확인
desc tb_student;

-- 데이터 확인
select * from tb_student;