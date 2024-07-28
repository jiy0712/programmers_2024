import math

def lcm(a, b):
    return a * b // math.gcd(a, b)

def solution(arr):
    res = arr[0]
    for num in arr[1:]:
        res = lcm(res, num)
    return res
