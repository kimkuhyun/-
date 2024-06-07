--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
FROM STUDENT ST
WHERE AVR BETWEEN 3.0 AND 4.0;

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT *
FROM PROFESSOR P
WHERE HIREDATE BETWEEN ('1994-01-01') AND  ('1995-12-31');

--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT *
FROM STUDENT 
WHERE MAJOR IN('화학','물리','생물');

--4) 정교수와 조교수를 검색하라(in)
SELECT *
FROM PROFESSOR 
WHERE ORDERS IN ('정교수','조교수');

--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
FROM COURSE 
WHERE COURSE.ST_NUM IN (1,2);

--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
FROM STUDENT 
WHERE SYEAR IN(1,2) AND AVR BETWEEN 2.0 AND 3.0;

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
FROM STUDENT 
WHERE MAJOR  IN ('화학','물리') AND SYEAR IN (1,2) 
ORDER BY AVR DESC;


--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
FROM PROFESSOR 
WHERE HIREDATE  < TO_DATE('1995-01-01 23:59:59', 'YYYY-MM-DD:HH24:MI:SS');

-------------------------------------------

--1) 송강 교수가 강의하는 과목을 검색한다
SELECT *
FROM PROFESSOR 
WHERE PNAME = '송강';


--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT *
FROM PROFESSOR
WHERE "SECTION" LIKE '%화학%';


--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT 
	P.PNAME ,
	P."SECTION" , 
	C.ST_NUM 
FROM PROFESSOR P
JOIN COURSE C
	ON C.PNO = P.PNO 
WHERE C.ST_NUM = 2


--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT 
	P.PNAME ,
	C.CNAME
FROM PROFESSOR P
JOIN COURSE C 
	ON C.PNO = P.PNO 
WHERE C.CNAME LIKE '%화학%';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	SC."RESULT" 
FROM STUDENT ST
JOIN SCORE SC
	ON ST.SNO =SC.SNO 
WHERE  ST.MAJOR = '화학' AND ST.SYEAR = 1

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT 
	C.CNAME ,
	SC."RESULT" 
FROM COURSE C
JOIN SCORE SC
	ON C.CNO =SC.CNO 
WHERE C.CNAME = '일반화학';


--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	C.CNAME ,
	SC."RESULT" 
FROM STUDENT ST
JOIN SCORE SC
	ON ST.SNO =SC.SNO 
JOIN COURSE C
	ON SC.CNO =C.CNO 
WHERE ST.MAJOR = '화학' AND C.CNAME = '일반화학'

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	C.CNAME ,
	SC."RESULT" 
FROM STUDENT ST
JOIN SCORE SC
	ON ST.SNO =SC.SNO 
JOIN COURSE C
	ON SC.CNO =C.CNO 
WHERE ST.SYEAR = 1

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	C.CNAME ,
	SC."RESULT" , 
	GR.GRADE 
FROM STUDENT ST
JOIN SCORE SC
	ON ST.SNO =SC.SNO 
JOIN COURSE C
	ON SC.CNO =C.CNO 
JOIN SCGRADE GR
	ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE
WHERE C.CNAME = '유기화학' AND GR.GRADE = 'F';

-----------------------------------------------------

--1) 학생중에 동명이인을 검색한다
SELECT 
	A.SNAME
FROM STUDENT A
INNER JOIN STUDENT B
	ON A.SNAME = B.SNAME 
WHERE  A.SNO <> B.SNO;


--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT 
	P.PNAME ,
	C.CNAME ,
	ST.MAJOR 
FROM PROFESSOR P
INNER JOIN COURSE C
	ON C.PNO =P.PNO 
INNER JOIN SCORE SC
	ON C.CNO = SC.CNO 
INNER JOIN STUDENT ST
	ON ST.SNO = SC.SNO 
ORDER BY ST.MAJOR  ;


--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT 
	ST.MAJOR ,
	P.PNAME ,
	C.ST_NUM 
FROM STUDENT ST
INNER JOIN SCORE SC
	ON SC.SNO = ST.SNO 
INNER JOIN COURSE C
	ON C.CNO = SC.CNO 
INNER JOIN PROFESSOR p 
	ON P.PNO =C.PNO 
ORDER BY C.ST_NUM  ;

-------------------------------------------------
--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT 
	ST.MAJOR ,
	C.CNAME ,
	P.PNAME 
FROM STUDENT ST
INNER JOIN SCORE SC
	ON SC.SNO = ST.SNO 
INNER JOIN COURSE C
	ON C.CNO = SC.CNO 
INNER JOIN PROFESSOR p 
	ON P.PNO =C.PNO 


--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	SC."RESULT" 
FROM STUDENT ST
INNER JOIN SCORE SC
	ON SC.SNO = ST.SNO 
INNER JOIN COURSE C
	ON C.CNO = SC.CNO 
INNER JOIN PROFESSOR p 
	ON P.PNO =C.PNO 
WHERE ST.MAJOR = '화학'


--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT 
	ST.SNAME ,
	C.CNAME ,
	SC."RESULT" 
FROM STUDENT ST
INNER JOIN SCORE SC
	ON SC.SNO = ST.SNO 
INNER JOIN COURSE C
	ON C.CNO = SC.CNO 
INNER JOIN PROFESSOR p 
	ON P.PNO =C.PNO 
WHERE C.CNAME = '유기화학'

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT 
	ST.SNAME ,
	ST.MAJOR ,
	C.CNAME ,
	P.PNAME 
FROM STUDENT ST
INNER JOIN SCORE SC
	ON SC.SNO = ST.SNO 
INNER JOIN COURSE C
	ON C.CNO = SC.CNO 
INNER JOIN PROFESSOR p 
	ON P.PNO =C.PNO 
WHERE ST.MAJOR = '화학' AND C.CNAME LIKE '%화학%';
--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT 
	P.PNAME ,
	C.CNAME 
FROM PROFESSOR P
LEFT OUTER JOIN COURSE C
	ON C.PNO = P.PNO ;


--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT 
	P.PNAME ,
	C.CNAME 
FROM PROFESSOR P
FULL OUTER JOIN COURSE C
	ON C.PNO = P.PNO ;
































