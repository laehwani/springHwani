USE w3schools;

-- ALTER TABLE : 테이블 수정
-- 컬럼 추가, 변경, 삭제
-- 제약 사항 변경
-- NOT NULL, UNIQUE, PRIMARY KEY, DEFAULT, FOREIGN KEY

-- 컬럼 추가
ALTER TABLE products
ADD COLUMN col1 INT;
ALTER TABLE products
ADD COLUMN col3 varchar(10) AFTER ProductName;
ALTER TABLE products
    ADD COLUMN col4 VARCHAR(10) FIRST;
ALTER TABLE products
    ADD Column col5 INT
        NOT NULL DEFAULT 1
        REFERENCES employees (EmployeeID);

DESC products;

-- 예) 직원 테이블에 salay 컬럼 마지막에 추가
-- data type 은 dec( 10,2) 눌안함, 기본값 0
ALTER TABLE employees
    ADD COLUMN salay DEC(10, 2) NOT NULL DEFAULT 0.00;
DESC employees;

-- 컬럼 삭제
ALTER TABLE products
DROP COLUMN col4;

-- 컬럼 변경
ALTER TABLE products
    MODIFY COLUMN col5 VARCHAR(10);
ALTER TABLE products
ADD COLUMN col4 VARCHAR(10);
INSERT INTO products(col4)
    VALUE ('pizza');
ALTER TABLE products
MODIFY COLUMN col4 VARCHAR(3);

-- 아래 컬럼 변경은 안된다
-- col4 에 이미 'pizza' 라는 문자열 값이 있어서 INT(숫자)변환이 불가능.
ALTER TABLE products
MODIFY COLUMN col4 INT;

DESC products;









