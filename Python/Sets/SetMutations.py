input()
a = set(map(int, input().split())) 
t = int(input())

for _ in range(t):
    cmd = input().split()
    if cmd[0] == "intersection_update":
        a = a.intersection(set(map(int, input().split()))) 
    elif cmd[0] == "update":
        a = set(list(a) + list(map(int, input().split())))
    elif cmd[0] == "symmetric_difference_update":
        a = a ^ set(map(int, input().split()))
    elif cmd[0] == "difference_update":
        a = a - set(map(int, input().split()))
print(sum(a)) 