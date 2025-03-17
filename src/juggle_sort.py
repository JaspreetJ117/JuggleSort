"""

Juggle sort
@sayanwala117 / Jaspreet Jawanda
Date Modified: 2025 - 03 - 17

Back story:
Created this sorting algorithm in class as the professor was teaching us merge sort
althogh lowkey cooked for Data structures and algoritms thought Id gain aura from making an 
sorting algortim, that did not happen I still got no aura.

what does it do?
Finds min and max, removes them then adds them to the new sorted list, and then it removes it from orginal list. 
This can be more efficent by using one list and not using the remove function. Calling it juggle sort because it juggles 
the min and max over and over again. This is very inefficent as it currently stands. If you use it and think "what was going through
this guys mind", be assured the winter semester depression is kicking in.  
    
"""

def find_min(lst):
    """
    _summary_
    find the minimum value in a list

    Args:
        lst (list): the orginal list

    Returns:
        min_val = int
    """
    min_val = lst[0]
    index = 0
    for i in range((len(lst) // 2) + 1):
        if lst[i] < min_val:
            min_val = lst[i]

        if lst[len(lst) - 1 - i] < min_val:
            min_val = lst[len(lst) - 1 - i]
            
    return min_val

def find_max(lst):
    """
    _summary_
    find the max value in a list

    Args:
        lst (list): the orginal list

    Returns:
        max_val = int
    """
    max_val = lst[0]
    
    for i in range((len(lst) // 2) + 1):
        if lst[i] > max_val:
            max_val = lst[i]
            
        if lst[len(lst) - 1 - i] > max_val:
            max_val = lst[len(lst) - 1 - i]

    return max_val

def sort(lst, sorted_lst=None, index=0):
    """_summary_
    recursivly calls and finds the min and max after remvoing the min and max in orginal. 
    also forgot to add it also creates a empty sorted list with none type. pretty sure this would
    work for a linked list too, if you manage to implement juggle sort for some like dat lemme know
    
    for my non programing buddies, this is meat of the sorting algortim.

    Args:
        lst (_type_): _description_
        sorted_lst (_type_, optional): _description_. Defaults to None.
        index (int, optional): _description_. Defaults to 0.

    Returns:
        _type_: _description_
    """
    if sorted_lst is None:
        sorted_lst = [None] * len(lst)
    
    if not lst:
        return sorted_lst
    
    min_val = find_min(lst)
    max_val = find_max(lst)
    
    sorted_lst[index] = min_val
    sorted_lst[-(index + 1)] = max_val
    
    lst.remove(min_val)
    if min_val != max_val:
        lst.remove(max_val)
    
    return sort(lst, sorted_lst, index + 1)

