# Problem Link : https://www.naukri.com/code360/problems/fastest-ninja_1461492?&interviewProblemRedirection=true

from os import *
from sys import *
from collections import *
from math import *

def fastestNinja(n, x, y, position):
	bobmoves = abs(x)+abs(y)

	for i in range(n):
		friendmoves = abs(x-position[i][0])+abs(y-position[i][1])
		if(bobmoves >= friendmoves):
			return False 
	return True