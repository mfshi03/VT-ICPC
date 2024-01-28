'''

10 100
30
300
1000
20
35
19
84
117
212
98

'''

n, lph = tuple(map(int, input().split()))

time = lph * 5 
arr = []

for i in range(n):
    arr.append(int(input()))

arr.sort()

total = 0
count = 0
for v in arr:
    total += v
    if total > time:
        break
    count += 1

print(count)
