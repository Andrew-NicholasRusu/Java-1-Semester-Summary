"Let's check a log of recent messages and warn users of risky attachments."

# Each message in the log has a list of attachments. Prin the number of files attached to each message.

message_log = [
    {
    "text": "Try this new game", 
    "sender": "SynergyHacker_101", 
    "recipient": "ExecuTroll_404",
    "attachments": ["fungame.exe"],
    "timestamp": 453991
    },
    {
    "text": "Test these out for me please",
    "sender": "SynergyHacker_101",
    "recipient": "MiddleManagerChild",
    "attachments": ["stx99p.exe", "runme.bat"],
    "timestamp": 454104
    },
    {
    "text": "Team lunch on Friday",
    "sender": "Intern4eva",
    "recipient": "ExecuTroll_404",
    "attachments": [],
    "timestamp": 454130
    },
    {
    "text": "Found this online. Looks interesting",
    "sender": "MiddleManagerChild",
    "recipient": "ExecuTroll_404",
    "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
    "timestamp": 454145
    },
    {
    "text": "Boost your workflow with this new app",
    "sender": "MiddleManagerChild", 
    "recipient": "PusherOfPaper",
    "attachments": ["stx99p.exe", "instructions.pdf", "backup.zip"],
    "timestamp": 454149
    },
    {
    "text": "Some items attached for your review",
    "sender": "ExecuTroll_404",
    "recipient": "Intern4eva",
    "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
    "timestamp": 454151
    }
    ]
for msg in message_log: # The outer loop iterates through each message dictionary in message_log.
    # Inside the loop, attachments = msg["attachments"] extracts the list of attachments from each message. 
    attachments = msg["attachments"]
    sender = msg["sender"]
    print(f"Sender: {sender}")
    print(f"📎 {len(attachments)}") # The len() function returns the number of items in the attachments list.
print() # SPACE

# Print the name of each attached file.

message_log = [
    {
    "text": "Try this new game", 
    "sender": "SynergyHacker_101", 
    "recipient": "ExecuTroll_404",
    "attachments": ["fungame.exe"],
    "timestamp": 453991
    },
    {
    "text": "Test these out for me please",
    "sender": "SynergyHacker_101",
    "recipient": "MiddleManagerChild",
    "attachments": ["stx99p.exe", "runme.bat"],
    "timestamp": 454104
    },
    {
    "text": "Team lunch on Friday",
    "sender": "Intern4eva",
    "recipient": "ExecuTroll_404",
    "attachments": [],
    "timestamp": 454130
    },
    {
    "text": "Found this online. Looks interesting",
    "sender": "MiddleManagerChild",
    "recipient": "ExecuTroll_404",
    "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
    "timestamp": 454145
    },
    {
    "text": "Boost your workflow with this new app",
    "sender": "MiddleManagerChild", 
    "recipient": "PusherOfPaper",
    "attachments": ["stx99p.exe", "instructions.pdf", "backup.zip"],
    "timestamp": 454149
    },
    {
    "text": "Some items attached for your review",
    "sender": "ExecuTroll_404",
    "recipient": "Intern4eva",
    "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
    "timestamp": 454151
    }
    ]
for msg in message_log: # The outer loop runs through the messages.
    attachments = msg["attachments"]
    sender = msg["sender"]
    print(f"Sender; {sender}")
    print(f"📎 {len(attachments)}")
    for filename in attachments: # The inner loop iterates through each filename in the attachments list.
        print(f"📄 {filename}") # For each message, this loop runs through all of its attachments and prints each filename.
print() # SPACE

"Nested loops can run through nested structures."

# A new virus has been discovered in a file name runme.bat. Check if this file is attached to any messages.

message_log = [
    {
    "text": "Try this new game", 
    "sender": "SynergyHacker_101", 
    "recipient": "ExecuTroll_404",
    "attachments": ["fungame.exe"],
    "timestamp": 453991
    },
    {
    "text": "Test these out for me please",
    "sender": "SynergyHacker_101",
    "recipient": "MiddleManagerChild",
    "attachments": ["stx99p.exe", "runme.bat"],
    "timestamp": 454104
    },
    {
    "text": "Team lunch on Friday",
    "sender": "Intern4eva",
    "recipient": "ExecuTroll_404",
    "attachments": [],
    "timestamp": 454130
    },
    {
    "text": "Found this online. Looks interesting",
    "sender": "MiddleManagerChild",
    "recipient": "ExecuTroll_404",
    "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
    "timestamp": 454145
    },
    {
    "text": "Boost your workflow with this new app",
    "sender": "MiddleManagerChild", 
    "recipient": "PusherOfPaper",
    "attachments": ["stx99p.exe", "instructions.pdf", "backup.zip"],
    "timestamp": 454149
    },
    {
    "text": "Some items attached for your review",
    "sender": "ExecuTroll_404",
    "recipient": "Intern4eva",
    "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
    "timestamp": 454151
    }
    ]
for msg in message_log:
    attachments = msg ["attachments"]
    sender = msg["sender"]
    print(f"Sender: {sender}")
    print(f"📎 {len(attachments)}")
    for filename in attachments:
        print(f"📄 {filename}")
        if filename == "runme.bat": # Inside the inner loop, an if statement checks whether filename == "runme.bat"
            print(f"⚠️ Caution: {filename}") #  When this condition is True, it prints a warning for that specific file.
print() # SPACE

# Viruses have been circulating in attachments ending in .zip. Check if any attachments have this extension.

message_log = [
    {
    "text": "Try this new game", 
    "sender": "SynergyHacker_101", 
    "recipient": "ExecuTroll_404",
    "attachments": ["fungame.exe"],
    "timestamp": 453991
    },
    {
    "text": "Test these out for me please",
    "sender": "SynergyHacker_101",
    "recipient": "MiddleManagerChild",
    "attachments": ["stx99p.exe", "runme.bat"],
    "timestamp": 454104
    },
    {
    "text": "Team lunch on Friday",
    "sender": "Intern4eva",
    "recipient": "ExecuTroll_404",
    "attachments": [],
    "timestamp": 454130
    },
    {
    "text": "Found this online. Looks interesting",
    "sender": "MiddleManagerChild",
    "recipient": "ExecuTroll_404",
    "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
    "timestamp": 454145
    },
    {
    "text": "Boost your workflow with this new app",
    "sender": "MiddleManagerChild", 
    "recipient": "PusherOfPaper",
    "attachments": ["stx99p.exe", "instructions.pdf", "backup.zip"],
    "timestamp": 454149
    },
    {
    "text": "Some items attached for your review",
    "sender": "ExecuTroll_404",
    "recipient": "Intern4eva",
    "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
    "timestamp": 454151
    }
    ]
for msg in message_log:
    attachments = msg ["attachments"]
    sender = msg["sender"]
    print(f"Sender: {sender}")
    print(f"📎 {len(attachments)}")
    for filename in attachments:
        print(f"📄 {filename}")
        if filename == "runme.bat":
            print(f"⚠️ Caution: {filename}")
        if filename.endswith(".zip"): # A second if statement checks if the filename ends with .zip using the endswith() method.
            # This checks only the end of the string, so it correctly identifies .zip files without false matches.
            print(f"⚠️ Caution: .zip file")
print() # SPACE

#

message_log = [
    {
    "text": "Try this new game", 
    "sender": "SynergyHacker_101", 
    "recipient": "ExecuTroll_404",
    "attachments": ["fungame.exe"],
    "timestamp": 453991
    },
    {
    "text": "Test these out for me please",
    "sender": "SynergyHacker_101",
    "recipient": "MiddleManagerChild",
    "attachments": ["stx99p.exe", "runme.bat"],
    "timestamp": 454104
    },
    {
    "text": "Team lunch on Friday",
    "sender": "Intern4eva",
    "recipient": "ExecuTroll_404",
    "attachments": [],
    "timestamp": 454130
    },
    {
    "text": "Found this online. Looks interesting",
    "sender": "MiddleManagerChild",
    "recipient": "ExecuTroll_404",
    "attachments": ["coupon.zip", "readme.txt", "avatar.png"],
    "timestamp": 454145
    },
    {
    "text": "Boost your workflow with this new app",
    "sender": "MiddleManagerChild", 
    "recipient": "PusherOfPaper",
    "attachments": ["stx99p.exe", "instructions.pdf", "backup.zip"],
    "timestamp": 454149
    },
    {
    "text": "Some items attached for your review",
    "sender": "ExecuTroll_404",
    "recipient": "Intern4eva",
    "attachments": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
    "timestamp": 454151
    }
    ]
risky_extensions = [".exe", ".zip", ".bat", ".scr", ".cmd", ".msi", ".iso", ".dmg"]
for msg in message_log:
    attachments = msg ["attachments"]
    sender = msg["sender"]
    print(f"Sender: {sender}")
    print(f"📎 {len(attachments)}")
    for filename in attachments:
        print(f"📄 {filename}")
        for ext in risky_extensions: # An additional inner loop iterates through each extension in risky_extensions.
            if filename.endswith(ext): # For each filename, the program checks all extensions to see if the filename ends with any of them.
                print(f"⚠️ Caution: {ext} file") # When a match is found, it prints a warning with that extension.
print() # SPACE

"Nested loops are a key tool for processing data that's stored in nested structures."