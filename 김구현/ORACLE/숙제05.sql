--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH AA AS(SELECT ORDERS,PNO,PNAME FROM PROFESSOR WHERE ORDERS ='정교수'),
BB AS(SELECT AA.PNO, C.CNO, C.CNAME FROM AA JOIN COURSE C ON AA.PNO = C.PNO WHERE C.CNAME LIKE '%일반%' )
SELECT BB.CNO,BB.CNAME,AA.PNO,AA.PNAME FROM AA JOIN BB ON BB.PNO = AA.PNO;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH AA AS(SELECT ENO,SAL,COMM,ENAME FROM EMP WHERE SAL >= 3000),
BB AS(SELECT COMM,ENO FROM AA WHERE COMM >=500 )
SELECT ENAME FROM AA JOIN BB ON AA.ENO =BB.ENO;

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH AA AS(SELECT SNO,SNAME FROM STUDENT WHERE AVR>=3.3),
BB AS(SELECT AVG(RESULT)  FROM SCORE SC JOIN AA ON AA.SNO=SC.SNO )
SELECT SNO,SNAME FROM AA NATURAL JOIN BB ;

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH AA AS (
    SELECT PNO, PNAME
    FROM PROFESSOR
    WHERE HIREDATE >= ADD_MONTHS(SYSDATE, -12 * 25)
),
BB AS (
    SELECT C.CNO, C.CNAME, S.SNO, S.SNAME, C.PNO, SC.RESULT
    FROM STUDENT S
    JOIN SCORE SC ON SC.SNO = S.SNO
    JOIN COURSE C ON SC.CNO = C.CNO
    WHERE SC.RESULT >= 90
)
SELECT 
    BB.CNO, 
    BB.CNAME, 
    BB.SNO, 
    BB.SNAME, 
    BB.PNO, 
    AA.PNAME AS PROFESSOR_NAME, 
    BB.RESULT
FROM 
    BB 
JOIN 
    AA 
ON 
    BB.PNO = AA.PNO;
--1) STUDENT 테이블을 참조하여 ST_TEMP 테이블을 만들고 모든 학생의 성적을 4.5만점 기준으로 수정하세요
CREATE TABLE ST_TEMP AS SELECT SNO,SNAME,MAJOR,AVR*4.5/4.0 AS AVR_NEW FROM STUDENT ;

--2) PROFESSOR 테이블을 참조하여 PF_TEMP 테이블을 만들고 모든 교수의 부임일자를 100일 앞으로 수정하세요
CREATE TABLE PF_TEMP AS SELECT PNO,PNAME,HIREDATE+100 AS NEWHIRE FROM PROFESSOR;

--3) ST_TEMP 테이블에서 화학과 2학년 학생의 정보를 삭제하세요
DELETE ST_TEMP WHERE SNO IN (SELECT SNO FROM STUDENT WHERE MAJOR = '화학' AND SYEAR = '1');

--4) PF_TEMP 테이블에서 조교수의 정보를 삭제하세요
DELETE PF_TEMP WHERE PNO IN (SELECT PNO FROM PROFESSOR WHERE ORDERS = '조교수');

--5) EMP 테이블을 참조하여 EMP2 테이블을 만들고 DNO = 30인 사원의 보너스를 15프로 상승시킨 값으로 변경하시고 
--   DNO = 20인 사원의 급여를 10프로 상승시킨 값으로 변경하세요.
CREATE TABLE EMP2 AS SELECT * FROM EMP;
UPDATE EMP2 SET COMM = COMM*1.15 WHERE DNO = 30;
UPDATE EMP2 SET SAL = SAL*1.10 WHERE DNO = 20;

--6) 화학과 2학년 학생중 기말고사 성적의 등급이 A, B인 정보를 갖는 테이블 SCORE_STGR을 생성하세요.(SNO, SNAME, MAJOR, SYEAR, RESULT, GRADE)
CREATE TABLE SCORE_STGR AS 
SELECT ST.SNO, ST.SNAME, ST.MAJOR, ST.SYEAR, SC.RESULT, SCG.GRADE
FROM STUDENT ST 
JOIN SCORE SC ON ST.SNO = SC.SNO 
JOIN SCGRADE SCG ON SC.RESULT BETWEEN SCG.LOSCORE AND SCG.HISCORE 
WHERE SCG.GRADE = 'A' OR SCG.GRADE = 'B';

--7) 생물학과 학생중 평점이 2.7이상인 학생이 수강중인 과목의 정보를 갖는 테이블 ST_COURSEPF를 생성하세요. (SNO, SNAME, CNO, CNAME, PNO, PNAME, AVR)
CREATE TABLE ST_COURSEPF AS
SELECT 
    ST.SNO,
    ST.SNAME,
    C.CNO,
    C.CNAME,
    C.PNO,
    P.PNAME,
    ST.AVR
FROM 
    STUDENT ST
JOIN 
    SCORE SC ON ST.SNO = SC.SNO
JOIN 
    COURSE C ON SC.CNO = C.CNO
JOIN 
    PROFESSOR P ON C.PNO = P.PNO
WHERE 
    ST.MAJOR = '생물' AND ST.AVR >= 2.7
GROUP BY 
    ST.SNO, ST.SNAME, C.CNO, C.CNAME, C.PNO, P.PNAME, ST.AVR;















