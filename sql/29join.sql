-- JOIN 문법의 다른 방법들.
USE w3schools;
SELECT *
FROM products p
         JOIN w3schools.suppliers s on p.SupplierID = s.SupplierID;
-- 아래 방식으로도 가능하긴 하다. 편한 걸 쓰면 됨
SELECT *
FROM products p
         JOIN suppliers s USING (SupplierID);
SELECT ProductName, SupplierName
FROM products p
         NATURAL JOIN suppliers s;




