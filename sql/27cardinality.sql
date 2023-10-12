USE mydb1;

-- 1 : n
# 일단 패스
-- 1 : 1 (일대일 연결)
CREATE TABLE my_table37_emplyee(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    name VARCHAR(20),
    brith DATE
);
CREATE TABLE my_table38_emplyee_info(
    id INT REFERENCES my_table37_emplyee(id),
    salary INT,
    address VARCHAR(20)
);

-- n : n (다대다 연결)
# 다대다 연결은 연결 테이블을 따로 만들어야 하며,
# 연결 테이블은 각 테이블의 키를 가져야 합니다.
CREATE TABLE my_table39_person(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    skill VARCHAR(20)
);
CREATE TABLE my_table40_skill(
    id INT PRIMARY KEY AUTO_INCREMENT,
    sklii_name VARCHAR(20)
);
CREATE TABLE my_table41_person_skill(
    person_id INT REFERENCES my_table39_person(id),
    skill_id INT REFERENCES my_table40_skill(id),
    PRIMARY KEY (person_id, skill_id)
);