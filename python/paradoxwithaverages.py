testcases = int(input())
counts = []
for i in range(testcases):
    _ = input()
    n_cs, n_econ = tuple(map(int, input().split()))
    cs = list(map(int, input().split()))
    econ = list(map(int, input().split()))

    sumv = sum(cs)
    div = n_cs - 1
    avg_cs = sumv / n_cs
    avg_econ = sum(econ) / n_econ if n_econ > 0 else 0
    count = 0

    for s in cs:
        avg_wo = (sumv - s) / div
        if avg_wo > avg_cs and avg_econ < s:
            count += 1

    counts.append(count)

for i in range(len(counts)):
    print(counts[i])
