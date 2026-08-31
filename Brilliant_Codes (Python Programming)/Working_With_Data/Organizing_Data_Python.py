"Let's start organizing data to monitor all the messages sent in the app for spam activity."

# Use a dictionary to store the lowercase text of the message, along with its sender, recipeint, and folder.

recipient = "PeePawPwn"
message = "Please align with design before we push this change to production."
sender = "chiefOfStuff"
folder = "✉️  Inbox"

message_dict = { # creates a dictionary called message_dict.
    "text": message.lower(), "sender": sender, 
    "recipient": recipient, "folder": folder # sets the values, using message.lower() to convert the text to lowercase. 
    }
print(message_dict) #  prints the message_dict dictionary.
print() # SPACE

# Each message has a timestamp showing the number of seconds since the last system update
# Give this message a timestamp of 430929.

recipient = "PeePawPwn"
message = "Please align with design before we push this change to production."
sender = "chiefOfStuff"
folder = "✉️  Inbox"

message_dict = { # creates a dictionary called message_dict.
    "text": message.lower(), "sender": sender, 
    "recipient": recipient, "folder": folder
    }
message_dict ["timestamp"] = 430929 # The message_dict dictionary stores properties of a single message using the 
# keys text, sender, recipient, folder, and timestamp.
print(message_dict)

"A dictionary can store related data about one item. Each key: value pair stores one of its properties."

# Build a list of dictionaries. one for each message. Each dictionary should store the message's text and sender.

messages = [
    "Is there any further action required on this invoice?",
    "Action required: please confirm payment details.",
    "Special offer: boost your energy. Click here fro details",
    "Please share the updated draft before the end of the day.",
    "Urgent action required! Hurry, don't miss this free offer.",
    "The agenda draft looks find, jsut add one more topic."
    ]
senders = [
    "cheifOfStuff", "entrepreNerd", "rubiksCubicle", "MagnumKPI", "ExecEnvy"
    ]
recipients = [
    "middlingManager", "MagnumKPI", "rubiksCubicle", "entrepreNerd", "chiefOfStuff"
    ]
folders = [
    "✉️ Inbox", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox"
    ]
timestamps = [
    430929, 449891, 451220, 456188, 483838, 493564
    ]
message_log = [] # initializes an empty list message_log.
for i in range(len(messages)): # loops through the indexes of the messages.
    print("Building dictionary", i)
    message_dict = {} # creates an empty dictionary message_dict for each iteration.
    message_dict ["text"] = messages[i].lower() # populates the dictionary values using the corresponding lists.
    message_dict["sender"] = senders[i]
    message_log.append(message_dict) # appends each completed dictionary to message_log.
print(message_log)
print() # SPACE

# Add recipient, folder, and timestamp data to each message dictionary in the list.

messages = [
    "Is there any further action required on this invoice?",
    "Action required: please confirm payment details.",
    "Special offer: boost your energy. Click here fro details",
    "Please share the updated draft before the end of the day.",
    "Urgent action required! Hurry, don't miss this free offer.",
    "The agenda draft looks find, jsut add one more topic."
    ]
senders = [
    "cheifOfStuff", "entrepreNerd", "rubiksCubicle", "MagnumKPI", "ExecEnvy"
    ]
recipients = [
    "middlingManager", "MagnumKPI", "rubiksCubicle", "entrepreNerd", "chiefOfStuff"
    ]
folders = [
    "✉️ Inbox", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox"
    ]
timestamps = [
    430929, 449891, 451220, 456188, 483838, 493564
    ]
message_log = [] # initializes an empty list message_log.
for i in range (len(messages)): # loops through the indexes of the messages
    print("Building dictionary", i)
    message_dict = {} # creates an empty dictionary message_dict for each iteration. 
    message_dict["text"] = message[i].lower()
    message_dict["sender"] = senders[i]
    message_dict["recipient"] = recipient[i]
    message_dict["folder"] = folders[i]
    message_dict["timestamp"] = timestamps[i]
    # populates the dictionary values by indexing into the corresponding lists. 
    message_log.append(message_dict) # appends each completed dictionary to message_log
for message in message_log:
    print(message["timestamp"], message["folder"], message["sender"])
    # print a summary of all messages.
print() # SPACE

# Loop through the list of message dictionaries. For each spam message, print the sender and recipient. 

messages = [
    "Is there any further action required on this invoice?",
    "Action required: please confirm payment details.",
    "Special offer: boost your energy. Click here fro details",
    "Please share the updated draft before the end of the day.",
    "Urgent action required! Hurry, don't miss this free offer.",
    "The agenda draft looks find, jsut add one more topic."
    ]
senders = [
    "cheifOfStuff", "entrepreNerd", "rubiksCubicle", "MagnumKPI", "ExecEnvy"
    ]
recipients = [
    "middlingManager", "MagnumKPI", "rubiksCubicle", "entrepreNerd", "chiefOfStuff"
    ]
folders = [
    "✉️ Inbox", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox"
    ]
timestamps = [
    430929, 449891, 451220, 456188, 483838, 493564
    ]
message_log = []
for i in range (len(messages)):
    message_dict = {}
    message_dict["text"] = messages[i].lower()
    message_dict["sender"] = senders[i]
    message_dict["recipient"] = recipient[i]
    message_dict["folder"] = folders[i]
    message_dict["timestamp"] = timestamps[i]
    message_log.append(message_dict)
for message in message_log: # loops through each message dictionary in message_log
    sender = message["sender"]
    recipient = message["recipient"]
    folder = message["folder"]
    # extracts the sender, recipient, and folder values.
    if folder == "⚠️ Spam": # checks if the folder is spam.
        print(f"{sender} sent spam to {recipient}") # When True, this prints the sender and recipient information.
print() # SPACE

# Let's see if any spam messages are still slipping through the cracks. Print the sender and timestamp
# of all nessages that contain "action required" but didn't get flagges as spam.

messages = [
    "Is there any further action required on this invoice?",
    "Action required: please confirm payment details.",
    "Special offer: boost your energy. Click here fro details",
    "Please share the updated draft before the end of the day.",
    "Urgent action required! Hurry, don't miss this free offer.",
    "The agenda draft looks find, jsut add one more topic."
    ]
senders = [
    "cheifOfStuff", "entrepreNerd", "rubiksCubicle", "MagnumKPI", "ExecEnvy"
    ]
recipients = [
    "middlingManager", "MagnumKPI", "rubiksCubicle", "entrepreNerd", "chiefOfStuff"
    ]
folders = [
    "✉️ Inbox", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox", "⚠️ Spam", "✉️ Inbox"
    ]
timestamps = [
    430929, 449891, 451220, 456188, 483838, 493564
    ]
message_log = []
for i in range (len(messages)):
    message_dict = {}
    message_dict["text"] = messages[i].lower()
    message_dict["sender"] = senders[i]
    message_dict["recipient"] = recipient[i]
    message_dict["folder"] = folders[i]
    message_dict["timestamp"] = timestamps[i]
    message_log.append(message_dict)
    for message in message_log:
        folder = message["folder"]
        sender = message["sender"]
        timestamp = message["timestamp"]
        text = message["text"] 
        # extracts the timestamp and text values from the message dictionary. 
        if "action required" in text and folder != "⚠️ Spam": # checks two conditions: "action required" in text (substring search) and folder != "⚠️ Spam" (not spam).
            print(f"From {sender} at {timestamp}:")
            print(text)
print() # SPACE
  
    