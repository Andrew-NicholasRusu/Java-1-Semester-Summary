"Let's decode by shifting letters. Print the alphabet position of each letter in the message."
"Skip the spaces."

def position_of(letter):
    alphabet_start = ord('a')
    return ord(letter) - alphabet_start

message = "khrsdm enq gtllhmfahqc"
for letter in message:
    if letter == " ":
        continue
    pos = position_of(letter)
    print(pos, end = " ")
print() # Space

"Now, use the positions to decode the message by shifting."

def letter_at(position):
    alphabet_start = ord('a')
    return chr(position + alphabet_start)

message = "khrsdm enq gtllhmfahqc"
# clue: a hides b, b hides c, ... y hides z
for letter in message:
    if letter == " ":
        print(letter, end = "")
        continue
    pos = position_of(letter) # gives the letter's 0-based spot in the alphabet — so k becomes 10.
    shifted = pos + 1
    print(letter_at(shifted), end = "")
print() # Space

"This time z hides a, so the positions need to wrap around. Decode it using mod."

message = "gdzqc nmkx bzrrnvzqx"
# clue: a hides b, b hides c, ... y hides z, z hides a
for letter in message:
    if letter == " ":
        print(letter, end = "")
        continue
    pos = position_of(letter)
# After position_of returns the position, line 43 shifts it, then the shifted value is passed to letter_at.
    shifted = (pos + 1) % 26
    print(letter_at(shifted), end = "")
print() # Space

"A function pipeline uses the output of one function for the input of another."

"Now, let's add a function to the pipeline to handle shifting by a given amount."

def shift_number(position, n):
# The function needs two inputs: the position and the shift amount. 
    return (position + n) % 26 # Shifting a position forward by n means adding: position + n.

message = [18, 16, 10, 9, 24, 4, 3]
# clue: shift positions forward 10
for num in message:
    shifted = shift_number(num, 10)
    print(letter_at(shifted), end = "")
print() # Space

"Decode the message using a pipeline with three functions."

message = "naoyqaz xu awcha"
# clue: a hides e, b hides f, ... z hides d
# The clue says "a hides e, b hides f, …, z hides d." Let's decode that: a is at position 0 and e is at position 4, so the hidden letter is 4 steps ahead. 
for letter in message:
    if letter == " ":
        print(letter, end = "")
        continue
    pos = position_of(letter)
    shifted = shift_number(pos, 4)
# we call shift_number(pos, 4) to move forward by 44 and recover the original letter's position.
    print(letter_at(shifted), end = "")
print() # Space

"You used function pipelines to decode messages."
"Function pipelines are crucial for organizing tasks in large programs."