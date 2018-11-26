input() ; arr = list(map(int, input().split())) 
mp = {}
for i in arr:
    if i in mp: mp[i] += 1
    else: mp[i] = 1
print(len(arr) - max(list(map(lambda x: mp[x], set(arr))))) 