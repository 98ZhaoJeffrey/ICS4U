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
        string(str)
    
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

def palindromeRecursiveHelper(string):
    """
    Finds the number of palindromes in our string recursively
    
    Args:
        string(str) 
    
    Returns:
        Array: Every possible substring of the string
    """
    length = len(string)
    
    if length == 0:
        return [string]
    total = []
    total.append(string)
    total += palindromeRecursiveHelper(string[1:])
    total += palindromeRecursiveHelper(string[:-1])
    return set(total)

def palindromeRecursive(string):
    """
    Finds the number of palindromes in our string recursively
    
    Args:
        string(str)
    
    Returns:
        Int: The number of unique palindromes that are not single chars or empty strings
    """
    stringArray = palindromeRecursiveHelper(string)
    palindromes = []
    for String in stringArray:
        if len(String) > 1 and  String == String[::-1]:
            palindromes.append(String)
    return len(set(palindromes))

    



print(digitSumIterative(126))
print(digitSumRecursive(126))
print(palindromeIterative('kayaka'))
print(palindromeRecursive('kayaka'))