# Problem Link : https://www.thejoboverflow.com/p/p1783/

right = 8 
queries = [[1, 2],[3, 5],[3, 1],[3, 2],[4, 5],[6, 1]]

hmp = {}
ans = []

for cord, color in queries:
    hmp[cord] = color 
    res = set(list(hmp.values()))
    ans.append(len(res))
print(ans)
