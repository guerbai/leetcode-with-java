# DELETE时JOIN.
# 注意You can't specify target table 'Person' for update in FROM clause错误
DELETE p1 FROM Person p1 JOIN Person p2
ON
  p1.Email = p2.Email
  AND
  p1.Id > p2.Id;
