# SELECT a.Email AS Email FROM (SELECT DISTINCT Email FROM PERSON) AS a WHERE (SELECT COUNT(Email) FROM Person WHERE a.Email=Email) > 1;
# Better way.
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;