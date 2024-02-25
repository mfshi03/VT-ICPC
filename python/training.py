n, s = tuple(map(int, input().split()))

for i in range(n):
    a, b = tuple(map(int, input().split()))
    if a <= s <= b:
        s += 1 

print(s)