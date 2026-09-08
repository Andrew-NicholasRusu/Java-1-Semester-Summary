"Let's see what happens when a local and global variable share the same name."
def translate(character, key):
    if character in key:
        return key[character]
    else:
        return character
message = "thi dintost knaws taa much"
# clue: a hides o, e hides a, i hides e, o hides i
message_key = {"a": "o", "e":"a", "i":"e", "o":"i"}
for letter in message:
    print(translate(letter, message_key), end = "") # the dentist knows too much
print() # Space

"Stop decoding the message after translating X."
def translate(character, key):
    if character in key:
        return key[character]
    else:
        return character
message = "senotozi thi affociXjq"
# clue: a hides o, e hides a, i hides e, o hides i 
# X hides . and ends message
message_key = {"a":"o", "e":"a", "i":"e", "o":"i", "X":"."}
for letter in message:
    print(translate(letter, message_key), end = "") # sanitize the office.
    if letter == "X":
        break
print() # Space

"The translate function should work even when the message contains uppercase letters."
"Update the function so it converts to lowercase before decoding, and update the key accordingly."

def translate(character, key):
    character = character.lower()
    if character in key:
        return key[character]
    else:
        return character
message = "Entosiptoc ShartegiXYZ"
# clue: a hides o, e hides a, i hides e, o hides i 
# X hides . and ends message
message_key = {"a":"o", "e":"a", "i":"e", "o":"i", "x":"."}
for letter in message:
    print(translate(letter, message_key), end = "") # antiseptic shortage.
    if letter == "X":
        break
print() # Space

"If a local and global variable share the same name, the local variable shadows the global one. Inside the function, the local variable is used instead."

def erase(letter, key):
    if letter in key:
        letter = ""
    return letter
message = "joulstyunseyowloatern"
# y, o, n, l are noise
# y inserts space
for letter in message:
    decoded = erase(letter, "yonl")
    print(decoded, end= "") # just use water
    if letter == "y":
        print(" ", end = "") 
print() # Space

"Decode the message."
def keep(letter, key):
    if letter not in key:
        letter = ""
    return letter
message = "OdiN scoT Over Ned RaN! ROl Peak"
# clue: just lowercase are real, but R makes a new line.
key = "abcdefghijklmnopqrstuvwxyz"
for letter in message:
    value = keep(letter, key)
    print(value, end = "")
    if letter == "R":
        print()

"In large programs, it can be tough to come up with new local variable names. Shadowing lets local and global variables share a name without affecting each other."