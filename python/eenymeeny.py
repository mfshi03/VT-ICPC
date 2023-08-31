length = len(list(map(str,input().split())))

n = int(input())
kids = []

for i in range(n):
    next = input()
    kids.append(next)

teamO = []
teamT = []
i = 0
par = 0
while(len(kids) > 0):
    #print(kids)
    temp = kids[(i + length) % len(kids)]
    if(par%2 == 0):
        teamO.append(kids.pop((i + length - 1) % len(kids)))
    else:
        teamT.append(kids.pop((i + length - 1) % len(kids)))
        
    if(len(kids) < 1):
        break
    i = kids.index(temp)
    par += 1 
    
print(len(teamO))

for i in range(len(teamO)):
    print(teamO[i])
    
    
print(len(teamT))

for i in range(len(teamT)):
    print(teamT[i])