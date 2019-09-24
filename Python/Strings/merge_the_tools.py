from pprint import pprint 


def split_to_chunk(arr, n):
    new_arr = [] 
    for i in range(0, len(arr), n):
        if (i + n) > len(arr):
            new_arr.append(arr[i:]) 
        else:
            new_arr.append(arr[i:i+n]) 
    return new_arr


def remove_dups(lst):
    st = set() 
    new_lst = [] 
    for i in lst:
        if i not in st:
            new_lst.append(i)
            st.add(i) 
    return new_lst 


def merge_the_tools(string, k):
   for i in split_to_chunk(string, k):
       print("".join(remove_dups(i))) 

merge_the_tools("AABCAAADA", 3)