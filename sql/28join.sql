USE w3schools;

SELECT * FROM products;
SELECT * FROM categories;

-- chais 상품의 카테고리명은?
SELECT * FROM products
WHERE ProductName = 'chais';

SELECT CategoryName FROM categories
WHERE CategoryID = 1;

-- join : 두개의 테이블 결합
SELECT *
FROM categories,
     products;
SELECT count(*)
FROM categories,
     products;
SELECT count(*)
FROM categories; -- 8개
SELECT count(*)
FROM products; -- 77개
SELECT count(*) FROM categories, products; -- 8 * 77 = 616개

--
CREATE TABLE table_a(
    p_id INT PRIMARY KEY AUTO_INCREMENT,
    p_name VARCHAR(20),
    c_id INT REFERENCES table_b
);
CREATE TABLE table_b(
    c_id INT PRIMARY KEY AUTO_INCREMENT,
    c_name VARCHAR(20)
);
INSERT INTO table_b (c_name)
    VALUE ('음료수'), ('반찬');

INSERT INTO table_a (p_name, c_id)
    VALUE ('콜라', 1),
    ('사이다', 1),
    ('제육', 2),
    ('돈까스', 2),
    ('두부', 2);

SELECT * FROM table_a , table_b;
-- 두 테이블 결합하면 조회된 레코드 수는
-- A테이블 row * B테이블 row
-- 컬럼 수는 A테이블 열 + B테이블 열
SELECT *
FROM table_a,
     table_b
WHERE p_name = '콜라' AND table_a.c_id = table_b.c_id;
            # 같은 컬럼명이 여러테이블에 있다면 테이블 명 작성.
# SELECT *
# FROM table_a,
#      table_b
# WHERE table_a.c_id = table_b.c_id -- join 조건
#   AND p_name = '콜라';
SELECT *
FROM table_a JOIN table_b
    ON table_a.c_id = table_b.c_id -- join 조건
WHERE p_name = '콜라';
# 아래 문법이 많이 쓰이는 방식.
SELECT ProductID, ProductName, CategoryName
FROM products p JOIN categories c -- AS 로 이름명 바꾸기
    ON p.CategoryID = c.CategoryID
WHERE ProductName = 'chais';

-- 예) chais 상품의 공급자명, 전화번호
SELECT SupplierName, Phone
FROM products p
         JOIN suppliers s
              ON p.CategoryID = s.SupplierID
WHERE ProductName = 'chais';

-- 예) 1996년 7월 4일에 주문한 고객명(customers, orders)
SELECT CustomerName, OrderDate
FROM customers c
         JOIN orders o
              ON c.CustomerID = o.CustomerID
WHERE OrderDate = '1996-07-04';

-- 예) 1996년 7월 4일에 주문을 담당한 직원명
SELECT LastName, FirstName, OrderDate
FROM employees e
         JOIN orders o
              ON e.EmployeeID = o.EmployeeID
WHERE OrderDate = '1996-07-04';

SELECT count(*) FROM products; -- 77개
SELECT count(*) FROM suppliers; -- 29개
SELECT count(*) FROM categories; -- 8개
SELECT 77 * 29 * 8;
-- 3개 테이블을 조회해보자
SELECT COUNT(*)
FROM products, suppliers, categories;

SELECT p.ProductName, s.SupplierName, s.Phone, c.CategoryName
FROM products p
         JOIN suppliers s ON p.SupplierID = s.SupplierID
         JOIN categories c ON p.CategoryID = c.CategoryID
WHERE p.ProductName = 'chais';

-- 예) 'chang' 상품의 공급자명, 카테고리명 조회
SELECT ProductName,SupplierName, CategoryName
FROM products p
         JOIN w3schools.categories c on p.CategoryID = c.CategoryID
         JOIN w3schools.suppliers s on p.SupplierID = s.SupplierID
WHERE ProductName = 'chang';

-- 예) 1996 7월 9일에 주문한 고객명과, 처리한 직원명
SELECT CustomerName, e.EmployeeID, LastName, FirstName
FROM orders o
        JOIN w3schools.customers c on o.CustomerID = c.CustomerID
        JOIN w3schools.employees e on o.EmployeeID = e.EmployeeID
WHERE OrderDate = '1996-07-09';

-- 예) 1996년 7월 9일에 주문한 상품명(orders, orderdetails, products)
SELECT ProductName, Quantity, OrderDate
FROM orders o
         JOIN orderdetails ord ON ord.OrderID = o.OrderID
         JOIN products p ON ord.ProductID = p.ProductID
WHERE OrderDate = '1996-07-09';

-- 예) 'chang' 상품이 주문된 날짜들
SELECT p.ProductName, o.OrderDate, c.CustomerID, CONCAT(e.FirstName,' ', e.LastName)FullName
FROM orders o
JOIN w3schools.customers c on o.CustomerID = c.CustomerID
JOIN w3schools.employees e on o.EmployeeID = e.EmployeeID
JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
JOIN w3schools.products p on o2.ProductID = p.ProductID

WHERE ProductName = 'chang';

