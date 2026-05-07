"Correcting for inflation was a hit. New coins now launch with an inflation-adjusted rule."

# Describe how the number of LogCoins grows
    # On day n, the number of LogCoins equals the coins on day n - 1, plus half the difference between day n - 1, and day n - 2.

# Write a function to compute the total LogCoins on day n.

def log_coins(n):
    if n == 0:
        return 0
    if n == 1:
        return 16
    yesterday = log_coins(n - 1)
    two_days_ago = log_coins(n - 2)
    # The function calls itself twice — log_coins(n - 1) and log_coins(n - 2) — then adds half the difference to yesterday's count. 
    difference = yesterday - two_days_ago # The growth slows each day: the new coins minted are halved, so the total converges toward 31.
    return yesterday + difference // 2
total = log_coins(6)
print(f"LogCoins Day 6: {total}")
print() # Space

# Write a function to compute the number of new LogCoins minted on day n.

def new_log_coins(n):
    if n == 1:
        return 16 # The function returns 16 for day 1, 
    # then halves yesterday's new coins each day: 16 → 8 → 4 → 2 → 1 → 0.
    yesterday = new_log_coins(n - 1)
    return yesterday // 2 # Once new_log_coins reaches 0, integer division keeps it at 0 forever.
new = new_log_coins(8)
print(f"New LogCoins Day 8: {new}")
print() # Space

"At some point, no new LogCoins are minted. How many days until that happens?"
    # The days until minting stops equals 1 plus the days left after tomorrow, when we will mint half as many LogCoins.

# Wrie a function to compute the days until no new LogCoins are minted.

def days_left (new_coins):
    if new_coins == 0:
        return  0
    days_left_tomorrow = days_left(new_coins // 2) # The function halves new_coins each call: days_left(16) calls days_left(8), then days_left(4), and so on until days_left(0) returns 0. 
    # Each step adds 1, giving 5 days total.
    return 1 + days_left_tomorrow
days = days_left(16)
print(f"Days until stable: {days}")
print() # Space

"A recursive function's input can shrink dynamically. It'll hatl as long as it eventually reaches a base case."

# Calculate the toal LogCoins minted
# The total minted equals today's new coins plus the total minted if we had started with half as many new coins.

def total_minted(new_coins):
    if new_coins == 0:
        return 0
    rest = total_minted(new_coins // 2) # The function adds today's new_coins to the total when we start from half as many coins, total_minted(new_coins // 2).
    # The recursive step halves the input each call.
    return 2 * rest + 1
total = total_minted(16)
print(f"Total LogCoins minted: {total}")

"A recursive function can take any size step toward its base case - what matters is that it gets there."







