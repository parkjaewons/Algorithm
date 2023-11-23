def solution(num_list):
    answer = 0
    n = 1
    p = 0
    for i in num_list:
        n *= i
        p += i
        
    answer = 1 if n < p*p else 0
    return answer