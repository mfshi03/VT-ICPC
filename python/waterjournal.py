'''

5 1 5
1
2
4
5
'''

numd, minv, maxv = tuple(map(int, input().split()))

days = []
for i in range(numd - 1):
    days.append(int(input()))

nomin = True 
nomax = True

faulty = False
for d in days:
    if d == maxv:
        nomax = False
    if d == minv:
        nomin = False 

    if d > maxv or d < minv:
        faulty = True

if minv != maxv and nomin and nomax:
    faulty = True 

if faulty:
    print(-1)
else:
    if nomin or nomax:
        if nomin:
            print(minv)
        if minv != maxv and nomax:
            print(maxv)
        
    else:
        for i in range(minv, maxv + 1):
            print(i)

