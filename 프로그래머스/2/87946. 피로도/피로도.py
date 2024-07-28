from itertools import permutations

def solution(k, d):
    m = 0
    for p in permutations(d):
        s, c = k, 0
        for r, cns in p:
            if s >= r:
                s -= cns
                c += 1
        m = max(m, c)
    return m
