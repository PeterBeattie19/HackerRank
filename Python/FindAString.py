string = input() ; sub_string = input() 
print(len(filter(lambda x: x==1,[1 if string[i:i+len(sub_string)] == sub_string else 0 for i in range(len(string) - len(sub_string) + 1)])))