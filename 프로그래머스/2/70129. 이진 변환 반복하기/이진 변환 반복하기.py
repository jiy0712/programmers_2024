def solution(s):
    count = 0
    total = 0
    
    while s != "1":
        z = s.count('0')
        total += z
        
        s = s.replace('0', '')
        length = len(s)
        
        s = bin(length)[2:]
        
        count += 1
    
    return [count, total]

print(solution("110010101001"))  # [3, 8]
print(solution("01110"))         # [3, 3]
print(solution("1111111"))       # [4, 1]
