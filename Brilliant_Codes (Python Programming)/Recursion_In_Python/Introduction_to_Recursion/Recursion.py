"Write a function to compute the total CacheCoins on day n."
# The number of CacheCoins doubles every day.

def cache_coins(final_day):
    day = 1
    total = 1
    while day < final_day:
        print(f"Day{day}: {total}")
        day += 1
        total *= 2
        # The program starts at day 1 with 1 coin and loops through the days, doubling the total each day until the final day.
    return total
print(f"Day 10:{cache_coins(10)}")
print() # Space

# Write a recursive function for CacheCoins
# On day n , the number of CacheCoins equals 2 times the number of CacheCoins on day n - 1.
# We've added hidden code to help visualize function calls.

def cache_coins(n): # The base case describes induction.
    if n == 1:
        return 1 # The base case returns 1 on day 1.
    return 2 * cache_coins(n - 1) # The recursive step returns 2 * cache_coins(n - 1), since the CacheCoins 
    # on day n is twice the CacheCoins on the previous day.
total = cache_coins(5)
print(f"CacheCoins Day 5: {total}")
print() # Space

"A recursive function expresses induction."

# Write a recursive function for StackCoins
# On day n, the number of StackCoins equals n plus the number of StackCoins on day n - 1.

def stack_coins(n):
    if n == 1: 
        return 1 # The base case returns 1 on day 1.
    return n + stack_coins(n - 1) # The recursive step returns n + stack_coins(n - 1), 
    # since the StackCoins on day nn equals n plus the StackCoins on the previous day.
total = stack_coins(10)
print(f"StackCoins Day 10: {total}")
print() # Space

# Write a recursive function for QueueCoins
# On day n, the number of QueueCoins equals 2 times the number of QueueCoins on day n - 1, plus 5

def queue_coins(n):
    if n == 1:
        return 5 # The base case returns 5 on day 1. 
    return 2 * queue_coins(n - 1) + 5 # The recursive step returns 2 * queue_coins(n - 1) + 5, since 
    # the QueueCoins on day n equals double the QueueCoins on the previous day, plus 5.
total = queue_coins(10)
print(f"QueueCoins Day 10: {total}")
print() # Space

"A recursive function calls itself - it expresses a problem in terms of a smaller version of the same problem."

