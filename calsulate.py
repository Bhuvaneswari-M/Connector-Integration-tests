def calculate_total(items):
    total = 0
    for item in items:
        total = total + item
    return total

result = calculate_total([1, 2, 3, 4, 5])
print(result)
