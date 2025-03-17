"""
Testing for juggle sort

@sayanwala117 / Jaspreet Jawanda 
"""

from random import randint
import juggle_sort as js

def create_random(size):
    result = []
    for i in range(size):
        result.append(randint(0, 100))
    return result

#test 1
print(js.sort([3, 5, 1, 8, 2, 7]))
#test 2
print(js.sort(create_random(9)))
#test 1
print(js.sort([3, 5, 1, 1, 2, 7]))
#test 2
print(js.sort(create_random(10)))

