USE w3schools;
CREATE TABLE bank
(
    name VARCHAR(10) primary key ,
    money INT NOT NULL DEFAULT 0
);
INSERT INTO bank(name, money)
VALUES ('son', 10000),
       ('kim', 10000);

-- 송금 업무 son - > kim 1000원 송금
UPDATE bank
SET money = money - 1000
WHERE name = 'son';
UPDATE bank
SET money = money + 1000
WHERE name = 'kim';
SELECT *
FROM bank;
-- 위에 손이 김에게 송금할때 update 둘중 하나에게도 문제가 생기면 안된다.
-- 하나로 묶여서 처리해야 된다.
-- 이런 하나로 처리되야 하는 업무과정을 트랜잭션(transaction) 이라 함.
-- 이 때 상단 메뉴얼중에 Auto 를 Manual(수동)으로 바꿔줘야함.
-- 되돌리기
ROLLBACK ;
-- 반영하기
COMMIT ;



