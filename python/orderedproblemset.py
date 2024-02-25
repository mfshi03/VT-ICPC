n = int(input())


arr = []

for i in range(n):
    arr.append(int(input()))


res = []
for i in range(2, n + 1):
    if n % i == 0:
        w = True
        size = n // i 
        for j in range(i): 
            if sum([i for i in range(j * size + 1, j * size + size + 1)]) != sum(arr[j * size:  j * size + size]):
                w = False
                break
                
        if w:
            res.append(i)

if len(res) > 0:
    for v in res:
        print(v)
else:
    print(-1)