SELECT a.name AS Employee FROM employee a LEFT JOIN employee b ON a.managerid=b.id AND a.salary > b.salary;

SELECT
  a.Name AS 'Employee'
FROM
  Employee a,
  Employee b
WHERE
  a.ManagerId=b.id
  AND
  a.Salary>b.Salary
;

