_ = int(input())
s = set(map(int, input().split()))
n = int(input()) 

for _ in range(0,n):
    st = input().split()
    if st[0] == "pop": s.pop()
    elif st[0] == "remove": s.remove(int(st[1])) 
    elif st[0] == "discard": s.discard(int(st[1])) 
print(sum(s)) 