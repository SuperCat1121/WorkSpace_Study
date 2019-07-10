SELECT *  FROM EMP;

-- database : 데이터를 저장/관리하는 저장소
-- rdbms (oracle)  -> 관계형 데이터베이스 <-> noSQL(mongodb 등등 (비정형))
-- 객체(Entity)    -> 테이블(table)
-- 속성(Attribute) -> 컬럼(column)
-- 데이터          -> 튜플(tuple, row)
-- SQL (Structured Query Language)
-- DDL (Data Definition Language)   : 정의어
CREATE TABLE STUDYTABLE (
	-- 컬럼이름 TYPE(SIZE) 제약조건
	NO NUMBER,
	NAME VARCHAR2(500),
	LOC VARCHAR2(1000)
);
-- 제약조건(CONSTRAINT) : 데이터의 무결성...
-- PRIMARY KEY : UNIQUE + NOT NULL (유일하게 식별할 수 있는 속성)
-- UNIQUE      : 유일하다
-- NOT NULL    : NULL 비허용
-- FOREIGN KEY : (외래키, 참조키) -> 다른 테이블의 PK
-- CHECK       : 조건에 맞는 값만 허용
ALTER
-- 테이블, 컬럼 수정
DROP TABLE STUDYTABLE;
-- 테이블 삭제
-- DML (Data Manipulation Language) : 조작어
SELECT * FROM STUDYTABLE;
SELECT LOC, COUNT(LOC) FROM STUDYTABLE GROUP BY LOC ORDER BY COUNT(LOC) DESC;
INSERT INTO STUDYTABLE VALUES (1,'박훈성','구리');
INSERT INTO STUDYTABLE VALUES (2,'한진수','인천');
INSERT INTO STUDYTABLE VALUES (3,'김용범','서울');
INSERT INTO STUDYTABLE VALUES (4,'이동규','서울');
UPDATE STUDYTABLE SET LOC='서울' WHERE NAME='박훈성';
DELETE
-- DCL (Data Control Language)      : 제어어
-- TCL
COMMIT
-- 트랜잭션 저장
ROLLBACK
-- 트랜잭션 전으로 되돌리기
-- 권한(ROLE)
GRANT
REVOKE

-- TRANSACTION : DB 최소한의 작업 단위





















