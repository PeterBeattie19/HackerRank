a = int(input())
m = {} 

for _ in range(a):
    c = input().split() 
    m[c[0]] = list(map(float, c[1:])) 
s = input() 
d = sum(m[s])/len(m[s])
print("%.2f" % d)