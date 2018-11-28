n = int(input()) 
a = [list(input()) for _ in range(n)] 
b = [list(i) for i in a]
for i in range(1,n-1):
    for j in range(1,n-1):
        if a[i+1][j] < a[i][j] and a[i-1][j] < a[i][j] and a[i][j-1] < a[i][j] and a[i][j+1] < a[i][j]:
            b[i][j] = 'X' 
print("\n".join(["".join(i) for i in b])) 