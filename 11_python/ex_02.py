def findElement(arr, n):
    leftMax = [None] * n
    leftMax[0] = arr[0]

    for i in range(1, n):
        leftMax[i] = max(leftMax[i-1], arr[i-1])
 
    rightMin = [None]*n
    rightMin[n-1] = arr[n-1]
 
    for i in range(n-2, -1, -1):
        rightMin[i] = min(rightMin[i+1], arr[i])
    
    sts = 0;
    for i in range(1, n-1):
        if leftMax[i-1] <= arr[i] and arr[i] <= rightMin[i+1]:
            print(i)
            sts = 1
    if sts == 0:
        print(-1)
 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
n = len(arr)
findElement(arr, n)