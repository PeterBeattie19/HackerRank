def split_by_similar(s):
    res = []
    pos, end = 0, 0
    while pos < len(s):
        c = s[pos] 
        end = pos + 1
        while end < len(s) and s[end] == c:
            end += 1
        res.append(s[pos:end]) 
        pos = end 
    return res 

print(" ".join(map(str, [tuple([len(i), int(i[0])]) for i in split_by_similar(input())])))