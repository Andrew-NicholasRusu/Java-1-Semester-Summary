"Write a function to decode the message."

message = "ofnrs ttiyno?pa"
indexes = [14, 2, 9, 5, 1, 11, 0, 7, 13, 3, 8, 10, 6, 4, 12]
# clue: list gives index order

def unscramble(text, key):
# The key is a list of indexes. Each number tells you which character to grab from the scrambled text — in order. 
    new_text = ""
    for index in key:
        new_text += text[index]
    return new_text
print(unscramble(message, indexes)) # any footprints?
"By looping through the key and pulling text[index] each time, you rebuild the original message: 'any footprints?'"

"Now, choose inputs that make the program raise an IndexError."

def unscramble(text, key):
    new_text = ""
    for index in key:
        new_text += text[index]
    return new_text
message = "h nptynorlisseo" # The string \"h nptynorlisseo\" has 15 characters, so valid indices run from 0 to 14.
indexes = [34, 17, 11, 13, 26, 0, 27, 13]
print (unscramble(message, indexes)) # INDEX ERROR
"When the loop tries text[34], Python can't find that position and raises an IndexError."

"A precondition is something that must be true about the input for a function to work correctly."
"A precondition of the unscramble function is that the largest index in key must be less than len(text)."

def unscramble(text, key):
# precondition: max(key) < len(text)
    new_text = ""
    for i in key:
        new_text += text[i]
    return new_text
# Protip: Python's max function returns the largest value in a list.
message = "h nptynorlisseo"
indexes = [14, 2, 9, 5, 1, 11, 0, 7, 13, 3, 8, 10, 6, 4, 12]
if max(indexes) >= len(message):
    print("⚠️ key values too large")
else: # If the precondition is true, call unscramble to decode the message. Otherwise, report that the key contains an index that's too large.
    print (unscramble(message, indexes)) # only shoeprints

"If the precondition is true, call unmask to decode the message. Otherwise, report that the key is too short."

def unmask(text, key): # unmask requires len(key)≥len(text)len(key)≥len(text). 
# preconditions: len(key) >= len(text)
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
    return(new_text)
message = "xthese fooxtprints werze madxe by shzoes"
real_letters = "011111111101"
if len(real_letters) < len(message): # the if checks the opposite of the precondition: len(realletters)<len(message). 
# When that's true, it's unsafe to call unmask, so we print the warning. 
    print("⚠️ key is too short")
else:
    print(unmask(message, real_letters)) 
# prints: ⚠️ key is too short

"If the precondition is satisfied, it should call the function. Otherwise, it should print a warning."

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text
# precondition: key is less than the length of each word.

message = "one cow stands if few eels attack"
key = 2
words = message.split()
key_ok = True
for word in words:
    if key >= len(word):
        key_ok = False
        print("⚠️ key too large")
        break
    if key_ok:
        print(word_letter(message, key))

"Understanding preconditions helps ensure that programs use functions correctly."