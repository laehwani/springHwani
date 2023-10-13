USE mydb1;

CREATE TABLE my_table42_a(
    col1 VARCHAR(1)
);
CREATE TABLE my_table42_b(
    col1 VARCHAR(1)
);
INSERT INTO my_table42_a(col1)
    VALUE ('a'),
    ('b'),
    ('c');
INSERT INTO my_table42_b(col1)
    VALUE ('b'),
    ('c'),
    ('b'),
    ('e');
SELECT * FROM my_table42_a a JOIN my_table42_b b;

SELECT * FROM my_table42_a a NATURAL JOIN my_table42_b b;
-- LEFT JOIN
SELECT *
FROM my_table42_a a
         LEFT JOIN my_table42_b b ON a.col1 = b.col1;
-- RIGHT JOIN
SELECT *
FROM my_table42_a a
         RIGHT JOIN my_table42_b b ON a.col1 = b.col1;
SELECT *
FROM my_table42_a a
         RIGHT OUTER JOIN my_table42_b b ON a.col1 = b.col1;

CREATE TABLE my_tabel44_a(
    col1 VARCHAR(1),
    name VARCHAR(10),
    address VARCHAR(10)
);
CREATE TABLE my_table45_b(
    col1 VARCHAR(1),
    product VARCHAR(10),
    country VARCHAR(10)
);
INSERT INTO my_tabel44_a(col1, name, address)
    VALUE ('a', '흥민', '런던'),
    ('b', '강인', '파리'),
    ('c', '민재', '뮌헨');
INSERT INTO my_table45_b(col1, product, country)
    VALUE ('b', '축구공', '한국'),
    ('c', '컴퓨터', '미국'),
    ('d', '야구공', '영국'),
    ('e', '럭비공', '우즈벡');
SELECT *
FROM my_tabel44_a a
         JOIN my_table45_b b;
SELECT *
FROM my_tabel44_a a
         NATURAL JOIN my_table45_b b;
SELECT *
FROM my_tabel44_a a
         LEFT JOIN my_table45_b b ON a.col1 = b.col1;
SELECT *
FROM my_tabel44_a a
         RIGHT JOIN my_table45_b b ON a.col1 = b.col1;
