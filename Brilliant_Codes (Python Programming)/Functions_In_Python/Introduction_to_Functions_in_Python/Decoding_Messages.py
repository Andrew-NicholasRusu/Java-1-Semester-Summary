# Decode the message. The program uses end = "" to keep printing on the same line.

message = "dXcodX this mXssagX"
# clue: X hides e

for letter in message: # The loop iterates through each letter in message.
    if letter == "X": # When letter == "X", the program prints "e" to replace the hidden letter.
        print("e", end ="")
    else: # Otherwise, it prints the original letter.
        print(letter, end ="") # decode this message
print() # Space

"A for-loop can run through the characters in a string."

# Decode the message

message = "tha aegla flias et dewn"
# clue: the e's and a's are swapped.
 
for letter in message: # The loop checks each letter. 
    if letter == "e": # If it's "a", the program prints "e".
        print("a", end ="")
    elif letter == "a": # If it's "e", it prints "a".
        print("e", end ="")
    else:
        print(letter, end ="") # Otherwise, it prints the original letter.
print() # Space

# Decode the message.

message = "anid tihe hawik retiurnis ati dusik"
# clue: i's are noise

for letter in message:
    if letter != "i": # When letter != "i", the program prints the letter.
        print(letter, end ="") # This filters out all the i's to reveal the hidden message.
print() # Space

"The key will be decomposition - breaking a problem into smaller parts."