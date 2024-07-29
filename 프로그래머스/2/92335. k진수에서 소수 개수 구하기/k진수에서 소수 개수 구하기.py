def solution(n, k):
    def prime(num):
        if num < 2:
            return False
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

    def base(n, b):
        if n == 0:
            return "0"
        conv = ""
        while n > 0:
            conv = str(n % b) + conv
            n //= b
        return conv

    k_base = base(n, k)
    candidates = k_base.split('0')
    prime_count = 0
    
    for candidate in candidates:
        if candidate and prime(int(candidate)):
            prime_count += 1

    return prime_count
