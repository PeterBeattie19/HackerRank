n = int(input())
rocks = [set(input()) for _ in range(n)]

mp = {} 
total = set() 
for i in rocks:
    for j in i:
        if j in mp:
            mp[j] += 1
        else:
            mp[j] = 1
        total.add(j) 
        
c = 0
for i in total:
    if mp[i] == n:
        c += 1
print(c) 