n, m = map(int, input().split()) 
a = [list(map(int, input().split())) for _ in range(n)] 
k = int(input())
for i in sorted(a, key = lambda x: x[k]): print(" ".join(map(str, i))) 