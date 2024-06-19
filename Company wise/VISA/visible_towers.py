# Problem Link : https://leetcode.com/discuss/interview-question/2571045/VISA-Company-3-Coding-questions-1.5-hours-1392022-Online-Test-On-Campus

n = 4
height = [5, 2, 10, 1]
result = [0]*n 
stack = []

for i in range(n-1,-1,-1):
    while stack and height[i] > stack[-1]:
        stack.pop()
        result[i]+=1 
    if stack:
        result[i]+=1 
    stack.append(height[i])

stack = []

for i in range(0,n):
    while stack and height[i] > stack[-1]:
        stack.pop()
        result[i]+=1
    if stack:
        result[i]+=1
    stack.append(height[i])
print(result)