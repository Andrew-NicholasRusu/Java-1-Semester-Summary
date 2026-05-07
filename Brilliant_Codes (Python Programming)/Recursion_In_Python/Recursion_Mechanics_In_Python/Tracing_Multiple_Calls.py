"Let's trace through what happens when a recursive function calls itself more than once."
# When vinary (4) makes two recursive calls, which one happens first.

def binary_coins(n):
    if n == 1:
        return 32
    if n == 2:
        return 16
    yesterday = binary_coins(n - 1)
    two_days_ago = binary_coins(n - 2)
    return (yesterday + two_days_ago) // 2
total = binary_coins(4)
# Answer: binary_coins(3)
    # binary_coins(4) first executes yesterday = binary_coins(n - 1), which calls binary_coins(3). 
    # The second call, binary_coins(n - 2), doesn't happen until the first one finishes.

# Binary_coins(4) calls binary_coins(3). What happens next?

def binary_coins(n):
    if n == 1:
        return 32
    if n == 2:
        return 16
    yesterday = binary_coins(n - 1)
    two_days_ago = binary_coins(n - 2)
    return (yesterday + two_days_ago) // 2
total = binary_coins(4)
# Answer: binary_coins(3) calls binary_coins(2)
    # binary_coins(3) starts executing and hits its own first recursive call: yesterday = binary_coins(n - 1), which calls binary_coins(2). 
    # Each call must fully resolve before the next one begins.

# binary_coins(4) calss both binary_coins(3) and binary_coins(2), but they don't happen back to back.

def binary_coin(n):
    if n == 1:
        return 32
    if n == 2:
        return 16
    # if a recursive call happens in the middle of a function, it must bottom out beofre executing the rest of the function.
    yesterday = binary_coins(n - 1) 
    two_days_ago = binary_coins(n - 2)
    return (yesterday + two_days_ago) // 2
total = binary_coins(4)

# binary_coins(2) returns 16 to its caller, binary_coins(3). What happens next?

def binary_coins(n):
    if n == 1:
        return 32
    if n == 2:
        return 16
    yesterday = binary_coins(n - 1) 
    two_days_ago = binary_coins(n - 2)
    return (yesterday + two_days_ago) // 2
total = binary_coins(4)
# Answer: binary_coins(3) calls binary_Coins(1)
    # Now binary_coins(3) has yesterday = 16. It moves to its second recursive call: two_days_ago = binary_coins(n - 2), 
    # which calls binary_coins(1).

"Understanding how the call stack unfold with multiple recursvie calls is crucial to resoning about algorithms."


    