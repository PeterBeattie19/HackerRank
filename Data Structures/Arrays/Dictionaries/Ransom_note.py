input()
s1, s2 = input().split(), input().split()
mp = {}
for i in s1:
    if i in mp: mp[i] += 1
    else: mp[i] = 1
for i in s2:
    if i not in mp: 
        print("No")
        exit()
    if mp[i] == 0:
        print("No")
        exit()
    mp[i] -= 1
print("Yes")