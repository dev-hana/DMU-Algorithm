# 거스름돈의 최소 동전 개수

#n = 1260

while True:
    try:
        n = int(input("금액을 입력해주세요: "))
        break
    except ValueError:
        print("숫자를 입력해 주세요")  

cnt = 0

array = [500, 100, 50, 10]

for coin in array:
    cnt += n // coin
    n %= coin

print("최소 동전 개수: ", cnt)