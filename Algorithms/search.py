def linearSearch(arr, target):
    """
    Searches the array for an the first element with the same value as our target.

    Args:
        arr(list): The list that is to be searched by
        target(int): The vlaue that we want to find in our array
    
    Returns:
        -1(int): The array does not contain the target
        index(int): The index of the first number found with the same value as our target


    """
    for index, element in enumerate(arr, start=0):
        if element.calculatePriceSizeRatio() == target:
            return index
    return -1

def binarySearch(arr, target):
    """
    Searches the array for an the first element with the same value as our target.

    Args:
        arr(list): The list that is to be searched by
        target(int): The vlaue that we want to find in our array
    
    Returns:
        -1(int): The array does not contain the target
        index(int): The index of the first number found with the same value as our target
    """
    
    left = 0
    right = len(arr)
    while right >= left:
        mid = (right + left) // 2
        if arr[mid].calculatePriceSizeRatio() == target:
            return mid
        if arr[mid].calculatePriceSizeRatio() > target:
            right = mid - 1
        else:
            left = mid + 1
    return -1

        