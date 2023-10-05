SELECT * FROM customers;
SELECT *
FROM customers
WHERE Country = 'Germeny';
SELECT ContactName, Country
FROM customers
WHERE NOT Country = 'Germany';

-- 예) 1번 카테고리에 속하지 않는 상품들 조회
-- 예) Japan 에 있지 않는 공급자들 조회

SELECT CategoryID, CategoryName
FROM categories
WHERE NOT CategoryID = 1;

SELECT *
FROM suppliers
WHERE NOT Country = 'Japan';
