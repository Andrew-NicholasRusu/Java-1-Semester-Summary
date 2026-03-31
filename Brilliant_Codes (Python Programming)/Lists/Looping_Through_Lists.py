"""Let's automate the notification process with for loops."""

# Loop through the list of login times and report each one.

username = "CornerOffice"
times = [110, 317, 1012, 1405, 1659]

for time in times: # Loops through the times list, setting the time variable to each element of the list on at a time.
    print ("Login at:", time) # Prints each login time as the loop iterates.
# Login at: 110
# Login at: 317
# Login at: 1012
# Login at: 1405
# Login at: 1659
print() # Space

"""A for loop can run through the elements of a list.
    The time variable starts at times[0]. In each iteration, it updates to the next value of the times list."""

# Logins between 2am and 4am are unusual. Notify the user of any unusual logins. 

username = "CornerOffice"
times = [110, 317, 1012, 1405, 1659]

for time in times: 
    print ("Login at:", time)
    if time > 200 and time < 400:
        print("Unusual login time:", time) # Checks if if time > 200 and time < 400 (between 2am-4am)
        print("Was this you?") # When True, this prints a notification about the unusual time
print() # Space
# Login at: 110
# Login at: 317
# Unusua login time: 317
# Was this you?
# Login at: 1012
# Login at: 1405
# Login at: 1659

# Report the device that was used for each login.

username = "CornerOffice"
times = [110, 317, 1012, 1405, 1659]
devices = ["samsung-383", "samsung-383", "thinkpad-219", 
           "samsung-383", "chromebook-239"]

for device in devices: # Loops through devices with for, setting device to each element.
    print("Device used:", device) # prints each device as the loop runs.

# Device used: samsung-383
# Device used: samsung-383
# Device used: thinkpad-219
# Device used: samsung-383
# Device used: chromebook-239

# Check each device to see if it was used in the past. Notify the user of any logins from new devices. 

username = "CornerOffice"
times = [110, 317, 1012, 1405, 1659]
devices = ["samsung-383", "samsung-383", "thinkpad-219", 
           "samsung-383", "chromebook-239"]

past_devices = ["samsung-383", "thinkpad-219"]
for device in devices: # Loops through each device in the devices list. 
    print("Device used:", device)
    if device not in past_devices: # Checks if each device is not in past_devices
        print("Login from new device:", device)
        print("Was this you?")
print() # Space

# A for loop is a crucial tool for running through each item of a list. 
 



