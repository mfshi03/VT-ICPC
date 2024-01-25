n = int(input())


def compute():
    M, V = tuple(map(int, input().split()))
    nodes = dict()
    internal = set()
    leaf = set()

    for j in range(1, (M-1)//2 + 1):
        bit, change = tuple(map(int, input().split()))
        if change == 1 and bit == V:
            bit = 1 if V == 0 else 0
        nodes[j] = bit
        internal.add(j)

    for j in range((M-1)//2 + 1, M + 1):
        nodes[j] = int(input())
        leaf.add(j)
    
    cache = dict()
    def dfs(root):
        if root in cache:
            return cache[root]

        if root in internal:
            if nodes[root] == 1:
                cache[root] = dfs(root * 2) & dfs(root * 2 + 1)
            else:
               cache[root] = dfs(root * 2) | dfs(root * 2 + 1) 
        else:
            cache[root] = nodes[root]

        return cache[root]
    
    val = dfs(1)

    if val == V:
        return val
    
    return "IMPOSSIBLE"


for i in range(n):
    val = compute()
    print(f"Case #{i+1}: {val}")

        






    
    
    

