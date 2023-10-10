n = int(input())
deck = list(map(float, input().split()))

maxv = 0.0
running = 0.0

for i in range(len(deck)):
    running += deck[i]
    maxv = max(maxv, (running)/(i+1))

running = 0.0
for i in range(len(deck)):
    running += deck[n - 1 - i]
    maxv = max(maxv, (running)/(i+1))


print(maxv)
