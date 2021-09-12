# 동전0
import numpy as np

while True:
    try:
        coin_cnt = int(input("동전 종류의 개수를 입력해주세요: "))
        break
    except ValueError:
        print("숫자를 입력해 주세요")

while True:
    try:
        n = int(input("금액을 입력해주세요: "))
        break
    except ValueError:
        print("숫자를 입력해 주세요")

type_array = []

for i in range(coin_cnt):
    while True:
        try:
            coin_type = int(input("동전의 종류를 입력해주세요: "))
            break
        except ValueError:
            print("숫자를 입력해 주세요")
    type_array.append(coin_type)

type_array=np.sort(type_array)[::-1]
#print(type_array)
cnt = 0

for coin in type_array:
    cnt += n // coin
    n %= coin


print("최소 동전 개수: ", cnt)