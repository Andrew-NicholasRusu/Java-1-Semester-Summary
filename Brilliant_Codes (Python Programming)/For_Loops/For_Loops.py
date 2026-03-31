"""2FA codes need to expire after a set time. Let's build a code expiration feature for the app."""

# Start by tracking time in seconds, 0, 1, 2.

second = 0
print("Second:", second)
second += 1
print("Second:", second)
second += 1
print("Second:", second)
print("Code expired")

# 2FA codes usually last longer than 3 seconds. Let's use a loop to count 10 seconds.

for second in range (10): # Creates a loop variable like second.
    print("Second", second) # Runs 10 times because of line 15.
print("Code expired")
print() # Space

# Users might not able to enter the code within 10 seconds.
# Let's give them 30 seconds. 

for second in range (30):
    print("Second", second) # Runs 30 times because of line 23.
print("Code expired")
print() # Space

# Python uses zero-indexing, so for loops start at 0. But users expect to count from 1.
# Show users a count from 1 - 30, bot 0 - 29.

for second in range (30):
    print("Elapsed:", second + 1) 
print("Code expired")

# Let's show users how the elapsed time comapres to the total duration of 30 seconds.
duration = 30
for second in range (duration):
    print("Elapsed:", second + 1 "out of", duration)
print("Code expired")

"""A for loop is essential for handling repetition in programs."""
duration = 30
for second in range (duration):
    print("Elapsed:", second + 1) # Since Python's range starts at zero, second + 1  will start at 1 and end at 30.
print("Code expired")





