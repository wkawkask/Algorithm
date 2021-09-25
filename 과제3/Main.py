
arr1 = [2,3,0,4,0,8]
j = 0

for i in range(0,len(arr1)):
    if(arr1[i] != 0):
        arr1[j] = arr1[i]
        j += 1
    
for i in range(j,len(arr1)):
    arr1[i] = 0;

print(arr1)


