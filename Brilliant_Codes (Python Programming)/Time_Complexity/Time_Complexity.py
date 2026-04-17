"Let's analyze how the runtimes of our programs change as the message log increases in size."

# Check if there were any messages sent on or after timestamp 628193.
# The message log is in order from earliest to latest.

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
last_msg = msg_log[-1] # Since the log is sorted by time, only the last message needs to be checked.
last_time = last_msg["timestamp"]
any_after = last_time >= 628193 # Using >= correctly identifies messages on or after the target timestamp.
print(any_after) # True
print() # SPACE
# The worst-case number of >= comparisons would be 1
# The comparison last_time >= 628193 runs exactly once, regardless of how many messages are in the log.

# Check if there's a message with the exact timestamp of 628193. Exit the loop if you find one.
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
for msg in msg_log:
    timestamp = msg["timestamp"]
    # Make a comparison:
    comparisons += 1
    print(f"Comparisons: {comparisons}")
    if timestamp == 628193: # The loop checks each timestamp with == and uses break to exit early when found.
        print(f"Found {timestamp}") # The message is printed before breaking.
        break
print() # SPACE

"The time complexity of a program describes how its worst-case runtime changes as the data grows"

# Report the timestamp of two messages that were sent at the same time. Exit the loop if you find one.

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
iterations = 0
found = False
for i in range (len(msg_log) - 1): # Protip: If a loop performs a fixed number of basic operations in each iteration,
# estimate its runtime by counting the number of iterations.
    # update iterations
    iterations += 1
    print(f"Iterations: {iterations}")
    j = i + 1 # Setting j = i + 1 compares each message with its neighbor.
    msg1 = msg_log[i]
    msg2 = msg_log[j]
    time1 = msg1["timestamp"]
    time2 = msg2["timestamp"]
    if time1 == time2:
        found = True
        same_time = time1
        break # When matching timestamps are found, the values are saved and break exits the loop early.
if found:
    print(f"Two messages sent at {same_time}")
print() # SPACE

# Check if there are two messages with the exact same text. Report every duplicated text.


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
iterations = 0
for i in range (len(msg_log)):
    for j in range (len(msg_log)):
# The nested loops check all pairs of messages by running through all ordered pairs $(i, j)$.
        # update iterations
        iterations += 1
        print(f"Iteration: {iterations}")
        msg1 = msg_log[i]
        msg2 = msg_log[j]
        text1 = msg1["text"]
        text2 = msg2["text"]
        if i < j and text1 == text2: # Using i < j ensures we only compare each pair once and don't compare a message with itself. 
            print(f"Duplicated: {text1}")
print() # SPACE

"Estimating time complexity is key to predicting how a program will perform on larger datasets."
