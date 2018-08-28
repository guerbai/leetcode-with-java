SELECT
  d.name as Department,
  t.Employee,
  t.Salary
FROM
  Department AS d
  INNER JOIN
  (
    SELECT
      DepartmentId as dpid,
      Name as Employee,
      Salary
    FROM
      Employee AS e
      INNER JOIN
      (
        SELECT
          max(Salary) as sl,
          DepartmentId as id
        FROM
          Employee
        GROUP BY
          DepartmentId
      ) AS maxTable
      ON e.Salary = maxTable.sl AND e.DepartmentId= maxTable.id
  ) AS t
    ON
      t.dpid = d.id;
