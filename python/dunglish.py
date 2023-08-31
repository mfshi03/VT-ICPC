count = int(input())
words = list(map(str, input().split()))
lend = int(input())
total = 0
word_map = dict()
incorrect = dict()
correct = dict()
more = False
for i in range(lend):
    defs = list(map(str, input().split()))
    word_map[defs[0]] = defs[1]
    if defs[2] == "correct":
        correct[defs[0]] = correct.get(defs[0], 0) + 1
    else:
        incorrect[defs[0]] = incorrect.get(defs[0], 0) + 1

c = 1
t = 1
for w in words:
    c *= correct.get(w,0)
    t *= (correct.get(w,0) + incorrect.get(w, 0))
    
if t == 1:
    s = ""
    ans = "correct"
    for i in range(len(words)):
        s += word_map[words[i]]
        if words[i] in incorrect:
            ans = "incorrect"
        if i != len(words)-1:
            s += " "
    print(s)
    print(ans)
else:
    print(c,"correct")
    print(t-c, "incorrect")
