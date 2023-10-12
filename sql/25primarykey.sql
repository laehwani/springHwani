USE mydb1;
# PRIMARY KEY (주키, 기본키, pk)
# 아래는 기본키를 주는 다양한 문법들 보통.
# 보통은 첫번째 27번 테이블 방식을 주로 쓴다.
CREATE TABLE my_table27(
    id INT PRIMARY KEY ,
    이름 VARCHAR(20) NOT NULL
);
CREATE TABLE my_table28(
    id INT,
    이름 VARCHAR(10),
    PRIMARY KEY (id)
);
CREATE TABLE my_table29(
    이름 VARCHAR(10),
    생일 DATE,
    PRIMARY KEY (이름,생일)
);

CREATE TABLE my_table30(
    id INT PRIMARY KEY AUTO_INCREMENT,
    이름 VARCHAR(10)
);
INSERT INTO my_table30(이름)
    VALUE ('son');
INSERT INTO my_table30(이름)
    VALUE ('lee');
INSERT INTO my_table30(이름)
    VALUE ('kim');
INSERT INTO my_table30(이름)
    VALUE ('kim');
INSERT INTO my_table30(이름)
    VALUE ('kim');
# 기본키배열중 하나를 지워보고 출력해보자.
DROP TABLE my_table30;
SELECT * FROM my_table30;
DELETE
FROM my_table30
WHERE id = 4;
# WHERE id = 5;

