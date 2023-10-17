USE w3schools;
-- having : 그룹함수 연산결과를 조건으로 줄 수 있는 키워드

-- 10만 달러 이상 소비한 고객 조회
SELECT *
FROM (SELECT c.CustomerID, c.CustomerName, sum(p.price * o2.Quantity) `총 주문 금액`
      FROM customers c
               JOIN w3schools.orders o on c.CustomerID = o.CustomerID
               JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
               JOIN w3schools.products p on o2.ProductID = p.ProductID
      GROUP BY c.CustomerID)t1
WHERE t1.`총 주문 금액` >= 100000;

-- having : 그룹함수 연산결과를 조건으로 줄 수 있는 키워드
SELECT c.CustomerID, c.CustomerName, sum(p.price * o2.Quantity) `총 주문 금액`
FROM customers c
         JOIN w3schools.orders o on c.CustomerID = o.CustomerID
         JOIN w3schools.orderdetails o2 on o.OrderID = o2.OrderID
         JOIN w3schools.products p on o2.ProductID = p.ProductID
# WHERE o.OrderDate >= '1996-09-01' AND  o.OrderDate <= '1996-09-30'
GROUP BY c.CustomerID
HAVING `총 주문 금액` >= 100000
ORDER BY `총 주문 금액` DESC ;

-- 예) 총 처리 금액 10만 달러 미만인 직원 조회
-- 오더, 오더디테일, 직원, 상품
SELECT e.EmployeeID                    직원코드,
       CONCAT(e.LastName, e.FirstName) 직원명,
       sum(o2.Quantity * p.Price)      처리금액
FROM employees e
JOIN w3schools.orders o on e.EmployeeID = o.EmployeeID
Join w3schools.orderdetails o2 on o.OrderID = o2.OrderID
JOIN w3schools.products p on o2.ProductID = p.ProductID
GROUP BY e.EmployeeID
HAVING 처리금액 < 100000
ORDER BY 처리금액 DESC ;

