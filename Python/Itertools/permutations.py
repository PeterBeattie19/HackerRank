from itertools import permutations 
a = input().split() 
s = a[0]
n = int(a[1]) 

print("\n".join(sorted(map(lambda x: "".join(x),list(permutations(s,n))))))