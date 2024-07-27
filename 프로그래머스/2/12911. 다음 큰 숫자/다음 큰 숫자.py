def solution(n):
    num = bin(n).count('1')
    n = n + 1
    while bin(n).count('1') != num:
        n += 1
    return n

print(solution(78)) 
print(solution(15)) 
