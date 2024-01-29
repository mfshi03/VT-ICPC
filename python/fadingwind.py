import math

h, k, v, s = tuple(map(int, input().split()))

total = 0
while h > 0:
    v += s 
    v -= max(1, int(math.floor(v/10)))

    if v >= k:
        h += 1
    if 0 < v < k:
        h -= 1
        if h == 0:
            v = 0

    if v <= 0:
        h = 0
        v = 0

    total += v

    if s > 0:
        s -= 1

print(total)

