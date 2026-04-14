"Let's start builfing a feature to protect users from harmful message attachments."

# Warn the user if any .zip files are attached to the message.

recipient = "entrepreNerd"
message_text = "attached are several files for your review."
attachments = ["Scanned_Contract.scr", "Q4_Budget_Spreadsheet.exe", "Urgent_Document.zip",
               "Security_Patch.bat", "wide.screen.txt", "Meeting_Agenda_Notes.docx", "vx1999bambam.exe"]
for filename in attachments:
    print(f"Attachment: {filename}")
    if ".zip" in filename:
        print(f"⚠️  Caution: {filename}")
print() # SPACE

# Warn the user if any files with risky extensiosn are found in the attachment list. 

recipient = "entrepreNerd"
message_text = "attached are several files for your review."
attachments = ["Scanned_Contract.scr", "Q4_Budget_Spreadsheet.exe", "Urgent_Document.zip",
               "Security_Patch.bat", "wide.screen.txt", "Meeting_Agenda_Notes.docx", "vx1999bambam.exe"]
risky_extensions = [".zip", ".exe", ".cmd", ".msi", ".bat", ".scr", ".iso", ".dmg"]
for filename in attachments: # The outer loop iterates through each filename in the attachments list. 
    print(f"Attachment: {filename}")
    for ext in risky_extensions: # The inner loop goes through each extension in risky_extensions.
        print(f"Checking for: {ext}")
        if ext in filename: # For each filename, the program checks every extension to see if any match.
            print(f"⚠️ Caution: {filename}")
print() # SPACE

"A loop can have a loop inside it. The inner loop runs to completion inside each outer loop iteration."

# Let the user know how many attachments there are, and how many are risky.

recipient = "entrepreNerd"
message_text = "attached are several files for your review."
attachments = ["Scanned_Contract.scr", "Q4_Budget_Spreadsheet.exe", "Urgent_Document.zip",
               "Security_Patch.bat", "wide.screen.txt", "Meeting_Agenda_Notes.docx", "vx1999bambam.exe"]
risky_extensions = [".zip", ".exe", ".cmd", ".msi", ".bat", ".scr", ".iso", ".dmg"]
num_checked = 0
num_warnings = 0
# The program initializes counters at 0.
for filename in attachments:
    print(f"Attachment: {filename}")
    num_checked += 1 # Each iteration of the outer loop increments num_checked by 1
    for ext in risky_extensions:
        if ext in filename:
            print(f"⚠️ Caution: {filename}")
            num_warnings += 1 # When a risky extension is found, the inner loop increments num_warnings by 1.
    print(f"Checked {num_checked} attachments")
    print(f"Warnings: {num_warnings}")
print() # SPACE

# PROTIP: The endswith method can check only the end of a string for a match.
# Update the program so attachments like wide.screen.txt don't get flagged as risky. 

recipient = "entrepreNerd"
message_text = "attached are several files for your review."
attachments = ["Scanned_Contract.scr", "Q4_Budget_Spreadsheet.exe", "Urgent_Document.zip",
               "Security_Patch.bat", "wide.screen.txt", "Meeting_Agenda_Notes.docx", "vx1999bambam.exe"]
risky_extensions = [".zip", ".exe", ".cmd", ".msi", ".bat", ".scr", ".iso", ".dmg"]
num_checked = 0
num_warnings = 0
for filename in attachments:
    print(f"Attachment: {filename}")
    num_checked += 1
    for ext in risky_extensions:
        if filename.endswith(ext):
            print(f"⚠️ Caution: {filename}")
            num_warnings += 1
    print(F"Checked {num_checked} attachments")
    print(f"Warnings: {num_warnings}")
print() # SPACE

# Let the user know how many unique risky extensions were found. For example, the list ["notes.zip", "work.exe", "pics.zip"] has 2 unique extensions

recipient = "entrepreNerd"
message_text = "attached are several files for your review."
attachments = ["Scanned_Contract.scr", "Q4_Budget_Spreadsheet.exe", "Urgent_Document.zip",
               "Security_Patch.bat", "wide.screen.txt", "Meeting_Agenda_Notes.docx", "vx1999bambam.exe"]
risky_extensions = [".zip", ".exe", ".cmd", ".msi", ".bat", ".scr", ".iso", ".dmg"]
num_risky = 0
for ext in risky_extensions: # By switching the loop order, the outer loop now iterates through extensions instead of filenames. 
    ext_found = False # For each extension, ext_found tracks whether any attachment has that extension.
    print(f"Checking for: {ext}")
    for filename in attachments:
        if filename in attachments:
            print(f"⚠️ {filename}")
            ext_found = True
        if ext_found:
            num_risky += 1 # After checking all attachments for an extension, num_risky increments only if that extension was found. 
    print(f"Found {num_risky} risky extensions")
print() # SPACE

"When a repeated task has its own mini-task to repeat, nesting loops is a common pattern."