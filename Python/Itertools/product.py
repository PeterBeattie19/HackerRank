from itertools import product


x = list(map(int, input().split())) 
y = list(map(int, input().split())) 

for i in list(product(x, y)):
    print(i, end=' ')
