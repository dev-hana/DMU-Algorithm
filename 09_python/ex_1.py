# 비트 연산을 통해 짝수, 홀수 판별하기
n = 16

if (n&1) == 0:
    print("Even")
else:
    print("Odd")