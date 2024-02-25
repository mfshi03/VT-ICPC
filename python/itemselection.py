import math
n, m, s, p, q = tuple(map(int, input().split()))

size = int(math.ceil(n / m)) 
pres = [[] for i in range(size)]
shared = [[] for i in range(size)]
want = [[] for i in range(size)]

for i in range(p):
    v = int(input()) - 1
    pres[v // m].append(v)

for i in range(q):
    v = int(input()) - 1
    want[v // m].append(v)
    if v in pres[v // m]:
        shared[v // m].append(v)

left = float("inf")
right = float("-inf")
tot_clicks = 0
for i in range(size):
    if len(pres[i]) > 0 or len(want[i]) > 0:
        c1 = 1 + len(want[i])
        num = n % m if i == size - 1 and n % m != 0 else m
        c2 = 1 + (num - len(want[i]))
        c3 = ((len(want[i]) - len(shared[i])) + (len(pres[i]) - len(shared[i])))

        clicks = min(c1, c2, c3)
        if clicks == 0:
            continue
        
        tot_clicks += clicks
        left = min(left, i)
        right = max(right, i)

s -= 1
l = s - left if s >= left else left - s
r = right - s if s <= right else s - right

paging = (right - left) + l if l <= r else (right - left) + r

if left == float("inf") or right == float("-inf"):
    paging = 0
           

print(tot_clicks + paging)




