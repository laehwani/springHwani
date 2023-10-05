-- < 작다, > 크다, <= 크거나 같다, >= 작거나 같다
-- NOT, !=, <>  같지 않다 라는 의미

SELECT *
FROM products
WHERE Price > 10;

SELECT *
FROM products
WHERE Price <= 10.00;

SELECT *
FROM products
WHERE Price != 30.00;

SELECT *
FROM products
WHERE Price <> 30.00;

SELECT *
FROM customers
WHERE CustomerID < 3;

-- 문자 형식으로도 비교가능하다.
SELECT *
FROM customers
WHERE CustomerName < 'd';

SELECT *
FROM customers
WHERE CustomerName < 'j';

-- 날짜 형식으로도 비교 가능하다.
SELECT *
FROM employees
WHERE BirthDate > '1969-01-01';
