nq, ns = map(int, input().split()) 
grades = [[] for _ in range(nq)] 

for _ in range(ns):
    arr = list(map(float, input().split()))
    for i in range(len(arr)):
        grades[i].append(arr[i]) 
    
for i in grades:
    print(sum(i)/len(i)) 