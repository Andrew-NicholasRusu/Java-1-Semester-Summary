"Several users are reporting that as soon as they tapped a 'new message' notification,"
"LockedIn froze and their phones got hacked."

# Let's scan the message log to investigate. 
# Print the fifth message in the message log, if there is one.

msg_log = [
    {
        "text": "just checking in on the status of that ticket",
        "sender": "MicrO-Mngr",
        "recipient": "rubiksCubicle",
        "timestamp": 286267
    },
    {
        "text":
        "can you take a quick look a this when you get a chance",
        "sender": "ExecEnvy",
        "recipient": "Intern4eva",
        "timestamp": 299022
    },
    {
        "text": "i updated the doc with the latest notes",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "timestamp": 300834
    },
    {
        "text": "lets sync later today if youre free",
        "sender": "ScroogMakeDeck",
        "recipient": "PusherOfPaper",
        "timestamp": 312887
    },
    {
        "text": "heads up that the build finished and looks good",
        "sender": "ExecEnvy",
        "recipient": "PusherOfPaper",
        "timestamp": 323710
    },
    {
        "text": "thanks for sending that over, ill review it shortly",
        "sender": "Intern4eva",
        "recipient": "VeePeeWee",
        "timestamp": 335451
    },
    {
        "text": "im in the meeting now, will reply after",
        "sender": "PusherOfPaper",
        "recipient": "ChiefOfStuff",
        "timestamp": 345363
    },
    {
        "text": "quick reminder the deadline is end of week",
        "sender": "ScroogeMakeDeck",
        "recipient": "MicrO-Mngr",
        "timestamp": 345363
    },
    {
        "text": "attached are a few things for you to review",
        "sender": "MicrO-Mngr",
        "recipient": "rubiksCubicle",
        "timestamp": 352343
    }
    ]
if len(msg_log) >= 5: # Use >= to check if there are at least 5 messages
    print(msg_log[4]) # Then access index 4 to print the fifth message (since lists are 0-indexed).
else:
    print("No fifth message")
print() # SPACE

# Find the index of the first message sent by "ExecEnvy". The program should stop within 8 iterations.
target = "ExecEnvy"
found = False
i = 0
iterations = 0
while i < len(msg_log):
    # update iterations
    msg = msg_log[i]
    if msg["sender"] == target:
        found = True
        break
    i += 1
if found:
    print(f"Found at index {i}")
else:
    print("Not found")
print() # SPACE

"A search algorithm finds an item in a dataset that matches a target value."

if len(msg_log) >= 5: 
    print(msg_log[4]) 
else:
    print("No fifth message")
# This doesn't search, because the index is already known.

target = "ExecEnvy"
found = False
i = 0
iterations = 0
while i < len(msg_log):
    msg = msg_log[i]
    if msg["sender"] == target:
        found = True
        break
    i += 1
# This searches for a target value whose index is unknown.

# Find the index of the first message received by "PusherOfPaper".
target = "PusherOfPaper" # Set target to "PusherOfPaper"
found = False
i = 0
while i < len (msg_log):
    print(f"Iteractions: {i+1}")
    msg = msg_log[i]
    if msg["recipient"] == target: # check msg["recipient"] == target to find messages received by that user.
        found = True
        break
    i += 1
# Print results:
if found:
    print(f"Found at index {i}")
else:
    print("Not found")
print() # SPACE

# Find the index of the first message sent after timestamp 300000
found = False
i = 0
while i < len (msg_log):
    print(f"Iteractions: {i+1}")
    msg = msg_log[i]
    if msg["timestamp"] > 300000: # Check msg["timestamp"] > 300000 to find the first message sent after that timestamp.
        found = True
        break
    i += 1
# Print results:
if found:
    print(f"Found at index {i}")
else:
    print("Not found")
print() # SPACE

# Find the index of the first message with timestamp 319212.
target = 319212 # Set target to 319212
found = False
i = 0
while i < len(msg_log):
    print(f"Iterations: {i+1}")
    msg = msg_log[i]
    if msg["timestamp"] == target: #  check msg["timestamp"] == target to find the message with that exact timestamp.
        found = True
        break
    i += 1
# Print results:
if found:
    print(f"Found at index {i}")
else:
    print("Not found")
print() # SPACE

"Searching is a common programming task, especially when working with large datasets"