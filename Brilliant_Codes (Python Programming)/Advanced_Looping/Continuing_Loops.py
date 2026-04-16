"Let's improve the message blocker by skipping message that are already checked."

# Malware is curculating in a file named "backup.zip". Block any messages with this attachment.

message_log = [
    {
    "text": "check out this little tool I found.",
    "sender": "WFHomie",
    "recipient": "rubiksCubicle",
    "attachments": ["arcade_fix.exe"],
    "timestamp": 510981,
    "status": "⛔ Blocked"
    },
    {
        "text": "can you send me a quick update today",
        "sender": "ChiefOfStuff",
        "recipient": "VeePeePee",
        "attachments": [],
        "timestamp": 511727,
        "status": "✅ OK"
    },
    {
        "text": "try running these and tell me what happens",
        "sender": "SynergyHacker_101",
        "recipient": "MicrOMngr",
        "attachments": ["budget_viewer.exe", "cleanup_run.bat"],
        "timestamp": 513882,
        "status": "⛔ Blocked"
    },
    {
        "text": "here's the backup i mentioned earlier",
        "sender": "ExecEnvy",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["backup.zip"],
        "timestamp": 513972,
        "status": "⛔ Blocked"
    },
    {
        "text": "lunch plans for friday if you're free",
        "sender": "Intern4eva",
        "recipient": "ExecuTroll_404",
        "attachments": [],
        "timestamp": 514232,
        "status": "not set"
    },
    {
        "text": "saw these files and thought you might want them",
        "sender": "MiddleManagerChild",
        "recipient": "ExecEnvy",
        "attachments": ["promo_bundle.zip", "read_this_first.txt", "profile_pic.png"],
        "timestamp": 514565,
        "status": "Not set"
    },
    {
        "text": "new app stuff for you to test when you can",
        "sender": "rubiksCubicle",
        "recipient": "PusherOfPaper",
        "attachments": ["status_tracker.exe", "setup_guide.pdf", "backup.zip"],
        "timestamp": 514801,
        "status": "Not set"
    },
    {
        "text": "attached are the docs for your review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["summary_notes.pdf", "roadmap.docx", "office_cat.jpg"],
        "timestamp": 515233,
        "status": "Not set"
    }
    ]
malware = "backup.zip"
for msg in message_log:
    # extract data...
    attachments = msg ["attachments"]
    status = msg ["status"]
    sender = msg ["sender"]
    print(f"Message from {sender}")
    print(f"Previous status: {status}")
    print("🔎 Checking attachments")
    if malware in attachments: # The condition malware in attachments checks if the malware file is in the attachments list. 
        msg ["status"] = "⛔ Blocked" # When found, the status is set to ⛔ Blocked.
        print("Status:", msg["status"])
print() # SPACE

# Some messages in the log were already blocked becasue they had other malware. We can use Python's continue to skip them.
# If a message is already blocked, report it, skip checking its attachments, and continue with the next message.

message_log = [
    {
    "text": "check out this little tool I found.",
    "sender": "WFHomie",
    "recipient": "rubiksCubicle",
    "attachments": ["arcade_fix.exe"],
    "timestamp": 510981,
    "status": "⛔ Blocked"
    },
    {
        "text": "can you send me a quick update today",
        "sender": "ChiefOfStuff",
        "recipient": "VeePeePee",
        "attachments": [],
        "timestamp": 511727,
        "status": "✅ OK"
    },
    {
        "text": "try running these and tell me what happens",
        "sender": "SynergyHacker_101",
        "recipient": "MicrOMngr",
        "attachments": ["budget_viewer.exe", "cleanup_run.bat"],
        "timestamp": 513882,
        "status": "⛔ Blocked"
    },
    {
        "text": "here's the backup i mentioned earlier",
        "sender": "ExecEnvy",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["backup.zip"],
        "timestamp": 513972,
        "status": "⛔ Blocked"
    },
    {
        "text": "lunch plans for friday if you're free",
        "sender": "Intern4eva",
        "recipient": "ExecuTroll_404",
        "attachments": [],
        "timestamp": 514232,
        "status": "not set"
    },
    {
        "text": "saw these files and thought you might want them",
        "sender": "MiddleManagerChild",
        "recipient": "ExecEnvy",
        "attachments": ["promo_bundle.zip", "read_this_first.txt", "profile_pic.png"],
        "timestamp": 514565,
        "status": "Not set"
    },
    {
        "text": "new app stuff for you to test when you can",
        "sender": "rubiksCubicle",
        "recipient": "PusherOfPaper",
        "attachments": ["status_tracker.exe", "setup_guide.pdf", "backup.zip"],
        "timestamp": 514801,
        "status": "Not set"
    },
    {
        "text": "attached are the docs for your review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["summary_notes.pdf", "roadmap.docx", "office_cat.jpg"],
        "timestamp": 515233,
        "status": "Not set"
    }
    ]
malware = "backup.zip"
for msg in message_log:
    # extract data...
    attachments = msg ["attachments"]
    status = msg ["status"]
    sender = msg ["sender"]
    print(f"Message from {sender}")
    if status == "⛔ Blocked": # When the status equals ⛔ Blocked, the program prints a message 
        # and uses continue to skip the attachment check.
        print("Already blocked")
        continue
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print("Status", msg["status"])
print() # SPACE

"The continue command ends with the current iteration and moves on to the next one."

# If a message has no attachments, set its status to " OK" and skip to the next message.

message_log = [
    {
    "text": "check out this little tool I found.",
    "sender": "WFHomie",
    "recipient": "rubiksCubicle",
    "attachments": ["arcade_fix.exe"],
    "timestamp": 510981,
    "status": "⛔ Blocked"
    },
    {
        "text": "can you send me a quick update today",
        "sender": "ChiefOfStuff",
        "recipient": "VeePeePee",
        "attachments": [],
        "timestamp": 511727,
        "status": "✅ OK"
    },
    {
        "text": "try running these and tell me what happens",
        "sender": "SynergyHacker_101",
        "recipient": "MicrOMngr",
        "attachments": ["budget_viewer.exe", "cleanup_run.bat"],
        "timestamp": 513882,
        "status": "⛔ Blocked"
    },
    {
        "text": "here's the backup i mentioned earlier",
        "sender": "ExecEnvy",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["backup.zip"],
        "timestamp": 513972,
        "status": "⛔ Blocked"
    },
    {
        "text": "lunch plans for friday if you're free",
        "sender": "Intern4eva",
        "recipient": "ExecuTroll_404",
        "attachments": [],
        "timestamp": 514232,
        "status": "not set"
    },
    {
        "text": "saw these files and thought you might want them",
        "sender": "MiddleManagerChild",
        "recipient": "ExecEnvy",
        "attachments": ["promo_bundle.zip", "read_this_first.txt", "profile_pic.png"],
        "timestamp": 514565,
        "status": "Not set"
    },
    {
        "text": "new app stuff for you to test when you can",
        "sender": "rubiksCubicle",
        "recipient": "PusherOfPaper",
        "attachments": ["status_tracker.exe", "setup_guide.pdf", "backup.zip"],
        "timestamp": 514801,
        "status": "Not set"
    },
    {
        "text": "attached are the docs for your review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["summary_notes.pdf", "roadmap.docx", "office_cat.jpg"],
        "timestamp": 515233,
        "status": "Not set"
    }
    ]
malware = "backup.zip"
for msg in message_log:
    # extract data...
    attachments = msg ["attachments"]
    status = msg ["status"]
    sender = msg ["sender"]
    print(f"Message from {sender}")
    if len(attachments) == 0:
        msg["status"] = "✅ OK" # When there are no attachments, the program sets the status to ✅ OK 
        # and uses continue to skip the malware check.
        print("Status:", msg["status"])
        continue
    if status == "⛔ Blocked":
        print("Already blocked")
        continue
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print("Status:", msg["status"])
print() # SPACE

# Avoid checking the length of the attachment list for a message if it's already been blocked.

message_log = [
    {
    "text": "check out this little tool I found.",
    "sender": "WFHomie",
    "recipient": "rubiksCubicle",
    "attachments": ["arcade_fix.exe"],
    "timestamp": 510981,
    "status": "⛔ Blocked"
    },
    {
        "text": "can you send me a quick update today",
        "sender": "ChiefOfStuff",
        "recipient": "VeePeePee",
        "attachments": [],
        "timestamp": 511727,
        "status": "✅ OK"
    },
    {
        "text": "try running these and tell me what happens",
        "sender": "SynergyHacker_101",
        "recipient": "MicrOMngr",
        "attachments": ["budget_viewer.exe", "cleanup_run.bat"],
        "timestamp": 513882,
        "status": "⛔ Blocked"
    },
    {
        "text": "here's the backup i mentioned earlier",
        "sender": "ExecEnvy",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["backup.zip"],
        "timestamp": 513972,
        "status": "⛔ Blocked"
    },
    {
        "text": "lunch plans for friday if you're free",
        "sender": "Intern4eva",
        "recipient": "ExecuTroll_404",
        "attachments": [],
        "timestamp": 514232,
        "status": "not set"
    },
    {
        "text": "saw these files and thought you might want them",
        "sender": "MiddleManagerChild",
        "recipient": "ExecEnvy",
        "attachments": ["promo_bundle.zip", "read_this_first.txt", "profile_pic.png"],
        "timestamp": 514565,
        "status": "Not set"
    },
    {
        "text": "new app stuff for you to test when you can",
        "sender": "rubiksCubicle",
        "recipient": "PusherOfPaper",
        "attachments": ["status_tracker.exe", "setup_guide.pdf", "backup.zip"],
        "timestamp": 514801,
        "status": "Not set"
    },
    {
        "text": "attached are the docs for your review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachments": ["summary_notes.pdf", "roadmap.docx", "office_cat.jpg"],
        "timestamp": 515233,
        "status": "Not set"
    }
    ]
malware = "backup.zip"
for msg in message_log:
    # extract data...
    attachments = msg ["attachments"]
    status = msg ["status"]
    sender = msg ["sender"]
    print(f"Message from {sender}")
    if status == "⛔ Blocked":
        print("Already blocked")
        continue # The first check uses continue to skip already blocked messages. 
    if len(attachments) == 0:
        msg["status"] = "✅ OK"
        continue # The second check uses continue to skip messages with no attachments, avoiding unnecessary checks.
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print("Status", msg["status"])
print() # SPACE

"Using continue can avoid extra computational steps once a loop iteration finishes its task."