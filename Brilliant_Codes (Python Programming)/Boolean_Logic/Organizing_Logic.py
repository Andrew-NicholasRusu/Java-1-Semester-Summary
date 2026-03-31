"""Lets give users some other options for the second factor in 2FA."""

# This user was verified with face ID, but not ID. Let them know it worked
username = "MicrO-Mngr" 
face_id_ok = True
touch_id_ok = False

if face_id_ok:
    print("Face ID verified")
if touch_id_ok:
    print("Touch ID verified")
print() # Space

# If the user was verified with one or both of the IDs, print a message.

username = "MicrO-Mngr" # This user was verified with face ID, but not ID. Let them know it worked.
face_id_ok = True
touch_id_ok = False

if face_id_ok or touch_id_ok: 
    # The or operator combines two Boolean expressions. The result is True when either expression is True (or when both are true).
    print("Biometric ID verified") # Since face_id_ok and touch_id_ok aren't both False, the if condtion is True.
print() # Space

# For the second factor, users can use either a biometirc ID or a 2FA code.
# Check whether the second step of 2FA passed.

username = "MicrO-Mngr" 
face_id_ok = True
touch_id_ok = False
code_ok = False

second_step_ok = face_id_ok or touch_id_ok or code_ok
if second_step_ok:
    print("Second step passed")
else:
    print("Second step failed")

# The login should succeed if the account is unlocked, the password attempt is correct, and one of the second steps has passed.

username = "MicrO-Mngr" 
face_id_ok = True
touch_id_ok = False
code_ok = False
second_step_ok = face_id_ok or touch_id_ok or code_ok
unlocked = True
attempt_ok = True

login_success = unlocked and attempt_ok and second_step_ok

if login_success:
    print("Login successful")
else: 
    print("Login failed")





