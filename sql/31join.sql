USE w3schools;

-- 교집합이 아닌 부분을 출력해보자.
SELECT DISTINCT CustomerID
FROM orders
ORDER BY 1;
SELECT *
FROM customers
WHERE CustomerID NOT IN (SELECT DISTINCT CustomerID
                         FROM orders
                         ORDER BY 1);
SELECT *
FROM customers c
         JOIN orders o ON c.CustomerID = o.CustomerID;
SELECT *
FROM customers c
         LEFT JOIN orders o ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;
SELECT *
FROM orders o
         RIGHT JOIN customers c ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;

-- 주문을 처리한적 없는 직원 찾기
SELECT *
FROM employees e
         LEFT JOIN w3schools.orders o on e.EmployeeID = o.EmployeeID
WHERE o.EmployeeID IS NULL;

SELECT DISTINCT EmployeeID
FROM orders ORDER BY 1;
INSERT INTO employees(lastname, firstname, birthdate, photo, notes)
    VALUE ('손', '흥민', '2020-01-01', '사진1', '축구선수');



