"Let's decode multiple messages at once using a function."
# Decode the message.

message = "bywxry thy yvyning rxin"
# clue: x hides a, y hides e

for letter in message: # The loop checks each letter
    if letter == "x":
        print("a", end = "") #  If it's "x", the program prints "a".
    elif letter == "y":
        print("e", end = "") # If it's "y", it prints "e". 
    else:
        print(letter, end = "") # Otherwise, it prints the original letter.
print() # Space

# Write a function to decode the message.

message = "bywxry thy yvyning rxin" 
# clue: x hides a, y hides e

def replace_xy(character):
    if character == "x":
        return "a"
    elif character == "y":
        return "e"
    else:
        return character
    # The function replace_xy(letter) takes a letter and returns "a" if it's "x", "e" if it's "y", or the original letter otherwise. 
for letter in message:
    print(replace_xy(letter), end = "") # The loop calls replace_xy(letter) for each letter.
print() # Space

# Use the function to decode both the message and the reply.

message = "thy xpply hxs fxllyn"
reply = "thy tryy is not fxr"
# clue: x hides a, y hides e

def replace_xy(character):
    if character == "x":
        return "a"
    elif character == "y":
        return "e"
    else:
        return character
    
for letter in message: # The first loop decodes message by calling replace_xy(letter) for each letter.
    print(replace_xy(letter), end = "")
print() # Space
for letter in reply: # The second loop reuses the same function to decode reply.
    print(replace_xy(letter), end = "")
print() # Space

"A function performs a specific task. It an be used wherever that taks is needed."

# Decode both the message and the reply.

message = "wxit for thy fxlcon"
# clue: x hides a, y hides e
replay = "tohayn scaxilolo tipso unpyixur"
# clue: x hides a, y hides e, and every other letter is noise.

def replace_xy(character):
    if character == "x":
        return "a"
    elif character == "y":
        return "e"
    else:
        return character

for letter in message: # The first loop decodes the message using the replace_xy function.
    print(replace_xy(letter), end = "")
print() # Space

i = 0
while i < len (reply):
    print(replace_xy(reply[i]), end = "")
    i += 2 # For the reply, the while loop skips every other letter by using i += 2, 
    # then applies replace_xy to decode the remaining letters.
print() # Space

# Decode both the message and the reply

message = "spxrrows in thy nyst?"
# clue: x hides a, y hides e
reply = "smrow dnx sggy tsuj"
# clue: x hides a, y hides e, and backwards

def replace_xy(character): # The first loop decodes message using the replace_xy function.
    if character == "x":
        return "a"
    elif character == "y":
        return "e"
    else:
        return character
    
for letter in message:
    print(replace_xy(letter), end = "")
print()

i = len(reply)- 1 # For reply, it starts at the last index (len(reply) - 1) and decrements with i -= 1 to read backwards, 
# applying replace_xy to each letter.
while i >= 0:
    print(replace_xy(reply[i]), end = "")
    i -= 1
print() # Space

"It's common to reuse functions as programs get more complex."

def replace_xy(character):
    if character == "x":
        return "a"
    elif character == "y":
        return "e"
    else:
        return character
    
message = "yxrth or mxriny?"
# clue: x hides a, y hides e
reply = "snxirxnlp ,ryhtiyn"
# clue: x hides a, y hides e, and backwards

for letter in message:
    print(replace_xy(letter), end = "")
print() # Space

i = len(reply) - 1
while i >= 0:
    print(replace_xy(reply[i]), end = "")
    i -= 1
print() # Space
    
