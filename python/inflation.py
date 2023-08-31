
n = int(input())
cans = sorted(list(map(int, input().split())))


minv = 1
nimp = True
for i in range(n):
    if cans[i] > i + 1:
        print("impossible")
        break    

    minv = min(minv, cans[i]/(i+1))

else:
    print(minv)
    