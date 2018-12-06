cube = lambda x: x**3# complete the lambda function 

def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    return fib(n-1) + fib(n-2) 

def fibonacci(n):
    # return a list of fibonacci numbers
    return [fib(i) for i in range(n)] 

