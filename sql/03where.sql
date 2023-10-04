SELECT CustomerID, Address, City, Country
FROM customers;

-- WHERE : 레코드 선택 (솎아내기)
SELECT *
FROM customers WHERE CustomerID=1;
SELECT *
FROM customers WHERE CustomerID=3;
SELECT *
FROM customers WHERE Country='USA';
SELECT *
FROM customers WHERE City='México D.F.';

SELECT *
FROM customers
WHERE Country = 'MEXICO'; -- 대소문자는 구분 안함
SELECT *
FROM customers
WHERE Country = 'mexico'; -- 대소문자는 구분 안함
SELECT *
FROM customers
WHERE Country = 'mexico'; -- 문자열은 ' ' 작은 따옴표로 묶되 수형식은 안써도 됨.

-- 예) 영국(UK) 에 사는 고객들 조쇠
-- 예) 1번 카테고리에 속한 상품(product)들 조회
-- 예) Osaka 에 있는 공급자들 조회
SELECT *
FROM customers
WHERE Country = 'UK';
SELECT *
FROM products
WHERE ProductID = 1;
SELECT *
FROM suppliers
WHERE City = 'Osaka';

-- 미국에 사는 고객의 이름들 조회
SELECT CustomerName
FROM customers
WHERE Country = 'USA';

-- 영국에 사는 고객의 이름과, 고객번호 조회
SELECT CustomerName, CustomerID
FROM customers
WHERE Country = 'UK';

-- 예) 2번 카테고리에 있는 상품명과 가격 조회
-- 예) 일본에 있는 공급자의 이름(SupplierName) 과 전화번호 조회
-- 예) 2번 카테고리의 이름 조회
SELECT ProductName, Price
FROM products
WHERE CategoryID= 2;
SELECT SupplierName, Phone
FROM suppliers
WHERE Country = 'JAPAN';
SELECT CategoryName
FROM categories
WHERE CategoryID = 2;













