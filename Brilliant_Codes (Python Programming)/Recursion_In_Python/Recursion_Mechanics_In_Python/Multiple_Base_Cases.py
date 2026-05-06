"Coinucopia is launching new currencies - let's get them online."
# Describe how the number of BinaryCoins grows.

# On day n, the number of BinaryCoins equals 2 times the number of BinaryCoins on day n - 2.

def binary_coins(n):
    if n == 1:
        return 2 # The function returns 2 for the base case n == 1, and multiplies by 2 for each step back by 2 days. 
    return 2 * binary_coins(n - 2)
total = binary_coins(7)
print(f"BinaryCoins Day 7: {total}") # So binary_coins(7) calls binary_coins(5), then binary_coins(3), 
# then binary_coins(1) which returns 2.
print() # Space

# Why does binary_coins(6) cause a RecursionError?

def binary_coins(n):
    if n == 1:
        return 2
    return 2 * binary_coins(n - 2)
total = binary_coins(6)
print(f"BinaryCoins Day 6: {total}")
print() # Space
# Answer: It never reaches the base case, n == 1, causing infinite recursion.
    # The function steps back by 2 each call: binary_coins(6) calls binary_coins(4), then binary_coins(2), then binary_coins(0), 
    # then binary_coins(-2), and so on. Since n starts even, it skips over the base case n == 1 entirely.

# We need a rule for even days too, here's the updated spec. Fix the recursive function so it works for all days.

def binary_coins(n):
    if n == 1:
        return 2
    if n == 2: # Adding a second base case if n == 2: return 3 catches even values of n. 
        return 3
    return 2 * binary_coins(n - 2)
total = binary_coins(6)
print(f"BinaryCoins Day 6: {total}") # Now binary_coins(6) steps back through 4 and 2, where it returns 3. 
# Odd inputs still reach the n == 1 base case.
print() # Space

"Some recursive functions need more than one base case."

# TernaryCoins starts with 3, 4, and 5 coins on days 1, 2, and 3. DEscribe how the number of TernaryCoins grows after that.
    # On day n, the number of TernaryCoins equals 3 times the number of TernaryCoins on day n - 3.

def ternary_coins(n):
    if n == 1:
        return 3
    if n == 2:
        return 4
    if n == 3:
        return 5
    # The function has three base cases — one for each of days 1, 2, and 3. 
    # Since it steps back by 3 each call, every input eventually reaches one of these. 
    # For example, ternary_coins(9) calls ternary_coins(6), then ternary_coins(3), which returns 5.
    return 3 * ternary_coins(n - 3)
total = ternary_coins(9)
print(f"TernaryCoins Day 9: {total}") 
print() # Space

"When a recursive function takes bigger steps, one base case might not be enough to catch every input."