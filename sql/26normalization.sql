-- 정규화 NORMALIZATION
-- 첫번째 정규화 (FIRST NORMAL FORM) 줄여서 1NF
-- 원자적 데이터를 가진 테이블, primary key컬럼이 있어야함.

# 책(369쪽)
-- 두번째 정규화 (SECOND NORMAL FORM) 줄여서 2NF
-- 이미 1NF 이고, 부분적 함수 의존이 없어야함.
-- 키가 아닌 컬럼의 값이 키 컬럼 일부에 종속되지 않아야한다.
-- 부분적함수 의존이란?
-- 키의 일부가 변경되면 키가 아닌 컬럼도 변경되어야 하면 부분적 함수 의존이다.

# 책(374쪽)
-- 세전째 정규화 (THIRD NORMAL FORM) 줄여서 3NF
-- 이미 2NF 이고, 이행적 종속이 없어야 함.
-- 이행적 종속이란?
-- 키가 아닌 컬럼이 다른 컬럼(키가 아닌)에 종속되어 있는 것을 뜻한다.
-- 즉, 키가 아닌 컬럼을 변경할 때 다른 컬럼도 변경 되는 것이 이행적 종속.

-- 입사지원자 테이블에서 id, 이름, 학교, 학교주소 표현해보자.
USE mydb1;

CREATE TABLE my_table30_person (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    school VARCHAR(10),
    school_address VARCHAR(10)
);
INSERT INTO my_table30_person (name, school, school_address)
VALUES ('흥민', '서울대', '관악'),
       ('강인', '고려대', '안암'),
       ('민재', '연세대', '신촌'),
       ('지성', '고려대', '안암'),
       ('범근', '연세대', '신촌');

DROP TABLE my_table32_school;
SELECT * FROM my_table30_person;

CREATE TABLE my_table31_person (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    school VARCHAR(10)
);
CREATE TABLE my_table32_school (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    school_address VARCHAR(10)
);

INSERT INTO my_table31_person (name, school)
VALUES ('흥민', '서울대'),
       ('강인', '고려대'),
       ('민재', '연세대'),
       ('지성', '고려대'),
       ('범근', '연세대');

INSERT INTO my_table32_school (name, school_address)
VALUES ('seoul univ', '관악'),
       ('korea univ', '안암'),
       ('연세대', '신촌');
SELECT * FROM my_table31_person;
SELECT * FROM my_table32_school;


CREATE TABLE my_table33_person(
    id INT PRIMARY KEY AUTO_INCREMENT,
    이름 VARCHAR(10) NOT NULL ,
    학교_id INT
    -- 한 테이블의 컬럼이 다른 테이블을 참조하면 pk를 사용해야한다.
);
CREATE TABLE my_table34_school(
    id INT PRIMARY KEY AUTO_INCREMENT,
    이름 VARCHAR(10) NOT NULL ,
    학교주소 VARCHAR(10)
);
INSERT INTO my_table33_person(이름, 학교_id)
    VALUE ('흥민', 1),
    ('강인', 2),
    ('민재', 1);

INSERT INTO my_table34_school(이름,학교주소)
VALUE ('서울대', '관악'),
    ('연세대', '신촌'),
    ('고려대', '안암');

SELECT * FROM my_table34_school;
SELECT * FROM my_table33_person;

INSERT INTO my_table33_person(이름,학교_id)
VALUE ('지성', 4);

CREATE TABLE my_table35_person(
    id INT PRIMARY KEY AUTO_INCREMENT,
    이름 VARCHAR(10) NOT NULL ,
    학교_id INT REFERENCES my_table36_school(id)
    -- 한 테이블의 컬럼이 다른 테이블을 참조하면 fk를 사용해야한다.
    -- fk 는 외래키 제약사항이라고도 한다.
    -- 프라이머리 키가 1 , 참조하고 있는 쪽이 n
);
CREATE TABLE my_table36_school(
    id INT PRIMARY KEY AUTO_INCREMENT,
    이름 VARCHAR(10) NOT NULL ,
    학교주소 VARCHAR(10)
);
INSERT INTO my_table35_person(이름, 학교_id)
    VALUE ('흥민', 1),
    ('강인', 2),
    ('민재', 1);

INSERT INTO my_table36_school(이름,학교주소)
    VALUE ('서울대', '관악'),
    ('연세대', '신촌'),
    ('고려대', '안암');
INSERT INTO my_table35_person(이름, 학교_id)
VALUE ('지성',4); -- 안됨

SELECT * FROM my_table36_school;
SELECT * FROM my_table35_person;

DELETE FROM my_table36_school WHERE id =1; -- 안됨
DELETE FROM my_table36_school WHERE id =3;

DESC my_table35_person;
SHOW CREATE TABLE my_table35_person;
CREATE TABLE `my_table35_person` (
                                     `id` int(11) NOT NULL AUTO_INCREMENT,
                                     `이름` varchar(10) NOT NULL,
                                     `학교_id` int(11) DEFAULT NULL,
                                     PRIMARY KEY (`id`),
                                     KEY `학교_id` (`학교_id`),
                                     CONSTRAINT `my_table35_person_ibfk_1` FOREIGN KEY (`학교_id`) REFERENCES `my_table36_school` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci




