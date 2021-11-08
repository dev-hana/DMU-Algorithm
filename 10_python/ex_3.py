# 가장 오른쪽 0값의 비트를 1로 바꾼 값 찾기
import math
def getPosOfRightmostSetBit(n):
    return int(math.log2(n&-n)+1)
 
  
def setRightmostUnsetBit(n):
    if (n == 0):
        return 1
      
    if ((n & (n + 1)) == 0):   
        return n

    pos = getPosOfRightmostSetBit(~n)   
    return ((1 << (pos - 1)) | n)

n = 21
print(setRightmostUnsetBit(n))
