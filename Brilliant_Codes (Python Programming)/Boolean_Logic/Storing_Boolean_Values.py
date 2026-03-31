# Tell the user if the account is unlocked or not. 
username = "MiddleManagerChild"
password = "SassyW0rd22"
locked = True

unlocked = locked == False
if unlocked:
    print("Account is unlocked.")
else: 
    print("Account is locked.")

# Allow the login if the account is unlocked and the passwords match.
username = "MiddleManagerChild"
password = "SassyW0rd22"
locked = True
attempt = "SassyWordzz"

unlocked = locked == False
attempt_ok = attempt == password # sets attempt_ok to the value of attempt == password
if unlocked and attempt_ok: # both aren't true, so it will print login blocked
    print("Login allowed.")
else:
    print("Login blocked.")

# Check whether the user entered the correct 2FA code. 
username = "MiddleManagerChild"
password = "SassyW0rd22"
locked = True
attempt = "SassyWordzz"
code_sent = 214576
code_entered = 214576

unlocked = locked == False
attempt_ok = attempt == password
code_ok = code_sent == code_entered # sets code_ok to the value of code_sent == code_entered
if code_ok:
    print("2FA code confirmed.")
else:
    print("Incorrect 2FA code")
