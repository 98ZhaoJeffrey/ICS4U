def bubbleSort(arr):
    """
        Sorts our array

    Args:
        arr(list): The list that is to be sorted
    
    Returns:
        arr(list): The sorted array
    """
    size = len(arr)
    #loop through the whole array
    for i in range(size):
        #loop through the whole array until we reach the point where the elements are sorted
        for j in range(0, size-i-1):
            #swap elements when they are out of order
            if arr[j].calculatePriceSizeRatio() > arr[j+1].calculatePriceSizeRatio():
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

def insertionSort(arr):
    """
    Sorts our array

    Args:
        arr(list): The list that is to be sorted
    
    Returns:
        arr(list): The sorted array
    """
    size = len(arr)
    for i in range(1, size):
        #get the curr item of the array
        curr = arr[i]
        #access to every element before it
        j = i-1
        #only run when the element to be sorted is less than some element in the array
        while curr.calculatePriceSizeRatio() < arr[j].calculatePriceSizeRatio() and j >= 0:
            arr[j+1] = arr[j]
            j-=1
        #move the array up one element
        arr[j+1] = curr
    return arr
