"Bugs can hide anywhere in a chain of function calls."
"This program has a bug."

# helper functions ...
def position_of(letter):
    alphabet_start = ord('a')
    return ord (letter) - alphabet_start

def letter_at(position):
    alphabet_start = ord('a')
    return chr (position + alphabet_start)

def shift_number(position, n):
    return (position + n) % 26

def is_lowercase(letter):
    return letter in "abcdefghijklmnopqrstuvwxyz"

def shift(letter, n):
    if is_lowercase(letter):
        pos = position_of(letter)
        shifted = shift_number(pos, n)
        return letter_at(shifted)
    return letter

def encrypt(text, key):
    encrypted = ""
    for letter in text:
        encrypted += shift(letter, key)
    return encrypted

def decrypt(text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, key)
    return decrypted

encrypted = encrypt("hello", 3)
print(decrypt(encrypted, 3)) # nkrru

# Answer: decrypt shifts forward by key instead of back.

'Fixing it:'

def encrypt(text, key):
    encrypted = ""
    for letter in text:
        encrypted += shift(letter, -1 * key)
# shifts each letter by −1×key (backward)
    return encrypted

def decrypt(text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, key)
    return decrypted

encrypted = encrypt("hello", 3)
print(decrypt(encrypted, 3)) # hello 
# encrypt and decrypt must be inverse operations — one shifts forward, the other shifts backward by the same amount.
# The original bug had both using key in the same direction, so decrypt would shift further instead of reversing.

"When a function isn’t working, the bug might be in the function, or it might be in one of the helpers it calls."

def decrypt2(text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, - 1 * key)
    return decrypted
message = "eplns te azcefrfpdp"
print(decrypt2(message, 11)) # teach it portuguese

"Understanding how to trace bugs is an essential part of modular software design and engineering."

