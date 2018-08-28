# Complete the primeQuery function below.
primes = {} 
def isPrime(n):
    if n in primes: 
        return primes[n]
    if n == 1: return False
    if n == 2: return  True
    
    for i in range(2, int(math.sqrt(n))+1):
        if n%i == 0:
            primes[n] = False
            return False
    primes[n] = True 
    return True 

def count(graph, values, root, running_total, vis):
    vis.add(root) 
    if isPrime(values[root-1]):
        running_total += 1
        
    for i in graph[root]:
        if i not in vis:
            running_total = count(graph, values, i, running_total, vis)
    return running_total
    
def build_tree(graph, root, new_graph, vis):
    vis.add(root)
    for i in graph[root]:
        if i not in vis:
            new_graph[root].append(i) 
            new_graph = build_tree(graph, i, new_graph, vis)
    '''
    for i in graph[root]:
        if i not in vis:
            new_graph = build_tree(graph, i, new_graph, vis)
    '''
    return new_graph

def primeQuery(n, first, second, values, queries):

    graph = [[] for _ in range(n+1)]

    
    for (i, j) in zip(first, second):
        graph[i].append(j)
        graph[j].append(i) 
    
    graph = build_tree(graph, 1, [[] for _ in range(n+1)], set()) 
    
    res = []
    for i in queries:
        res.append(count(graph, values, i, 0, set())) 
    return res
    
    
    