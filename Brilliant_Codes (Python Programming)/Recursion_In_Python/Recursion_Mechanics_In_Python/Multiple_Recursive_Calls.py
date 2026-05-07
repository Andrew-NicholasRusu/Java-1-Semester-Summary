"Coinucopia's users are complaining that inflation is through the roof."
# First, let's review the old rule: On day n, the number of BinaryCoins equals twice the BinaryCoins on day n - 2.

def binary_coins(n):
    if n == 1:
        return 2
    if n == 2:
        return 3
    two_days_ago = binary_coins(n - 2) # The function returns 2 for day 1 and 3 for day 2, then doubles the BinaryCoins from two days ago.
    return 2 * two_days_ago # So binary_coins(6) traces back through days 4 and 2, giving 2 * 2 * 3 = 12.
total = binary_coins(6)
print(f"BinaryCoins Day 6: {total}")
print() # Space

def binary_coins(n):
    if n == 1:
        return 32
    if n == 2:
        return 26
    yesterday = binary_coins(n - 1)
    two_days_ago = binary_coins(n - 2)
    # The function makes two recursive calls — binary_coins(n - 1) for yesterday and binary_coins(n - 2) for two days ago — then returns their average. 
    return (yesterday + two_days_ago) // 2
total = binary_coins(4) # For binary_coins(4): yesterday is binary_coins(3) = 24 and two days ago is binary_coins(2) = 16, so (24 + 16) // 2 = 20.
print(f"BinaryCoins Day 4: {total}")
print() # Space

"A recursive function can call itself more than once."

# Write a function for TernaryCoins.
# On day n, the number of TernaryCoins equals the number of day n - 1, plus half (rounded) of the difference between day n - 1 and day n - 2.

def ternary_coins(n):
    if n == 1:
        return 
    if n == 2:
        return 
    yesterday = ternary_coins(n - 1)
    two_days_ago = ternary_coins(n - 2)
    difference = yesterday - two_days_ago
    return yesterday + difference // 2
total = ternary_coins(5)
print(f"TernaryCoins Day 5: {total}")
print() # Space

"When a problem depends on more than one previous result, a recursive function can call itself multiple times."
