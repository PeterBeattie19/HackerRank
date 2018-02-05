#!/bin/python

import sys

def acidNaming(acid_name):
    # Complete this function
    if acid_name[:5] == "hydro" and  acid_name[-2:] == "ic":
        return "non-metal acid"
    
    if acid_name[-2:] == "ic":
        return "polyatomic acid"
    return "not an acid"

if __name__ == "__main__":
    n = int(raw_input().strip())
    for a0 in xrange(n):
        acid_name = raw_input().strip()
        result = acidNaming(acid_name)
        print result
