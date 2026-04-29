"Some span words aren't in the dictionary yet."

# Calculate the spam risk of a message with the words "urgent" and "password", defaulting to 0 for missing words.

message = "URGENT: Enter your password below to unlock your account."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
risk = spam_risks.get("urgent", 0) + spam_risks.get("password", 0) # calculates the risk by getting "urgent" (4) 
# and "password" (defaults to 0 since it's not in the dictionary). The total risk is 4.
print(f"Message: {message}")
print(f"Risk: {risk}")
print() # SPACE

# Add "password" to the dictionary with a spam risk of 3.

message = "URGENT: Enter your password below to unlock your account."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
spam_risks["password"] = 3 # adds the key "password" to the dictionary with value 3. 
risk = spam_risks.get("urgent", 0) + spam_risks.get ("password", 0) # accesses both "urgent" (4) 
# and "password" (3) for a total risk of 7.
print(f"Message; {message}")
print(f"Risk:{risk}")
print() # SPACE

# Update the spam risk of the word "urgent" to 5.

message = "URGENT: Enter your password below to unlock your account."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
spam_risks["password"] = 3 # this line adds the "password" key with a value of 3 to spam_risks
spam_risks["urgent"] = 5 # updates the value of the "urgent" key to 5.
risk = spam_risks.get("urgent", 0) + spam_risks.get("password", 0)
print(f"MessageL {message}")
print(f"Risk; {risk}")
print() # SPACE

"To add a new key or update the value of an existing key in a dictionary, use the [] operator."

# Increase the risk of "offer" by 1, and set the risk of "limited" to 2.
# Then calculate the risk of a limited offer.

message = "Limited-time offer: Enter your credentials to claim your prize."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
spam_risks["offer"] += 1 # increments "offer" from 3 to 4.
spam_risks["limited"] = 2 # adds "limited" to the dictionary with value 2. 
risk = spam_risks.get("offer", 0) + spam_risks.get("limited", 0) # calculates the total risk: 2 (limited) + 4 (offer) = 6.
print(f"Message: {message}")
print(f"Risk: {risk}")
print() # SPACE

# Let's use a list of standard spam words to make our spam risks dictionary more comprehensive.
# If a spam word is in the dictionary, increase its risk by 11. Otherwise, set its risk to 2.

message = "Log in to verify your account."
spam_risks = {
    "urgent": 4,
    "www": 5,
    "offer": 3
    }
spam_words = ["urgent", "www", "click", "enter", "password", "verify", "account",
              "credentials", "offer", "hurry", "limited", "free"]
for word in spam_words: # The program loops through the list of spam words.
    if word in spam_risks:
        spam_risks[word] += 1 # For each key that exists in the dictionary ("urgent", "www", "offer"), it increments their value by 1.
    else:
        spam_risks[word] = 2 # For new keys, it sets their value to 2.
    print(f"{word}: {spam_risks[word]}")
print() # SPACE

"Dictionaries often need to be updated to account for new information."
