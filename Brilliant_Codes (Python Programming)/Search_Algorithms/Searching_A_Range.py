"We've found the user who sent the malware. Now let's help everyone they hit."

# Complete the binary search to find a message with timestamp 632016.
# The program should stop within 4 iterations.

msg_log = [
    {
        "text":
        "can you send me a quick update before close of day",
        "sender": "WFHomie",
        "recipient": "ChiefOfStuff",
        "attachments": [],
        "timestamp": 698267,
        "status": "Not set"
    },
    {
        "text": "hey, try opening this when you get a second",
        "sender": "ExecEnvy",
        "recipient": "rubiksCubicle",
        "attachments": ["meeting_minutes.scr"],
        "timestamp": 600136,
        "status": "Not set"
    },
    {
        "text": "run these for me and tell ne what you see",
        "sender": "ScroogeMakeDeck",
        "recipient": "MicrO-Mngr",
        "attachments": ["stx99p.exe", "runme.bat"],
        "timestamp": 600834,
        "status": "Not set"
    },
    {
        "text": "lunch on friday if you're free",
        "sender": "Intern4eva",
        "recipient": "VeePeeWee",
        "attachments": [],
        "timestamp": 612887,
        "status": "Not set"
    },
    {
        "text": "i'm sending the setup just in case",
        "sender": "PusherOfPaper",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi"],
        "timestamp": 623710,
        "status": "Not set"
    },
    {
        "text": "checking the latest updates now",
        "sender": "ThoughtLeader",
        "recipient": "WFHomie",
        "timestamp": 629852
    },
    {
        "text": "ill responsed after my meeting",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "timestamp": 629905
    },
    {
        "text": "found this pack online, might help with your project",
        "sender": "rubiksCubicle",
        "recipient": "ExecEnvy",
        "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
        "timestamp": 635451,
        "status": "Not set"
    },
    {
        "text": "here's the backup and the instructiosn i mentioned",
        "sender": "MagnumKPI",
        "recipient": "PusherOfPaper",
        "attachments": ["instructions.pdf", "backup.zip"],
        "timestamp": 645363,
        "status": "Not set"
    },
    {
        "text": "attached re a few things for you to review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
        "timestamp": 652343,
        "status": "Not set"
    }
    ]
target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right: # The loop continues while left <= right.
    # print search range:
    print(f"Search range: {left} to {right}")
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]: # When target == msg["timestamp"], 
        # the program exits the loop because it has found a match.
        found = True
        break
    elif target < msg["timestamp"]: # If target < msg["timestamp"], 
        # it searches the left half by updating right.
        right = middle - 1
    else:
        left = middle + 1 # Otherwise, it searches the right half by updating left.
# print results:
if found:
    print(msg)
else:
    print("Timestamp not found")
print() # SPACE

# Find the first message in the log with timestamp 632016. The program should stop within 7 iterations.

target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right:
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        print(f"Found at {middle}")
        found = True
        first_found = middle # When a match is found, the program saves first_found = middle 
        right = middle - 1 # and continues searching left (right = middle - 1) to find an earlier match. 
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1
    # The loop continues until no earlier matches exist.
if found:
    print("First index:", first_found)
    msg = msg_log[first_found]
    print("Sender:", msg["sender"])
    print("Recipient", msg["recipient"])
    print("Timestamp:", msg["timestamp"])
print() # Space

"Sometimes, the data contains multiple instances of the target value. We can modify the binary search to find the first or last instance."

# Find the last message in the log with timestamp 632016. The program should stop within 7 iterations.

target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right:
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        print(f"Found at {middle}")
        found = True
        last_found = middle
        left = middle + 1
    # When a match is found, the program saves last_found = middle and continues searching right (left = middle + 1) to find a later match.
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1
    # The loop continues until no later matches exist.
if found: 
    print("Last index:", last_found)
    msg = msg_log[last_found]
    print("Sender:", msg["sender"])
    print("Recipient", msg["recipient"])
    print("Timestamp:", msg["timestamp"])
print() # Space

# Now that we've found the indexes of the malware messages (from first_found to last_found), let's read out to the affected users.
# If a user received a message at timestamp 632016, send them a code to recover their account.

# find first_found:
target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right:
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        found = True
        first_found = middle
        right = middle - 1
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1

# find last_found:
target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right:
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        last_found = middle
        left = middle + 1
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1

if found: # First the program checks to make sure at least one message was found. 
    i = first_found
    while i <= last_found: # If so, it loops starting with i = first_found while i <= last_found, so that all messages, 
        # from the first to the last, will be included.
        msg = msg_log[i]
        recipient = msg["recipient"]
        print(f"📲 Code sent for {recipient}")
        i += 1
    print(f"Contacted {i - first_found} affected users") # When the loop finishes, i will have been incremented once 
    # for each user contacted, so the count i - first_found gives the total number of users contacted.
print() # SPACE

"Binary searches are the gold standard for searching efficiency."

