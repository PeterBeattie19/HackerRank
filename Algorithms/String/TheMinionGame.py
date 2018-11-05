s = input() 
a, b = 0, 0

vowels = set(list("IEAOU"))

for i in range(len(s)):
    if s[i] in vowels:
        b += len(s) - i
    else:
        a += len(s) - i

if a > b:
    print("Stuart",a)
elif b > a:
    print("Kevin", b)
else:
    print("Draw")