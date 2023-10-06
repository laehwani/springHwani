SELECT *
FROM products
WHERE ProductID = 1;
SELECT Price + 1
FROM products
WHERE ProductID = 1;
SELECT  3
FROM products
WHERE  ProductID= 1;

SELECT ProductName, ProductName * 2
FROM products;
SELECT ProductName + 1, Price -- 문자열 연결연산은 안됨!
FROM products;
SELECT concat(ProductName, 1), Price
FROM products;      -- 문자열 연결은 concat 을 사용해야 함!

SELECT LastName, BirthDate
FROM employees
WHERE EmployeeID = 1;
SELECT LastName, BirthDate + 1 -- 날짜를 숫자로 변환시킬수 있다.
FROM employees
WHERE EmployeeID = 1;
SELECT LastName, ADDDATE(BirthDate, INTERVAL 1 DAY)
FROM employees
WHERE EmployeeID = 1;  -- 날짜변경 함수 사용

SELECT *
FROM employees;
SELECT EmployeeID, LastName, FirstName
FROM employees;
SELECT EmployeeID, CONCAT(LastName,FirstName)
FROM employees;
SELECT EmployeeID, CONCAT(FirstName, ' ', LastName)
FROM employees;
SELECT EmployeeID,
       CONCAT(FirstName,' ', LastName),
       ADDDATE(BirthDate, INTERVAL -2 YEAR )
FROM employees;

-- 예) 주문수량 *2 결과 조회 (오더디테일 테이블)
-- 예) "city, country" 고객테이블 조회

SELECT Quantity *2
FROM orderdetails;

SELECT CustomerID,
       concat(City, ', ', Country)
FROM customers;





