import random
with open('numbers.txt', 'w') as file:
    for i in range(100000):
        file.write('%d \n' %(random.randint(1,1000000)))