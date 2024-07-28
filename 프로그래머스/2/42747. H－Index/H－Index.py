def solution(citations):
    citations.sort(reverse=True)
    return max(min(c, i + 1) for i, c in enumerate(citations))
