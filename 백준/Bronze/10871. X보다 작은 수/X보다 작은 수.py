n , x = map(int,input().split())
a = list(map(int,input().split()))
i = 0
for i in range(n):
    if a[i] < x:
        print(a[i])