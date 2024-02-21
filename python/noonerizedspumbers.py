a, op, b, _, c = input().split()
#print(a, b, c)
def solve():
    #print(a,b,c)
    #print(len(a), len(b), len(c))
    for i in range(1, len(a)):
        for j in range(1, len(b)):
            na = b[:j] + a[i:]
            nb = a[:i] + b[j:]
            if op == "+":
                if (int(na) + int(nb)) == int(c):
                    return " ".join([na, op, nb, "=", c])
            else:
                if (int(na) * int(nb)) == int(c):
                    return " ".join([na, op, nb, "=", c])


    for i in range(1, len(a)):
        for j in range(1, len(c)):
            na = c[:j] + a[i:]
            nc = a[:i] + c[j:]

            if op == "+":
                if (int(na) + int(b)) == int(nc):
                    return " ".join([na, op, b, "=", nc])
            else:
                if (int(na) * int(b)) == int(nc):
                    return " ".join([na, op, b, "=", nc])

    for i in range(1, len(b)):
        for j in range(1, len(c)):
            nb = c[:j] + b[i:]
            nc = b[:i] + c[j:]

            if op == "+":
                if (int(a) + int(nb)) == int(nc):
                    return " ".join([a, op, nb, "=", nc])
            else:
                if (int(a) * int(nb)) == int(nc):
                    return " ".join([a, op, nb, "=", nc])
    return "what"

print(solve())