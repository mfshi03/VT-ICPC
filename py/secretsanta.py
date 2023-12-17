# using the derangement problem formulation
n = int(input())

n = 1000 if n > 1000 else n

prob = 0
fact = 1
for i in range(n+1):
    if i > 0:
        fact *= i
    prob += (-1)**i / fact
    
print(1 - prob)