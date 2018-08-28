def largestRectangle(h, s, e):
	if s == e:
		return [h[s], [h[s]]]

	else:
		mid = (e-s)//2
		l = largestRectangle(h, s, mid)
		r = largestRectangle(h, mid, e)

		combined_total = min(min(l[1]), min(r[1]))*(len(l) + len(r))
		lh = l[0]
		rh = l[0]

		if combined_total > lh and combined_total > rh:
			return [combined_total, l[1]+r[1]] 
		elif lh > rh:
			return [lh, l[1]]
		else:
			return  [rh, r[1]] 


h = list(map(int, input().split()))

print(largestRectangle(h, 0, len(h)))