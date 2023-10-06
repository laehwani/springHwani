
-- ORDER BY : 원하는 목록의 오름차순 정렬순서로 테이블 보기
SELECT *
FROM employees
ORDER BY BirthDate;
SELECT *
FROM employees
ORDER BY 4;
SELECT EmployeeID, LastName, BirthDate
FROM employees
# ORDER BY BirthDate;
ORDER BY 3;

-- ORDER BY 'any' DESC : 내림차순 정렬순서로 보기
SELECT *
FROM products
ORDER BY CategoryID, Price DESC ;
SELECT *
FROM products
ORDER BY CategoryID DESC, Price ;

-- 예) 고객을 국가명 오름차순으로 조회
-- 예) 가격이 비싼 상품이 먼저 조회되도록 코드 작성
-- 예) 가장 어린 직원이 먼저 조회 코드 작성

SELECT CustomerID, CustomerName, Country
FROM customers
ORDER BY Country;

SELECT Price
FROM products
ORDER BY Price DESC ;

SELECT BirthDate `birth`
FROM employees
WHERE EmployeeID = 1
ORDER BY birth DESC ;



