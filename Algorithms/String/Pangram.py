# Enter your code here. Read input from STDIN. Print output to STDOUT
s = raw_input()
s = s.lower()

arr = [0]*26

for i in s:
    if i == ' ':
        continue
    index = ord(i) - 97
    arr[index] += 1
    
found = False
for i in arr:
    if i == 0:
        print("not pangram")
        found = True
        break
        
        
if  found == False:
    print("pangram")
