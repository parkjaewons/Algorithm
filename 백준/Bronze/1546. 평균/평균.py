n = int(input())
score_list = list(map(int,input().split()))
max_score = max(score_list)

n_list = []

for score in score_list:
    n_list.append(score/max_score*100)
test_avg = sum(n_list)/n
print(test_avg)