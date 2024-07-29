def solution(pr, lc):
    q = [(v, i) for i, v in enumerate(pr)]
    cnt = 0
    
    while True:
        cur = q.pop(0)
        if any(cur[0] < x[0] for x in q):
            q.append(cur)
        else:
            cnt += 1
            if cur[1] == lc:
                return cnt
