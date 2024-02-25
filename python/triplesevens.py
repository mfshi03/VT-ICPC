n = int(input())

s = 3 
for i in range(3):
    nums = list(map(int, input().split()))
    for v in nums:
        if v == 7:
            s -= 1 
            break

if s == 0:
    print("777")
else:
    print("0")