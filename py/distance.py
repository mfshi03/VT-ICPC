n = int(input())
trucks = [tuple(map(int, input().split())) for _ in range(n)]

a = [t[0] for t in trucks]
b = [t[1] for t in trucks]

a.sort()
b.sort()
k = len(trucks)
#print(a)
#print(b)
terma = k*a[0]
termb = k*b[0]
prefixa = [0 for i in range(k+1)]
prefixb = [0 for i in range(k+1)]
total = 0

for i in range(0,len(trucks)):
    prefixa[i+1] = prefixa[i] + a[i]
    prefixb[i+1] = prefixb[i] + b[i]
    
#print(prefixa, " ", prefixb)
k = len(trucks) - 1
for i in range(0, len(trucks)-1):
    terma = prefixa[len(trucks)] - prefixa[i+1]
    termb = prefixb[len(trucks)] - prefixb[i+1]
    # print(((i+1)*a[i]),((i+1)*b[i]),terma, termb)
    counta = abs(terma - ((k-i)*a[i]))
    countb = abs(termb - ((k-i)*b[i]))
    total += counta + countb
    
print(total)