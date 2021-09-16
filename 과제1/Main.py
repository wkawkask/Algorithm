
n, k = list(map(int, input().split()))
cnt = 0

array = []

for i in range(0, n):
    array.append(input())

for i in range(0, len(array)):
    if(int(k) < int(array[i])):
        continue
    cnt += int(k)/int(array[i-1])
    k = int(k) % int(array[i-1])


print("%d" % cnt)
