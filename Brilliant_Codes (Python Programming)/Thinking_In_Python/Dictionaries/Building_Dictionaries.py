"Let's update our scoring system so repeated spam words increase the score."

# Print whether each word in the dictionary is present in the message. 

username = "SynergizerBunny"
sender = "EmilyVP"
message = "Special offer: Enter your credentials to claim a limited-time offer at www.lockdin-offers.com"
text = message.lower()
spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}

for word in spam_risks: # loops through each word in the spam_risks dictionary.
    present = word in text # checks if the word is in text, the lowercase version of the message.
    print(F"'{word}' in message? {present}") # prints the result
print() # SPACE

# Create a dictionary that stores whetehr or not each spam word is present in the message.

username = "SynergizerBunny"
sender = "EmilyVP"
message = "Special offer: Enter your credentials to claim a limited-time offer at www.lockdin-offers.com"
text = message.lower()
spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}
 
spam_present = {} # initializes spam_present as a new empty dictionary.
for word in spam_risks: # loops through the spam words in the spam_risks dictionary.
    present = word in text # checks if each word is in the lowercase text of the message. 
    spam_present[word] = present # stores this True/False value in the spam_present dictionary using the value of word as a key.
    print(f"'{word}' in message? {present}")
print(spam_present)
print() # SPACE

"You can build dictionaries inside a loop"

# In Python, the count method can be used to count how many times one string appears in another. 
# Build a dictionary to store the number of times each spam word appears in the lowercase text 
# of the message.

username = "SynergizerBunny"
sender = "EmilyVP"
message = "Special offer: Enter your credentials to claim a limited-time offer at www.lockdin-offers.com"
text = message.lower()
spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}

spam_counts = {} # creates a new empty dictionary.
for word in spam_risks: #  loops through every word in the spam_risks dictionary.
    count = text.count(word) # uses text.count(word) to count how many times each word appears in the lowercase text of the message.
    spam_counts[word] = count # stores the count value in the spam_counts dictionary using the key stored in word.
    print(f"{count}x '{word}'")
print(spam_counts)
print() # SPACE

# Build a dictionary to store each spam word's score - its risk multiplied by how many times it appears in the message.

username = "SynergizerBunny"
sender = "EmilyVP"
message = "Special offer: Enter your credentials to claim a limited-time offer at www.lockdin-offers.com"
text = message.lower()
spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}

spam_counts = {} 
for word in spam_risks: 
    count = text.count(word) 
    spam_counts[word] = count
word_scores = {} # creates a new empty dictionary.
for word, count in spam_counts.items(): # loops through the word, count pairs stored in the spam_counts dictionary. 
    risk = spam_risks[word] # looks up the risk of each word.
    score = risk * count # calculates the word's spam score (risk * count).
    word_scores[word] = score # stores the score value in the word_scores dictionary using the key stored in word.
    print(f"{count}x '{word}' -> Score: {score}")
print(word_scores)
print() # SPACE

# Calcualate the message's spam score by adding all the word scores together. 
# If the spam score is over 10, put the message in the Spam folder; otherwise,
# put it in the inbox.

username = "SynergizerBunny"
sender = "EmilyVP"
message = "Special offer: Enter your credentials to claim a limited-time offer at www.lockdin-offers.com"
text = message.lower()
spam_risks = {
    "urgent": 4, "www": 5, "click": 3, "enter": 4, "password": 3, "verify": 3,
    "account": 1, "credentials": 4, "offer": 3, "hurry": 2, "limited": 2, "free": 2
}

spam_counts = {} 
for word in spam_risks: 
    count = text.count(word) 
    spam_counts[word] = count
word_scores = {} # creates a new empty dictionary.
for word, count in spam_counts.items(): # loops through the word, count pairs stored in the spam_counts dictionary. 
    risk = spam_risks[word] # looks up the risk of each word.
    score = risk * count # calculates the word's spam score (risk * count).
    word_scores[word] = score
spam_score = 0  # initializes spam_score to 0.
for word,score in word_scores.items():
    spam_score += score
    print(f"⚠️ Spam risk: {spam_score}")
    #  loops through the word scores, adding each score to the total.

if spam_score > 10: # checks if the score exceeds 10, classifying the message as Spam (score > 10) or Inbox (score <= 10).
    folder = "⚠️ Spam" 
else:
    folder = "✉️ Inbox"
print(f"[{folder}] {sender}: {message}")

"Building dictionaries helps with storing information in an organized way."
