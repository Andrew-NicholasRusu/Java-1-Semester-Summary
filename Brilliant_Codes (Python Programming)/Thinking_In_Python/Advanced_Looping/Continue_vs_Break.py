"Let's add finer control to the message-blocking feature."

# New malware has surfaced in a file name meeting_minutes.scr. Starting with the most recent, block all messages with this file attached.
message_log = [
    {
        "text": "looks solid to me, thanks for putting it together",
        "sender": "ChiefOfStuff",
        "recipient": "WFHomie",
        "attachments": [],
        "timestamp": 524741,
        "status": "✅ OK"
    },
    {
        "text": "can you test this quick demo i made",
        "sender": "ExecEnvy",
        "recipient": "SynergyHacker_101",
        "attachments": ["retro_runner.exe"],
        "timestamp": 524990,
        "status": "⛔ Blocked"
    },
    {
        "text": "any chance you can send an update today",
        "sender": "WFHomie",
        "recipient": "ChiefOfStuff",
        "attachments": [],
        "timestamp": 525895,
        "status": "✅ OK"
    },
    {
        "text": "take a look at these when you get a minute",
        "sender": "ScroogeMakeDeck",
        "recipient": "MicrO-Mngr",
        "attachments": ["meeting_minutes.scr", "setup_helper.bat"],
        "timestamp": 526450,
        "status": "Not set"
    },
    {
        "text": "here are the files from the test run",
        "sender": "VeePeeWee",
        "recipient": "rubiksCubicle",
        "attachments": ["deploy_tools.bat", "notes_prompt.md", "output_results.xlsx"],
        "timestamp": 526854,
        "status": "⛔ Blocked"
    },
    {
        "text": "lunch on friday if your're around",
        "sender": "Intern4eva",
        "recipient": "ExecEnvy",
        "attachments": [],
        "timestamp": 526877,
        "status": "Not set"
    },
    {
        "text": "sending myself a backup before the update",
        "sender": "PusherOfPaper",
        "recipient": "PusherOfPaper",
        "attachments": ["home_backup.zip"],
        "timestamp": 527093,
        "status": "Not set"
    },
    {
        "text": "found this bundle online, might be useful",
        "sender": "MicrO-Mngr",
        "recipient": "VeePeeWee",
        "attachments": ["starter_pack.zip", "read_first.txt", "avatar_alt.png"],
        "timestamp": 527133,
        "status": "Not set"
    },
    {
        "text": "new app rollout stuff for you to check",
        "sender": "rubiksCubicle",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["meeting_minutes.scr", "quickstart.pdf", "archive_backup.zip"],
        "timestamp": 527849,
        "status": "Not set"
    },
    {
        "text": "attached are the docs for your review",
        "sender": "SynergyHacker_101",
        "recipient": "Intern4eva",
        "attachments": ["review_notes.pdf", "launch_agenda.docx", "team_photo.jpg"],
        "timestamp": 528919,
        "status": "Not set"
    }
    ]
malware = "meeting_minutes.scr"
for msg in reversed(message_log): # The reversed() function iterates through the messages from newest to oldest.
    # extract data ...
    attachments = msg["attachments"]
    status = msg["status"]
    sender = msg["sender"]
    timestamp = msg["timestamp"]
    print(f"Message from {sender} at {timestamp}")
    print(f"Previous status: {status}")
    print("🔎 Checking attachments")
    if malware in attachments: # The in operator checks if malware is present in the attachments list.
        msg["status"] = "⛔ Blocked"
        print(f"⛔ Found {malware}")
print() # Space

# Some messages in the log were already blocked because they had other malware. If a message is already blocked, report it and don't check its attachents.

malware = "meeting_minutes.scr"
for msg in reversed(message_log): 
    # extract data ...
    attachments = msg["attachments"]
    status = msg["status"]
    sender = msg["sender"]
    timestamp = msg["timestamp"]
    if status == "⛔ Blocked": # When the status equals ⛔ Blocked, the program prints a message and 
        # uses continue to skip the attachment check for that message and continue with the next one.
        print("Already blocked")
        continue
    # print message info...
    print(f"Message from {sender} at {timestamp}")
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print(f"⛔ Found {malware}")
print() # Space

# No malware was reported before 525000, so don't scan any messages sent before that time. 

malware = "meeting_minutes.scr"
for msg in reversed(message_log): 
    # extract data ...
    attachments = msg["attachments"]
    status = msg["status"]
    sender = msg["sender"]
    timestamp = msg["timestamp"]
    if timestamp < 525000:
        break # When timestamp goes below 525000, break exits the loop to avoid checking older messages.
    if status == "⛔ Blocked":
        print("Already blocked")
        continue # when this runs, the loop continues to check the next msg, if any remain.
    # print message info...
    print(f"Message from {sender} at {timestamp}")
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print(f"⛔ Found {malware}")
print() # Space

"The continue command only ends the current iteration, but break exits the loop."

# If a message has no attachments, report it and don't check its attachments. Make sure its status is also set to "✅ OK"

malware = "meeting_minutes.scr"
for msg in reversed(message_log):
    # extract data ...
    attachments = msg["attachments"]
    status = msg["status"]
    sender = msg["sender"]
    timestamp = msg["timestamp"]
    # check if too early ...
    if timestamp < 525000:
        break
    # print message info ...
    print(f"Message from {sender} at {timestamp}")
    # check if already blocked ...
    if status == "⛔ Blocked":
        print("Already blocked")
        continue
    msg["status"] = "✅ OK" # he program sets the status to ✅ OK at the start.
    if len(attachments) == 0:
        print("✅ No attachment") # If no attachments are found, it prints a message 
        continue # and uses continue to skip the rest of the loop iteration.
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print(f"⛔ Found {malware}")
print() # Space

# New security details have come to light: the malware was only sent twice. Update the program to stop checking once it blocks both.

malware = "meeting_minutes.scr"
num_blocked = 0 # The program initializes num_blocked to 0
for msg in reversed(message_log):
    # extract data ...
    attachments = msg["attachments"]
    status = msg["status"]
    sender = msg["sender"]
    timestamp = msg["timestamp"]
    # check if too early ...
    if timestamp < 525000:
        break
    # print message info ...
    print(f"Message from {sender} at {timestamp}")
    # check if already blocked ...
    if status == "⛔ Blocked":
        print("Already blocked")
        continue
    msg["status"] = "✅ OK"
    # check if no attachments ...
    if len(attachments) == 0:
        print("✅ No attachment") 
        continue 
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print(f"⛔ Found {malware}")
        num_blocked += 1 # Each time malware is found, it increments the counter using num_blocked += 1.
    if num_blocked == 2: # When the counter reaches 2, break exits the loop.
        print(f"Found both messages with {malware}")
        break
print() # Space

"The break and continue commands give you custom control over loops."