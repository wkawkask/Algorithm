
n = int(input())
total = 0
array = []

array = list(map(int, input().split()))

array.sort()

for i in range(1,(len(array)+1)):
   for j in range(0,i):
       total += array[j]


print("%d" % total)
