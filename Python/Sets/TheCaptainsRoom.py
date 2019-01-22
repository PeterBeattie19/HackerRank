input()
a = list(map(int, input().split()))
mp = {}
for i in a:
    if i in mp:
        mp[i] += 1
    else:
        mp[i] = 1
for i in set(a):
    if mp[i] == 1:
        print(i)
        exit()