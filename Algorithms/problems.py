def digitSumIterative(number):
    string = str(number)
    length = len(string)
    sum = 0
    for i in range(length):
        sum += int(string[i])
    return sum

def digitSumRecursive(number):
    if number == 0:
        return 0
    elif number % 10 != 0:
        return digitSumRecursive(number-1) + 1 
    else:
        return digitSumRecursive((number / 10) - 1) + 1 

def palindromeIterative(string):
    length = 1+ len(string) // 2
    number = 0
    for i in range(length):
        if string == string[::-1]:
            number += 1
    return number

def palindromeRecursive(string):
    length = len(string)
    if string != string[::-1]:
        return 0
    elif length == 1 or length == 0:
        return 1
    else:
        return 1 + palindromeRecursive(string[1:length-1])

print(digitSumIterative(126))
print(digitSumRecursive(126))
print(palindromeIterative('kayak'))
print(palindromeRecursive('kayak'))