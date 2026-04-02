"Let's clean up our code for monitoring suspicous logins using Boolean flags."

# Consider every login time and let the user know how many were unusual.
username = "middlingManager"
past_devices = ["iphone-16-001", "ipad-air-007"]
times = [107, 207, 242, 303, 343, 948, 948, 1017]
devices = ["iphone-16-001", "ipad-air-007", "pixel-8-003", "surface-pro-007",
           "ipad-air-003", "iphone-16-001", "ipad-air-007", "pixel-8-004"]

i = 0
unusual = 0
index_ok = True # initializes the Boolean flag index_ok to True
while index_ok: # uses this flag as the loop condition with while index_ok
    print("Checking logins...")
    time = times[i]
    if time > 200 and time < 400:
        unusual += 1
    i += 1
    index_ok = i < len(times) # updates the flag with index_ok = i < len(times) after incrementing i.
    # he loop continues as long as index_ok is True, which means i is still a valid index.

print("Logins at unusual hours:", unusual)

"A boolean flag is a variable that stores True or False. Flags can be used to control while loops."

# Three logins at unusual times is suspicious. Let the user knwo if this happens.

username = "middlingManager"
past_devices = ["iphone-16-001", "ipad-air-007"]
times = [107, 207, 242, 303, 343, 948, 948, 1017]
devices = ["iphone-16-001", "ipad-air-007", "pixel-8-003", "surface-pro-007",
           "ipad-air-003", "iphone-16-001", "ipad-air-007", "pixel-8-004"]

i = 0
unusual = 0
index_ok = True
suspicious_times = False # initializes the suspicious_times flag to False
while index_ok and not suspicious_times: # uses a compound condition while index_ok and not suspicious_times to continue 
    # looping while both the index is valid and suspicious activity hasn't been found.
    time = times[i]
    if time > 200 and time < 400: # checks if each time is between 200 and 400 and increment unusual
        unusual += 1
    i += 1
    index_ok = i < len(times)
    print("Logins at unusual hours:", unusual)
    suspicious_times = unusual == 3 # updates the flag with suspicious_times = unusual == 3 after printing.

if suspicious_times:
    print("# logins at unusual hours")
else:
    print("All good")

# Four logins from new devices is suspicious. Notify the user if this happens.

username = "middlingManager"
past_devices = ["iphone-16-001", "ipad-air-007"]
times = [107, 207, 242, 303, 343, 948, 948, 1017]
devices = ["iphone-16-001", "ipad-air-007", "pixel-8-003", "surface-pro-007",
           "ipad-air-003", "iphone-16-001", "ipad-air-007", "pixel-8-004"]

i = 0
unusual = 0
index_ok = True
suspicious_devices = False
while index_ok and not suspicious_devices:
    if devices[i] not in past_devices:
        past_devices.append(devices[i])
        new += 1
    i += 1
    index_ok = i < len (devices)
    print("New devices so far:", new)
    suspicious_devices = new == 4

if suspicious_devices:
    print("4 new devices today")
else:
    print("All good")

# Notify the user if the device used to log in changed five times.

username = "middlingManager"
past_devices = ["iphone-16-001", "ipad-air-007"]
times = [107, 207, 242, 303, 343, 948, 948, 1017]
devices = ["iphone-16-001", "ipad-air-007", "pixel-8-003", "surface-pro-007",
           "ipad-air-003", "iphone-16-001", "ipad-air-007", "pixel-8-004"]

i = 0
unusual = 0
index_ok = True
changes_ok = False
while index_ok and not changes_ok:
    if devices[i] != devices [i -1]:
        changes += 1
    i += 1
    index_ok = i < len (devices)
    print("Changes so far:", changes)
    changes_ok = changes > 5

if changes_ok:
    print("5 device changes today")
else:
    print("All good")

"Boolean flags make program logic easier to read and manage."
