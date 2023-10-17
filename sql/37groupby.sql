USE w3schools;

-- GROUP BY : 그룹함수 사용시 그룹함수의 범위 지정
SELECT * FROM products;
SELECT CategoryID, MAX(Price) FROM products
GROUP BY CategoryID DESC ;
SELECT CategoryID, sum(Price) FROM products
GROUP BY CategoryID DESC ;

-- 일별 매출액
SELECT o.OrderID, o.OrderDate, sum(Price * Quantity) 매출액
FROM products p
         JOIN orderdetails od ON p.ProductID = od.ProductID
         JOIN orders o ON od.OrderID = o.OrderID
GROUP BY o.OrderDate
ORDER BY o.OrderDate;

-- 예) 직원별 총 주문 처리액 조회
-- 직원명(last,firstname) , 직원별 주문 처리액
SELECT * FROM employees;
SELECT LastName, FirstName, sum(o2.Quantity*p.Price)`직원별 주문 처리액`
FROM employees e
         JOIN w3schools.orders o on e.EmployeeID = o.EmployeeID
         JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
         JOIN w3schools.products p on o2.ProductID = p.ProductID
WHERE o.OrderDate >= '1996-08-01' AND o.OrderDate <= '1996-09-01'
GROUP BY e.EmployeeID
ORDER BY `직원별 주문 처리액` DESC ;

-- 예 고객별 총 주문 금액 조회
SELECT c.CustomerID, c.CustomerName, sum(p.price* o2.Quantity)`총 주문 금액` FROM customers c
JOIN w3schools.orders o on c.CustomerID = o.CustomerID
JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
JOIN w3schools.products p on o2.ProductID = p.ProductID
# WHERE o.OrderDate >= '1996-09-01' AND  o.OrderDate <= '1996-09-30'
GROUP BY c.CustomerID
ORDER BY `총 주문 금액` DESC ;

-- 10 달러 이상 소비한 고객 조회
-- 항상 서브쿼리를 먼저 염두해보자
SELECT *
FROM (SELECT c.CustomerID, c.CustomerName, sum(p.price * o2.Quantity) `총 주문 금액`
      FROM customers c
               JOIN w3schools.orders o on c.CustomerID = o.CustomerID
               JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
               JOIN w3schools.products p on o2.ProductID = p.ProductID
      GROUP BY c.CustomerID)t1
WHERE t1.`총 주문 금액` >= 100000;
