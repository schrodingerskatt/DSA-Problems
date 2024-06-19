# Problem Link : https://www.thejoboverflow.com/p/p1783/

from bisect import bisect_left
a2b = [0, 200, 500]
b2a = [99, 210, 450]
def flight_time(a2b, b2a, n):
    a2b.sort()
    b2a.sort()
    def flight(timetable, time):
        if(time == -1):
            return -1
        i = bisect_left(timetable, time)
        return timetable[i]+100 if (i < len(timetable)) else -1 
    time = 0
    for _ in range(n):
        time = flight(a2b, time)
        time = flight(b2a, time)
    return time 
ans = flight_time(a2b, b2a, 1)
print(ans)