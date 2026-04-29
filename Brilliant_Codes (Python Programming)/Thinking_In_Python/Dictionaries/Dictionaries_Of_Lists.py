"Let's use our scoring system to classify senders by the spam scores of messages they've sent."

# Start by building a list of folders. Messages with spam scores over 10 go to Spam, an the rest go to Inbox.

username = "Intern4eva"
messages = [
    "URGENT: Verify your password to unlock payroll. Click the link now.",
    "Reminder: team lunch moved to Thursday. Free pizza!",
    "Thanks for the quick review on the deck.",
    "URGENT security notice: reset your password at www.lockdin-security.com immediately.",
    "Action required: confirm credentials and verify your account at www.lockdin-benefits.com",
    "FYI: agenda for all-hands is posted.",
    "Limited-time offer: clcik to redeem free corporate perks. Hurry!",
    "URGENT; verify your password and account details at www.lockdin-benefits.com immediately.",
    "I've got an urgent scheduling asl: can we move the roadmap sync?",
    "Final warning: your account will be locked. Verify credentials now at www.lockdin.com.",    
    ]
senders = [
    "vpOfVibes",
    "VeePeeWee",
    "vpOfVibes",
    "ExecEnvy",
    "EmilyVP",
    "MagnumKPI",
    "EmilyVP",
    "vpOfVibes",
    "MicrO-Mngr",
    "vpOfVibes"
    ]
spam_scores = [
    13, 2, 0, 12, 13, 0, 12, 16, 4, 13
]
folders = [] # initializes an empty folders list.
for i in range (len(messages)):
    message = messages[i]
    sender = senders[i]
    spam_score = spam_scores[i] #  looks up the spam score for each message.
    if spam_score > 10: # checks if the score exceeds 10 and assigns a folder accordingly
        folder = "⚠️  Spam"
    else:
        folder = "✉️  Inbox"
    folders.append(folder) # appends the folder for the ith message to the list.
    print(f"[{folder}] {message}")
print(folders)
print() # SPACE

# Build a dictionary that groups messages by folder. Tie each folder name to a list of the messages in it.

folders = []
for i in range (len(messages)):
    message = messages[i]
    spam_score = spam_scores[i] #
    if spam_score > 10:
        folder = "⚠️  Spam"
    else:
        folder = "✉️  Inbox"
    folders.append(folder)
folder_messages = {} # creates an empty dictionary. 
for i in range (len(messages)):
    message = messages[i]
    folder = folders[i] # gets the folder for each message.
    if folder not in folder_messages: # checks if the folder is not yet a key in the dictionary.
        folder_messages[folder] = [] # adds that folder to the dictionary with an empty list value. 
    folder_messages[folder].append(message) # appends the message to the folder's list.
    print(f"{folder} message")
print("---Folders---")
for fldr, msgs in folder_messages.items():
    print(f"{fldr}: {len(msgs)}")

"A dictionary's values can be lists."

# Build a dictionary that groups messages by sender.

folders = [] 
for i in range (len(messages)):
    message = messages[i]
    sender = senders[i]
    spam_score = spam_scores[i] 
    if spam_score > 10: # checks if the score exceeds 10 and assigns a folder accordingly
        folder = "⚠️  Spam"
    else:
        folder = "✉️  Inbox"
    folders.append(folder)
sender_messages = {} # creates an empty dictionary. 
for i in range(len(messages)):
    message = message[i]
    sender = senders[i] # gets the sender for each message.
    if sender not in sender_messages: # checks if the sender is not yet a key in sender_messages.
        sender_messages[sender] = [] #  adds that sender to the dictionary with an empty list value.
    sender_messages[sender].append(message) #  appends the message to the sender's list.
    print(f"Message from{sender}")
print("---Senders---")
for sndr, msgs in sender_messages.items():
    print(f"{sndr}: {len(msgs)}")
print() # SPACE

# Build a dictionary that groups spam scores by sender.

folders = [] 
for i in range (len(messages)):
    message = messages[i]
    sender = senders[i]
    spam_score = spam_scores[i] 
    if spam_score > 10: # checks if the score exceeds 10 and assigns a folder accordingly
        folder = "⚠️  Spam"
    else:
        folder = "✉️  Inbox"
    folders.append(folder)
sender_scores = {} # creates an empty dictionary. 
for i in range(len(messages)):
    sender = senders[i]
    spam_score = spam_scores[i]
    if sender not in sender_scores:
        sender_scores[sender] = []
    sender_scores[sender].append(spam_score)
    print(f"{sender} scores updated")
print("---Sender scores---")
for sender, scores in sender_scores.items():
    print(f"{sender} risk: {scores}")
print() # Space

# Python's sum function adds all the values in a list.

# Build a dictionary that gorups senders by the sum of their spam scores:
# low (0- 10), medium (11- 30), high (31+)
folders = [] 
for i in range (len(messages)):
    message = messages[i]
    sender = senders[i]
    spam_score = spam_scores[i] 
    if spam_score > 10: # checks if the score exceeds 10 and assigns a folder accordingly
        folder = "⚠️  Spam"
    else:
        folder = "✉️  Inbox"
    folders.append(folder)
sender_scores = {} 
for i in range(len(messages)):
    sender = senders[i]
    folder = folders[i]
    spam_scores = spam_scores[i]
    if sender not in sender_scores:
        sender_scores[sender] = []
    sender_scores[sender].append(spam_score)
risk_senders = {} # creates an empty dictionary.
for sender, scores in sender_scores.item(): # loops through the sender, scores pairs in the sender_scores dictionary.
    risk = sum(scores) # calculates the total spam score of the sender using sum(scores).
    if risk > 30:
        risk_level = "high"
    elif risk > 10:
        risk_level = "medium"
    else:
        risk_level = "low"
    # classifys senders into risk levels using a conditional chain.
    print(f"{sender} risk: {risk_level}")
    if risk_level not in risk_senders: # checks if the risk level is not yet a key.
        risk_senders[risk_level] = []
    risk_senders[risk_level].append(sender)
print("---Risk levels---")
for risk_level, senders in risk_senders.items():
    print(f"{risk_level}: {senders}")
print() # Space

"Dictionaries of lists turn cluttered data into organized buckets."


