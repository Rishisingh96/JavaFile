import time

start = time.time()

total = 0
for i in range(1, 100000001):
    total += i

end = time.time()

print("Sum of 1 to 100000000:", total)
print("Time taken to execute the code is: {:.2f} ms".format((end - start) * 1000))
