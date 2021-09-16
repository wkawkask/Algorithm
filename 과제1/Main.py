
n, k = list(map(int, input().split()))
cnt = 0
array = []

for i in range(0, n):
    array.append(int(input()))

for i in range(len(array),0,-1):
    if( k < array[i-1] ):
        continue
    cnt += k // array[i-1]
    k = k % array[i-1]

print("%d" % cnt)
