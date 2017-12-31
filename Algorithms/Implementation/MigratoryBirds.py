#!/bin/python3

import sys

def migratoryBirds(n, ar):
    # Complete this function
    freq = [0]*6
    for i in ar:
        freq[i] += 1
    max = 1
    for i in range(1,6):
        if freq[i] > freq[max]:
            max = i
    return max    

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = migratoryBirds(n, ar)
print(result)
