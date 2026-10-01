s = "python java python html python"
target = "python"
replacement = "java"
res = ""

i = 0
while i < len(s):
    if s[i:i+len(target)] == target:
        res += replacement
        i += len(target)
    else:
        res += s[i]
        i += 1

print(res)
