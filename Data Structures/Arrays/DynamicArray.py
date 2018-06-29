def fix_me(n, queries):
	last_ans = 0
	arr = [[] for _ in range(n)]
	print(queries)
	for q in queries:
		if q[0] == 1:
			index = ((q[1]^last_ans)%n)
			arr[index].append(q[2]) 

		else:
			index = ((q[1]^last_ans)%n) 
			last_ans = arr[index][q[2]%len(arr[index])]
			print(last_ans)

n, nq = map(int, input().split()) 

queries = [list(map(int, input().split())) for _ in range(nq)]
fix_me(n, queries)
