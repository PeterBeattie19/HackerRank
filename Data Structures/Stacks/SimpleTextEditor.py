n = int(input())
stack = []
s = ""

for _ in range(n):
    cmd = input().split()
    cmd[0] = int(cmd[0])
  #  print("stack ", stack)
   # print("s ", s)
    
    if cmd[0] == 1:
        stack.append(s)
        s += cmd[1]
        continue
    
    if cmd[0] == 2:
        stack.append(s)
        b = len(s) - int(cmd[1])
        s = s[:b]
        continue
    
    if cmd[0] == 3:
        print(s[int(cmd[1])-1])
        continue
    
    else:
        s = stack.pop() 
        continue
    
    
