"Let's make a codebreaking function."

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

# Which helper does our decrypt function call?
# Answer: shift
# shift takes a letter and a number, and returns the shifted letter. decrypt just calls it with −1×key to reverse the encoding.

"How many different helpers does the shift function call?"

def decrypt(text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, -1 * key)
    return decrypted 
# Answer: 4
# Look at lines 18 to 21.
# Each one does a small job, and shift chains them together.

"A complex task can be broken into smaller subtasks, each handled by a helper."

# decrypted
# └─ shift
#    ├─ is_lowercase
#    ├─ position_of
#    ├─ shift_number
#    └─ letter_at
"Here, shift doesn’t need to know how each subtask works — just each helper’s inputs and return values."

"find_keys needs a helper, uses_common_word, to check whether a decoded string looks like English."
"Which plan describes what this function should do?"

# find_keys
#  └─ uses_common_word

# Answer: Check each word in the text. Return True if any word appears in a list of common English words.

"Write the uses_common_word helper."
def uses_common_word(text):
    common_words = ["the", "and", "for", "are", "not", "at", "a" "to", "of", "is"]
    for word in text.split():
        if word in common_words:
            return True
    return False

print(uses_common_word("what is the signal?")) # True
print(uses_common_word("hsle td esp dtrylw?")) # False

"Write find_keys to get a list of keys that might crack the code."

def find_keys(message):
    keys = []
    for key in range(26):
        decrypted = decrypt(message, key)
        if uses_common_word(decrypted):
            keys.append(key)
    return keys

message = "t estyv esp bfpeklw htww dtyr"
likely_keys = find_keys(message)
print(likely_keys)

"Try all the likely keys to see if any of them worked."

message = "t estyv esp bfpeklw htww dtyr"
likely_keys = find_keys(message) # tries all 26 keys and keeps only the ones whose decryption contains a common English word like "the" or "is".
for key in likely_keys:
    print(f"🔑 {key}: { # 🔑 11: i think the quetzal will sing
    decrypt(message, key)}") 

"You planned a program with subtasks to do a brute-force attack on a shift cipher."
"Breaking a complex task into subtasks is one of the most important strategies in software development."

# find_keys
#  ├─ uses_common_word
#  └─ decrypt
#     └─ shift
#        ├─ is_lowercase
#        ├─ position_of
#        ├─ shift_number
#        └─ letter_at