def solution(clothes):
    from collections import Counter
    from functools import reduce
    
    c = Counter([kind for _, kind in clothes])
    return reduce(lambda x, y: x * (y + 1), c.values(), 1) - 1
