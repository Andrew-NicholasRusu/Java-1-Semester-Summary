"""For the security notifications to work, we need to update the list of past devices on each login."""

# Let the user know about their past device usage. 

username = "SynergizerBunny"
past_devices = ["iphone-16-021", "ipad-pro-202"]

print("You hae logged in from", len(past_devices), 
      "different devices") # prints the device count with len(past_devices)
print("List of past devices:", past_devices) #  prints the list itself with past_devices.
print() # Space

# There's a login from a new MacBook. Append it to the list of past devices, and notify the user.

username = "SynergizerBunny"
past_devices = ["iphone-16-021", "ipad-pro-202"]

device = "macbook-pro-299"
# The append method adds an item to a list. 
past_devices.append(device) # uses past_devices.append(device) to add the device to the past_devices list.
print("Login from new device:", device) # prints a notification about the new device.
print("Was this you?")

print("You have logged in from", len(past_devices),
      "different devices")
print("Past devices:", past_devices)
print() # Space

# Run through the list of login devices, printing a message for each.

username = "SynergizerBunny"
past_devices = ["iphone-16-021", "ipad-pro-202",
                "macbook-pro-299"]

devices = ["iphone-16-021", "ipad-pro-202", 
           "macbook-pro-299","ipad-pro-202", "ipad-pro-202", 
           "macbook-pro-299", "lenovo-yoga-208", "ipad-pro-202", 
           "ipad-pro-202"]
for device in devices: # loops through devices, setting device to each element
    print("Login form:", device) # prints each device as the loop runs.
print() # Space

# Update the list of past devices whenever there's a login from a new device.

username = "SynergizerBunny"
past_devices = ["iphone-16-021", "ipad-pro-202",
                "macbook-pro-299"]

devices = ["iphone-16-021", "ipad-pro-202", 
           "macbook-pro-299","ipad-pro-202", "ipad-pro-202", 
           "macbook-pro-299", "lenovo-yoga-208", "ipad-pro-202", 
           "ipad-pro-202"]
for device in devices: # loops through each device used to log in
    print("Login form:", device)
    if device not in past_devices: # checks if the device is not in past_devices
        past_devices.append(device) # appends it to the list if it's True.
        # That way, each new device gets added to past_devices list the first time they're used.
        print("Login from new device:", device)
        print("Was this you?")
print("You have logged in from", len(past_devices), 
      "different devices")
print() # Space

# Appending is a very common way to update lists.


