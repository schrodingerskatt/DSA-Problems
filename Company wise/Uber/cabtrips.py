'''
You want to schedule a certain number of trips with a collection of several cabs.

Given an integer n representing a desired number of trips, and an array cabTravelTime representing 
your cabs and how long it takes each cab (at that index of the array) to make a trip, return the 
minimum time required to make n trips.

Assume that cabs can run simultaneously and there is no waiting period between trips. 
There may be multiple cabs with the same time cost.

n=10
cabTravelTime=[1,3,5,7,8]

* 7 trips with cab 0 (cost 1)
* 2 trips with cab 1 (cost 3)
* 1 trip with cab 2 (cost 5)
So, answer is 7 (there could be other combinations)
'''
nums = [1, 3, 5, 7, 8]
n = 10

def pos(val, nums, n):
    curr = 0
    for i in range(len(nums)):
        curr += val // nums[i]
        if curr >= n:
            return True
    return False


l, r = 0, 10**9 + 7
ans = 10**9 + 7
while l < r:
    mid = l + (r - l) // 2
    if pos(mid, nums, n):
        ans = min(ans, mid)
        r = mid
    else:
        l = mid + 1
print(ans)

