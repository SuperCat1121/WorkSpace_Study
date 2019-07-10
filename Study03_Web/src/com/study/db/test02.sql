
DROP SEQUENCE STUDYSEQ;
DROP TABLE STUDYTABLE;

CREATE SEQUENCE STUDYSEQ;
CREATE TABLE STUDYTABLE(
	NO NUMBER PRIMARY KEY,
	NAME VARCHAR2(1000) NOT NULL,
	LOC VARCHAR2(1000) NOT NULL
);

SELECT * FROM STUDYTABLE;

INSERT INTO STUDYTABLE VALUES(STUDYSEQ.NEXTVAL, '강사', '수원');