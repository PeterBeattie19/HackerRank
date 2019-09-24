import itertools

def get_combos(lst, n):
    return list(itertools.combinations(lst, n)) 

def check_for_occurence(lst, val):
    cnt = 0
    for i in lst:
        if val in i:
            cnt += 1 
    return cnt 


input()
characters = input().split() 
n = int(input())

combos = get_combos(characters, n) 
occurences = check_for_occurence(combos, 'a') 

print(round(occurences/len(combos), 4)) 
