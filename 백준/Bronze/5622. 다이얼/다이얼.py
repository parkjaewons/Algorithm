alp = str(input())

NUM = ['','ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
time = 0
for j in range(len(alp)): ## 입력받은 문자들 하나씩에 대하여
    for i in range(len(NUM)):
        if alp[j] in NUM[i]: ## 입력받은 문자가 NUM[i] 안에 있으면
            time += NUM.index(NUM[i])+2
print(time)