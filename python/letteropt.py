import sys
sys.setrecursionlimit(1000000)

n = int(input())

I = dict()
M = dict()
dependents = dict()
non_dependent = set(range(1, n+1))
dependent = []
root = []

for i in range(1, n+1):
    val = list(map(int, input().split()))
    M[i] = val[0]
    N = val[1]
    if N == 0:
         root.append(i)
    for j in range(2, len(val), 2):
        index = val[j]
        percent = val[j + 1]
        dependent.append(index)
        if index in non_dependent:
            non_dependent.remove(index)
        
        if index in dependents:
            dependents[index].append((i, percent))
        else:
            dependents[index] = [(i, percent)]

visited = dict()
ret = []
def dfs(v):
    if v in visited:
        return visited[v]
    
    if v in non_dependent:
            visited[v] = M[v]
            I[v] = float("inf")
            return visited[v]
            
    if v in dependents:
        for p, percent in dependents[v]:        
            if v in I:
                I[v] += dfs(p) * percent/100
            else:
                I[v] = dfs(p) * percent/100
    
    visited[v] = min(I[v], M[v])
    return visited[v]

#print(dependents)
for v in root:
    dfs(v)

ret = []

for k in I:		
    if k in M and I[k] - M[k] > 10e-4:		
          ret.append(str(k))
    
print(" ".join(sorted(ret, key=float)))


'''
4
1 0  2 2 1 3 1
2 0 3 30 
3 0
4 0  
'''