-- page
SELECT *
FROM suppliers;
-- COUNT(*) : records 수
SELECT count(*)
FROM suppliers; -- 23 records

-- 1페이지에 10개 rows
-- suppliers 목록은 3페이지가 마지막페이지

-- 레코드가 n 개이고 페이지당 10개씩 보여줄 때 마지막 페이지번호는?
-- (n-1)/10 + 1




