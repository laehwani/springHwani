-- 비상관쿼리 : 외부쿼리의 컬럼이 내부쿼리에 사용되지 않을 때


-- 상관쿼리 : 외부쿼리의 컬럼이 내부쿼리에 사용될 때
-- 각 공급자가 있는 나라의 고객 수는?
USE w3schools;

SELECT * FROM suppliers;

SELECT COUNT(*)
FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 1);
SELECT COUNT(*)
FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 2);

-- 상관 쿼리
SELECT COUNT(*)
FROM suppliers;
SELECT s.supplierID,
       (SELECT COUNT(*)
        FROM customers c
        WHERE c.Country = s.Country) `Number Of Customer`
FROM suppliers s;

-- 예) 각 직원보다 나이가 많은 직원의 수 (lastname, numberofemp
SELECT *
FROM employees;
SELECT COUNT(*)
FROM employees;
SELECT LastName, BirthDate,
       (SELECT COUNT(*)
        FROM employees e
        WHERE e.BirthDate < e1.BirthDate) NumberOfEmp
FROM employees e1;

-- 예) 생산자와 같은 도시에 있는 구매자의 수
SELECT *
FROM suppliers;
SELECT SupplierName, Country,
       (SELECT COUNT(*) FROM customers c
                 WHERE s.Country = c.Country) NumberCustomer
FROM suppliers s;





