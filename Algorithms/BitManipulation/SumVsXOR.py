#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(n):
    if n == 0:
        return 1
    c = 0
    

    s = bin(n)[2:]
    
    for i in s:
        if i == '0':
            c+=1
    return 2**c

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    result = solve(n)

    fptr.write(str(result) + '\n')

    fptr.close()
