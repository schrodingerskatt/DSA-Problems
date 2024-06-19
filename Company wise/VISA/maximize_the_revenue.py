# OA Link : https://leetcode.com/discuss/interview-question/2571045/VISA-Company-3-Coding-questions-1.5-hours-1392022-Online-Test-On-Campus

import heapq
n = 3
m = 4
quantity = [1, 2, 4]

res = 0
heap = []
for num in quantity:
    heap.append(-num)
heapq.heapify(heap)

for _ in range(m):
    ele = heapq.heappop(heap)*-1
    res+= ele 
    heapq.heappush(heap,(ele-1)*-1)
print(res)
