USE mydb1;

-- 제약사항 추가, 삭제하기

CREATE TABLE my_table46(
    col1 INT,
    col2 INT,
    col3 INT,
    col4 INT,
    col5 INT
);
-- 위 테이블에 NOT NULL 제약 사항을 추가해보자
ALTER TABLE my_table46
MODIFY col1 INT NOT NULL ;
DESC my_table46;
-- NOT NULL 삭제해보자
ALTER TABLE my_table46
MODIFY col1 INT NULL ;

-- 예) col2 에 not null 제약사항 추가, 삭제
ALTER TABLE my_table46
MODIFY col2 INT NOT NULL ;
ALTER TABLE my_table46
    MODIFY col2 INT NULL ;
DESC my_table46;

-- DEFAULT 제약사항 추가
ALTER TABLE my_table46
ALTER col3 SET DEFAULT 100;
-- DEFAULT 제약사항 삭제
ALTER TABLE my_table46
ALTER col3 DROP DEFAULT;

ALTER TABLE my_table46
ALTER col4 SET DEFAULT 0;
ALTER TABLE my_table46
ALTER col4 DROP DEFAULT ;
DESC my_table46;

-- UNIQUE 제약사항 추가
ALTER TABLE my_table46
ADD UNIQUE (col5);
# 쇼테이블을 참조하여 UNIQUE 제약이 걸려있는 컬럼명을 정확히 써줘야 한다.
SHOW CREATE TABLE my_table46;
ALTER TABLE my_table46
DROP INDEX col5;

DESC my_table46;

-- PRIMARY KEY 제약사항 추가
ALTER TABLE my_table46
ADD PRIMARY KEY (col1, col2);
-- PRIMARY KEY 제약사항 삭제
SHOW CREATE TABLE my_table46;
ALTER TABLE my_table46
MODIFY col1 INT NULL;

CREATE TABLE my_table47(
    id INT AUTO_INCREMENT primary key ,
    name VARCHAR(10)
);

-- FOREIGN KEY 제약사항 추가
ALTER TABLE my_table46
ADD FOREIGN KEY (col5) REFERENCES my_table47(id);
-- FOREIGN KEY 제약사항 삭제
SHOW CREATE TABLE my_table46;
ALTER TABLE my_table46
DROP FOREIGN KEY my_table46_ibfk_1;
ALTER TABLE my_table46
DROP INDEX col5;

DESC my_table46;