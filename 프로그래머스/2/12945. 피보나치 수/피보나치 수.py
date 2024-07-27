def solution(n):
    if n == 2:
        return 1
    fib = [0] * (n + 1)
    fib[1] = 1
    for i in range(2, n + 1):
        fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567
    return fib[n]


print(solution(3))  
print(solution(5))  
print(solution(100000))