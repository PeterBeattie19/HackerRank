def check(a):
    af = [ord(i) for i in a]
    ar = [ord(i) for i in a[::-1]] 
    return [abs(af[i]-af[i+1]) for i in range(len(a)-1)] == [abs(ar[i]-ar[i+1]) for i in range(len(a)-1)]

n = int(input()) 
for _ in range(n):
    if check(input()):
        print("Funny")
    else:
        print("Not Funny") 