"""Let's use variable dependency to refine the 2FA code expiration feature."""

# Show users the time elapsed since the 2FA code was sent.

duration = 30
print("Code sent")
for second in range (duration):
    elapsed = second + 1
    print("Elapsed:", elapsed)
print("Code expired")
print() # Space

# Users tend to prefer a countdown, instead of elapsed time.
# Show users a countdown of time until the code expires, from 30 to 1.

duration = 30
print("Code sent")
for second in range (duration):
    countdown = duration - second # Variables can depend on the loop variable
    # Countdown depends on duration and second (the loop variable)
    print("Countdown:", countdown)
print("Code expired")
print() # Space

# Let users know if they're more than halfway to code expiration.

duration = 30
print("Code sent")
for second in range (duration):
    countdown = duration - second
    past_halfway = countdown <= duration / 2
    print("Countdown:", countdown, "Halfway?", past_halfway)
print("Code expired")
print() # Space

# Give users a warning if they only have 10 seconds until the 2FA code expires.

uration = 30
print("Code sent")
for second in range (duration):
    countdown = duration - second
    warning = countdown <= 10
    print("Countdown:", countdown, "Warning?", warning)
print("Code expired")
print() # Space

# Variable dependency lets you build dynamic, responsive programs.

