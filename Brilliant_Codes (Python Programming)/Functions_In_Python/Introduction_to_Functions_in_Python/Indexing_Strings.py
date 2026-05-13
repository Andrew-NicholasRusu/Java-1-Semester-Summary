# Decode the message using indexes.

message = "onaip"
# clue: backwards

print(message[4], end ="")
print(message[3], end ="")
print(message[2], end ="")
print(message[1], end ="")
print(message[0], end ="")
# To print backwards, access indices in reverse: message[4] is "p", message[3] is "i", 
# message[2] is "a", message[1] is "n", message[0] is "o".
print() # Space

# Decode the message.

message = "gninut sdeen onaip eht"
# clue: backwards

i = len (message) - 1 # Starting at the last index (len(message) - 1), the loop continues while i >= 0.
while i >= 0:
    print(message[i], end ="")
    i -= 1
    # Each iteration prints message[i] and decrements i with i -= 1 to move backwards through the string.
print() # Space

"Strings can be indexed, just like lists."

# Decode the message.

message = "wahoipcoho skeetyisk?"
# clue: every other letter is noise.

i = 0
while i < len(message): # Starting at index 0, the loop continues while i < len(message).
    print(message[i], end = "")
    i += 2
    # Each iteration prints message[i] and increments i by 2 with i += 2 to skip every other letter.
print() # Space

# Decode the message.

message = "pryanylillon erproomifum artochomertmerp"
# clue: every third letter is real, but p's are noise.

i = 0 # Starting at index 0, the loop increments by 3 with i += 3 to read every third letter. 
while i < len(message):
    letter = message[i]
    if letter != "p": # The condition letter != "p" filters out the noise ps, revealing the hidden message.
        print(letter, end = "")
    i += 3
print() # Space

"String indexing is crucial to many modern algorithms."

# What are the first two letters prited by this program?

message = "hetamilintow dipritothipent pumprunistoinic"
# clue: every third letter is real, but p's are noise.

i = 0
while i < len(message):
    letter = message[i]
    if letter != "p":
        print(letter, end ="")
    i += 3
print() # Space
# Answer : ha
    # The loop starts at i = 0 and increments by 3. So it prints message[0] then message[3]: h and a.




