"Let's block messages contaiing harmful malware attachments."

# First, initialize the status of each message in the log to "Not set".
message_log = [
    {
        "text": "Here are the markdown instructions",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attchments": ["instructions.md"],
        "timestamp": 483980
    },
    {
        "text": "can you review these before the meeting?",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["budget_draft.xlsx", "slides_outline.pptx"],
        "timestamp": 484060
    },
    {
        "text": "Friday hangout details :)",
        "sender": "Intern4eva",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi", "logo.png"],
        "timestamp": 494120
    },
    {
        "text": "Check out these tools. Are they useful?",
        "sender": "rubiksCubicle",
        "recipient": "VeePeeWee",
        "attachments": ["workflow_helper.exe", "readme.txt", "printer_setup.msi"],
        "timestamp": 494138
    },
    {
        "text": "Installer = notes for the new app rollout.",
        "sender": "MicrO-Mngr",
        "recipient": "WFHomie",
        "attachments": ["rollout_notes.pdf", "printer_setup.msi", "backup_files.zip"],
        "timestamp": 504146
    },
    {
        "text": "Here are the finalized docs from today.",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "attachments": ["final_report.pdf", "agenda.docx", "workflow_helper.exe"],
        "timestamp": 504152
    },
    {
        "text": "Please test this and get back to me",
        "sender": "rubiksCubicle",
        "recipient": "ChiefOfStuff",
        "attachments": ["workflow_helper.exe"],
        "timestamp": 504823
    }
    ]
for msg in message_log: # The loop iterates through each message dictionary in message_log.
    msg["status"] = "Not set" # For each message, it creates a new key status and sets its value to "Not set".
    print("Status:", msg["status"])
print() # SPACE

# Malware was found in printer_setup.msi. Report the timestamps of all messages that have printer_setup.msi attached.

message_log = [
    {
        "text": "Here are the markdown instructions",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attchments": ["instructions.md"],
        "timestamp": 483980,
        "status": "Not set"
    },
    {
        "text": "can you review these before the meeting?",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["budget_draft.xlsx", "slides_outline.pptx"],
        "timestamp": 484060,
        "status": "Not set"
    },
    {
        "text": "Friday hangout details :)",
        "sender": "Intern4eva",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi", "logo.png"],
        "timestamp": 494120,
        "status": "Not set"
    },
    {
        "text": "Check out these tools. Are they useful?",
        "sender": "rubiksCubicle",
        "recipient": "VeePeeWee",
        "attachments": ["workflow_helper.exe", "readme.txt", "printer_setup.msi"],
        "timestamp": 494138,
        "status": "Not set"
    },
    {
        "text": "Installer = notes for the new app rollout.",
        "sender": "MicrO-Mngr",
        "recipient": "WFHomie",
        "attachments": ["rollout_notes.pdf", "printer_setup.msi", "backup_files.zip"],
        "timestamp": 504146,
        "status": "Not set"
    },
    {
        "text": "Here are the finalized docs from today.",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "attachments": ["final_report.pdf", "agenda.docx", "workflow_helper.exe"],
        "timestamp": 504152,
        "status": "Not set"
    },
    {
        "text": "Please test this and get back to me",
        "sender": "rubiksCubicle",
        "recipient": "ChiefOfStuff",
        "attachments": ["workflow_helper.exe"],
        "timestamp": 504823,
        "status": "Not set"
    }
]

malware = "printer_setup.msi"
for msg in message_log:
    timestamp = msg["timestamp"]
    attachments = msg["attachments"]
    print("🔎 Checking attachments")
    # The loop assigns malware, timestamp, and attachments from each message.
    if malware in attachments: # Inside the loop, the program checks if malware is in the attachments list and reports the timestamp when found.
        print(f"☣️ Found {malware}")
        print(f"⏲️ {timestamp}")
print("Checked all messages")
print() # SPACE

# Protip: reversed() lets you loop backwards, starting from the end of a list.
# Since the malware appeared recently, run through the log from newest to oldest. 
# Block any message with malware

message_log = [
    {
        "text": "Here are the markdown instructions",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attchments": ["instructions.md"],
        "timestamp": 483980,
        "status": "Not set"
    },
    {
        "text": "can you review these before the meeting?",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["budget_draft.xlsx", "slides_outline.pptx"],
        "timestamp": 484060,
        "status": "Not set"
    },
    {
        "text": "Friday hangout details :)",
        "sender": "Intern4eva",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi", "logo.png"],
        "timestamp": 494120,
        "status": "Not set"
    },
    {
        "text": "Check out these tools. Are they useful?",
        "sender": "rubiksCubicle",
        "recipient": "VeePeeWee",
        "attachments": ["workflow_helper.exe", "readme.txt", "printer_setup.msi"],
        "timestamp": 494138,
        "status": "Not set"
    },
    {
        "text": "Installer = notes for the new app rollout.",
        "sender": "MicrO-Mngr",
        "recipient": "WFHomie",
        "attachments": ["rollout_notes.pdf", "printer_setup.msi", "backup_files.zip"],
        "timestamp": 504146,
        "status": "Not set"
    },
    {
        "text": "Here are the finalized docs from today.",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "attachments": ["final_report.pdf", "agenda.docx", "workflow_helper.exe"],
        "timestamp": 504152,
        "status": "Not set"
    },
    {
        "text": "Please test this and get back to me",
        "sender": "rubiksCubicle",
        "recipient": "ChiefOfStuff",
        "attachments": ["workflow_helper.exe"],
        "timestamp": 504823,
        "status": "Not set"
    }
    ]
malware = "printer_setup.msi"
for msg in reversed(message_log): # The reversed() function iterates through the messages from newest to oldest. 
    timestamp = msg["timestamp"]
    print(f"⏲️ {timestamp}")
    attachments = msg["attachments"]
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        # When malware is found in the attachments, the program sets the message status to "⛔ Blocked" and prints it.
        print(msg["status"])
print("Checked all messages")
print() # SPACE

# The malware was first released at timestamp 494120. Report when the program reaches a timestamp before the malware was
# released. Then, use break to stop the loop.

message_log = [
    {
        "text": "Here are the markdown instructions",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attchments": ["instructions.md"],
        "timestamp": 483980,
        "status": "Not set"
    },
    {
        "text": "can you review these before the meeting?",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["budget_draft.xlsx", "slides_outline.pptx"],
        "timestamp": 484060,
        "status": "Not set"
    },
    {
        "text": "Friday hangout details :)",
        "sender": "Intern4eva",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi", "logo.png"],
        "timestamp": 494120,
        "status": "Not set"
    },
    {
        "text": "Check out these tools. Are they useful?",
        "sender": "rubiksCubicle",
        "recipient": "VeePeeWee",
        "attachments": ["workflow_helper.exe", "readme.txt", "printer_setup.msi"],
        "timestamp": 494138,
        "status": "Not set"
    },
    {
        "text": "Installer = notes for the new app rollout.",
        "sender": "MicrO-Mngr",
        "recipient": "WFHomie",
        "attachments": ["rollout_notes.pdf", "printer_setup.msi", "backup_files.zip"],
        "timestamp": 504146,
        "status": "Not set"
    },
    {
        "text": "Here are the finalized docs from today.",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "attachments": ["final_report.pdf", "agenda.docx", "workflow_helper.exe"],
        "timestamp": 504152,
        "status": "Not set"
    },
    {
        "text": "Please test this and get back to me",
        "sender": "rubiksCubicle",
        "recipient": "ChiefOfStuff",
        "attachments": ["workflow_helper.exe"],
        "timestamp": 504823,
        "status": "Not set"
    }
    ]
malware = "printer_setup.msi"
for msg in reversed (message_log):
    timestamp = msg["timestamp"]
    print(f"⏲️ {timestamp}")
    if timestamp < 494120: # When the timestamp is before 494120, the program: 
        print("Before malware released") # prints a message and then executes break, which exits the loop immediately. 
        break # once this line executes, the loop stops and the program executes line 282.
    # This prevents checking older messages that were sent before the malware existed.
    attachments = msg["attachments"]
    print("🔎 Checking attachments")
    if malware in attachments:
        msg["status"] = "⛔ Blocked"
        print(msg["status"])
print("Checked all messages since release")
print() # SPACE

"The break command exits a loop immediately and resumes execution after the loop."

# There's a new malware file name workflow_helper.exe.
# Find the first time it appears in the log. Then, stop checking and report the time. If it never appears, report -1.

message_log = [
    {
        "text": "Here are the markdown instructions",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attchments": ["instructions.md"],
        "timestamp": 483980,
        "status": "Not set"
    },
    {
        "text": "can you review these before the meeting?",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["budget_draft.xlsx", "slides_outline.pptx"],
        "timestamp": 484060,
        "status": "Not set"
    },
    {
        "text": "Friday hangout details :)",
        "sender": "Intern4eva",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi", "logo.png"],
        "timestamp": 494120,
        "status": "Not set"
    },
    {
        "text": "Check out these tools. Are they useful?",
        "sender": "rubiksCubicle",
        "recipient": "VeePeeWee",
        "attachments": ["workflow_helper.exe", "readme.txt", "printer_setup.msi"],
        "timestamp": 494138,
        "status": "Not set"
    },
    {
        "text": "Installer = notes for the new app rollout.",
        "sender": "MicrO-Mngr",
        "recipient": "WFHomie",
        "attachments": ["rollout_notes.pdf", "printer_setup.msi", "backup_files.zip"],
        "timestamp": 504146,
        "status": "Not set"
    },
    {
        "text": "Here are the finalized docs from today.",
        "sender": "VeePeeWee",
        "recipient": "ExecEnvy",
        "attachments": ["final_report.pdf", "agenda.docx", "workflow_helper.exe"],
        "timestamp": 504152,
        "status": "Not set"
    },
    {
        "text": "Please test this and get back to me",
        "sender": "rubiksCubicle",
        "recipient": "ChiefOfStuff",
        "attachments": ["workflow_helper.exe"],
        "timestamp": 504823,
        "status": "Not set"
    }
    ]
malware = "workflow_helper.exe"
first_time = -1
for msg in message_log:
    timestamp = msg["timestamp"]
    print(f"⏲️ {timestamp}")
    attachments = msg["attachments"]
    if malware in attachments:
        print(f"☣️ Found {malware}")
        first_time = timestamp
        break
# When the loop finds malware in the attachments, it stores the timestamp in first_time and then executes break to exit the loop immediately. 
# This efficiently finds the first occurrence without checking all messages.
print(f"First released at {first_time}")
print() # SPACE

"Breaking a loop is a reliable way to make it stop when you want it."