#!/bin/python3

import sys

def breakingRecords(score):
    # Complete this function
    low = 0
    high = 0
    large = score[0]
    small = score[0]
    
    for i in score[1:]:
        if i > large:
            large = i
            high += 1
        if i < small:
            small = i
            low += 1
    return [high, low]

if __name__ == "__main__":
    n = int(input().strip())
    score = list(map(int, input().strip().split(' ')))
    result = breakingRecords(score)
    print (" ".join(map(str, result)))


