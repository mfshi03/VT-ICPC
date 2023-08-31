arr = list(map(str,input().split()))
#print(arr)
cons = ['b','c','d','g','k','n','p','t']
end = ['a', 'o', 'u']

final = ''
for i in range(len(arr)):
    s = arr[i]
    syl = s.split("-")
    s = list(syl[0])
    if s[0].lower() not in cons:
        mini = float("inf")
        mdiff = float("inf")
        for j in range(len(cons)):
            #print(cons[j], s[0])
            diff = abs(ord(cons[j]) - ord(s[0].lower()))
            #print(id(cons[j]),id(s[0]))
            if diff < mdiff:
                mdiff = diff
                mini = j
        #print(cons[mini])
        s[0] = cons[mini]
    s = "".join(s)
    syl[0] = s
    #print(s)
    for k in range(1, len(syl)):
        word = list(syl[k])
        #print(word)
        #print(s[0])
        for f in range(len(word)):
            if word[f] != s[0] and word[f] in cons:
                word[f] = s[0].lower()

        syl[k] = "".join(word)
        #print(syl)

    word1 = "".join(syl)
    word1 = list(word1)
    #print(word1)

    if word1[len(word1)-1] in cons:
            mini = float("inf")
            mdiff = float("inf")
            for j in range(len(end)):
                diff = abs(ord(end[j]) - ord(word1[len(word1)-1]))
                if diff < mdiff:
                    mdiff = diff
                    mini = j
            #print(end[mini] + "h")
            word1[len(word1)-1] += end[mini] + "h"

    word1 = "".join(word1)
    if i != len(arr) - 1:
        final += word1 + " "
    else:
        final += word1

final = list(final)
final[0] = final[0].upper()
final = "".join(final)
print(final)