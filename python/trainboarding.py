k = list(map(int,input().split()))
n = k[0]
l = k[1]
p = k[2]

max_in = 0
max_dist = 0
cars = []
cars = [0 for i in range(n)]
for i in range(p):
    person = int(input())
    minv = float("inf")
    min_ind = 0
    i = 0
    for k in range(l//2, l*n, l):
        if person > k:
            if(person - k <= minv):
                minv = person - k
                min_ind = i
        else:
            if(k - person <= minv):
                minv = k - person
                min_ind = i
        i+=1

    cars[min_ind] += 1
    max_in = max(max_in, cars[min_ind]) 
    max_dist = max(minv, max_dist)               

print(max_dist, "\n", max_in)
            