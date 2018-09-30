_ = int(input()) 
a = set(map(int, input().split()))
_ = int(input())
b = set(map(int, input().split()))  

print("\n".join(map(str,sorted(list(a - b) + list(b-a)))))