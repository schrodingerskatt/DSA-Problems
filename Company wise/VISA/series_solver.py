# Problem Link : https://leetcode.com/discuss/interview-question/2571045/VISA-Company-3-Coding-questions-1.5-hours-1392022-Online-Test-On-Campus

series = ['ACB','BDC','CED','DEF']
series_set = set()
ans = None 
for s in series:
    dist = []
    for i in range(len(s)-1):
        dist.append(ord(s[i+1])-ord(s[i]))
    tup = tuple(dist)
    if tup not in series_set:
        series_set.add(tup)
        ans = s 
    else:
        ans = None 
print(ans)