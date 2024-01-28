'''
6 6 4

'''

import math
needed, maxmg, maxp = tuple(map(int, input().split()))

common_factors = set()
maxv = min(needed, maxmg)
minv = int(math.ceil(needed / maxp))
for i in range(1, int(needed**0.5) + 1):
    if needed % i == 0 and i <= maxmg:
        if i >= minv:
            common_factors.add(i)

        if needed // i <= maxmg and needed // i >= minv:
            common_factors.add(needed // i)

ps = list(common_factors)
ps.sort()
print(len(ps))
for v in ps:
    print(v)

