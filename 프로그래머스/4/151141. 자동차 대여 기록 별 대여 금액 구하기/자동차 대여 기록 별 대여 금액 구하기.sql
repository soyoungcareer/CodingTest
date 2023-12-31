SELECT HISTORY_ID
     , DDIFF * DAILY_FEE * (1 - NVL(C.DISCOUNT_RATE, 0) * 0.01) FEE
  FROM (
    SELECT HISTORY_ID, A.CAR_ID, B.DAILY_FEE
         , TRUNC(END_DATE) - TRUNC(START_DATE) + 1 DDIFF
         , CASE WHEN TRUNC(END_DATE) - TRUNC(START_DATE) + 1 < 7 THEN 0
                WHEN TRUNC(END_DATE) - TRUNC(START_DATE) + 1 < 30 THEN 7
                WHEN TRUNC(END_DATE) - TRUNC(START_DATE) + 1 < 90 THEN 30
                ELSE 90 END AS DCDAYS
      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
     INNER JOIN CAR_RENTAL_COMPANY_CAR B ON A.CAR_ID = B.CAR_ID
     WHERE B.CAR_TYPE = '트럭'
  ) T
 LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN C 
        ON T.DCDAYS = REPLACE(C.DURATION_TYPE, '일 이상', '')
       AND C.CAR_TYPE = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC;
