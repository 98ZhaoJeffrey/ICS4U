class House:

    def __init__(self, price, size):
        self.__price = price
        self.__size = size

    def getPrice(self):
        return self.__price

    def setPrice(self, price):
        self.__price = price

    def getSize(self):
        return self.__size

    def setSize(self, size):
        self.__size = size
    
    def calculatePriceSizeRatio(self):
        return self.getPrice()//self.getSize()

    def __str__(self):
        return (f"Price: {self.getPrice()}, Size: {self.getSize()}")