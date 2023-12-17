lst = list(map(int,input().split()))
n = lst[0]
m = lst[1]
s = lst[2]
d = lst[3]

cap = list(map(int,input().split()))
counts = dict()
fill = dict()

if sum(cap) < m :
    print("impossible")
else:
    for i in range(len(cap)):
        counts[i] = cap[i]
        fill[i] = 0
    keys = sorted(counts, key=counts.get)
    filled = set()
    #print(keys)
    for k in keys:
        if n <= 0:
            break
        if(counts[k] < d):
            if n >= (d - counts[k]):
                n -= (d - counts[k])
                fill[k] = (d - counts[k])
                filled.add(k)
            else:
                fill[k] = n
                n = 0
                filled.add(k)
            
        
    if(n > 0):
        print("impossible")
    else:
        p = True
        sum = 0
        for i in range(len(cap)):
            if i not in filled:
                sum += cap[i]
        if(sum < m):
            print("impossible")
        else:
            for k in fill:
                if k < len(fill) - 1:
                    print(fill[k], end=" ")
                else:
                    print(fill[k])