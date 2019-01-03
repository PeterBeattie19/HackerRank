from itertools import combinations 
a = input().split() 
s = a[0]
k = int(a[1]) 
res = ""
for n in range(1,k+1):
    res += "\n".join(sorted(map(lambda x: "".join(sorted(x)),list(combinations(s,n))))) +"\n"
print(res) 