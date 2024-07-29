def solution(n, t, m, p):
    def base(num, b):
        conv = "0123456789ABCDEF"
        if num == 0:
            return "0"
        digits = ""
        while num:
            digits += conv[num % b]
            num //= b
        return digits[::-1]

    answer = ''
    num = 0
    turn = 0
    
    while len(answer) < t:
        base_num = base(num, n)
        for char in base_num:
            if turn % m == p - 1:
                answer += char
                if len(answer) == t:
                    break
            turn += 1
        num += 1
        
    return answer
