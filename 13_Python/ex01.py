def solution(n, arr1, arr2):
    ans = []
    for i in range(n):
        bin_str = bin(arr1[i] | arr2[i])[2:]
        ans.append(("0" *(n - len(bin_str)) + bin_str).replace("1", "#")
                                                      .replace("0", " "))
    return ans

n = int(input())

inputString1 = input()
inputString1 = inputString1.replace("[", "").replace("]", "")
arr1 = list(map(int, inputString1.split(",")))

inputString2 = input()
inputString2 = inputString2.replace("[", "").replace("]", "")
arr2 = list(map(int, inputString2.split(",")))
print(solution(n, arr1, arr2))
