"Let's explore a larger data set to investigate spam activity."

# Print the number of messages in the message_log list, and also the last message.

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
num_messages = len(message_log) # uses len(message_log) to count the total number of messages, which is 3
print(f"Found {num_messages} message")
print("Last message:")
print(message_log[-1]) # uses message_log[-1] to access the last message in the list.

# Print the sender and folder of the last 5 messages.

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
for message in message_log[-5:]: # Using message_log[-5:] gets the messages with indexes -5, -4, -3, -2, and -1, which are the last five dictionaries in the list.
    sender = message["sender"]
    folder = message["folder"]
    # extract the sender and folder from each message dictionary.
    print(f"{folder} from {sender}") # this prints them.
print() # SPACE

# Count the total number of spam messages in the data set, and print the timestamp of each. 

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
spam_count = 0 # initializes spam_count to 0
for message in message_log:
    folder = message["folder"]
    timestamp = message["timestamp"] # extracts the timestamp. 
    if folder == "⚠️ Spam": # checks if the folder is spam.
        spam_count += 1 # When true, this line increments the counter 
        print(f"Spam at {timestamp}") # prints the timestamp.
    print(f"Found {spam_count} spam messages") # prints the total count.
print() # SPACE

"When a dataset is organized as a list of dictionaries, it's simple to scan through it."

# Make a list of all the senders who have sent spam.

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
spam_count = 0
spammers = []
for message in message_log:
    folder = message ["folder"]
    timestamp = message ["timestamp"]
    sender = message ["sender"]
    if folder == "⚠️ Spam":
        spam_count += 1
        print(f"Spam at {timestamp} from {sender}")
        if sender not in spammers:
            spammers.append(sender)
    print(f"Found {spam_count} spam messages")
    print(F"Found {len(spammers)} spammers")
print() # SPACE

# Keep track of the total number of spam messages sent by each spammer 

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
spammer_counts = {} # creates an empty dictionary.
for message in message_log:
    folder = message["folder"]
    timestamp = message["timestamp"]
    sender = message["sender"]
    if folder == "⚠️ Spam":
        print(f"Spam from {sender}")
        if sender not in spammer_counts: # checks if the sender isn't in the dictionary.
            spammer_counts[sender] = 0 # initializes their count to 0. 
        spammer_counts[sender] += 1 # increments the count for each spammer. 
    print("⚠️ Spammers ⚠️")
    for spammer, count in spammer_counts.items(): # loop through the dictionary items
        print(f"{spammer} sent {count} spam") # prints each spammer's total.
print() # SPACE

"Since they make data easy to explore, lists of dictionaries are commonly used to store data sets."
