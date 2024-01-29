'''

3 3
first
second
third
first second
third first
second third

'''

n, q = tuple(map(int, input().split()))

indmap = dict()
prefix = [0 for i in range(n+1)]

for i in range(1, n + 1):
    street = input()
    indmap[street] = i
    prefix[i] = prefix[i - 1] + 1
    
for i in range(q):
    beg, end = tuple(map(str, input().split()))
    print(max(0, abs(prefix[indmap[end]] - prefix[indmap[beg]]) - 1))




