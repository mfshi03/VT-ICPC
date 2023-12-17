n = int(input())

time = []
for i in range(n):
    time.append(int(input()))

if n % 2 == 1:
    print("still running")
else:
    total = 0
    for i in range(0,n-1,2):
        total += (time[i+1] - time[i])
    print(total)