# Decode the message.

message = "XlXvXn pXnguins ahXad"
# clue: X hides e

for letter in message: # The loop iterates through each letter in message.
    if letter == "X":
        print ("e", end = "") # When letter == "X", the program prints "e" to replace the hidden letter. 
    else:
        print(letter, end = "") # Otherwise, it prints the original letter.
print() # Space

# Decode the message.

message = "hoildoXy atoheXy aspanradoipniXus"
# clue other letter is noise, and X hides e

i = 0
while i < len(message): # The while loop uses the condition i < len(message) to loop while there are characters left. 
    letter = message[i]
    if letter =="X":
        print("e", end = "")
    else:
        print(letter, end = "")
    i += 2 #  The program uses message[i] to get each letter, then increments by 2 with i += 2 to skip the noise letters.
print() # Space

"Instead of repeating commands, we can write a function that decodes a single character."

# def decode (character)
#   if character == "X":
#       return "e"
#   else:
#       return character

"A function takes an input value and returns an output value."

# Define a function that returns "e" when the input characters is "X", and otherwise returns the input value.

def decode(character): # defines decode(letter) with the input in parentheses.
    if character == "X": # When letter == "X", it returns "e" as output.
        return "e"
    else: # Otherwise, it returns the original letter.
        return character
    
for letter in "Xat":
    print(f"{letter} -> {decode(letter)}")
print() # Space

# To use a function, it has to be called. 
# Call the function using the inputs X, w, and e.

def decode (character):
    if character == "X":
        return "e"
    else:
        return character
    
print(decode("X"))
print(decode("w"))
print(decode("e"))
# The program calls decode with each input: decode("X"), decode("w"), and decode("e").
print() # Space

# Use the function to decode the message.

message = "XlXvXn pXnguins ahXad"
# clue: X hides e

def decode(character):
    if character == "X":
        return "e"
    else:
        return character
    
for letter in message:
    print(decode(letter), end = "") # The program loops through each letter in message, then calls decode(letter) to transform each letter.
print() # Space

# USe the function to decode the message.

message = "hoildoXy atoheXy aspanradoipniXus"
# clue other letter is noise, and X hides e

def decode(character):
    if character == "X":
        return "e"
    else:
        return character

i = 0
while i < len(message): # The while condition i < len(message) makes the loop run while characters remain.
    letter = message[i]
    print(decode(letter), end = "") # The program uses message[i] to get each letter, then calls decode(letter) to transform it before printing.
    i += 2
print() # Space

"Functions help transform data and break problems into parts."

message = "tuhaXi spoolkiXy winso tirnu edrapnogaXer"
# clue: every other letter is noise, and X hides e

def decode (character):
    if character == "X":
        return "e"
    else:
        return character # When the input character is "X", the function returns "e". Otherwise, it returns the original input character.
    
i = 0
while i < len (message):
    letter = message[i]
    print(decode(letter), end = "")
    i += 2
print() # Space