# 비트 연산을 통해 문자의 대소문자 바꾸기
string = "CheRrY" 
result = []

for i in range(0, len(string)):
    temp = ord(string[i])
    result.append(temp)
    result[i] ^= 32
    result[i] = chr(result[i])

print(''.join(result))
    
