# Problem Link : https://www.naukri.com/code360/problems/umbrella_1402895?&interviewProblemRedirection=true

from os import *
from sys import *
from collections import *
from math import *

def minUmbrellas(umbrella, m):
    n = len(umbrella)
    INF = 1e9 
    dp = [[0 for j in range(m+1)]for i in range(n+1)]
    for i in range(n+1):
        for j in range(m+1):
            if(j == 0):
                dp[i][j] = 0
            elif(i == 0):
                dp[i][j] = INF 
            else:
                dp[i][j] = dp[i-1][j]
                if (j >= umbrella[i-1]):
                    dp[i][j] = min(dp[i][j],1+dp[i-1][j-umbrella[i-1]])
    ans = dp[n][m]
    if(ans >= INF):
        return -1 
    return ans 