"""Let's use Boolean logic to make the 2FA error messages more helpful.
    Let the user know if their account is unlocked."""

# Let the user know if their account is unlocked 
username = "Sr_JuniorAnalyst"
password = "HelloH@ck3rs!"
locked = False

if not locked: # The not operator gives the negation of a Boolean expression:
    #  it changes False to True and True to False.
    print("Account unlocked.")

# Send a message if the account is unlocked but the password attempt is wrong
username = "Sr_JuniorAnalyst"
password = "HelloH@ck3rs!"
locked = False
attempt = "HelloHack3rs!"
attempt_ok = attempt == password

if (not locked) and (not attempt_ok): # checks if not locked and not attempt_ok are both True. Since locked is False, not locked is True.
    # Since attempt_ok is False, not attempt_ok is True. Both conditions are True, so line 22 runs, printing the message.
    print("Account unlocked, but password wrong.")

# Send a message if the account is unlocked and the password is right, but the 2FA code is wrong.
username = "Sr_JuniorAnalyst"
password = "HelloH@ck3rs!"
locked = False
attempt = "HelloH@ck3rs!"
attempt_ok = attempt == password
code_sent = 881640
code_entered = 881650
code_ok = code_entered == code_sent

if (not locked) and (not attempt_ok):
    print("Account wrong, but password wrong")
if (not locked) and attempt_ok and (not code_ok):
    print("Account unlocked, correct password, wrong 2FA code")

# Let the user know whether their login attempt succeeded or failed.
username = "Sr_JuniorAnalyst"
password = "HelloH@ck3rs!"
locked = False
attempt = "HelloH@ck3rs!"
attempt_ok = attempt == password
code_sent = 881640
code_entered = 881640
code_ok = code_entered == code_sent
login_success = (not locked) and attempt_ok and code_ok # All three conditions are True, so login_success is True.

if not login_success: #  Since login_success is True, not login_success is False
    print("Login Failed.")
else:
    print("Login successful")
if (not locked) and (not attempt_ok):
    print("Account unlocked, but password wrong")
if (not locked) and attempt_ok and (not code_ok):
    print("Account unlocked, correct password, wrong 2FA code")
