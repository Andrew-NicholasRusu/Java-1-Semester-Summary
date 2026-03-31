"Let's notify users hwen there are two logins to their account at the same time."

# Check if the third login was at the same time as the second login.

username = "rubiksCubicle"
times = [832, 915, 915, 1041, 1139, 1228, 159, 159, 242, 310]

if times[2] == times[1]: # compares times[2] and times[1] to check if the 
    # third and second logins happened at the same time.
    print("Two logins at", times[1]) # If they are the same, this line prints the repeated time.
    print("Were these both you?")
print() # Space

# Check if the fifth login was at the same time as the fourth login.

username = "rubiksCubicle"
times = [832, 915, 915, 1041, 1139, 1228, 159, 159, 242, 310]

i = 4
# Here, times[i - 1] and times[i] are sonsecutive values in the list
if times[i] == times[i - 1]: # compares times[i] and times[i - 1]
    # With i = 4, this checks if the fifth login time, times[4], equals the fourth login time, times[3]
    print("Two logins at", times[i])
    print("Were these both you?")
else:
    print("Login", i, "OK")
print() # Space

"If i >= 1, the element with index i - 1 comes right before the element with index i."

# Notify the user if there are neighboring logins at the same time.

username = "rubiksCubicle"
times = [832, 915, 915, 1041, 1139, 1228, 159, 159, 242, 310]

for i in range(len(times)): # loops through all indexes with range(len(times))
    if i >= 1 and times[i] == times[i - 1]: # uses i >= 1 and times[i] == times[i - 1] to safely check consecutive logins
        # First, it checks indexes 1 and 0. Then, it checks indexes 2 and 1, and so on.
        print("Two logins at", times[i])
        print("Were these both you?")
    else:
        print("Login", i, "OK")
print() # Space

# Let's remove the and condition from lien 5. In the first loop iteration, which values does it compare?

username = "rubiksCubicle"
times = [832, 915, 915, 1041, 1139, 1228, 159, 159, 242, 310]

for i in range(len(times)): 
    if times[i] == times[i - 1]: # In the first iteration, i = 0, so times[i] is the first list item.
        # Therefore, i - 1 is -1, so times[i - 1] is times[-1], which is the last item of the list.
        print("Two logins at", times[i])
        print("Were these both you?")
    else:
        print("Login", i, "OK")
print() # Space

# Protip: in Python, you can set a starting value for range.
# Modify the program so it compares the first two list values in the first iteration. 

username = "rubiksCubicle"
times = [832, 915, 915, 1041, 1139, 1228, 159, 159, 242, 310]

for i in range(1, len(times)): # uses range(1, len(times)) to start the loop at i = 1, 
    # avoiding the need for the i >= 1 check.

    # Since i is 1 on the first iteration of this loop, 
    # times[i - 1] will access times[0] correctly on that iteration
    if times[i] == times[i - 1]:
        print("Two logins at", times[i])
        print("Were these both you?")
    else:
        print("Login", i, "OK")
print() # Space

"When processing data, it's very common to compare consecutive list entries."

