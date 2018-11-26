input() 
arr = list(map(int, input().split())) 
mp = {} 
for i in range(len(arr)):
    if arr[i] in mp:
        mp[arr[i]].append(i) 
    else:
        mp[arr[i]] = [i] 

res = []
for i,k in mp.items():
    if len(k) < 2: continue
    t = sorted(k)
    res.append(min(list([abs(t[j] - t[j+1]) for j in range(len(t)-1)]))) 

if len(res) == 0:
    print("-1")
    exit() 
print(min(res)) 
