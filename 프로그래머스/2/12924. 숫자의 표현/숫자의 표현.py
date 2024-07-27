def solution(n):
    count = 0
    for start in range(1, n + 1):
        sum = 0
        while sum < n:
            sum += start
            start += 1
        if sum == n:
            count += 1
    return count

print(solution(15))
print(solution(1))   
print(solution(3))   
print(solution(10))  
print(solution(10000))  
