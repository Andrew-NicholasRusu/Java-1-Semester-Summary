# Decode the message.
message = "ekal eht ta snettim eulb"
# clue: backwards

i = len(message) - 1 # The program starts i at the last index len(message) - 1.
while i >= 0:
    print(message[i], end = "") # While i >= 0, it prints the character at that index and decrements i with i -= 1 
    # to move backwards through the string.
    i -= 1
print() # Space

"Protip: The += operator can append to the end of a string."
# Decode the message and save the result as a string.

message = "dilos nezorf si ekal"
# clue: backwards

new_text = "" # The program initializes new_text as an empty string.
i = len(message) - 1
while i >= 0:
    new_text += message[i] # Then it uses += to append each character from the end of the message to build the result string.
    i -= 1
print(new_text)
print() # Space

# Use a function to decode both the message and the reply.
message = "remmahkcaj ro etimanyd esu"
reply = "reyrdriah gnisu"
# clue: backwards

def reverse(text): # The program defines reverse(text) to take text as input.
    new_text = ""
    i = len(text) - 1
    while i >= 0:
        new_text += text[i]
        i -= 1
    return new_text
#  It initializes new_text as empty, loops backwards through text, appends each character with +=, then returns new_text.
print(reverse(message))
print(reverse(reply))
print() # Space

"Variables defined and used within a function are called local variable."
# Write a function to decode the message.

message = "lbe carefu"
# clue: last letter has been moved to front.

def cycle(text):
    cycled = "" # The program starts cycled as empty and starts i at 1 to skip the first character. 
    i = 1
    while i < len(text):
        cycled += text[i]
        i += 1
    cycled += text[0]
    return cycled
#  It loops through appending text[i], then addstext[0] at the end to move the first character to the back.
print(cycle(message))
print() # Space

# Write a function to decode the message.

message = "amointuteepnusk pirnd scrupsitrooday"
# clue: even-indexed letters are noise

def odd_letters(text):
    only_odds = "" # The program starts with an empty only_odds and i = 1 (the first odd index). 
    i = 1
    while i < len(text):
        only_odds += text[i]
        i += 2
    return only_odds
# It loops while i < len(text), appending text[i] and incrementing by 2 to skip even indices.
print(odd_letters(message))
print() # Space

"Local variables are very common in functions that handle complex tasks"



