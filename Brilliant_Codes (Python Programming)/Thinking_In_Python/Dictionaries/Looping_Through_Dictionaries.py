"Let's use a loop to calculate the spam risk of a message."

# Start by printing the spam risk of "urgent".

spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}

word = "urgent" # Sets word to "urgent".
risk = spam_risks[word] #  accesses the dictionary using spam_risks[word] to get the risk value 4.
print(f"{word} -> {risk}") #  prints the word and its risk.
print() # SPACE

# Print the risk of each word in the dictionary.

spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}
for word in spam_risks: # loops through each key in the spam_risks dictionary
    risk = spam_risks[word] # uses the value of word as a dictionary key, and stores the value in risk.
    print(f"{word} -> {risk}") # prints each word with its risk value.
print() # SPACE

" A for loop can go through all the keys of a dictionary."

# Print whether each word in the dictionary is present in the lowercase text of the message.

spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}
username = "chief0fStuff"
sender = "vp0fVibes"
message = "URGENT! Verify your credentials to unlock your benefits at www.lockdin-benefits.com"
text = message.lower() # converts the message to lowercase for case-insensitive matching.

for word in spam_risks: # loops through each word in the dictionary.
    present = word in text # checks if the word appears in the lowercase text,
    print(F"'{word}' in message? {present}") # prints the result
print() # SPACE

# Calculate the total spam risk of the message. If a spam word is in the lowercase text of the message,
# add its risk to the message risk.

spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}
username = "chief0fStuff"
sender = "vp0fVibes"
message = "URGENT! Verify your credentials to unlock your benefits at www.lockdin-benefits.com"
text = message.lower()

msg_risk = 0 # initializes msg_risk to 0.
for word in spam_risks:
    if word in text:
        msg_risk += spam_risks[word] # adds that word's risk to the total.
        print(f"Found {word}!") # loops through the dictionary, checking if each word is in the message text.
    print(f"'{word}' -> ⚠️ Spam risk:{msg_risk}")
    # The final risk is 16 ("urgent": 4 + "www": 5 + "verify": 3 + "credentials": 4).
print() # SPACE

# Here's a protip: Python lets you loop through every key, value pair in a dictionary with the items method.
# Use it to calculate the total spam risk of the message.

spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}
username = "chief0fStuff"
sender = "vp0fVibes"
message = "URGENT! Verify your credentials to unlock your benefits at www.lockdin-benefits.com"
text = message.lower()

msg_risk = 0
for word, risk in spam_risks.items(): # uses .items() to loop through key-value pairs.
    #  The unpacking word, risk gives direct access to both the key and value.
    if word in text: # checks if the word is in the text
        msg_risk += risk # adds the risk directly without needing to look it up again.
        print(f"Found{word}!")
    print(f"{word}' -> ⚠️ Spam risk:{msg_risk}")

"Looping through dictionaries is crucial for processing stored data."