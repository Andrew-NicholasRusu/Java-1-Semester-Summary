"Let's start building feature to notify users when there's a login from a new device!"

# In the past, this user has logged in from an iPhone, an iPad, and a Pixel. 
# Set a list to store these devices.

username = "cheifOfStuff"
past_devices = ["iphone-14-001", "ipad-air-002", "pixel-9-003"]
print("Devices already used:", past_devices)
print() # Space

# The user logs in with an iPhone. Check if they've used this device before. 
username = "cheifOfStuff"
past_devices = ["iphone-14-001", "ipad-air-002", "pixel-9-003"]
device = "iphone-14-001"
print("Device used before?", device in past_devices)
# The in operator checks if a value is in the list.
print() # Space

# Let the user know when they log in from a device they have used in the past.

username = "cheifOfStuff"
past_devices = ["iphone-14-001", "ipad-air-002", "pixel-8-003"]

device = "iphone-14-001"
if device in past_devices:
    print("Device seen before")
print() # Space

# The user logs in with a Surface Pro. Send a notification if it hasn't been used in the past.

username = "chiefOfStuff"
past_devices = ["iphone-14-001", "ipad-air-002", "pixel-8-003"]

device = "surface-pro-683"
if device in past_devices:
    print("Device seen before")
else:
    print("Login from a new device")
    print("Was this you?")
print() # Space

# To make the code easier to read, let's put the notification in the first branch of the if-else statement. Set the condtion to match.

username = "chiefOfStuff"
past_devices = ["iphone-14-001", "ipad-air-002", "pixel-8-003"]

device = "surface-pro-683"
if device not in past_devices: # uses not in to check if device is not in the past_devices list.
    print("Login from a new device")
    print("Was this you?") # True if surface-pro-683 is not in the past_devices list
else:
    print("Device seen before")
print() # Space

# Lists are an essential tool for storing related values.












