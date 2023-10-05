-- between
-- A 와 B 사이에 있는 조건들 포함
SELECT * FROM products
WHERE Price >= 10 AND Price <=13;
SELECT *
FROM products
WHERE Price BETWEEN 10 AND 13;

SELECT *
FROM customers
WHERE CustomerName BETWEEN 'a' AND 'b';

SELECT *
FROM orders
WHERE OrderDate BETWEEN '1996-01-01' AND '1996-12-31';

-- 예) 가격이 30~ 40포함 사이인 상품 조회
-- 예) 1998년 2월에 주문한 주문조회
-- 예) 1958년 9월 태어난 직원 조회
SELECT *
FROM products
WHERE Price BETWEEN 30.00 AND 40.00;

SELECT *
FROM orders
WHERE OrderDate BETWEEN '1998-02-01' AND '1998-02-28';

SELECT *
FROM employees
WHERE BirthDate BETWEEN '1958-09-01' AND '1958-09-30';


