SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain';
SELECT CustomerName, City, Country
FROM customers
WHERE city = 'Madrid';

-- AND , OR  그리고, 또는
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain'
  AND City = 'Madrid';
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain'
  AND city != 'Madrid';

SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain'
   OR city = 'Madrid';
SELECT CustomerName, City, Country
FROM customers
WHERE Country <> 'spain' OR city <> 'Madrid';
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain' OR Country = 'UK';

SELECT *
FROM products
WHERE Price > 10.00
  AND Price <= 30.00;
SELECT *
FROM customers
WHERE CustomerName >= 'c'
  AND CustomerName < 'f';

-- 예) 스웨덴이나 이태리에 있는 공급자들 조회
-- 예) 1963년 8월 생 직원 조회
-- 예) 가격이 100~~200 (포함) 사이인 상품 조회
-- 예) 1997 년에 주문한 주문조회
SELECT *
FROM suppliers
WHERE Country = 'Sweden'
  OR Country = 'Italy';

SELECT *
FROM employees
WHERE BirthDate >= '1963-08-01'
  AND BirthDate <= '1963-08-30';

SELECT *
FROM orders
WHERE OrderDate < '1998-01-01'
  AND OrderDate > '1997-01-01';

SELECT *
FROM products
WHERE price >= 100.00
  AND price <= 200.00;

-- 여러 연산자 조합시 ( ) 사용해서 우선순위를 결정
-- 예) 1번 카테고리 상품 중 10달러 미만, 100달러 이상
SELECT *
FROM products
WHERE (Price >= 100.00
  OR Price < 10.00) AND CategoryID = 1;

SELECT *
FROM suppliers;









