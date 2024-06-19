# Problem Link : https://www.thejoboverflow.com/p/p1783/

word = "dbaca"
n = len(word)
ans = list()
for i in range(n):
    start = word[:i][::-1]+word[i:]
    ans.append(start)
word = word[::-1]
for i in range(n):
    end = word[:i][::-1]+word[i:]
    ans.append(end)

ans.sort()
print(ans[0])