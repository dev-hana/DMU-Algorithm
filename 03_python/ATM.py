import numpy as np

n = int(input())
p = list(map(int, input().split()))

data=np.sort(p)

temp = 0
result = 0

for i in range(0, n):
    temp += data[i]
    result += temp

print(result)