s = input()
n = len(s)
i = 0

temp = ""
last = 1
w = True

while i < n:

    temp += str(last)
    i += len(str(last))
    last += 1

    if temp != s[:i]:
        w = False 
        print(-1)
        break

if w:
    print(last - 1)