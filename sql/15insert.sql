-- insert into tableName (columnName1, columnName2, ...)
-- VALUES (value1, value2, ...)

INSERT INTO employees(employeeid, lastname, firstname, birthdate, photo, notes)
    VALUE (10, '손', '흥민', '2000-01-01', '사진10', 'epl득점왕');

SELECT * FROM employees ORDER BY EmployeeID DESC ;

INSERT INTO employees(employeeid, lastname, firstname, birthdate, photo, notes)
    VALUE (11, '이', '강인', '2010-01-01', '사진11', '드리블러');

-- 모든 컬럼에 값 넣을 때 컬럼명 나열 생략 가능
INSERT INTO employees
    VALUE (12, '김', '민재', '2000-03-03', '사진12', '수비수');

SELECT *
FROM employees
ORDER BY EmployeeID DESC;
-- 특정 컬럼에만 값을 넣을 때는 컬럼명 나열 생략 하면 안됨!
INSERT INTO employees(EmployeeID, LastName, FirstName)
    VALUE (13, '박', '지성');
-- 나열된 컬려명과 값을 순서, 갯수가 무조건 같아야함!
INSERT INTO employees(EmployeeID, FirstName, LastName)
    VALUE (14, '차', '범근');

-- 값의 타입에 따라 넣는 방법이 다름
INSERT INTO employees (EmployeeID)
    VALUE (15); -- 권장

INSERT INTO employees (EmployeeID)
    VALUE ('16'); -- 되긴 됨...

INSERT INTO employees (LastName)
    VALUE ('son');

INSERT INTO employees (LastName)
    VALUE ('10000'); -- 따옴표 사용 권장

INSERT INTO employees (LastName)
    VALUE (10000); -- 되긴 됨...

INSERT INTO employees (BirthDate)
    VALUE ('2000-01-01');

SELECT * FROM employees ORDER BY EmployeeID DESC;


INSERT INTO products (Price)
    VALUE (20.10);

INSERT INTO products (Price)
    VALUE ('30.33'); -- 되긴 됨...

INSERT INTO products (Price)
    VALUE ('thirteen');

-- 예) 80 번 상품 입력 (productId, productName, supplierId, categoryId, unit, price)
INSERT INTO products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE (80, '두부', 1, 1, '1 모', 30.33);

-- 예) 새 상품 입력 (productName, supplierId, categoryId, unit, price)
INSERT INTO products (ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE ('김치', 2, 2, '1 포기', 50.55);

INSERT INTO products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE (82, '김치', 2, 2, '1 포기', 50.55);

INSERT INTO products
    VALUE (83, '김치', 2, 2, '1 포기', 50.55);

SELECT * FROM products ORDER BY ProductID DESC;

SELECT * FROM suppliers ORDER BY 1 DESC ;

SELECT * FROM employees ORDER BY 1 DESC ;
