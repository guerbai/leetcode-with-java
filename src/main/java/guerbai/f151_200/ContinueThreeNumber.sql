# SELECT DISTINCT Num AS ConsecutiveNums FROM
#   (SELECT Num AS SN, id AS tid FROM `Logs`
#     WHERE
#   (SELECT Num FROM `Logs` WHERE id=tid+1)=Num
#   AND
#   (SELECT Num FROM `Logs` WHERE id=tid+2)=Num
#   );

SELECT DISTINCT
  Num AS ConsecutiveNums
FROM
  `Logs` l1,
  `Logs` l2,
  `Logs` l3
WHERE
  l1.id = l2.id-1
  AND l2.id = l3.id-1
  AND l1.Num = l2.Num
  AND l2.Num = l3.Num;
