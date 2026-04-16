"LockedIn's message traffic is growing quickly. Let's analyze the efficiency of our programs so we can keep up."

# The message log has 29 messages. Another 17 were added. Calculate the total.

num_messages = 29 # The loop starts with 29 messages
for i in range (17):
    num_messages += 1 # adds 1 for each of the 17 new messages from the previous line 
    print(f"Calculations: {i+1}") # 46 total. This requires 17 addition operations.
print(f"Message total: {num_messages}")
print() # SPACE

# There's a faster way to do this.
# The message log has 29 messages. Another 17 were addedd. Calculate the total.

num_messages = 29 + 17 # Using 29 + 17 calculates the total in a single addition operation, which is more efficient than looping 17 times.
print("Calculations: 1")
print(f"Message total: {num_messages}")
print() # SPACE

"Some programs are more efficient than others. They do the same task with fewer basic operations."
"Understanding how to count operations is crucial to analyzing program performance."