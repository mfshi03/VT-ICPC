t = int(input())

while t > 0:
    num = input()
    res = []
    for i in range(1, min(len(num), 5) + 1):
        curr = num[:i]
        first = int(curr)
        v = int(curr)
        skips = 0
        skipv = -1
        ind = i

        while True:
            v += 1
            s = str(v)
            curr = num[ind:ind + len(s)]
            if s == curr:
                ind += len(s)
            else:
                skipv = v
                skips += 1

            if ind >= len(num):
                if skips == 1 and skipv != v:
                    if 0 < skipv < 100000:
                        res.append(skipv)
                else:
                    if 0 < first - 1 < 100000:
                        res.append(first - 1)
                    if skipv == -1:
                        if 0 < v + 1 < 100000:
                            res.append(v + 1)
                    else:
                        if 0 < skipv < 100000:
                            res.append(skipv)
                break
            
            if skips == 2:
                break


    print(len(res))
    res.sort()
    print(*res)
    t -= 1




