n = int(input()) 
for _ in range(n):
    print("NO" if len(set(input()).intersection(set(input()))) == 0 else "YES") 