n = int(input())

def compute():
    M, V = tuple(map(int, input().split()))
    gates = [-1]
    change = [-1]
    nodes = [-1]

    for j in range(1, (M-1)//2 + 1):
        b, c = tuple(map(int, input().split()))
        gates.append(b)
        change.append(c)
        nodes.append(-1)

    for j in range((M-1)//2 + 1, M + 1):
        gates.append(-1)
        nodes.append(int(input()))
    
    cache = dict()
    def dfs(i, v):
        if gates[i] < 0: # if it is a leaf node
            return 0 if nodes[i] == v else float("inf")      

        if (i,v) in cache:
            return cache[(i,v)]
        
        if nodes[i] == v:
            cache[(i,v)] = 0
            return cache[(i,v)]
        
        res = float("inf")

        if gates[i] == 1 or change[i]:
            if v == 1:
                res = min(res, dfs(2*i, 1) + dfs(2*i + 1, 1) + (0 if gates[i] == 1 else 1))
            else:
                res = min(res, dfs(2*i, 1) + dfs(2*i + 1, 0) + (0 if gates[i] == 1 else 1))
                res = min(res, dfs(2*i, 0) + dfs(2*i + 1, 1) + (0 if gates[i] == 1 else 1))
                res = min(res, dfs(2*i, 0) + dfs(2*i + 1, 0) + (0 if gates[i] == 1 else 1))

        if gates[i] == 0 or change[i]:
            if v == 1:
                res = min(res, dfs(2*i, 0) + dfs(2*i + 1, 1) + (0 if gates[i] == 0 else 1))
                res = min(res, dfs(2*i, 1) + dfs(2*i + 1, 0) + (0 if gates[i] == 0 else 1))
                res = min(res, dfs(2*i, 1) + dfs(2*i + 1, 1) + (0 if gates[i] == 0 else 1))
            else:
                res = min(res, dfs(2*i, 0) + dfs(2*i + 1, 0) + (0 if gates[i] == 0 else 1))


        cache[(i,v)] = res 
        return cache[(i,v)]

        
    
    val = dfs(1, V)

    if val != float("inf"):
        return val
    
    return "IMPOSSIBLE"


for i in range(n):
    val = compute()
    print(f"Case #{i+1}: {val}")