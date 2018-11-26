n = int(input()) 
for _ in range(n):
    v = int(input()) 
    print(len(list(filter(lambda x: v%x==0, list(map(int, list(filter(lambda x: x != '0',  str(v))))))))) 