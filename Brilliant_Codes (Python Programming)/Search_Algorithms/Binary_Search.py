"Some users' phones were hacked after opening a message with timestamp 632016. Let's find the sender, fast!"

# Check if 632016 is in the range between the first (leftmost) and last (rightmost) timestamps.

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
# Setting left = 0 gives the first index and right = len(msg_log) - 1 gives the last.
left_msg = msg_log[left]
right_msg = msg_log[right]
left_time = left_msg["timestamp"]
right_time = right_msg ["timestamp"]
if target >= left_time and target <= right_time:
# The condition target >= left_time and target <= right_time checks if the target is within the data's range.
    print(f"Target {target} is between {left_time} and {right_time}")
print() # SPACE

# Protip: Python's // operator divides two numbers and rounds the result down to a whole number.
# Use // to find an index in the middle between left and right, then check if 632016 coud be in the first or second half of the log.

target = 632016
left = 0
right = len(msg_log) - 1
left_msg = msg_log[left]
right_msg = msg_log[right]
left_time = left_msg["timestamp"]
right_time = right_msg ["timestamp"]
middle = (left + right) // 2 # Using (left + right) // 2 finds the middle index.
# The // operator divides and rounds down to an integer.
middle_msg = msg_log[middle]
middle_time = middle_msg["timestamp"]
if target >= left_time and target <= middle_time: # Checking target <= middle_time determines if the target could be in the first half.
    print("Target is in first half")
else:
    print("Target is in second half")
print() # SPACE

"Ruling out half of the data reduces the size of the problem quickly."

# Check if the target is in the middle. If not, update left or right to narrow the search to the range of indexes where the target could be.
target = 632016
found = False
left = 0
right = len(msg_log) - 1
middle = (left + right) // 2
msg = msg_log[middle]
middle_time = msg["timestamp"]
if target == middle_time:
    found = True # If the target equals middle_time, we found it.
elif target < middle_time: # If target < middle_time, the target must be in the left half, so we update right
    right = middle - 1
else: # Otherwise, we update left to search the right half.
    left = middle + 1
# print results:
if found:
    print(f"Target found at index {middle}")
else:
    print(f"Narrowed the search range to indexes from {left} to {right}")
print() # SPACE

# Keep ruling out half of the data until the target is found, or until the search range is smaller than 0. The program should stop within 6 iterations.

target = 632016
left = 0
right = len(msg_log) - 1
found = False
while left <= right: # The loop continues while left <= right.
    print(f"Search range: {left} to {right}")
    middle = (left + right) // 2
    msg = msg_log[middle]
    middle_time = msg["timestamp"]
    if target == middle_time:
        found = True
        break
    elif target > middle_time:
        left = middle + 1
    else: 
        right = middle - 1
    # Each iteration checks if the target matches the value in the middle of the search range, 
    # and narrows the range by updating left or right, as appropriate.
if found: # If the target is found, break exits the loop.
    print("🚨 MALWARE SENT BY:", msg["sender"])
else:
    print("Timestamp not found")

"Repeatedly halving the search range is the key to improving search speed."