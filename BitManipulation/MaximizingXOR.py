#!/bin/python3

import sys

def maximizingXor(l, r):
    # Complete this function
    max = -1000000
    
    for i in range(l,r+1):
        for j in range(i,r+1):
            a = i ^ j
            if a > max:
                max = a
    return max

if __name__ == "__main__":
    l = int(input().strip())
    r = int(input().strip())
    result = maximizingXor(l, r)
    print(result)
