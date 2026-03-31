"""Let's give users some time to request a new 2FA code."""

# Make their 2FA sessions last longer than the code expiration countdown.

duration = 60
countdown = 30
for second in range (duration):
    print("Countdown:", countdown)
    countdown -= 1
print("Session expired")
print() # Space

# Make sure users don't see a negative countdown
duration = 60
countdown = 30
for second in range (duration):
    print("Countdown", countdown)
    if countdown > 0:
        countdown -= 1 # When countdown is 1, the condition is True, so line 6 decrements it to 0.
        # When countdown is 0, the condition is False, so countdown stays at 0 and doesn't go negative.
print ("Session expired") 
print() # Space

# Keep track of the 2FA coud status and display it to the user 
duration = 60 
countdown = 30
for second in range (duration):
    if countdown == 0:
        status = "expired"
    else: 
        status = "active"
    print("Code", status, countdown)
    if countdown > 0:
        countdown -= 1
print("Session expired")
print()

# Warn users during the final 10 seconds before their code expires. 
duration = 60
countdown = 30
for second in range (duration):
    if countdown == 0:
        status = "expired"
    else:
        status = "active"
    # Sets status beased on whether countdown is 0 or not. 

    if countdown > 0 and countdown <= 10:
        status = "warning" # gives a warning dring the final 10 seconds.
    print("Code", status, countdown)
    if countdown > 0:
        countdown -= 1
print("Session expired")
print() # Space

# Once the 2FA code has expired, users can request a new code. Display the time they have left to do so.

duration = 60
countdown = 30
for second in range (duration):
    if countdown == 0:
        status = "expired"
    else:
        status = "active"

    if countdown > 0 and countdown <= 10:
        status = "warning"

    if status == "expired": # If true, next line calculates left = duration - second
        left = duration - second
        print("Code", status, "Request new code?", left) # Dispalys the time left to request a new code. 
    else:
        print("Code", status, countdown)

    if countdown > 0:
        countdown -= 1
print("Session expired.")
print() # Space

# Using logic in loops gives programs their decision-making power.
