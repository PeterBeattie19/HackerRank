#!/bin/python3

import sys

def gridChallenge(grid):
    # Complete this function
    temp = grid
    grid = []
    
    for i in temp:
        grid.append(list(i)) 
        

    
    flag = True
    for i in grid:
        i.sort()
        
        
    for i in range(0,len(grid[0])):
        arr = []
        for j in range(0,len(grid)):
            arr.append(grid[j][i])
            
        temp = list(arr)
        arr.sort()
        

        
        if arr != temp:
            flag = False
            return "NO"
        
        
                       
    return "YES" 
                    
                
        
        
            

if __name__ == "__main__":
    t = int(input().strip())

    for _ in range(t):
        grid = []
        
        n = int(input())
        for _ in range(n):
            grid.append(input())
        print(gridChallenge(grid))
