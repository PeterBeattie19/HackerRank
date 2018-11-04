n = int(input())
cmds = int(input()) 
pos = 0

for _ in range(cmds):
    line = input()
    if line == "DOWN" and (pos + n) <= n**2:
        pos += n
    elif line == "UP" and (pos - n) >= 0:
        pos -= n
    elif line == "LEFT" and pos%n != 0:
        pos -= 1
    elif line == "RIGHT" and (pos+1)%n != 0:
        pos += 1
print(pos) 