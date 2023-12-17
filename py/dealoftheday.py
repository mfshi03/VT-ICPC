cards = list(map(int, input().split()))
K = int(input())
cards_dict = dict()

for i, c in enumerate(cards):
    if c > 0:
        cards_dict[i] = c
    
keys = sorted(list(cards_dict.keys()))
dp = dict()
def dfs(index, count):

    if (index, count) in dp:
        return dp[(index, count)]

    if index >= len(keys):
        if count == K:
            return 1
        else:
            return 0

    
    sum = cards_dict[keys[index]] * dfs(index + 1, count + 1) + dfs(index + 1, count)
    dp[(index, count)] = sum
    return sum

print(dfs(0, 0))