
n = int(input())
ar = []
bestvals = []
beststored = []
for i in range(n):
  ar.append(int(input()))
  beststored.append(0)

beststored[0] = 1

for i in range(n):
  maxval = 1
  for j in range(i):
    if ar[i] % ar[j] == 0:
      maxval = max(maxval,(beststored[j])+1)
  beststored[i] = maxval

print(max(beststored))