# Problem Link : https://www.naukri.com/code360/problems/split-a-string-in-balanced-strings_1404710?&interviewProblemRedirection=true

from os import *
from sys import *
from collections import *
from math import *

def balancedStringSplit(s):
    stack = []
    count = 0
    for i in range(len(s)):
        if len(stack) == 0 or stack[-1] == s[i]:
            stack.append(s[i])
        else:
            if len(stack)!= 0 and stack[-1] != s[i]:
                stack.pop() 
            if len(stack) == 0:
                count+=1
    return count 