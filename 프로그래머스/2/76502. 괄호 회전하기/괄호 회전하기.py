def solution(s):
    def is_valid(s):
        stack = []
        pairs = {')': '(', '}': '{', ']': '['}
        for ch in s:
            if ch in pairs.values():
                stack.append(ch)
            elif ch in pairs.keys():
                if not stack or stack.pop() != pairs[ch]:
                    return False
        return not stack

    n = len(s)
    count = 0
    for i in range(n):
        if is_valid(s[i:] + s[:i]):
            count += 1
    return count
