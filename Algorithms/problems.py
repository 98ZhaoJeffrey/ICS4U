def digitSumIterative(number):
    """
    Finds the sum of the digits of a number iteratively

    Args:
        numnber(int)
    
    Returns:
        sum(int): The sum of the digits of our number 

    """
    string = str(number)
    length = len(string)
    sum = 0
    for i in range(length):
        sum += int(string[i])
    return sum

def digitSumRecursive(number):
    """
    Finds the sum of the digits of a number recursively

    Args:
        numnber(int)
    
    Returns:
        sum(int): The sum of the digits of our number 
    """
    if number == 0:
        return 0
    elif number % 10 != 0:
        return digitSumRecursive(number-1) + 1 
    else:
        return digitSumRecursive((number / 10) - 1) + 1 

def palindromeIterative(string):
    """
    Finds the number of palindromes in our string iteratively
    
    Args:
        numnber(int)
    
    Returns:
        sum(int): The sum of the digits of our number 
    """
    string = string.lower()
    length = len(string)
    number = 0
    for i in range(length):
        for j in range(i+1, length+1):
            tmp = string[i:j]
            if tmp == tmp[::-1] and len(tmp) > 1:
                number += 1
    return number

def palindromeRecursive(string):
    """
    Finds the number of palindromes in our string recursively
    
    Args:
        numnber(int)
    
    Returns:
        sum(int): The sum of the digits of our number 
    """
    length = len(string)
    if string != string[::-1]:
        return 0
    elif length <= 1:
        return 0
    else:
        return 1 + palindromeRecursive(string[1:length-1])



print(digitSumIterative(126))
print(digitSumRecursive(126))
print(palindromeIterative('kayak'))
print(palindromeRecursive('kayak'))