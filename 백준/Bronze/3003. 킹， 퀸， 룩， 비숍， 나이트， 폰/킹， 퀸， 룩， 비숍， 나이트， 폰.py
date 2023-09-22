b_list = [1,1,2,2,2,8]
w_list = list(map(int,input().split()))

for i in range(6):
    print(b_list[i] - w_list[i], sep="")