n, k= map(int,input().split())
li = []
count = 0

for _ in range(n):
    li.append(int(input()))
li.reverse()

for i in li:
    count += k // i
    k %= i
print(count)