"Let's wrap the decoding pipeline into a single function. Decode the message."

def position_of(letter):
    alphabet_start = ord('a')
    return ord(letter) - alphabet_start
def letter_at(position):
    alphabet_start = ord('a')
    return chr(position + alphabet_start)
def shift_number(position, n):
    return (position + n) % 26

message = "amldgpk"
# clue: shift forward 2
for letter in message:
    pos = position_of(letter)
    shifted = shift_number(pos, 2) # it adds 2 and wraps around with % 26. 
    print(letter_at(shifted), end = "")
print() # Space

"Let's make the shift amount flexible too."

def shift(letter, n): # takes two inputs: the letter to shift and how far to shift it. 
    # The function needs both because different messages use different shift amounts.
    pos = position_of(letter)
    shifted = shift_number(pos, n)
    return letter_at(shifted)
"The caller function shift uses the helper functions position_of, shift_number, and letter_at."

message = "sxxajeslanw"
# clue: shift forward 8
for letter in message:
    print(shift(letter, 8), end = "")
print() # Space
"A helper function is called by another function. A helper function performs a task for its caller function."

"Now, the message has non-letter characters too."
"Write a function to check for lowercase letters, and only shift those."

def is_lowercase(letter):
    return letter in "abcdefghijklmnopqrstuvwxyz"
message = "dn zvbgz di ocz diadmhvmt?"
# clue: shift only lowercase letters forward 5
for letter in message:
    if is_lowercase(letter):
        print(shift(letter, 5), end = "")
    else:
        print(letter, end = "")
print() # Space

"Update shift to pass non-lowercase characters through unchanged, and decode the message."

def shift2 (letter, n):
    if is_lowercase(letter):
        pos = position_of(letter)
        shifted = shift_number(pos, n)
        return letter_at(shifted) # turns the shifted number back into a character.
    return letter
message = "jk, awcha eo ej pda ebniwiajp"
# clue: shift forward 4
for letter in message:
    print(shift2(letter, 4), end ="")

"You used helper functions to write a function that shifts letters."
"Software engineers regularly break large tasks into smaller subtasks and write helper functions to handle each one."