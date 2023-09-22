word = str(input())
word = word.upper()
S_list = list(set(word))

cnt = []

for i in range(len(S_list)):
    cnt.append(list(word).count(S_list[i]))
Max = max(cnt)

if cnt.count(Max) != 1:
    print("?")
else:
    print(S_list[cnt.index(Max)])