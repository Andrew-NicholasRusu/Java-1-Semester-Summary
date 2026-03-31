"""Let's continue working on the 2FA code expiration feature."""

# Displat to the user how many seconds have elapsed, from 1 to 30. 

duration = 30
for second in range (duration):
    print("Elapsed:", second + 1) # Prints second + 1 to display elapsed time from 1 to 30.

# Keep track of elapsed time, or how long the 2FA code has been valid.
duration = 30
elapsed = 0
for second in range (duration):
    elapsed += 1
    print("Elapsed:", elapsed)

# Keep track of whetehr or not the code is expired. 

duration = 30
elapsed = 0
expired = False # Sets expired to False before the loops starts 
print("Expired:", expired)
for second in range (duration):
    elapsed += 1
    print("Elapsed:", elapsed)
expired = True # Sets expired to True after the loop ends. 
print("Expired:", expired)
# This tracks whether the code has expired: False while the timer runs, then True after.

# First, the 2FA code is sent to the user. Then it's active fro 30 seconds.
# Display the status of the code to the user.

duration = 30
elapsed = 0
expired = False 
print("Expired:", expired)
print("Code sent")
for second in range (duration):
    elapsed += 1
    print ("Code active", "Elapsed:", elapsed)
expired = True
print("Expired:", expired)
print("Code expired")
print() # space

# Streamline the program. Track the code and handle the user-facing display with jsut one variable.
duration = 30
elapsed = 0
status = "sent"
print("Code", status)
for second in range (duration):
    elapsed += 1
    status = "active"
    print("Code", status, "Elapsed:", elapsed)
status = "expired"
print("Code", status)

# Strucutring Loops are crucial for building clear, reliable programs.



