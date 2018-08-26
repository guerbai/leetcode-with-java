# 注意这个distinct;
# https://blog.csdn.net/bitcarmanlee/article/details/51280949
SELECT class FROM courses GROUP BY class HAVING count(DISTINCT student) >= 5;