arr = [1, 2, 3, 4, 5, 6, 7]
d = 2
n = len(arr)

# Reverse first d elements
arr[:d] = reversed(arr[:d])

# Reverse remaining elements
arr[d:] = reversed(arr[d:])

# Reverse entire array
arr.reverse()
print(arr)
