from collections import Counter

input()
shoes = Counter(list(map(int, input().split()))) 

n = int(input()) 
profit = 0

for _ in range(n):
    q = list(map(int, input().split())) 
    if shoes[q[0]] == 0:
        continue
    profit += q[1] 
    shoes[q[0]] -= 1
print(profit) 