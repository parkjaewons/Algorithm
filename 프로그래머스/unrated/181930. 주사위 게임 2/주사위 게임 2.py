def solution(a, b, c):
    if a == b and a == c and b == c:
        return (a+b+c) * ((a*a)+(b*b)+(c*c)) * ((a*a*a)+(b*b*b)+(c*c*c))
    elif a == b or a == c or b == c:
        return (a+b+c) * ((a*a)+(b*b)+(c*c))
    else:
        return (a+b+c)