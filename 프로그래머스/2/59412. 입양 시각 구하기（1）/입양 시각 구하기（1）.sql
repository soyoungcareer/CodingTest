-- 코드를 입력하세요
SELECT EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) HOUR, COUNT(*) COUNT
  FROM ANIMAL_OUTS
 GROUP BY EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))
HAVING EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) BETWEEN 9 AND 19
 ORDER BY 1;