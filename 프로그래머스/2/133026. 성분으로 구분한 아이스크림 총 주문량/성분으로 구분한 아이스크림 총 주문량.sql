-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) TOTAL_ORDER
  FROM FIRST_HALF FH INNER JOIN ICECREAM_INFO II ON FH.FLAVOR = II.FLAVOR
 GROUP BY INGREDIENT_TYPE
 ORDER BY 2;