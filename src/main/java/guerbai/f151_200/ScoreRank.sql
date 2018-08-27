# solution:
# https://leetcode.com/problems/rank-scores/discuss/53129/Maybe-the-Simpest-Solution
SELECT
  a.Score,
  (SELECT COUNT(DISTINCT Score) FROM Scores WHERE Score > a.Score) + 1 AS Rank
FROM
  Scores AS a
ORDER BY Score DESC;