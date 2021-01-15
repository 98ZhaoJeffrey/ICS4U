from search import linearSearch, binarySearch
from sort import bubbleSort, insertionSort
from datetime import datetime
from random import choice

#python is already slow enough as it is so the file is only 50000 elements because I didn't want to wait 10 years to finish bubblesort
def main():
    inputsArray = []
    with open('numbers.txt', 'r') as input:
        inputsArray = input.readlines()
    inputsArray = [int(i) for i in inputsArray]

    searchArray = sorting(sorted, inputsArray)
    sorting(insertionSort, inputsArray)
    sorting(bubbleSort, inputsArray)
    
    target = choice(inputsArray)

    searching(linearSearch, target, inputsArray)
    searching(binarySearch, target, inputsArray)
    return 0


def sorting(function, array):
    print(f"{function.__name__} is now starting to sort the array")
    start = datetime.now()
    arr = function(array)
    end = datetime.now() 
    print(f"{function.__name__} has finished sorting the array in {(end-start).total_seconds()} seconds")
    print("====================")
    with open(f'outputs/{function.__name__} outputs.txt', 'w') as outputs:
        for number in arr:
            outputs.write(f'{number} \n')
    return arr

def searching(function, target, array):
    print(f"{function.__name__} is now starting to search the array for {target}")
    start = datetime.now()
    if function.__name__ == 'binarySearch':
        array = sorted(array)
    result = function(array, target)
    end = datetime.now()
    print(f"The element was found at index {result}" if result > 0 else "The element was not found in the array")
    print(f"{function.__name__} has finished searching the array in {(end-start).total_seconds()} seconds")
    print("====================")

if __name__ == '__main__':
    main()