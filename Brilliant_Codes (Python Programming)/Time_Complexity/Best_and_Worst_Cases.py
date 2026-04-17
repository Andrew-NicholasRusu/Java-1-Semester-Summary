"Let's explore how runtime depends on the contents of the message log."

# Find the timestamp of the first message sent after 700000, or report if none is found.

msg_log = [
    {
        "text": "can you send me a quick update before close of day",
        "sender": "WFHomie",
        "recipient": "ChiefOfStuff",
        "attachments": [],
        "timestamp": 598267,
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
        "text": "run these for me and tell me what you see",
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
        "text": "i'm sneding the setup just in case",
        "sender": "PusherOfPaper",
        "recipient": "rubiksCubicle",
        "attachments": ["printer_setup.msi"],
        "timestamp": 623710,
        "status": "Not set"
    },
    {
        "text": "found this pack online, might help with your project", 
        "sender": "rubiksCubicle",
        "recipient": "ExecEnvy",
        "attachments": ["coupon.zip", "readme.txt", "avater.png"],
        "timestamp": 635451,
        "status": "Not set"
    },
    {
        "text": "here's the backup and the intsructions i mentioned",
        "sender": "MicrO-Mngr",
        "recipient": "PusherOfPaper",
        "attachments": ["instructions.pdf", "backup.zip"],
        "timestamp": 645363,
        "status": "Not set"
    },
    {
        "text": "here's the backup and the instrucions i mentioned",
        "sender": "MicrO-Mngr",
        "recipient": "ChiefOfStuff",
        "attachments": ["instructions.pdf", "backup.zip"],
        "timestamp": 645363,
        "status": "Not set"
    },
    {
        "text": "attached are a few things for you to review",
        "sender": "VeePeeWee",
        "recipient": "Intern4eva",
        "attachment": ["notes.pdf", "agenda.docx", "funnycat.jpg"],
        "timestamp": 652343,
        "status": "Not set"
    }
    ]
comparisons = 0
found = False
for msg in msg_log:
    timestamp = msg["timestamp"]
    # make a comparison:
    comparisons += 1
    print(f"Comparisons: {comparisons}")
    if timestamp > 700000: # The loop checks each message's timestamp.
        found = True 
        first_time = timestamp # When it finds one greater than 700000, it sets found = True, saves the value to first_time, and uses break to exit immediately. 
        break
    if found:
        print(f"First time: {first_time}")
    else:
        print("Not found")
print() # SPACE

# A best-case scenario is when the runtime is as small as possible.
# What's best-case scenario for this program?

Found = False
for msg in msg_log:
   timestamp = msg["timestamp"]
   if timestamp > 700000:
    found = True
    first_time = timestamp
    break
    
# Answer: The first timestamp in msg_log is greater than 700000.

# What's a worst-case scenario for the previous program?
# Answer: None of the timestamps in msg_log are greater than 700000.

"For programs whose untime depends on the size of the data structure, there are best and worst cases"

Found = False
for msg in msg_log:
   timestamp = msg["timestamp"]
   if timestamp > 700000:
    found = True
    first_time = timestamp
    break
# The worst-case runtime of this program happens when it has to check the timestamp of every message in the log.

"When analyzing algorithms, we typically focus on worst-case scenarios because we have no guarantees about the data."

# What's a worst-case scenario for this program?

for i in range (len(msg_log)):
   for j in range(len(msg_log)):
      msg1 = msg_log[i]
      msg2 = msg_log[j]
      text1 = msg1["text"]
      text2 = msg2["text"]
      if i < j and text1 == text2:
        print(f"Duplicated: {text1}")
        break
# Answer: None of the message texts are the same