s = input() 
mp = {}
for i in s:
    if i in mp:
        mp[i] += 1
    else:
        mp[i] = 1
a = sorted(list(set(s)), key = lambda x: (-mp[x], x))

for i in a[:3]:
    print(i, mp[i]) 