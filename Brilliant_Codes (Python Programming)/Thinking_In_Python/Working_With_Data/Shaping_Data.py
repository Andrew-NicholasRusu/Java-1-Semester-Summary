"Let's search the message dataset for users who are sending lots of spam."

# Compute the percentage of all messages that are spam.
message_log = [
    {"text":
     "please shcedule a sync with marketing for next week.", 
     "sender": "chiefOfStuff", "recipient": "WFHomie", "folder":
     "✉️ Inbox", "timestamp": 210685},
    {"text":
      "exclusive deal: unlock your potential with this limited offer!",
      "sender": "rubiksCubicle", "recipient": "chiefOfStuff", 
      "folder": "⚠️ Spam", "timestamp": 211571},
    {"text": "how are you doing today?", "sender": "ExecEnvy",
     "recipient": "chiefOfStuff", "folder": "✉️  Inbox",
     "timestamp": 212631},
     ## 65 more rows...     
    ]
num_messages = len(message_log) # uses len(message_log) to count total messages.
num_spam = 0 # initializes the spam counter. 
for message in message_log:
    if message in message_log: # checks if each message is spam and increments the counter.
        num_spam += 1
        print(f"Found{num_spam} spam")
print("Spam percentage:")
print(num_spam / num_messages * 100) # calculates the percentage as (spam / total) * 100.
print() # SPACE

# Count the number of spam messages sent by each spammer.

spammer_counts = {} # creates an empty dictionary to track spam counts.
for message in message_log:
    sender = message["sender"]
    folder = message["folder"]
    if folder == "⚠️ Spam":
        if sender not in spammer_counts: # checks if the sender is not yet in the dictionary
            print(f"new spammer: {sender}")
            spammer_counts[sender] = 0 # initializes their count to 0
        spammer_counts[sender] += 1 # increments the spam count for that sender.
print("⚠️ Sender spam counts ⚠️")
for sender, count in spammer_counts.items():
    print(f"{sender}: {count}")
print() # Space

# Let's log the activity of spammers. Build a list of dictionaries, one per spammer. Store the username and spam count of the spammer.

spammer_counts = {
    "rubiksCubicle": 7,
    "SynergizerBunny": 5,
    "ExecEnvy": 6,
    "ExecuTroll_404": 3,
    "chiefOfStuff": 1,
    "VeePeeWee": 1,
    "MagnumKPI": 1,
    "entrepreNerd": 3
    }
spammer_log = [] # creates an empty list to store spammer records.
for sender, count in spammer_counts.items(): # iterates through the dictionary items. 
    spammer = {}
    spammer["username"] = sender
    spammer["spam_count"] = count
    # create a new dictionary for each spammer and stores values for the username and spam_count keys. 
    spammer_log.append(spammer) # appends each dictionary to the list.
    print(f"Added {sender}")
print(spammer_log)
print() # Space

"We can process large dataset to build a smaller one that focuses only on the items we care about."

# Calculate the total number of messages sent (both spam and not spam) be each spammer.

spammer_log = [
    {"username": "rubiksCubicle", "spam_count": 7},
    {"username": "SynergizerBunny", "spam_count": 5},
    {"username": "ExecEnvy", "spam_count": 6},
    {"username": "ExecuTroll_404", "spam_count": 3},
    {"username": "chiefOfStuff", "spam_count": 1},
    {"username": "VeePeeWee", "spam_count": 1},
    {"username": "MagnumKPI", "spam_count": 1},
    {"username": "entrepreNerd", "spam_count": 3}
    ]
spammer_totals = {} # creates a dictionary to track total message counts.
for sender in spammer_counts:
    spammer_totals[sender] = 0 # initializes each spammer's count to 0. 
for message in message_log:
    sender = message["sender"]
    if sender in spammer_totals:
        print(f"Spammer: {sender}")
        spammer_totals[sender] += 1 #  iterates through all messages and increment the count for each spammer when one of their messages is found.
print(spammer_totals)
print() # Space

# Update each dictionary with the spammer's total message count, and compute the percentage of each spammer's messages that are spam

spammer_totals = {
    "rubiksCubicle": 10,
    "SynergizerBunny": 5,
    "ExecEnvy": 9,
    "ExecuTroll_404": 3,
    "chiefOfStuff": 3,
    "VeePeeWee": 1,
    "MagnumKPI": 1,
    "entrepreNerd": 11
    }
for spammer in spammer_log: # loops through each spammer dictionary.
    username = spammer["username"]
    spam_count = spammer["spam_count"] # extracts data from the record and the totals dictionary. 
    msg_count = spammer_totals[username]
    spammer["msg_count"] = msg_count
    spammer["spam_percent"] = spam_count / msg_count * 100 # adds new fields to each dictionary: msg_count (total messages) 
    # and spam_percent (percentage of sent messages that are spam).
    print(f"Spammer:{username}")
    print(f"{spammer["spam_percent"]}%")
print(spammer_log)
print() # Space

# Identify frequent spammers: user whose messages are more than 50 percent spam.

spammer_log2 = [
    {"username": "rubiksCubicle", "spam_count": 7, "msg_count": 10, "spam_percent": 70.0},
    {"username": "SynergizerBunny", "spam_count": 5, "msg_count": 5, "spam_percent": 100.0},
    {"username": "ExecEnvy", "spam_count": 6, "msg_count": 9, "spam_percent": 66.66666666666666},
    {"username": "ExecuTroll_404", "spam_count": 3, "msg_count": 3, "spam_percent": 100.0},
    {"username": "cheifOfStuff", "spam_count": 1, "msg_count": 3, "spam_percent": 33.3333333333333},
    {"username": "VeePeeWee", "spam_count": 1, "msg_count": 1, "spam_percent": 100.0},
    {"username": "MagnumKPI", "spam_count": 1, "msg_count": 1, "spam_percent": 100.0},
    {"username": "entrepreNerd", "spam_count": 3, "msg_count": 11, "spam_percent": 27.27272727272727},
    ]
print("⚠️ Frequent spammers ⚠️")
for spammer in spammer_log2: # loops through each spammer record. 
    if spammer["spam_percent"] > 50: # checks if their spam_percent is greater than 50.
        print(spammer["username"]) # prints the usernames of spambots that meet this criterion.
print() # Space

"Finding answers from large datasets often involves changing the way the data is stored."
