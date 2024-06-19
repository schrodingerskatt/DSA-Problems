# Problem Link : https://www.naukri.com/code360/problems/rat-in-a-maze-all-paths_758966?&interviewProblemRedirection=true

from os import *
from sys import *
from collections import *
from math import *

def ratInAMaze(maze, n):
    ans = [[0 for j in range(n)]for i in range(n)]
    

    def solveMaze(maze, solution, x, y, n):
        if(x == n-1 and y == n-1):
            solution[x][y] = 1
            printSolution(solution, n)
            print("")
            return  
        
        if (x > n-1 or x < 0 or y > n-1 or y < 0 or maze[x][y] == 0 or solution[x][y]==1):
            return  
        solution[x][y] = 1
        solveMaze(maze, solution, x-1, y, n)
        solveMaze(maze, solution, x+1, y, n)
        solveMaze(maze, solution, x, y+1, n)
        solveMaze(maze, solution, x, y-1, n)
        solution[x][y] = 0

    def printSolution(solution, n):
        for i in range(n):
            for j in range(n):
                print(solution[i][j], end=" ")
        print(" ")
    solveMaze(maze, ans, 0, 0, n)
    
# Main.
n = int(input())
maze = n*[0]

for i in range(0 , n):
    maze[i]=input().split()
    maze[i]=[int(j) for j in maze[i]]
    
ratInAMaze(maze , n) 