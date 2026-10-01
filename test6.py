arr = [1, 2, 3, 4, 5, 6, 7]
d = 2
n = len(arr)

# Reverse first part
start, end = 0, d - 1
while start < end:
    arr[start], arr[end] = arr[end], arr[start]
    start += 1
    end -= 1

# Reverse second part
start, end = d, n - 1
while start < end:
    arr[start], arr[end] = arr[end], arr[start]
    start += 1
    end -= 1

# Reverse full array
arr.reverse()
print(arr)
