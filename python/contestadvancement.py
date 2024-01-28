'''
10 7 3
3 9
1 9
4 9
5 9
9 7
2 7
6 7
7 7
8 5
10 5

'''

n, adv, limit = tuple(map(int, input().split()))

freq = dict()

other = []
first = []

not_enough = True

for i in range(n):
    tid, s = tuple(map(int, input().split()))
    freq[s] = freq.get(s, 0) + 1

    if freq[s] > limit:
        other.append((tid, i))
    else:
        if adv > 0:
            first.append((tid, i))
            adv -= 1 
        else:
            other.append((tid, i))
    
for v in other:
    if adv <= 0:
        break
    adv -= 1 
    first.append(v)

first = sorted(first, key=lambda x: x[1])

for i in range(len(first)):
    print(first[i][0])





            





