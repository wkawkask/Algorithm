
n, k = list(map(int, input().split()))
cnt = 0
array = []

for i in range(0, n):
    array.append(input())

for i in range(len(array),0,-1):
    print("sum" , k)
    if(int(k) < int(array[i-1])):
        continue

    print("sum2" , int(k)//int(array[i-1]))
    cnt += int(k)//int(array[i-1])
    k = int(k) % int(array[i-1])

print("%d" % cnt)
