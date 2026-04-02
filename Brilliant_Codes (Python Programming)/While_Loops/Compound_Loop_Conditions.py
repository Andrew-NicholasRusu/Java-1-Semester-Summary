# Fix the error by making the loop stop when it's checked all the login devices.

username = "entrepreNerd"
past_devices = ["iphone-16-001"]
devices = ["iphone-16-001", "iphone-16-001", "iphone-16-001"]

i = 0
while i < len(devices) and devices [i] in past_devices: # uses and to ensure both conditions are True: 
    # i < len(devices) prevents accessing an invalid index, and devices[i] in past_devices checks the device.
    print("Device seen before")
    i += 1 # The loop runs through all three devices (indexes 0, 1, 2).

if i < len(devices): # When i reaches 3, the first condition i < len(devices) becomes False, so the loop stops safely.
    print("Logged in from new device", devices[i])
else:
    print("All good")

"A while loop can ve defined with and's and or's. With an and of two conditions, the loop stops as soon as either condition is False."

# It's suspicious to log in from four new devices in one day. 
# Let the user know if this happened or not. 

username = "entrepreNerd"
past_devices = ["iphone-16-001"]
devices = ["iphone-16-001", "iphone-16-001", "iphone-16-001",
           "ipad-air-007", "iphone-16-001"]

i = 0
new = 0
while i < len(devices) and new < 4:
    device = devices[i]
    if device not in past_devices:
        new += 1
        past_devices.append(device)
    print ("New devices so far:", new)
    i += 1

# Since new never reaches 4, the loop stops when i reaches 5 (end of list)
if new == 4: # checks if new == 4 and correctly reports 'All good' at line 42.
    print("logged in from 4 new devices")
else:
    print("All good")

# It's suspicious to change five times in one day. 
# Let the user know if this happened or not. 

username = "entrepreNerd"
past_devices = ["iphone-16-001"]
devices = ["iphone-16-001", "iphone-16-001", "iphone-16-001",
           "ipad-air-007", "iphone-16-001"]

i = 1 
changes = 0
while i < len (devices) and changes < 5:
    if devices[i] != devices [i -1]: #  compares consecutive devices using devices[i] != devices[i - 1]
        changes += 1 # increments changes when they differ.
    print("Device changes so far:", changes)
    i += 1 # The loop finds 2 device changes: at index 3 (iPad differs from iPhone) and at index 4 (iPhone differs from iPad).
    #  Since changes only reaches 2 (not 5), the loop continues until i reaches 5 (end of list). 
if changes == 5:
    print("Changed deivces 5 times")
else:
    print("All good")

# It's suspicious to log in three times at unusual hours (betwen 2 am and 4 am).
# Let the user know if this happened or not. 

username = "entrepreNerd"
times = [217, 303, 327, 712, 712]

i = 0
unusual = 0
while i < len(times) and unusual < 3:
    time = times[i]
    if time > 200 and time < 400: # checks if the time is between 200 and 400 (2am-4am) using another compound condition with and.
        unusual += 1 # Times 217, 303, and 327 all fall in this range, so this increments unusual three times.
    print("Logins at unusual hours:", unusual)
    i += 1

if unusual == 3: # When unusual reaches 3, the condition unusual < 3 becomes False and the loop stops at i = 3
    print("Logged in 3 times at unusual hours")
else:
    print("All good")

"Compund while loop conditions can help make programs reliable and precise."