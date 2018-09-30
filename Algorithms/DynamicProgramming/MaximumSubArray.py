def solve(arr):
    max_so_far = arr[0]
    max_ending_here = arr[0]

    for i in arr[1:]:
        max_ending_here = max(i, max_ending_here+i) 
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far

def dp(arr):
    arr = sorted(arr)[::-1] 
    if arr[0] <= 0:
        return arr[0]
    return sum(list(filter(lambda x: x>=0, arr)))

t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split())) 
    best = dp(a) 
    print(solve(a), best) 