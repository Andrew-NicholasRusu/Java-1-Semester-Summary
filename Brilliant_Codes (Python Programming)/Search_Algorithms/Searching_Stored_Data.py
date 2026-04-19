"Let's avoid some unnecessary computations when scanning the message log."

# Check if there's a message with timestamp 528193. Stop scanning the log if you find one.

msg_log = [
    {
        "text":
        "can you send me a quick update before close of day",
        "sender": "WFHomie",
        "recipient": "ChiefOfStuff",
        "attachments": [],
        "timestamp": 498267,
        "status": "Not set"
    },
    {
        "text": "hey, try opening this when you get a second",
        "sender": "ExecEnvy",
        "recipient": "rubiksCubicle",
        "attachments": ["meeting_minutes.scr"],
        "timestamp": 500136,
        "status": "Not set"
    },
    {
        "text": "run these for me and tell ne what you see",
        "sender": "ScroogeMakeDeck",
        "recipient": "MicrO-Mngr",
        "attachments": ["stx99p.exe", "runme.bat"],
        "timestamp": 500834,
        "status": "Not set"
    },
    {
        "text": "lunch on friday if you're free",
        "sender": "Intern4eva",
        "recipient": "VeePeeWee",
        "attachments": [],
        "timestamp": 512887,
        "status": "Not set"
    },
    {
        "text": "i'm sending the setup just in case",
        "sender": "PusherOfPaper",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi"],
        "timestamp": 523710,
        "status": "Not set"
    },
    {
        "text": "found this pack online, might help with your project",
        "sender": "rubiksCubicle",
        "recipient": "ExecEnvy",
        "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
        "timestamp": 535451,
        "status": "Not set"
    },
    {
        "text": "here's the backup and the instructiosn i mentioned",
        "sender": "MagnumKPI",
        "recipient": "PusherOfPaper",
        "attachments": ["instructions.pdf", "backup.zip"],
        "timestamp": 545363,
        "status": "Not set"
    },
    {
        "text": "attached re a few things for you to review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
        "timestamp": 552343,
        "status": "Not set"
    }
    ]
target = 528193 # The program sets target to the timestamp 528193.
found = False
i = 0
iterations = 0
while i < len(msg_log): # The while loop runs over all valid indexes starting from 0.
    iterations += 1
    print(f"Iterations: {iterations}")
    msg = msg_log[i]
    timestamp = msg["timestamp"]
    if target == timestamp: # If a message's timestamp matches the target, the program sets found to True 
        # and the break statement exits the loop.
        found = True
        break   
    i += 1
print("Found?", found)
print() # SPACE

# The message log is sorted by timestamp, from earliest to latest. Stop searching when you've gone past the target timestamp. 
# The program should stop within 6 iterations.
target = 528193
found = False
i = 0
iterations = 0
while i < len(msg_log):
    # update iterations...
    iterations += 1
    print(f"Iterations: {timestamp}")
    msg = msg_log[i]
    timestamp = msg["timestamp"]
    if target == timestamp:
        found = True
        break
    if timestamp > target: # When timestamp > target, the search has passed where the target would be.
        found = False # Setting found = False and using break exits the loop early.
        break 
# Since the messages are sorted from earliest to latest, the search can halt when it passed the target timestamp.
    i += 1
print("Found?", found)
print() # SPACE

"When data is ordered, a search doesn't always have to check every item."

# Avoid starting the loop if the target timestamp is later than all the messages in the log.

target = 528193
last_msg = msg_log[-1] # Using msg_log[-1] gets the last message (with the largest timestamp).
last_time = last_msg["timestamp"]
found = False
if last_time >= target: # Checking last_time >= target ensures the loop only runs if the target could exist in the list.
    i = 0
    iterations= 0
    while i < len(msg_log):
        iterations += 1
        print(f"Iterations: {timestamp}")
        msg = msg_log[i]
        timestamp = msg["timestamp"]
        if target == timestamp:
            found = True
            break
        if timestamp > target: # When timestamp > target, the search has passed where the target would be.
            found = False # Setting found = False and using break exits the loop early.
            break 
    i += 1
print("Found?", found)

"While these upgrades improved some special cases ,they didn't change the worst-case time complexity."


