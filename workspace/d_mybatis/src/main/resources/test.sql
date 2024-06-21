create table TBL_BIRD
(
    ID     NUMBER not null
        constraint PK_BIRD
            primary key,
    NAME   VARCHAR2(100),
    AGE    NUMBER,
    GENDER VARCHAR2(100)
);

CREATE SEQUENCE SQL_BIRD
START WITH 1
INCREMENT BY 1
NOCACHE;

SELECT SQL_BIRD.nextval FROM dual;

select * from TBL_BIRD
where ID = 1;

select * from TBL_BIRD

