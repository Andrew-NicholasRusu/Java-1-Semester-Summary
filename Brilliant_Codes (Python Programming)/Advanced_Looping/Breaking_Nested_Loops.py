"Let's improve the message-blocking feature by checking for multiple harmful attachments at once."

# Run through the message log in reverse, from newest oldest. Print the number of files attached to each message.

message_log = [
    {
        "text": "notes from today's meeting are attached",
        "sender": "Intern4eva",
        "recipient": "WFHomie",
        "attachments": ["meeting_notes.pdf", "action_items.docx"],
        "timestamp": 504819,
        "status": "Not set"
    },
    {
        "text": "hey, can you try installing this on your mac?",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attachments": ["quick_sync.dmg", "forecast.md", "install.dmg"],
        "timestamp": 504982,
        "status": "Not set"
    },
    {
        "text": "thought you might want these files asap",
        "sender": "ScroogeMakeDeck",
        "recipient": "Intern4eva",
        "attachments": ["team_mtg_docx", "free_offer.zip", "clean_files.bat"],
        "timestamp": 505125,
        "status": "Not set"
    },
    {
        "text": "this is the breaking update i mentioned",
        "sender": "VeePeeWee",
        "recipient": "ChiefOfStuff",
        "attachments": ["news_flash.exe", "signature.txt"],
        "timestamp": 505772,
        "status": "Not set"
    },
    {
        "text": "please use this installer before logging in again",
        "sender": "Micr0-Mngr",
        "recipient": "rubiksCubicle",
        "attachments": ["login_tools.msi", "tutorial.py"],
        "timestamp": 506193,
        "status": "Not set"
    },
    {
        "text": "new design app build for you to review",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["brand_designer_preview.dmg", "instructions.txt", "backup.zip", "benefits.docx"],
        "timestamp": 506362,
        "status": "Not set"
    },
    {
        "text": "run this cleanup script when you get a second",
        "sender": "ExecEnvy",
        "recipient": "VeePeeWee",
        "attachments": ["clean_files.bat", "update.xlsx"],
        "timestamp": 506955,
        "status": "Not set"
    },
    {
        "text": "here's the tool we talked about, mac version",
        "sender": "rubiksCubicle",
        "recipient": "MicrO-Mngr",
        "attachments": ["team_dashboard_installer.dmg"],
        "timestamp": 507830,
        "status": "Not set"
    }
    ]
for msg in reversed(message_log): # The reversed() function makes the loop run through the messages from newest to oldest. 
    timestamp = msg ["timestamp"]
    attachments = msg["attachments"]
    print (f"⏲️ {timestamp}")
    print(f"📎{len(attachments)}") # For each message, the program prints the timestamp and the number of attachments using len(attachments).
print() # SPACE

# New malware was released at timestamp 505100. Don't report any messages that were sent before this time.

message_log = [
    {
        "text": "notes from today's meeting are attached",
        "sender": "Intern4eva",
        "recipient": "WFHomie",
        "attachments": ["meeting_notes.pdf", "action_items.docx"],
        "timestamp": 504819,
        "status": "Not set"
    },
    {
        "text": "hey, can you try installing this on your mac?",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attachments": ["quick_sync.dmg", "forecast.md", "install.dmg"],
        "timestamp": 504982,
        "status": "Not set"
    },
    {
        "text": "thought you might want these files asap",
        "sender": "ScroogeMakeDeck",
        "recipient": "Intern4eva",
        "attachments": ["team_mtg_docx", "free_offer.zip", "clean_files.bat"],
        "timestamp": 505125,
        "status": "Not set"
    },
    {
        "text": "this is the breaking update i mentioned",
        "sender": "VeePeeWee",
        "recipient": "ChiefOfStuff",
        "attachments": ["news_flash.exe", "signature.txt"],
        "timestamp": 505772,
        "status": "Not set"
    },
    {
        "text": "please use this installer before logging in again",
        "sender": "Micr0-Mngr",
        "recipient": "rubiksCubicle",
        "attachments": ["login_tools.msi", "tutorial.py"],
        "timestamp": 506193,
        "status": "Not set"
    },
    {
        "text": "new design app build for you to review",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["brand_designer_preview.dmg", "instructions.txt", "backup.zip", "benefits.docx"],
        "timestamp": 506362,
        "status": "Not set"
    },
    {
        "text": "run this cleanup script when you get a second",
        "sender": "ExecEnvy",
        "recipient": "VeePeeWee",
        "attachments": ["clean_files.bat", "update.xlsx"],
        "timestamp": 506955,
        "status": "Not set"
    },
    {
        "text": "here's the tool we talked about, mac version",
        "sender": "rubiksCubicle",
        "recipient": "MicrO-Mngr",
        "attachments": ["team_dashboard_installer.dmg"],
        "timestamp": 507830,
        "status": "Not set"
    }
    ]
for msg in reversed(message_log): 
    timestamp = msg ["timestamp"]
    attachments = msg["attachments"]
    if timestamp < 505100:
        break # When the timestamp is less than 505100, the program executes break, which exits the loop. 
    # This prevents reporting messages sent before the malware was released.
    print(f"⏲️ {timestamp}")
    print(f"📎 {len(attachments)}")
print("End of at-risk messages")
print() # SPACE

# The block list hold known malware filenames. Report if any are attached to messages sent after the release time.



message_log = [
    {
        "text": "notes from today's meeting are attached",
        "sender": "Intern4eva",
        "recipient": "WFHomie",
        "attachments": ["meeting_notes.pdf", "action_items.docx"],
        "timestamp": 504819,
        "status": "Not set"
    },
    {
        "text": "hey, can you try installing this on your mac?",
        "sender": "WFHomie",
        "recipient": "ExecEnvy",
        "attachments": ["quick_sync.dmg", "forecast.md", "install.dmg"],
        "timestamp": 504982,
        "status": "Not set"
    },
    {
        "text": "thought you might want these files asap",
        "sender": "ScroogeMakeDeck",
        "recipient": "Intern4eva",
        "attachments": ["team_mtg_docx", "free_offer.zip", "clean_files.bat"],
        "timestamp": 505125,
        "status": "Not set"
    },
    {
        "text": "this is the breaking update i mentioned",
        "sender": "VeePeeWee",
        "recipient": "ChiefOfStuff",
        "attachments": ["news_flash.exe", "signature.txt"],
        "timestamp": 505772,
        "status": "Not set"
    },
    {
        "text": "please use this installer before logging in again",
        "sender": "Micr0-Mngr",
        "recipient": "rubiksCubicle",
        "attachments": ["login_tools.msi", "tutorial.py"],
        "timestamp": 506193,
        "status": "Not set"
    },
    {
        "text": "new design app build for you to review",
        "sender": "ChiefOfStuff",
        "recipient": "ScroogeMakeDeck",
        "attachments": ["brand_designer_preview.dmg", "instructions.txt", "backup.zip", "benefits.docx"],
        "timestamp": 506362,
        "status": "Not set"
    },
    {
        "text": "run this cleanup script when you get a second",
        "sender": "ExecEnvy",
        "recipient": "VeePeeWee",
        "attachments": ["clean_files.bat", "update.xlsx"],
        "timestamp": 506955,
        "status": "Not set"
    },
    {
        "text": "here's the tool we talked about, mac version",
        "sender": "rubiksCubicle",
        "recipient": "MicrO-Mngr",
        "attachments": ["team_dashboard_installer.dmg"],
        "timestamp": 507830,
        "status": "Not set"
    }
    ]
block_list = ["free_offer.zip", "news_flash.exe", "login_tools.msi", "clean_files.bat"]
for msg in reversed(message_log):
    # extract data...
    timestamp = msg["timestamp"]
    attachments = msg["attachments"]
    if timestamp < 505100:
        break
    print("🔎 Checking attachments")
    for filename in block_list: # The inner loop iterates through each filename in attachments.
        if filename in attachments: # checks if each filename is in block_list
            print(f"⚠️ {filename} found") # When a match is found, the program reports it.
print ("End of at-risk messages")

# Check each message's attachments: if any is in the block list, block the message and stop checking it. Otherwise, mark it " OK". Report each message's final status.