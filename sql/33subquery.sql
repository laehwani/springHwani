USE w3schools;

SELECT Price
FROM products
WHERE ProductName = 'ipoh coffee';
-- 쿼리에 쿼리를 추가한 것을 subquery 라고 한다.
SELECT ProductName, Price FROM products
WHERE Price > (SELECT Price
               FROM products
               WHERE ProductName = 'ipoh coffee');

-- leverling 보다 나이가 많은 직원 출력
SELECT BirthDate
FROM employees
WHERE LastName = 'leverling';
SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate < '1963-08-30';

-- subquery
-- 행도 1개고, 열도 1개인 조건
SELECT BirthDate
FROM employees
WHERE LastName = 'leverling';

-- 행 여러개, 열 1개
SELECT ShipperID FROM orders WHERE OrderDate = '1996-07-08';
SELECT CustomerName
FROM customers
WHERE Country = 'mexico';

-- 행 여러개 , 열 여러개
SELECT CustomerID, CustomerName
FROM customers
WHERE Country = 'mexico';

-- 행도 1개고, 열도 1개인 조건 예제
-- 'Tofu' 상품을 공급한 공급자명
SELECT SupplierID FROM products WHERE ProductName = 'tofu';
SELECT SupplierID, SupplierName
FROM suppliers
WHERE SupplierID = 6;

SELECT p.SupplierID, s.SupplierName
FROM suppliers s
         JOIN products p ON s.SupplierID
WHERE p.ProductName = 'tofu';

-- 여러행 1개열
-- 멕시코 고객이 주문한 일자들 조회
SELECT *
FROM customers
WHERE Country = 'mexico';
SELECT OrderDate FROM orders WHERE CustomerID IN (SELECT customers.CustomerID
                                                  FROM customers
                                                  WHERE Country = 'mexico');

-- 예) 1번 카테고리에 있는 상품이 주문된 주문번호 (오더디테일스, 프로덕트)
SELECT * FROM products
WHERE CategoryID = 1;
SELECT * FROM orderdetails WHERE ProductID IN(SELECT CategoryID FROM products
                                                          WHERE CategoryID = 1);
-- 1번 카테고리에 있는 상품이 주문된 날짜 (오더디테일스, 프로덕트)
SELECT *
FROM orders
WHERE OrderID IN (SELECT OrderID
                  FROM orderdetails
                  WHERE ProductID IN (SELECT products.ProductID
                                      FROM products
                                      WHERE CategoryID = 1));
SELECT DISTINCT o.OrderID, o.OrderDate
FROM orders o
         JOIN orderdetails ord ON o.OrderID = ord.OrderID
         JOIN products p ON ord.ProductID = p.ProductID
WHERE p.CategoryID = 1;

-- 주문 한적 없는 고객들
SELECT CustomerID
FROM orders;
SELECT *
FROM customers
WHERE CustomerID NOT IN (SELECT CustomerID
                         FROM orders);

-- 행 여러개 열 여러개
SELECT SupplierName, Address, Country
FROM suppliers;

SELECT *
FROM customers;
INSERT INTO customers(customername, Address,Country)
SELECT SupplierName, Address, Country
FROM suppliers;

INSERT INTO customers(CustomerName, Address, Country)
        (SELECT ContactName, City, Phone FROM suppliers);

SELECT *
FROM customers
WHERE (City, Country) IN (SELECT City, Country FROM suppliers);

CREATE TABLE table_c
SELECT CustomerName, City, Country
FROM customers;
SELECT *
FROM table_c;
DESC table_c;

-- 예) 1번 카테고리에 있는 상품들로 새 테이블을 만드는데
--      새로운 테이블은 productName, categoryName, price
CREATE TABLE table_d
SELECT p.ProductName, c.CategoryName, Price
FROM products p
    JOIN categories c ON p.CategoryID = c.CategoryID
WHERE p.CategoryID = 1;
SELECT *
FROM table_d;















