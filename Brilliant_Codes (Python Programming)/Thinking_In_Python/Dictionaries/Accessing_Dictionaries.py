"Let's calculate the spam risk of different messages."

# Print the spam risk of an urgent message.

message = "urgent: Deadline approaching soon!"
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
risk = spam_risks["urgent"] # accesses the dictionary using the key "urgent" to get the risk value 4.
# The message contains the word "urgent", so that's the spam risk to look up.
print(f"Message: {message}")
print(f"Risk: {risk}")
print() # SPACE

# Calculate the spam risk of an urgent offer. 

message = "urgent: Deadline approaching soon!"
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
risk = spam_risks["urgent"] + spam_risks["offer"] # adds the risks for "urgent" (4) and "offer" (3) to get a total risk of 7.
print(f"Message: {message}") # The message contains both words, so both risks should be included.
print(f"Risk: {risk}")
print() # SPACE

# Calculate the spam risk of an urgent offer with a link.
message = "Urgent: Claim your offer at www.lockedin-benefits.com"
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
risk = spam_risks["urgent"] + spam_risks["offer"] + spam_risks["www"] # adds the risks for all three words in the message: 
# "urgent" (4), "offer" (3), and "www" (5), for a total risk of 12.
print(f"Message: {message}")
print(f"Risk: {risk}")
print() # SPACE

"The [] operator accesses the value of a key in a dictionary."

# You can check if an item is in a directory with the in operator.
# Check if the dictionary specifies a risk for the word "limited", and
# print an appropriate message.

message = "Limited time only: Enter your credentials to claim your prize."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
word = "limited" # sets word to "limited".
print(f"Message: {message}")
if word in spam_risks: # checks if word in spam_risks, which is False since "limited" isn't a key. 
    print(f"Risk: {spam_risks[word]}")
else:
    print(f"'{word}'not in dictionary") # printing that "limited" is not in the dictionary.
print() # SPACE

# Here's a protip. the get method falls back to a default value if the key isn't the dictionary.
# Use it to calculate the risk of a message with the words "urgent" and "account", defaulting to 0 if a word is missing.

message = "Urgent: Unlock your account before it's too late."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 4
    }
risk = spam_risks["urgent"] + spam_risks.get("account", 0) # uses .get() to safely access the dictionary.
# spam_risks.get("urgent", 0) returns 4 since "urgent" is in the dictionary. 
# spam_risks.get("account", 0) returns 0 (the default) since "account" is not in the dictionary.
print(f"Message: {message}")
print(f"Risk: {risk}")
print() # SPACE

# Calculate the risk of a message with the words "urgent", "redeem", "this", "offer" and "today", defaulting to 0 if a word isn't the dictionary.

message = "URGENT: Redeem this offer today!!!"
spam_risk = {
    "urgent": 4,
    "www": 5,
    "offer": 4  
    }
msg_words = ["urgent", "redeem", "this", "offer", "today"] # creates a list of words to check.
risk = 0  # initializes risk to 0.
for word in msg_words: # loop through each word, adding its risk to the total using 
    rish += spam_risks.get(word, 0) # .get(word, 0), which defaults to 0 if the word isn't in the dictionary.
print(f"Message: {message}")
print(f"Risk: {risk}") # The total risk is 4 + 0 + 0 + 3 + 0 = 7.
print() # SPACE

"Accessing dictionary values with safe defaults ensures reliable access to stored data."
