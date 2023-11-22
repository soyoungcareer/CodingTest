-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, A.TOTAL_SALES
  FROM USED_GOODS_USER U INNER JOIN (
    SELECT WRITER_ID, SUM(PRICE) TOTAL_SALES
      FROM USED_GOODS_BOARD
     WHERE STATUS = 'DONE'
     GROUP BY WRITER_ID
    HAVING SUM(PRICE) >= 700000) A ON U.USER_ID = A.WRITER_ID
 ORDER BY A.TOTAL_SALES;
    