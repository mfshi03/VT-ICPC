n = int(input())

comp = []
teams = 0
team = []
for i in range(1, n + 1):
    a, b = tuple(map(int, input().split()))
    comp.append((i, a, b))

for i in range(len(comp)):
    r, a, b = comp[i][0], comp[i][1], comp[i][2]
    nteam = []
    if len(team) == 0:
        team.append((r, a, b))
    else:
        for t in team:
            if t[1] <= r <= t[2] and a <= t[0] <= b:
                nteam.append(t)

        nteam.append((r, a, b))
        team = nteam
            
    if len(team) == 3:
        team = []
        teams += 1

print(teams)





