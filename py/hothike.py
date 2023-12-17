
n = int(input())
days = list(map(int, input().split()))

trip = []
minv = float('inf')
maxv = 0
index = 0

for i in range(n - 2):
    trip.append(days[i])
    trip.append(days[i+2])
    #print(trip)
    sorts = sorted(trip)
    if sorts[1] < minv:
        index = i
        minv = sorts[1]
    trip.clear()
        
print(index + 1, minv)