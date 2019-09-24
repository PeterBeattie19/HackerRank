def solve(s):
    new_str = ''
    reset = True
    for i in s:
        if reset and i != ' ':
            reset = False 
            new_str += i.capitalize() 
        else:
            new_str += i 
        if i == " ":
            reset = True 
    return new_str 


s_ = "1 w 2 r 3g"
print(solve(s_))
