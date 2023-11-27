-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
  FROM (
    SELECT ROW_NUMBER() OVER(PARTITION BY FOOD_TYPE ORDER BY FOOD_TYPE) RNUM
         , FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
      FROM REST_INFO
     ORDER BY FOOD_TYPE DESC, FAVORITES DESC
    ) T
 WHERE T.RNUM = 1;