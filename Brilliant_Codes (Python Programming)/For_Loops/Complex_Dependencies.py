"""Let's automatically resend a new 2FA code when the old one expires."""

# Start by displaying a countdown from 30 to 0.

duration = 60
countdown = 30
for second in range (duration):
    print ("Countdown:", countdown)
    if countdown > 0:
        countdown -= 1
print("Session expired")
print() # Space

# Keep track of the code status and display to the user.

duration = 60
countdown = 30
for second in range (duration):
    if countdown > 0:
        status = "acitve"
    else:
        status = "expired"
    print("Code", status, countdown)
    if countdown > 0:
        countdown -= 1
print ("Session expired.")
print() # Space

# When the 2FA code expires, send a new one, restart the countdown, and update the status.

duration = 60
countdown = 30
for second in range (duration):
    if countdown == 0:
        status = "expired" # expires when countdown is 0
        print("Code", status, "Sending new code:") # 
        countdown = 30 # resets cooldown to 30 and sets next line's status to "active"
        status = "active"
    else:
        status = "active"

    if countdown > 0:
        print("Code", status, countdown)
        countdown -= 1
print("Session expired")
print() # Space

# Incorporate a three-second delay to allow time for the new code to be delivered.

duration = 63
countdown = 30
delay = 3 # Creates a delay of 3 seconds 
for second in range (duration):
    if countdown == 0:
        status = "expired"
    else:
        status = "active"

    if status == "expired" and delay > 0:
        print("Code", status, "New code incoming")
        delay -= 1 # decrements delay by 1
    if countdown > 0:
        print("Code", status, countdown)
        countdown -= 1
print("Session expired.")
print() # Space

# Complete the feature by resetting the countdown and delay once the delay period is over.

duration = 63
countdown = 30
delay = 3
for second in range (duration):
    if delay == 0:
        countdown = 30 # Resets cooldown to 30
        delay = 3 # Resets delay to 3

    if countdown == 0:
        status = "expired"
    else:
        status = "active"

    if status == "expired" and delay > 0:
        print("Code", status, "New code incoming")
        delay -= 1
    if countdown > 0:
        print("Code", status, countdown)
        countdown -= 1
print("Session expired")
print() # Space

