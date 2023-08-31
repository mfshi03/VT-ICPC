n = int(input())

I = dict()
M = dict()
dependents = dict()
non_dependent = [i for i in range(1,n+1)]
dependent = []
root = []

for i in range(1,n+1):
    val = list(map(int, input().split()))
    M[i] = val[0]
    N = val[1]
    if N == 0:
         root.append(i)
    for j in range(0, 2*N, 2):
        index = val[2 + j]
        percent = val[2 + j + 1]
        #print(index)
        dependent.append(index)
        if index in non_dependent:
            non_dependent.remove(index)
        
        if index in dependents:
            dependents[index].append((i,percent))
        else:
            dependents[index] = [(i,percent)]

visited = dict()
ret = []
def dfs(v):
    if v in visited:
        return visited[v]
    
    visited[v] = True
    if v in non_dependent:
            visited[v] = M[v]
            I[v] = float("inf")
            return M[v]
            
    if v in dependents:
        for p, percent in dependents[v]:        
            if v in I:
                if I[v] > M[v]:
                    ret.append(str(v))
                    visited[v] = M[v]
                    return visited[v]
                I[v] += dfs(p) * percent/100
            else:
                I[v] = dfs(p) * percent/100

    if I[v] > M[v]:
        ret.append(str(v))
        visited[v] = M[v]
        return visited[v]
    
    visited[v] = min(I[v], M[v])
    return visited[v]

for v in non_dependent:
    ret.append(v)
for v in root:
    dfs(v)
    

print(" ".join(sorted(ret)))  
          
     

    
    
'''
8: 5

7: 10 , 3:8 , 4:9, 1:7

2:10, 6:12, 5:11
'''

    



