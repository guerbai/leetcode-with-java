SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
FROM Employee e inner join Department d
ON e.DepartmentId = d.Id
-- 选出前三；
WHERE 3 > (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e.salary < e2.salary
    AND e.DepartmentId = e2.DepartmentId
);