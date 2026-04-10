"Let's process multiple messages and flag potential security threats."

# If a message is urgent and has a link, flag it as phishing.

username = "ChiefLatteOfficer" 
message = "Urgent: redeem free-trial here: www.net-flicks.co"
text = message.lower() # converts the message to lowercase.
if "urgent" in text and "www" in text: # checks if both "urgent" and "www" are in the lowercase text, which is True
    # so the next line prints the phishing warning.
    print("⬇️  Phishing ⬇️")
print(f"[✉️  Inbox] {message}") # uses an f-string to print the message with its label.
print() # Space

# Print all the messages in the user's message list. 

username = "ChiefLatteOfficer"
messages = [
    "It's urgent that you visit www.changemypasswd007.com",
    "Lunch meeting: 1:30 in the conference room",
    "Reminder: office party on Friday",
    "Urgently required: log back in at www.lockdin.com",
    "Severe weather -- URGENT -- log in to www.thewetherchanel.com for details",
    "Remember to log your hours before the end of the week."
]
print(f"You have {len(messages)} messages") # uses an f-string with {len(messages)} to print the total number of messages.
for msg in messages: # loops through each message using for msg in messages.
    print(f"[✉️  Inbox] {msg}") # prints each message using an f-string with {msg}.
print() # Space

# If a message is urgent and has a link, warn the user of phishing.
username = "ChiefLatteOfficer"
messages = [
    "It's urgent that you visit www.changemypasswd007.com",
    "Lunch meeting: 1:30 in the conference room",
    "Reminder: office party on Friday",
    "Urgently required: log back in at www.lockdin.com",
    "Severe weather -- URGENT -- log in to www.thewetherchanel.com for details",
    "Remember to log your hours before the end of the week."
]
print(f"You have {len(messages)} messages") 
for msg in messages:
    text = msg.lower()
    if "urgent" in text and "www" in text:
        print("⬇️  Phishing ⬇️")
    print(f"[✉️  Inbox] {msg}")
print() # Space

# Let's attach a label to every message.
# If a message is urgent and has a link, label it as phishing. Otherwise, label it as inbox.

username = "ChiefLatteOfficer"
messages = [
    "It's urgent that you visit www.changemypasswd007.com",
    "Lunch meeting: 1:30 in the conference room",
    "Reminder: office party on Friday",
    "Urgently required: log back in at www.lockdin.com",
    "Severe weather -- URGENT -- log in to www.thewetherchanel.com for details",
    "Remember to log your hours before the end of the week."
]
for msg in messages:
    text = msg.lower()
    if "urgent" in text and "www" in text:
        label = " 🚨 Phishing"
    else:
        label = " ✉️  Inbox"
    print(f"[{label}]{msg}")
