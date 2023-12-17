films1 = list(map(int, input().split()))
films2 = list(map(int, input().split()))


films1.pop(0)
films2.pop(0)

films = []

films1.sort()
films2.sort()
last = None
seen = set()
lf1 = len(films1)
lf2 = len(films2)
pt1 = 0 
pt2 = 0
total = 0
while pt1 < lf1 or pt2 < lf2:
    curr1 = films1[pt1] if pt1 < lf1 else float("inf")
    curr2 = films2[pt2] if pt2 < lf2 else float("inf")
    if curr1 == curr2:
        last = None
        total += 1
        pt2 += 1
        pt1 += 1
        continue

    if curr1 < curr2:
        if (last is None or last == 2):
            total += 1
        last = 1 
        pt1 += 1
        continue

    if curr2 < curr1:
        if (last is None or last == 1):
            total += 1
        last = 2 
        pt2 += 1
        continue

print(total)











