from itertools import combinations_with_replacement

def get_combos(arr, n):
    return sorted(["".join(sorted(i)) for i in list(combinations_with_replacement(arr, n))]) 

input_line = input().split() 
s, n = input_line[0], int(input_line[1]) 

print("\n".join(get_combos(s, n))) 
