import sys

sys.stdin.readline()
mp = {}
order = []

for a in sys.stdin.readlines():
    i = a.rstrip() 
    if i in mp:
        mp[i] += 1
    else:
        order.append(i)
        mp[i] = 1

sys.stdout.write(str(len(order))+"\n") 

for i in order:
    sys.stdout.write(str(mp[i])+" ") 