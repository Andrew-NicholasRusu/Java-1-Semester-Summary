# Write a function that returns "th" whe nthe input is "h", and retruns the input otherwise.

def expand_h(character):
    if character == "h": # The function expand_h(character) checks if character == "h".
        return "th" # If so, it returns "th".
    else:
        return character # Otherwise, it returns the original character.

print(expand_h("h"))
print() # Space

# Test the expand_h function on three different inout values.

def expand_h(character):
    if character == "h":
        return "th"
    else:
        return character
    
print(expand_h("h"))
print(expand_h("e"))
print(expand_h("y"))
# Test the function with all three inputs: "h", "e", and "y".
# The function returns "th" for "h" and the original character for the others.
print() # Space

# Call the function to decode the message.

message = "he sloh is on he pah"
# clue: h hides th

def expand_h(character):
    if character == "h":
        return "th"
    else:
        return character
    
for letter in message: # The loop iterates through each letter in message.
    print(expand_h(letter), end = "") # Calling expand_h(letter) replaces each "h" with "th" to reveal "the sloth is on the path".
print() # Space

# Call the function to decode the reply.

reply = "yadsruh no speels rehnap eh"
# clue: h hides th, and backwards

def expand_h(character):
    if character == "h":
        return "th"
    else:
        return character
    
i = len(reply) - 1
while i >= 0:
    print(expand_h(reply[i]), end = "") # Starting from the last index (i = len(reply) - 1), 
    # the loop goes backwards by decrementing (i -= 1) until it finishes processing the first letter (i >= 0).
    # Calling expand_h(reply[i]) decodes each character in reverse order.
    i -= 1
print() # Space

"When calling a function, the input can take different forms."

# Decode the message.

message = "the pda can hdle the islds"
# clue: d hides and

def expand_d(character): # The function expand_d(character) checks if character == "d".
    if character == "d":
        return "and" #  If so, it returns "and".
    else:
        return character # Otherwise, it returns the original character. 
    
for letter in message:
    print(expand_d(letter), end = "") # Calling expand_d(letter) for each letter decodes the message.
print() # Space 

# Decode the reply.

reply = "tuheep abodointo awadreprisk pirnk isocooptolid"
# clue: d hidees and, and eveyr other letter is noise.

def expand_d(character):
    if character == "d":
        return "and"
    else:
        return character
    
i = 0
while i < len(reply):
    print(expand_d(reply[i]), end = "") # Calling expand_d(reply[i]) on the remaining characters expands "d" to "and" to decode the reply.
    i += 2 # The loop skips every other character (i += 2) to filter out noise. 
print() # Space

"Calling functions is key to writing modular, scalable programs."
