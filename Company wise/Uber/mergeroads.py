'''
There is a long road with markers on it after each unit of distance. There are some ubers standing on 
the road. You are given the starting and ending coordinate of each uber (both inclusive).
Note: At any given marker there may be multiple ubers or there may be none at all.
Your task is to find the number of markers on which at least one uber is present. 
An uber with coordinates (l, r) is considered to be present on a marker m if and only if l ≤ m ≤ r.

Example :
For coordinates=[[4, 7], [-1, 5], [3, 6]], the output should be easyCountUber(coordinates) = 9.
'''

coordinates=[[4, 7], [-1, 5], [3, 6]]
coordinates.sort()
ans = []
ans.append(coordinates[0])
for i in range(1, len(coordinates)):
    if ans[-1][1] >= coordinates[i][0]:
        ans[-1][1] = max(ans[-1][1],coordinates[i][1])
    else:
        ans.append(coordinates[i])
res = 0
for cord in ans:
    x = cord[0]
    y = cord[1]
    res+=(y-x+1)
print(res)
