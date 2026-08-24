"Let's look at how functions fit into bigger programs."

message = "mergenc" # clue: missing an e in front and a y at the end.
message = "e" + message
message = message + "y"
print(message) # emergency

# Reverse function

message1 = "syawedis seog rotavele eht" # clue: backwards 
def reverse(text):
    new_text = ""
    for letter in text:
        new_text = letter + new_text
    return new_text
print(reverse(message1)) # the elevator goes sideways

"Protip: Python's split() method breaks a string into a list of words."

def reverse(text):
    new_text = ""
    for letter in text:
        new_text = letter + new_text
    return new_text

message2 = "ekat eht sriats daetsni" # clue: words are in order, but each word is reversed.
words = message2.split() 
# message.split() breaks "ekat eht sriats daetsni" into a list: ["ekat", "eht", "sriats", "daetsni"].
for word in words:
    print(reverse(word), end = " ") # take the stairs instead 
print() # Space

"A function can handle a single task within a larger program."

"Protip: To split a message at a string str instead of at spaces, use split(str)."

def cycle(text, n):
    cycled = ""
    i = n
    while i < len(text):
        cycled += text[i]
        i += 1
    i = 0
    while i < n:
        cycled += text[i]
        i += 1
    return cycled

message = "eth/sstair/ehav/sear"
# clue: last letter of each word has been moved to front
words = message.split("/")
for word in words:
    print(cycle(word, 1), end = " ") # the stairs have ears
print() # Space

# Write a function to decode each word of the message.

message = "plunt sihoopees ion spinliernut moopdie"
# clue: every other letter of each word is noise.

def step_through(text, step): # The step_through function builds a new string one letter at a time.
    new_text = ""
    i = 0 # loops while the index i is still valid
    while i < len(text):
        new_text += text[i]
        i += step
    return new_text
words = message.split()
for word in words:
    print(step_through(word, 2), end = " ") # put shoes in silent mode

"Finding places to use functions is at the heart of modular programming."