"Let's use functions to update our decoders."
# Write a function to decode the message.

message = "wu havu thu culury"
# clue: u hides e 

def restore(character): # The restore(character) function 
    # checks if character == "u" and returns "e" to decode the hidden character.
    if character == "u":
        return "e"
    else:
        return character # Otherwise, it returns the original character.

for letter in message:
    print(restore(letter), end = "")
print() # Space

# Update the function to decode both the message and the reply.

message = "whurx aru thx buuts?"
reply = "samu placx as bxforu"
# clue: u and x hide e

def restore(character):
    if character in ["u", "x"]: # Using character in ["u", "x"] checks if the character 
        # is either "u" or "x", so both are replaced with "e".
        return "e"
    else:
        return character
# The same function decodes both messages.
for letter in message:
    print(restore(letter), end = "")
print() # Space 

for letter in reply:
    print(restore(letter), end = "")
print() # Space

"Updating a function updates its behavior everywhere it is used."

# Write a function to decode the message.

message = "kaap tha calary sefa"
# clue: a's and e;s are swapped

def swap_ae(character): # The swap_ae function swaps "a" and "e"
    if character == "a":
        return "e"
    elif character == "e": #  If character == "a", it returns "e".
        return "a"
    else:
        return character # Otherwise, it returns the original character.
    
for letter in message:
    print(swap_ae(letter), end = "")
print() # Space 

# Update the function to decode both the message and the reply. 

message = "ba@ats obt#ein&ad"
reply = "calar&y ra#fri@gar&et@ad"
# clue: a's and e's are swapped, and @ # are noise

def swap_ae(character):
    if character == "a":
        return "e"
    elif character == "e":
        return "a"
    elif character in ["@", "#", "&"]: # The updated function adds a new condition: elif character in ["@", "#", "&"].
        return "" #  In this case, the function returns an empty string "" to remove the noise characters.
    else:
        return character

for letter in message:
    print(swap_ae(letter), end = "")
print() # Space
for letter in reply:
    print(swap_ae(letter), end = "")
print() # Space

# Decode the message

message = "cha@ck per#slay &end fate"
reply = "nage#tiva. san@d harb&s"
# clue: a's and e's are swapped, and @ # & are noise

def swap_ae(character):
    if character == "a":
        return "e"
    elif character == "e":
        return "a"
    elif character in ["@", "#", "&"]:
        return ""
    else:
        return character
    
for letter in message:
    print(swap_ae(letter), end = "")
print() # Space
for letter in reply:
    print(swap_ae(letter), end = "")
print() # Space
    
"Functions make programs easier to maintain and upgrade."