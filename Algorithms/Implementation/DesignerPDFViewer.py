#!/bin/python

import sys

def designerPdfViewer(h, word):
    # Complete this function
    size = len(word)
    large = 0
    
    for i in word:
        if h[ord(i) - ord('a')] > large:
            large = h[ord(i) - ord('a')]
    return (large*size)

if __name__ == "__main__":
    h = map(int, raw_input().strip().split(' '))
    word = raw_input().strip()
    result = designerPdfViewer(h, word)
    print result
