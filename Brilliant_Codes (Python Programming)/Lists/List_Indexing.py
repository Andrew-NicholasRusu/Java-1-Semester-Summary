"Let's improve the security notifications by reporting login times."

# This user has logged in 5 different times. Set up a list to store this data, in order from earliest to latest.

username = "EmilyVP"
times = [812, 947, 1145, 1523, 1701]
print("Login times:", times)

# Notify the user of their first two login times:

username = "EmilyVP"
times = [812, 947, 1145, 1523, 1701]
# List indexes correspond to specific elements.
print("First login today at", times[0]) # Indexes start at 0
print("Second login at", times[1]) 
print("Was this you?")
# The 5 elements of times are times[0], times[1], times[2], times[3], and times[4].

# The len function gives the number of elements in the list.
# Tell the user how many times they've logged in, and when they last logged in.

username = "EmilyVP"
times = [812, 947, 1145, 1523, 1701]
print("You logged in", len(times), "times today") 
# len(times): gets the number of elements in the times list(5)
print("Last login:", times [len(times)-1]) # Since Python uses zero-indexing, line 4 then accesses the last element 
# with times[len(times) - 1], which is times[4].
print("Was this you?")

# Here's a protip: to count from the end of a Python list, use negative indexes.
# Notidy the user of their last login time.

username = "EmilyVP"
times = [812, 947, 1145, 1523, 1701]
print("You logged in", len(times), "times today")
print("Last login:", times[-1]) # accesses the last element
print("Was this you?")
# Negative indexes count from the end: -1 is the last element, -2 is the second-to-last element, and so on.

# To index multiple elements at the beginning or end of a list, use a colon (:).
# Notify the user of their first three and last three login times.

username = "EmilyVP"
times = [812, 947, 1145, 1523, 1701]
print("You logged in", len(times), "times today")
print("First 3 logins:", times[:3]) # Gets the first three elements.
print("Last 3 logins:", times[-3:]) # Gets the last three elements
print("Was this you?")

# Indexing is the main way to get specific information out of a list.
