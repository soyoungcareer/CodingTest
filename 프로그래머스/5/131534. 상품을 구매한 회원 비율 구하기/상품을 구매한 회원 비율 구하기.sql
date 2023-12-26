-- 2021년에 가입한 전체 회원들 중 상품을 구매한 회원수와 상품을 구매한 회원의 비율을 년, 월 별로 출력
-- (2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수)
SELECT EXTRACT(YEAR FROM OS.SALES_DATE) YEAR
     , EXTRACT(MONTH FROM OS.SALES_DATE) MONTH
     , COUNT(DISTINCT OS.USER_ID) PUCHASED_USERS
     , ROUND(COUNT(DISTINCT OS.USER_ID) /
       (SELECT COUNT(USER_ID)
          FROM USER_INFO
         WHERE EXTRACT(YEAR FROM JOINED) = '2021'), 1) PUCHASED_RATIO
  FROM ONLINE_SALE OS INNER JOIN USER_INFO UI ON OS.USER_ID = UI.USER_ID
 WHERE EXTRACT(YEAR FROM UI.JOINED) = '2021'
 GROUP BY EXTRACT(YEAR FROM OS.SALES_DATE), EXTRACT(MONTH FROM OS.SALES_DATE)
 ORDER BY 1,2;