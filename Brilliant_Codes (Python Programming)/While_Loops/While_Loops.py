"Let's start on a feature to let users know if there's suspicious activity on their account."

# Print the user's first three login times today.

username = "Pyth0nPr0gr@ammer##"
times = [212, 401, 554, 728, 1201, 1225, 1826]

for i in range(3): # uses for i in range(3) to loop exactly 3 times, with i taking values 0, 1, and 2. 
    print("Logged in at", times[i]) #  prints the login time at index i for each iteration, 
    # displaying the first three login times from the times list.
print() # Space

# OUTPUT:
    # Logged in at 212
    # Logged in at 401
    # Logged in at 554

# Print the user's first five login times today.

username = "Pyth0nPr0gr@ammer##"
times = [212, 401, 554, 728, 1201, 1225, 1826]

i = 0
while i < 5: # The loop runs 5 times with i taking values 0, 1, 2, 3, and 4. 
    # When i reaches 5, the condition i < 5 becomes False and the loop stops, having printed exactly 5 login times.
    print("Logged in at", times[i])
    i += 1 # increments i by 1 each iteration with i += 1

"A while loop runs as long as its condition is True. It stops as soon as the condition becomes False."

# Print all of the user's login times today. 

username = "Pyth0nPr0gr@ammer##"
times = [212, 401, 554, 728, 1201, 1225, 1826]

i = 0
while i < len(times): #  uses while i < len(times) to continue looping as long as i is less than the length of the times list.
    # Since len(times) is 8, the loop runs for i values 0 through 7, printing all 8 login times. 
    # When i reaches 8, the condition becomes False and the loop stops.
    print("Logged in at", times[i])
    i += 1 

# Logins too early in the day look suspicious. Notify the user of logins that occured before 5 am. 

username = "Pyth0nPr0gr@ammer##"
times = [212, 401, 554, 728, 1201, 1225, 1826]

i = 0
while times[i] < 500: # uses while times[i] < 500 to continue looping as long as the current login time is before 5am (500 in military time).
    # The loop runs for i values 0 and 1, printing times 212 and 401. 
    # When i reaches 2, times[2] is 554 (after 5am), so the condition becomes False and the loop stops.
    print("Unusual login at", times[i])
    i += 1

# Two logins at the exact same time is suspicious. Notify the user as soon as this happens.

username = "Pyth0nPr0gr@ammer##"
times = [212, 401, 554, 728, 1201, 1225, 1826]

i = 1
while times[i] != times[i - 1]: # continues while times[i] != times[i - 1], comparing each login time to the previous one.
    # The loop runs for i values 1, 2, and 3, printing times that differ from the previous. 
    # When i reaches 4, both times[4] and times[3] equal 728, so the condition becomes False and the loop stops.
    print("Logged in at", times[i])
    i += 1
    print("Two logins at", times[i]) # Prints the alert about the duplicate login time.

"A while loop is a common tool for repeating actions until a condition changes."