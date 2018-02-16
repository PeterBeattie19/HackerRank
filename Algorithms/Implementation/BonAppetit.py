# Enter your code here. Read input from STDIN. Print output to STDOUT
n,e = map(int, raw_input().split())

arr = list(map(int, raw_input().split()))
s = 0
for i in range(len(arr)):
    if i != e:
        s += arr[i]
        
        
amount = int(input())
s /= 2
if s == amount:
    print "Bon Appetit"
else:
    print abs(amount - s)  
