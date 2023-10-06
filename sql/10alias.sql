SELECT *
FROM employees;
SELECT EmployeeID, LastName
FROM employees;

-- AS : 컬럼명(테이블명) 변경하기
SELECT EmployeeID AS id, LastName AS name
FROM employees;
-- 다만! AS 는 backtic ` ` 으로도 표현이 가능하다
SELECT EmployeeID, CONCAT(FirstName,' , ',LastName) `full Name`
FROM employees;

-- 예) 공급자 이름, 주소(address, city, country)
--      전화번호(phone number)
SELECT SupplierName, CONCAT(Address,', ',City,', ',Country), Phone `phone number`
FROM suppliers;

-- 응용해보기
SELECT * FROM categories;
SELECT * FROM products;
-- 카테고리와 물건 한꺼번에 요청하기
SELECT *
FROM categories JOIN products ON products.CategoryID = categories.CategoryID;
-- 위의 코드 리팩토링하기
SELECT p.ProductName, c.CategoryName
FROM categories `c` JOIN products `p` ON p.CategoryID = c.CategoryID;

