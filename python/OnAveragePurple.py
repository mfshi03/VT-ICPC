from collections import deque

N, M = tuple(map(int, input().split()))

graph = dict()

for i in range(M):
    a, b = tuple(map(int, input().split()))
    if a in graph:
        graph[a].append(b)
    else:
        graph[a] = [b]

    if b in graph:
        graph[b].append(a)
    else:
        graph[b] = [a]

def bfs(a, b):
    queue = deque([(a, 0)]) 
    visited = set()

    while queue:
        node, distance = queue.popleft()

        if node == b:
            return distance

        visited.add(node)

        for neighbor in graph[node]:
            if neighbor not in visited:
                queue.append((neighbor, distance + 1))

    return -1 

val = bfs(1, N)

if val >= 0:
    print(val - 1)
else:
    print(0)

        
