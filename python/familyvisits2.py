# Attempt 2 
n, d = map(int, input().split())
days = [list(map(int, input().split())) for i in range(n)]
visits = [int(input()) for i in range(d)]
prefix = [0 for i in range(n + 1)]
for i in range(n):
    prefix[i+1] = days[i][0] + prefix[i]

dp = dict()

sol = 0

def solve(start, n):
    s = n - start + 1 
    for k in range(s+1):
        for i, day in reversed(list(enumerate(days[start:n+1], 1))):
            if i == s:
                if k == 0:
                    dp[(i, k)] = -day[0]
                else:
                    dp[(i, k)] = day[1] - day[0]
            else:
                allowed = min(day[1], prefix[start + i] - prefix[start])
                if k > 0 and dp[(i + 1, k - 1)] >= 0:
                     dp[(i, k)] = max(dp[(i + 1, k)] - day[0], dp[(i + 1, k - 1)] + allowed - day[0])
                else:
                     dp[(i, k)] = dp[(i + 1, k)] - day[0]
        
        if dp[(1, k)] >= 0:
            return k

    return float("-inf")


start = 0
np = False

for v in visits:
    add = solve(start, v - 1)
    start = v
    dp = dict()
    if add < 0:
        np = True
        break

    sol += add

if np:
    print(-1)
else:
    print(sol)


        


