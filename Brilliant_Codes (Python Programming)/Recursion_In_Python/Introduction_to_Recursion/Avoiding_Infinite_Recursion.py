"Some of the minting functions have bugs. Let's find and fix them"
# Why does this program cause a RecursionError?

def stack_coins(n):
    return n + stack_coins(n - 1)
total = stack_coins(4)
print(f"StackCoins Day 4: {total}")
print() # Space
# Answer: The function doesn't have a base case, so it never stops calling itself.
    # The stack_coins function calls itself with n - 1 but has no base case to stop the recursion. 
    # Without a condition like if n == 1: return 1, the calls continue past 0 into negative numbers and never stop.

# Fix the function to avoid infinite recursion.

def stack_coins(n):
    if n == 1:
        return 1
    return n + stack_coins(n - 1)
total = stack_coins(4)
print(f"StackCoins Day 4: {total}")
print() # Space
# Answer:
    # Adding the base case if n == 1: return 1 gives the recursion a stopping point. 
    # Now stack_coins(4) calls down to stack_coins(1), which returns 1 instead of recursing further.

"When a recursive function runs, the call stack must reach a base case. Otherwise, it causes infinite recursion."

# Why does this program cause a RecursionError?

def cache_coins(n):
    if n == 1:
        return 1
    return 2 * cache_coins(n + 1)
total = cache_coins(5)
print(f"CacheCoins Day 5: {total}")
print() # Space
# Answer: The recursive call moves n away from the base case, not closer.
    # The base case checks n == 1, but the recursive call uses cache_coins(n + 1). 
    # Starting from n = 5, the calls go to n = 6, 7, 8, ... — moving away from 1, not toward it.

# Fix the function to avoid infinite recursion.

def cache_coins(n):
    if n == 1:
        return 1
    return 2 * cache_coins(n - 1) # Changing the recursive call from cache_coins(n + 1) to cache_coins(n - 1) makes n decrease toward the base case n == 1.
    # Now cache_coins(5) calls down to cache_coins(1), which returns 1.
total = cache_coins(5)
print(f"CacheCoins Day 5: {total}")
print() # Space

# Why does this program cause a RecursionError?

def queue_coins(n):
    if n == 1:
        return 5
    return 2 * queue_coins(n) + 5
total = queue_coins(6)
print(f"QueueCoins Day 6: {total}")
print() # Space
# Answer: The recursive call uses n unchanged, so it never reaches the base case.
    # The recursive call uses queue_coins(n) — the same value of n each time. 
    # Since n never changes, it never reaches the base case n == 1, causing infinite recursion.

# Fix the function to avoid infinite recursion.

def queue_coins(n):
    if n == 1:
        return 5
    return 2 * queue_coins(n - 1) + 5 # Changing the recursive call from queue_coins(n) to queue_coins(n - 1) makes n decrease by 1 each call. 
    #  Now queue_coins(6) calls down to queue_coins(1), which returns 5.
total = queue_coins(6)
print(f"QueueCoins Day 6: {total}")
print() # Space

"Ensuring that recursive functions halt is crucial to advanced algorithmic thinking."
