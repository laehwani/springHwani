-- LIMIT : 조회 , 레코드(행,low) 제한하기
SELECT *
FROM customers;
SELECT *
FROM customers
LIMIT 3;
SELECT * FROM products
LIMIT 3;
SELECT *
FROM employees
ORDER BY BirthDate DESC
LIMIT 3;
SELECT *
FROM customers

-- 예) 가장 어린 3명의 직원 조회
-- 예) 2번 카테고리에서 가장 저렴한 상품 조회
SELECT *
FROM employees
ORDER BY BirthDate DESC
LIMIT 3;

SELECT *
FROM products
WHERE CategoryID = 2
ORDER BY Price
LIMIT 2;

-- LIMIT n : n 개 ,  오라클에서는 이 리미트가 없다.
-- LIMIT n, m : n부터 m개(n은 0번부터)
-- n 은 0번부터 시작한다.
SELECT ProductName, Price
FROM products
ORDER BY Price
LIMIT 4, 4;

-- 페이지 나누기
SELECT CustomerID, CustomerName
FROM customers
ORDER BY CustomerID;  -- 91 개다. 이걸 10개씩 나눠보자.
SELECT CustomerID, CustomerName
FROM customers
ORDER BY CustomerID
LIMIT 0, 10;
SELECT CustomerID, CustomerName
FROM customers
ORDER BY CustomerID
LIMIT 10, 20;

-- 예) 공급자(suppliers) 를 한 페이지에 5개씩 보여줄 때
--      3번째 페이지 조회 코드 작성
SELECT *
FROM suppliers
LIMIT 10, 5;

-- 한 페이지가 n개의 레코드를 보여주면
-- m번째 페이지 조회에서는 LIMIT (m-1)*n, n 의 법칙이다.
-- 그냥 쉽게 말해 0번째부터 시작한다.






