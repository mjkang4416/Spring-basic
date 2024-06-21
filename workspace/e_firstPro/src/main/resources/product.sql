CREATE SEQUENCE SQL_PRODUCT
    START WITH 1
    INCREMENT BY 1
    NOCACHE;


drop sequence SQL_PRODUCT;

CREATE SEQUENCE SQL_PRODUCT
    START WITH 1
    INCREMENT BY 1
    NOCACHE;

insert into PRODUCT (id, name, price, category, description) values (SQL_PRODUCT.nextval,'노트북',20.0,'전자기기','이쁨');
insert into PRODUCT (id, name, price, category, description) values (SQL_PRODUCT.nextval,'전등',20.0,'전자기기','이쁨');
insert into PRODUCT (id, name, price, category, description) values (SQL_PRODUCT.nextval,'패드',20.0,'전자기기','애플거');
insert into PRODUCT (id, name, price, category, description) values (SQL_PRODUCT.nextval,'노트북',20.0,'전자기기','삼성거');

drop sequence SQL_PRODUCT;

CREATE SEQUENCE SQL_PRODUCT
    START WITH 1
    INCREMENT BY 1
    NOCACHE;