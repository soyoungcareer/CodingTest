SELECT DISTINCT A.CAR_ID, A.CAR_TYPE
     , ROUND(A.DAILY_FEE * (1 - C.DISCOUNT_RATE * 0.01) * 30, 0) FEE
  FROM CAR_RENTAL_COMPANY_CAR A INNER JOIN 
       CAR_RENTAL_COMPANY_DISCOUNT_PLAN C ON A.CAR_TYPE = C.CAR_TYPE 
       AND C.DURATION_TYPE = '30일 이상'
 WHERE A.CAR_TYPE IN ('세단', 'SUV')
   AND CAR_ID NOT IN (
       SELECT CAR_ID 
         FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE TO_CHAR(END_DATE, 'YYYYMMDD') > '20221101'
          AND TO_CHAR(START_DATE, 'YYYYMMDD') < '20221101'
   )
   AND A.DAILY_FEE * (1 - C.DISCOUNT_RATE * 0.01) * 30 >= 500000 
   AND A.DAILY_FEE * (1 - C.DISCOUNT_RATE * 0.01) * 30 < 2000000
 ORDER BY 3 DESC, 2, 1 DESC;