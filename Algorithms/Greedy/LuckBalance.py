#!/bin/python3

import sys

def luckBalance(n, k, contests):
    # Complete this function

    total,count = 0,1
    contests.sort(key = lambda x: x[0], reverse=True)
        
    for i in contests:
            
        if i[1] == 1 and count > k:
            total -= i[0]
        
        elif i[1] == 1 and count <= k:
            total += i[0]
            count += 1
            
        else:
            total += i[0] 
            
    return total
            
    
if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    contests = []
    for contests_i in range(n):
       contests_t = [int(contests_temp) for contests_temp in input().strip().split(' ')]
       contests.append(contests_t)
    result = luckBalance(n, k, contests)
    print(result)
