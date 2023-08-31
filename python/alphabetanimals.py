first = input()
n = int(input())
lasts =  set()
name = '?'

counts = dict()

animals = []
names = []
for i in range(n):
    next = input()
    counts[next[0]] = counts.get(next[0], 0) + 1
    if first[len(first)-1] == next[0]:
        names.append(next) 

for i in range(len(names)):
    name = names[0]
    count = 0
    if(names[i][0] == names[i][len(names[i])-1]):
        count = 1
    #print(counts[names[i][len(names[i])-1]])
    if(names[i][len(names[i])-1] not in counts or counts[names[i][len(names[i])-1]] - count  < 1):
        name = names[i] + '!'
        break
        
print(name)