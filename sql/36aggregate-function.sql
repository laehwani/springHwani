use w3schools;

-- aggregate function (집합함수)
-- MAX, MIN, AVG, SUM, COUNT 등등이 있다

SELECT MAX(Price)
FROM products;
SELECT AVG(Price)
FROM products;
SELECT sum(Price)
FROM products;
SELECT count(Price)
FROM products;
SELECT * FROM products ORDER BY Price DESC;
SELECT ProductName , MAX(Price) FROM products;
-- 위에 코드는 잘못된 정보가 나온다. 컬럼이 따로따로 적용되기 때문.
-- 원하는 조건하에 검색하려면, 아래가 옳은 방식이다.
SELECT * FROM products
WHERE Price = (SELECT MAX(Price)
               FROM products);
-- MIN 최소값
SELECT * FROM products
WHERE Price = (SELECT MIN(Price)
               FROM products);

-- 예) 가장 어린 직원 명 조회
-- 예) 가장 나이 많은 직원 조회
SELECT max(BirthDate) FROM employees;
SELECT * FROM employees
WHERE BirthDate = (SELECT min(BirthDate) FROM employees);
SELECT * FROM employees
WHERE BirthDate = (SELECT max(BirthDate) FROM employees);

-- COUNT : 갯수
SELECT * FROM employees;
SELECT COUNT(EmployeeID) FROM employees;
SELECT COUNT(LastName) FROM employees;
# count(*)는 NULL 을 포함하지만, count(컬럼)은 NULL 자동으로 제외한다.

INSERT INTO products (ProductName)
VALUE ('커피');
SELECT * FROM products ORDER BY 1 DESC;
SELECT min(Price) FROM products;

;
-- 만약 NULL 을 포함한 값을 원한다면
SELECT min(IFNULL(Price,0)) FROM products;

SELECT min(ifnull(Price,0)) FROM products;

;
SELECT * FROM products
WHERE IFNULL(Price,0) = (SELECT min(IFNULL(Price,0)) FROM products);

-- SUM : 합
SELECT * FROM products;
SELECT SUM(Price) FROM products;
SELECT sum(o2.Quantity)
FROM orders o
         JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
         JOIN w3schools.products p on o2.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';

-- 예 ) 96년 7월 4일 매출액 구하기
SELECT * FROM products;
SELECT sum(Quantity * Price)매출액, avg(Quantity*Price)평균액
FROM orders o
         JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
         JOIN w3schools.products p on o2.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';

-- AVG : 평균
SELECT AVG(Price) FROM products;
SELECT sum(Price) FROM products;    -- 2222.71
SELECT count(ProductID) FROM  products; -- 78
SELECT count(Price) FROM products; -- 77 개
# 계산할 때 집계함수는 NULL 을 포함하지 않는 다는것을 꼭 염두해야 한다.





