from search import linearSearch, binarySearch
from sort import bubbleSort, insertionSort
from datetime import datetime
from random import choice
from house import House
#python is already slow enough as it is so the file is only 50000 elements because I didn't want to wait 10 years to finish bubblesort
def main():
    priceArray = []
    sizeArray = []
    houseArray = []
    with open('price.txt', 'r') as input:
        priceArray = input.readlines()
    priceArray = [int(i) for i in priceArray]

    with open('size.txt', 'r') as input:
        sizeArray = input.readlines()
    sizeArray = [int(i) for i in sizeArray]

    for i in range(len(priceArray) - 1):
        houseArray.append(House(priceArray[i], sizeArray[i]))

    #sorting(sorted, houseArray)
    #sorting(insertionSort, houseArray)
    #sorting(bubbleSort, houseArray)
    
    target = choice(houseArray).calculatePriceSizeRatio()

    searching(linearSearch, target, houseArray)
    searching(binarySearch, target, houseArray)
    return 0


def sorting(function, array):
    print(f"{function.__name__} is now starting to sort the array")
    start = datetime.now()
    if function.__name__ == 'sorted':
        arr = function(array, key=lambda x: x.calculatePriceSizeRatio())
    else:
        arr = function(array)
    end = datetime.now() 
    print(f"{function.__name__} has finished sorting the array in {(end-start).total_seconds()} seconds")
    print("====================")
    with open(f'outputs/{function.__name__} outputs.txt', 'w') as outputs:
        for house in arr:
            outputs.write(f'{house} \n')
    return arr

def searching(function, target, array):
    print(f"{function.__name__} is now starting to search the array for {target}")
    start = datetime.now()
    if function.__name__ == 'binarySearch':
        array = sorted(array, key=lambda x: x.calculatePriceSizeRatio())
    result = function(array, target)
    end = datetime.now()
    print(f"The element was found at index {result}" if result > 0 else "The element was not found in the array")
    print(f"{function.__name__} has finished searching the array in {(end-start).total_seconds()} seconds")
    print("====================")

if __name__ == '__main__':
    main()