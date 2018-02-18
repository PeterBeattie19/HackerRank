#!/bin/python

import sys

def extraLongFactorials(n):
    # Complete this function
    if n == 1:
        return 1
    return n*extraLongFactorials(n-1)

if __name__ == "__main__":
    n = int(raw_input().strip())
    print extraLongFactorials(n)
