input()
a = list(map(int, input().split())) 
print("True" if len(list(filter(lambda x: x>=0 , a))) == len(a) and any([True if str(i) == str(i)[::-1] else False for i in a]) else "False")