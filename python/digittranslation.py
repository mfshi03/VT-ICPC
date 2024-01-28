s = str(input())

freq = dict()
vows = set(['a', 'e', 'i', 'o', 'u', 'y'])
for c in s:
    if c in vows:
        freq[c] = freq.get(c, 0) + 1
        
total = 0

for key in freq:
    total += freq[key]

print(total - freq.get('y', 0), total)