USE w3schools;

-- union 합집합
SELECT Country
FROM customers;
SELECT Country
FROM suppliers;
-- UNION 은 자동으로 중복제거한 합집합이다.
SELECT Country
FROM customers
UNION
SELECT Country
FROM suppliers;
-- 만약 중복제거 없는 합집합을 원한다면?
SELECT Country
FROM customers
UNION ALL
SELECT Country
FROM suppliers;

SELECT CustomerName, Country, City, CustomerID FROM customers
UNION
SELECT SupplierName, Country, City, Address FROM suppliers;

-- 예) 직원의 lastName 과 firstName 을 name 이라는 하나의 컬럼으로 조회
SELECT FirstName name
FROM employees
UNION
SELECT LastName
FROM employees;


USE mydb1;

-- FULL OUTER JOIN
SELECT *
FROM my_tabel44_a a
         LEFT JOIN my_table45_b b ON a.col1 = b.col1
UNION
SELECT *
FROM my_tabel44_a a
         RIGHT JOIN my_table45_b b ON a.col1 = b.col1;
-- LEFT OUTER JOIN
SELECT *
FROM my_tabel44_a a
         LEFT JOIN my_table45_b b ON a.col1 = b.col1;
-- RIGHT OUTER JOIN
SELECT *
FROM my_tabel44_a a
         RIGHT JOIN my_table45_b b ON a.col1 = b.col1;










