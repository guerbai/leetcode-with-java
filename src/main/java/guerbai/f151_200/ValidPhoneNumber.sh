# regex document at http://tool.oschina.net/uploads/apidocs/jquery/regexp.html
# use grep -P at macos see http://www.jibing57.com/2018/02/09/non-greedy-match-in-grep-on-macos/
cat file.txt | grep -P '^(\(\d{3}\) |\d{3}-)\d{3}-\d{4}$'