#!/bin/python

import sys

def revisedRussianRoulette(doors):
    # Complete this function
    count1 = 0
    count2 = 0
    for i in doors:
        if i == 1:
            count1 += 1
    
    for i in range(0,len(doors)):
        
        #print doors[i]
        if i == (len(doors) - 1):
            if doors[i] == 1:
                count2 += 1
            
            
        
        elif doors[i] == 1 and doors[i+1] == 1:
            count2 += 1
            doors[i] = 0
            doors[i+1] = 0
            i += 1
        
        elif doors[i] == 1 and doors[i+1] == 0:
            count2 += 1
            doors[i] = 0
            
        
    return [count2, count1]
            
        

if __name__ == "__main__":
    n = int(raw_input().strip())
    doors = map(int, raw_input().strip().split(' '))
    result = revisedRussianRoulette(doors)
    print " ".join(map(str, result))
