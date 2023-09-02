v1 = [False] * 1000000
v2 = [False] * 1000000

films1 = list(map(int, input().split()))
films2 = list(map(int, input().split()))

films1.pop(0)
films2.pop(0)

films1 = set(films1)
films2 = set(films2)

h1 = True
h2 = True
total = 0
for i in range(1000000):
    if i in films1 and i in films2:
        h1 = True
        h2 = True
        total += 1
    elif i in films1 and h2:
        h1 = True
        h2 = False
        total += 1
    elif i in films2 and h1:
        h1 = False
        h2 = True
        total += 1

print(total)