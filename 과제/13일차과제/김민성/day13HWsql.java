public class student day13HWsql {

}
    {aiclass;

            create table tb_student(
            st_index bigint auto_increment primary key,
            st_ID varchar(20)not null,
            st_name varchar(30)not null,
            st_ph varchar(60)not null,
            st_gender varchar(80)not null,
            st_rgdate datetime default now()
        );
        select*from tb_student;

        select st_ID,st_name,st_ph,st_gender,st_regdate from tb_student;
        }