# This is the program that prints out the first 20 numbers of the fibonacci sequence.

import sys
import numpy as np
import pandas as pd

# Start off by printing the first two numbers of the sequence.
var1 = 0
var2 = 1

def fibonacciSequence(var1, var2):
    print(var1)
    print(var2)
    nextFib = var1 + var2
    print(nextFib)

    for i in range(17):
        var1 = var2
        var2 = nextFib
        nextFib = var1 + var2
        print(nextFib)

    """"
    This is the sequence that is repeating. This is the sequence that I need to iterate {
    var1 = var2
    var2 = nextFib
    nextFib = var1 + var2
    print(nextFib)

    """

fibonacciSequence(0, 1)