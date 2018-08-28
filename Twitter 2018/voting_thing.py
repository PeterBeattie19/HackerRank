import functools
import operator 
def electionWinner(votes):
    mp = {}
    s = set() 
    
    for i in votes:
        if i in mp:
            mp[i] += 1
        else:
            mp[i] = 1
        s.add(i) 
    
    a = list(s) 
     
    m = max([mp[i] for i in mp])
    
    a = list(filter(lambda x: mp[x] == m, a)) 
    
    a = sorted(a) 
    return a[-1]
