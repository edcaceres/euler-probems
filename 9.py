import time

def getResult():
    res = 0
    for a in range(1, 1000 / 3):
        for b in range(a, 1000 / 2):
            for c in range(b, 1000):
                if (a**2 + b **2) == c**2 and a + b + c == 1000:
                    res = a * b * c
                    break
            if res != 0:
                break
        if res != 0:
            break
    return res

s = time.time()
r = getResult()
f = time.time()
print(r, f - s) # (31875000, 10.100466012954712)
