def bfs(s, c, cur, graph, visited, colours, len_path):
    if colours[c] == colours[cur] and s != cur:
        return len_path
    visited.add(cur) 
    for i in graph[cur]:
        if i not in visited:
            return bfs(s, c, i, graph, visited, colours, len_path+1) 
    return -1 

n, m = map(int, input().split())

graph = [[] for _ in range(n)]

for _ in range(m):
    a, b = map(int, input().split()) 
    graph[a].append(b)
    graph[b].append(a) 

colours = list(map(int, input().split())) 
c = int(input()) 

print(min([bfs(i, c, i, graph, set(), colours, 0) if i == c else 1000000 for i in range(n)])) 