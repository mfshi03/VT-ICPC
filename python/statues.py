from collections import Counter

m, n = tuple(map(int, input().split()))

matrix = []

for i in range(m):
    matrix.append(list(map(int, input().split())))

diag1 = []
diag2 = []

start1 = [(i, 0) for i in range(0, m)]
start1.extend([(m - 1, j) for j in range(1, n)])

start2 = [(i, n - 1) for i in range(0, m)]
start2.extend([(m - 1, n - 1 - j) for j in range(1, n)])

alln = []
for t in start1:
    i, j = t[0], t[1] 
    temp = []
    while i >= 0 and j < n:
        if matrix[i][j] != -1:
            alln.append(matrix[i][j])
            temp.append(matrix[i][j])
        i -= 1 
        j += 1

    diag1.append(temp)

for t in start2:
    i, j = t[0], t[1] 
    temp = []
    while j >= 0 and i >= 0:
        if matrix[i][j] != -1:
            temp.append(matrix[i][j])
        i -= 1 
        j -= 1

    diag2.append(temp)


c1 = sorted(alln)
c2 = sorted(alln, reverse=True)

d1_asc = 0
d1_desc = 0

d2_asc = 0
d2_desc = 0

for d in diag1:
    s = len(d)
    desc = Counter(c2[:s])
    asc = Counter(c1[:s])
    move1 = 0
    move2 = 0
    for v in d:
        if v in asc:
            asc[v] -= 1 
        if v in desc:
            desc[v] -= 1 

    for v in asc:
        move1 += asc[v]
    for v in desc:
        move2 += desc[v] 

    d1_asc += move1
    d1_desc += move2 

    c2 = c2[s:]
    c1 = c1[s:]

c1 = sorted(alln)
c2 = sorted(alln, reverse=True)

for d in diag2:
    s = len(d)
    desc = Counter(c2[:s])
    asc = Counter(c1[:s])
    move1 = 0
    move2 = 0
    for v in d:
        if v in asc:
            asc[v] -= 1 
        if v in desc:
            desc[v] -= 1 

    for v in asc:
        move1 += asc[v]
    for v in desc:
        move2 += desc[v] 

    d2_asc += move1
    d2_desc += move2

    c2 = c2[s:]
    c1 = c1[s:] 
    
print(min(d1_asc, d1_desc, d2_asc, d2_desc))




    








    
