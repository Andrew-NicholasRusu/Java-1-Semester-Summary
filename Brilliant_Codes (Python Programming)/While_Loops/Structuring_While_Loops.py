"Let's use while loops to notify users about suspicious activity as soon as it's detected."

# Notify the user as soon as there's a login from a new device. 

username = "vpOfVibes"
past_devices = ["iphone-14-001", "ipad-air-002"]
devices = ["iphone-14-001"] # ...

i = 0
while devices[i] in past_devices: # The loop continues as long as devices[i] in past_devices evaluates to True. 
    # It runs through devices at indexes 0, 1, 2, and 3, all of which are in past_devices. 
    # When i reaches 4, devices[4] (the Pixel) is not in past_devices, so the condition becomes False and the loop stops. 
    print("Device seen before:", devices[i])
    i += 1
print("Login from new device", devices[i])

"A while loop stops when its condition becomes False. Then, the lines after the loop run."

# Notify the user as soon as the device used to log in changes. 

username = "vpOfVibes"
past_devices = ["iphone-14-001", "ipad-air-002"]
devices = ["iphone-14-001"] # ...

i = 1 # Starting at i = 1, the loop continues while devices[i] == devices[i - 1].
while devices[i] == devices[i - 1]: # At indexes 1 and 2, the device matches the previous one, so the loop continues.
    print("Device same as last one:", devices[i])
    i += 1 # # When i reaches 3, devices[3] (iPad) differs from devices[2] (iPhone), so the condition becomes False and the loop stops.
print("Changed device", devices[i])

# It's suspicious when the device used to log in has changed four times. 
# Notify the user as soon as this happens. 

username = "vpOfVibes"
past_devices = ["iphone-14-001", "ipad-air-002"]
devices = ["iphone-14-001"] # ...

i = 1
changes = 0
while changes < 4: # The changes counter starts at 0 and the loop continues while changes < 4.
    if devices[i] != devices [i - 1]: # Each time the device differs from the previous one (line 42), changes increments by 1 (line 43). 
        changes += 1
    i += 1
    # The loop continues checking each login until changes reaches 4, at which point the condition changes < 4 becomes False and the loop stops.
    print("Device changes so far:", changes)
print("Changed devices 4 times")

# It's suspicious when three new devices have been used to log in. 
# Notify the user as soon as this happens.

username = "vpOfVibes"
past_devices = ["iphone-14-001", "ipad-air-002"]
devices = ["iphone-14-001"] # ...

i = 0
new = 0 # The new counter starts at 0 and the loop continues while new < 3. 
while new < 3:
    device = devices[i]
    if device not in past_devices: # checks if the current device is not in past_devices. 
        new += 1
        past_devices.append(device) # If true, it increments new by 1 and adds the device to past_devices. 
    i += 1 # The loop continues checking each login until new reaches 3, at which point the condition new < 3 becomes False and the loop stops.
    print("New devices so far.", new)
print("Logged in from 3 new devices ")

"Mastering while loops is crucial for precisely controlling program behavior."

