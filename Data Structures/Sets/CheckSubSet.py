def check(a, b):
    for i in a:
        if i not in b:
            return False
    return True

t = int(input()) 
for _ in range(t):
    input()
    a = set(map(int, input().split()))
    input()
    b = set(map(int, input().split()))
    print(check(a,b)) 