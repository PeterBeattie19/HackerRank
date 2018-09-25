n = int(input())
grades = set() 
mp = {}
for _ in range(n):
    nme = input()
    grd = float(input()) 
    grades.add(grd) 
    if grd in mp:
        mp[grd].append(nme)
    else:
        mp[grd] = [nme]
grades = sorted(list(grades))
print("\n".join(sorted((mp[grades[1]])))) 