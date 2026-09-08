"Decode both the message and the reply."
def translate (character): 
    if character in key:
        new_character = key[character]
    else:
        new_character = character
    return new_character
message = "eur ricopi os cempremosid"
# clue: e hides o, i hides e, o hides i
key = {"e":"o", "i":"e", "o":"i"}
for letter in message:
    print(translate(letter), end = "") # our recipe is compromised
print()
reply = "uso did's rocepo enstoid"
# clue: e hides i, i hides a, o hides e
key = {"e": "i", "i":"a", "o":"e"}
for letter in reply:
    print(translate(letter), end = "") # use dad's recipe instead
print() # Space

"The function needs its own key input instead of relying on the global one."
def translate(character, key): # By adding key as a second parameter, the function can now accept ANY substitution dictionary you pass in.
    if character in key:
        new_character = key[character]
    else:
        new_character = character
    return new_character
message = "eur ricopi os cempremosid"
# e hides o, i hides e, o hides i
message_key = {"e":"o", "i":"e", "o":"i"}
reply = "uso did's rocepo enstoid"
# e hides i, i hides a, o hides e
reply_key = {"e":"i", "i":"a", "o":"e"}
for letter in message:
    print(translate(letter, message_key), end = "") # recipe is compromised
print() 
for letter in reply:
    print(translate(letter, reply_key), end = "") # use dad's recipe instead
"Functions that depend on global variables can behave in unexpected ways. Passing values as inputs instead can make functions more reliable."

"Now, the function erases noise characters instead of translating them."
def erase(character, key):
    if character in key:
        return ""
    else:
        return character
message = "ognarslinc resquinored"
# clue: o, n, s are noise
message_key = "ons"
reply = "slurbastiratruter roarnilona"
# clue: a, r, l are noise
reply_key = "arl"
for letter in message:
    print(erase(letter, message_key), end = "") # garlic required
print()
for letter in reply:
    print(erase(letter, reply_key), end = "") # substitute onion
print()

"This time, the function keeps characters instead of erasing them."
def keep(character, key):
    if character in key:
        return character
    else:
        return ""
message = "sUNs hAVe nAILs! stAy treBLE"
# clue: keep only uppercase
message_key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
reply = "SimpLE? Or GLovES iNsIDe"
# clue: keep only lowercase
reply_key = "abcdefghijklmnopqrstuvwxyz"
for letter in message:
    print(keep(letter, message_key), end = "") # UNAVAILABLE
print() 
for letter in reply:
    print(keep(letter, reply_key), end = "") # improvise

"Designing the right function inputs makes programs easier to understand and maintain."