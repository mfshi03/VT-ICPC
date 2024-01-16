# TLE RIP working solutions get to 700 characters

import sys
sys.setrecursionlimit(1000000)

n, d = map(int, input().split())

mess = [0 for i in range(n)]
times = [0 for i in range(n)]
prefix = [0 for i in range(n + 1)]

for i in range(n):
    m, c = map(int, input().split())
    mess[i] = m
    prefix[i+1] = prefix[i] + m
    times[i] = c

cache = dict()

def recur(start, i, target, count):
    if target <= 0:
        return count 

    if i < start:
        return float("inf")

    if (i, target, count) in cache:
        return cache[(i, target, count)]


    removed = min(times[i], prefix[i+1] - prefix[start])
    
    cache[(i, target, count)] = min(recur(start, i - 1, target - removed, count + 1), recur(start, i - 1, target, count))

    return cache[(i, target, count)]
    

cdays = 0
start = 0
np = False
days = []

for i in range(d):
    days.append(int(input()))
    
for day in days:

    if times[day - 1] < mess[day - 1]:
        np = True
        break

    clean_days = recur(start, day - 1, prefix[day] - prefix[start], 0)

    if clean_days == float("inf"):
        np = True
        break

    cdays += clean_days
    start = day

if np:
    print(-1)
else:
    print(cdays)



