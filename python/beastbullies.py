
n = int(input())
strengths = [int(input()) for i in range(n)]

strengths = sorted(strengths, reverse=True)

strong_strength = strengths[0]
strong_size = 1

weak_strength = 0
weak_size = 0

for strength in strengths[1:]:
    weak_strength += strength
    weak_size += 1
    if weak_strength >= strong_strength:
        strong_strength += weak_strength
        strong_size += weak_size
        weak_strength = 0
        weak_size = 0

print(strong_size)