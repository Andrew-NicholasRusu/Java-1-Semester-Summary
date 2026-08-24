"Let's use multiple functions together."

def swap1 (text, letter1, letter2):
    new_text = ""
    for letter in text:
        if letter == letter1:
            new_text += letter2
        elif letter == letter2:
            new_text += letter1
        else:
            new_text += letter
    return new_text

message1 = "tsasut updase requetsed"
# clue: each word has s and t swapped.
words = message1.split() # message.split() breaks it into a list of individual words.
for word in words:
    print(swap1(word, "s", "t"), end = " ") # status update requested 
print() # Space

"This time, only some of the words need to be swapped."

def swap2 (text, letter1, letter2):
    new_text = ""
    for letter in text:
        if letter == letter1:
            new_text += letter2
        elif letter == letter2:
            new_text += letter1
        else:
            new_text += letter
    return new_text

message2 = "begals heva gona rogue"
# clue: words without u's have a and e swapped.
words = message2.split()
for word in words:
    if "u" not in word:
        print(swap2(word, "a", "e"), end = " ")
    else:
        print(word, end = " ") # bagels have gone rogue 
print() # Space

"Use the swap and remove functions to decode the message."

def swap3 (text, letter1, letter2):
    new_text = ""
    for letter in text:
        if letter == letter1:
            new_text += letter2
        elif letter == letter2:
            new_text += letter1
        else:
            new_text += letter
    return new_text
def remove3(text, to_remove): 
    new_text = ""
    for letter in text:
        if letter != to_remove:
            new_text += letter
    return new_text

message3 = "craem chaasa aulusuo?"
# words without u: a and e are swapped
# words with u: u is noise
words = message3.split()
for word in words:
    if "u" not in word:
        print(swap3(word, "a", "e"), end = " ")
    else:
        print(remove3(word, "u"), end = " ")
print() # Space
