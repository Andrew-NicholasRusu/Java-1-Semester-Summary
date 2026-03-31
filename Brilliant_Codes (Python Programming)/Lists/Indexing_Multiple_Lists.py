"""Let's improve login notifications by combining both time and device data."""

# To start, set up a loop that runs as many times as there are logins.

username = "VeePeeWee"
times = [362, 454, 728, 948, 1017, 1147, 1201, 1225, 1323, 1826]
devices = ["ipad-air-002", "pixel-8-003", "iphone-14-001", 
    "iphone-14-001", "pixel-8-003", "surface-pro-007", 
    "ipad-air-002", "iphone-14-001", "ipad-air-002", 
    "pixel-8-003"]

for i in range(len(times)): # loops with for i in range(len(times))
    # Running once for each login.
    print("Login", i) # prints the index i for each iteration.
print() # Space

# Every iteration, report the corresponding login time. 

username = "VeePeeWee"
times = [362, 454, 728, 948, 1017, 1147, 1201, 1225, 1323, 1826]
devices = ["ipad-air-002", "pixel-8-003", "iphone-14-001", 
    "iphone-14-001", "pixel-8-003", "surface-pro-007", 
    "ipad-air-002", "iphone-14-001", "ipad-air-002", 
    "pixel-8-003"]

for i in range(len(times)):
    print("Login at", times[i]) # prints each login time using times[i], 
    # which accesses the element at index i in the times list.

# Report the device that was used for each login. 

username = "VeePeeWee"
times = [362, 454, 728, 948, 1017, 1147, 1201, 1225, 1323, 1826]
devices = ["ipad-air-002", "pixel-8-003", "iphone-14-001", 
    "iphone-14-001", "pixel-8-003", "surface-pro-007", 
    "ipad-air-002", "iphone-14-001", "ipad-air-002", 
    "pixel-8-003"]

for i in range(len(times)):
    print("Login at", times[i], "with", devices[i]) #  prints both the time and device.
    # Using the same index i, it accesses times[i] and devices[i] to get the login info for login number i.
print() # Space

"""When two lists are related, an index identifies related values."""

# Let's make the code easier to read. Use the two new variables to store the current time and device.

username = "VeePeeWee"
times = [362, 454, 728, 948, 1017, 1147, 1201, 1225, 1323, 1826]
devices = ["ipad-air-002", "pixel-8-003", "iphone-14-001", 
    "iphone-14-001", "pixel-8-003", "surface-pro-007", 
    "ipad-air-002", "iphone-14-001", "ipad-air-002", 
    "pixel-8-003"]

for i in range(len(times)):
    time = times[i] 
    device = devices[i]
    # creates time and device variables to store the indexed values.
    print("Login at", time, "with", device) # prints the login details using these variables.
print() # Space

# Construct a list of past devices, and notify the user when a new device is used. 

username = "VeePeeWee"
times = [362, 454, 728, 948, 1017, 1147, 1201, 1225, 1323, 1826]
devices = ["ipad-air-002", "pixel-8-003", "iphone-14-001", 
    "iphone-14-001", "pixel-8-003", "surface-pro-007", 
    "ipad-air-002", "iphone-14-001", "ipad-air-002", 
    "pixel-8-003"]

past_devices = [] # empty list
for i in range (len(times)):
    time = times[i]
    device = devices[i]
    # gets the time and device of login number i
    if device not in past_devices: # checks if device not in past_devices
        print("Login from new device", device, "at", time)
        print("Was this you?") # prints a notification when devices not in past_devices is true
        past_devices.append(device) # appends the device to the past_devices list
num_past_devices = len(past_devices) # sets the total number of devices used to log in
print("You have used", num_past_devices, "different devices")

# Looping over a single index is a good way to process two lists at the same time.
