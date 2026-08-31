"Let's analyze the worst-case time complexity of different searching strategies"

# Use a binary search to find a message with timestamp 632016. The program should stop within 4 iterations.

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
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]: # If target == msg["timestamp"], we found it.
        found = True
        break
    elif target < msg["timestamp"]: #  If target < msg["timestamp"], the target is in the left half.
        right = middle - 1
    else: # Otherwise (else), it's in the right half.
        left = middle + 1
print(msg)
print() # SPACE

# Count the number of times the loop runs.

target = 632016
left = 0
right = len(msg_log) - 1
found = False
iterations = 0
while left <= right:
    iterations += 1
    print("Iterations:", iterations)
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        found = True
        break
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1
print("Found:", msg["timestamp"])
# Initialize iterations = 0 before the loop, then use iterations += 1 inside the loop to count each iteration.
print() # Space

"Doubling the size of the data only adss about one more iteration to the search."
"This describes logarithmic time complexity, or O(log n)."

# What's the worst-case time complexity of the binary search?

target = 632016
left = 0
right = len(msg_log) - 1
found = False
iterations = 0
while left <= right:
    iterations += 1
    print("Iterations:", iterations)
    middle = (left + right) // 2
    msg = msg_log[middle]
    if target == msg["timestamp"]:
        found = True
        break
    elif target < msg["timestamp"]:
        right = middle - 1
    else:
        left = middle + 1
# Answer: Logarithmic time: O (log n)
# Explanation: The binary search rules out half of the data in each iteration. 
    # Increasing the number of messages from nn to 2n2n only adds about one more iteration to the runtime. 
    # So, its worst-case time complexity is O(log⁡n),O(logn), or logarithmic time.

# What's the worst-case time complexity of the sequential search?

target = 632016
found = False
i = 0
while i < len(msg_log):
    msg = msg_log[i]
    if msg["timestamp"] == target:
        found = True
        break
    i += 1
# Answer: Linear time: O(n)
# Explanation: In the worst case, the sequential search has to loop through each item in the list. 
    # If there are nn messages to process, the loop runs nn times. 
    # So, its worst-case time complexity is O(n),O(n), or linear time.

"Programs that un in logarithmic time are much more efficient than linear-time programs, espcially for large datasets."
