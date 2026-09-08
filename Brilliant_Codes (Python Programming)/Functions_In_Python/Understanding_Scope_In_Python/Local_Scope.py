"Let's explore where variables can and can't be used."
def translate(character, key):
    if character in key:
        new_character = key[character]
    else:
        new_character = character
    return new_character
message = "librory beeks ora evardua"
# clue: a hides e, e hides o, o hides a
message_key = {"a":"e", "e":"o", "o":"a"}
for letter in message:
    result = translate(letter, message_key)
    # translate(letter, message_key) looks up each letter in that key, swapping disguised letters back. 
    print(result, end= "")
print() # Space

"The loop needs to stop at a certain point."
def translate(character, key):
    if character in key:
        new_character = key[character]
    else:
        new_character = character
    return new_character
message = "poy fina in homstarsXiw"
# clue; a hides e, e hides o, o hides a
# X hides . and ends message
message_key = {"a":"e", "e":"o", "o":"a", "X":"."}
for letter in message:
    result = translate(letter, message_key)
    print(result, end= "") # pay fine in hamsters.
    if result == ".":
        break
print() # Space

"The scope of a variable refers to where it can be used in a program."
"Variables defined inside a function can't be used outside of the function."

"Fix the program so it doesn't use a variable outside its scope."
def translate(character, key):
    if character in key:
        new_character2 = key[character]
    else:
        new_character2 = character
        # new_character2 and character are both created inside the translate function
    return new_character2 
# Once the function returns, those variables disappear — they don't exist out in the loop.

message = "enly ena homstar laftXg"
message_key = {"a":"e", "e":"o", "o":"a", "X":"."}
for letter in message:
    result = translate(letter, message_key)
    print(result, end= "") # only one hamster left.
    if result == ".":
        break
print() # Space

"Pay attention to which variables are local and which are global."
def erase(character, key):
    if character in key:
        output = ""
    else:
        output = character
    return output
message = "rusted guidnear prigst"
# clue: r, t, d are noise
for letter in message:
    decoded = erase(letter, "rtd")
    print(decoded, end= "") # use guinea pigs
print() # Space

"This time the function keeps characters instead of erasing them."
def keep(character, key):
    if character in key:
        result = character
    else:
        result = ""
    return result 
message = "dig us map. up near medow"
# clue: only a, d, e, i, p, r, s are real 
for letter in message: 
# In the loop, keep(letter, "adeiprs") checks each letter against all 7 real letters from the clue. 
# Only those letters survive — the rest become "", so print(value, end="") outputs just the real letters: "disappeared".
    value = keep(letter, "adeiprs")
    print(value, end= "") # disappeared

"Understanding local scope is crucial to avoiding errors when programming with functions."