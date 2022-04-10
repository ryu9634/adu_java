-- 데이터베이스 생성
create database aiclass;

-- 데이터베이스 사용
use aiclass;

create table tb_student (
-- 학생
    st_idx bigint auto_increment primary key,
-- 학생의 학번 , unique 를 주어 중복되는 값을 받지 않게 한다
	st_num int unique not null,
-- 학생 이름  
    st_name varchar(20) not null,
-- 학생 폰 번호 , unique 를 주어 중복되는 값을 받지 않게 한다
    st_ph varchar(50) unique ,
-- 학생 성별 
    st_gender enum('남자','여자') not null,
-- 등록 시간
    vo_regdate datetime default now()
);
DROP TABLE tb_student;