-- In : 하나라도 같으면

SELECT *
FROM customers
WHERE Country = 'UK'
   OR Country = 'Spain'
   OR Country = 'Italy';

SELECT *
FROM customers
WHERE Country IN ('UK', 'Spain', 'Italy');

-- 예) 카테고리 3, 4에 속한 상품들
-- 예) 1996년 7월 4일, 5일에 주문한 주문들
-- 예) London 이나 Madrid, Sevilla 에 있는 고개들
SELECT * FROM products
WHERE CategoryID IN (3, 4);

SELECT *
FROM orders
WHERE OrderDate IN ('1996-07-04', '1996-07-05');

SELECT *
FROM customers
WHERE City IN ('London', 'Madrid', 'Sevilla');


