n_list = [list(map(int, input().split())) for _ in range(9)]

n = 0
row, col = 0, 0
for r in range(9):
    for c in range(9):
        if n <= n_list[r][c]:
            row = r + 1
            col = c + 1
            n = n_list[r][c]

print(n)
print(row, col)