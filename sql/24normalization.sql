
-- normalization : 정규화
USE mydb1;

-- atomic data(원자적 데이터) 책 209쪽
-- 예) 이름, 최종학력, 특기
CREATE TABLE my_table21_person(
    이름 VARCHAR(100) NOT NULL ,
    학력 VARCHAR(100) ,
    특기 VARCHAR(1000)
);
INSERT INTO my_table21_person(이름, 학력, 특기)
    VALUE ('손흥민', '대학', '축구,노래');
INSERT INTO my_table21_person(이름, 학력, 특기)
    VALUE ('이강인', '대학원', '야구,농구');
INSERT INTO my_table21_person(이름,학력,특기)
    VALUE ('김민재', '학원', '배구,야구');
SELECT * FROM my_table21_person;

-- 책 209쪽 규칙2
-- 원자적 데이터로 구성된 테이블은 같은 타입의 데이터를 여러 열에 가질 수 없다.
-- 즉 21번 테이블은 규칙을 어긴 잘못된 예이다.
CREATE TABLE my_table22_person(
    이름 VARCHAR(20) NOT NULL ,
    학력 VARCHAR(100),
    특기 VARCHAR(100),
    특기2 VARCHAR(100),
    특기3 VARCHAR(100)
);
INSERT INTO my_table22_person(이름, 학력, 특기, 특기2, 특기3)
    VALUE ('흥민', '대학교', '축구', '노래', null);
INSERT INTO my_table22_person(이름, 학력, 특기, 특기2, 특기3)
    VALUE ('강인', '대학원', '축구', '노래', '야구');
INSERT INTO my_table22_person(이름, 학력, 특기, 특기2, 특기3)
    VALUE ('흥민', '대학교', '축구', null, null);
SELECT * FROM my_table22_person;

CREATE TABLE my_table23_person(
    이름 VARCHAR(100) NOT NULL ,
    학력 VARCHAR(100) ,
    특기 VARCHAR(1000)
);
INSERT INTO my_table23_person(이름, 학력, 특기)
    VALUE ('흥민', '대학', '야구');
INSERT INTO my_table23_person(이름, 학력, 특기)
    VALUE ('흥민', '대학', '축구');
INSERT INTO my_table23_person(이름, 학력, 특기)
    VALUE ('강인', '대학', '농구');
SELECT * FROM my_table23_person;
-- 22,23번 테이블처럼 할 수 있지만 잘못 된 방식임.

-- 책 210p 정규화의 조건!
-- 각행의 데이터들은 원자적 값을 가져야 한다.
-- 각 행은 유일무이한 식별자인 기본키(primary key)를 가지고 있어야 한다.

-- KEY : 각 행을 구분하는 컬럼(들) 설정하기.
CREATE TABLE my_table24_person(
    id VARCHAR(10) NOT NULL UNIQUE ,
    이름 VARCHAR(10) NOT NULL ,
    학력 VARCHAR(10) ,
    특기 VARCHAR(10)
);
-- 책 216p
-- 기본키 조건 : null 값이 될수 없음(not null), 변경 불가임(unique),
-- : 삽입될 때 값이 있어야 함. 간결해야함.

# 기본키 id 를 줘보자
CREATE TABLE my_table25_person(
    id INT NOT NULL UNIQUE AUTO_INCREMENT,
    -- AUTO_INCREMENT : 1부터 자동으로 증가된 값 삽입한다.
    ssn VARCHAR(10) NOT NULL ,
    이름 VARCHAR(10) NOT NULL ,
    학력 VARCHAR(10) ,
    특기 VARCHAR(10)
);
DROP TABLE my_table25_person;
INSERT INTO my_table25_person(ssn, 이름, 학력, 특기)
    VALUE ('090101', '흥민', '대학', '축구');
INSERT INTO my_table25_person(ssn, 이름, 학력, 특기)
    VALUE ('090101', '흥민', '대학', '야구');
INSERT INTO my_table25_person(ssn, 이름, 학력, 특기)
    VALUE ('090303', '강인', '대학', '농구');
INSERT INTO my_table25_person(ssn, 이름, 학력, 특기)
    VALUE ('090101', '흥민', '대학', '축구');
SELECT * FROM my_table25_person;

CREATE TABLE my_table26_person(
    id INT PRIMARY KEY AUTO_INCREMENT,
    #PRIMARY KEY : NOT NULL UNIQUE 와 같은 명령어다
    ssn VARCHAR(10) NOT NULL ,
    이름 VARCHAR(10) NOT NULL ,
    학력 VARCHAR(10) ,
    특기 VARCHAR(10)
);
DESC my_table25_person;
DESC my_table26_person;