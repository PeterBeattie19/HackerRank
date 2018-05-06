#!/bin/python3

import sys

def marcsCakewalk(calorie):
    # Complete this function
    calorie.sort(reverse = True)
    total = 0
    
    for i in range(len(calorie)):
        total += calorie[i]*(2**i)
    return total

if __name__ == "__main__":
    n = int(input().strip())
    calorie = list(map(int, input().strip().split(' ')))
    result = marcsCakewalk(calorie)
    print(result)
