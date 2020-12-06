-- 创建表
create table T_ORDER
(
    ID   NUMBER not null,
    NAME VARCHAR2(255),
    TYPE VARCHAR2(255)
)

-- 创建序列
create sequence seq_order
increment by 1
start with 1
maxvalue 999999999;