"Let's lock an account if two different devices logged in at the same time."

# First report how many consecutive logins happened at the same time. 

username = "WFHomie"
times = [207, 242, 303, 303, 800, 1201, 1201, 1826]
devices = ["iphone-16-001", "ipad-air-007", "iphone-16-001", "iphone-16-001",
           "iphone-16-001", "ipad-bond-007", "iphone-16-001", "ipad-air-007"]

i = 1
index_ok = True
double_logins = 0
while index_ok: # continues while index_ok is True.
    print("Checking logins...")
    if times[i] == times[i - 1]: # checks if consecutive times match using times[i] == times[i - 1]
        double_logins += 1 # increments double_logins when they do.
    i += 1
    index_ok = i <len(times) # updates index_ok to check if i is still a valid index.

print("Number of double logins:", double_logins)

# Mark the account suspicious as soon as a pair of consecutive logins happend at the same time.

username = "WFHomie"
times = [207, 242, 303, 303, 800, 1201, 1201, 1826]
devices = ["iphone-16-001", "ipad-air-007", "iphone-16-001", "iphone-16-001",
           "iphone-16-001", "ipad-bond-007", "iphone-16-001", "ipad-air-007"]

i = 1
index_ok = True
times_ok = True #  initializes the times_ok flag to True.
while index_ok and times_ok: # uses the compound condition while index_ok and times_ok to continue while both flags are True.
    print("Checking logins...")
    times_ok = times[i] != times[i - 1] # updates times_ok = times[i] != times[i - 1], checking if consecutive times differ. 
    i += 1 # The loop runs through indexes 1 and 2 (times 242 and 303, which differ). 
    # At index 3, times[3] equals times[2] (both 303), so times_ok becomes False and the loop stops.
    index_ok = i < len(times)

if not times_ok:
    print("Two logins at", times[i - 1])
    print("Suspicious")
else:
    print("All good")

# Lock the account when two different devices log in at the same time. 

username = "WFHomie"
times = [207, 242, 303, 303, 800, 1201, 1201, 1826]
devices = ["iphone-16-001", "ipad-air-007", "iphone-16-001", "iphone-16-001",
           "iphone-16-001", "ipad-bond-007", "iphone-16-001", "ipad-air-007"]

i = 1
index_ok = True
times_ok = True
devices_ok = True
while index_ok and (times_ok or devices_ok): # uses the complex condition while index_ok and (times_ok or devices_ok) 
    # - the loop continues as long as the index is valid AND at least one of the two flags is True
    print("Checking logins...")
    times_ok = times[i] != times[i - 1]
    devices_ok = devices[i] == devices[i - 1] # update the flags: times_ok checks if consecutive times differ, and devices_ok checks if 
    # consecutive devices match. 
    i += 1 # The loop continues while either times differ OR devices match.
    # At index 6, both flags become False: times[6] equals times[5] (both 1201), and devices[6] differs from devices[5] (iPhone vs iPad), 
    # making devices_ok = False.
    index_ok = i < len(times)

if not times_ok and not devices_ok: # When both are False, (times_ok or devices_ok) becomes False, so the loop stops.
    print("Two logins at", times[i - 1], "from", devices [i - 1], "and", devices[i - 2])
    print("Account locked")
else:
    print("All good")

"Complex conditions can control a while loop. Consider while x and ( y or z)"
"   It will run as long as x is True and (y or z) is True."
"   If x is still True but both y and z are False, the loop will stop."

" Knowing how to use and, and or in while loop condtions is key to controlling loops."