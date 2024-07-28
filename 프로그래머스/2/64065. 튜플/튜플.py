def solution(s):
    s = sorted(s[2:-2].split("},{"), key=len)
    res = []
    for group in s:
        nums = group.split(',')
        for num in nums:
            if int(num) not in res:
                res.append(int(num))
    return res
