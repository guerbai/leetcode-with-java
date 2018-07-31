# Join的时候两个联结条件差一天，且温度高，按照这个规则join，选出来的就是了。
SELECT Weather.Id AS Id
FROM
  Weather
    JOIN
  Weather w on DATEDIFF(Weather.RecordDate, w.RecordDate) = 1
  AND Weather.Temperature > w.Temperature;
