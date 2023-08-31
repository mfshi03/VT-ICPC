import math


n = int(input())
minv = float("inf")
w = math.ceil(math.sqrt(n))
    
while True:
    h = n // w + 1
    if n % w == 0:
        h -= 1
    if h * 2 < w:
        break
    if (w * h) - n < minv:
        minv = (w * h) - n
    w += 1
    
print(minv)