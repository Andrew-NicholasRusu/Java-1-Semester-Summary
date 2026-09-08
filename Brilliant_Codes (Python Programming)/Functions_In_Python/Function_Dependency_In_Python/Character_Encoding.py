"Let's decode messages using numbers."
"Computers store characters as numeric codes. Python's chr converts this number back to its character. Decode the message."

message = [119, 104, 111, 32, 97, 114, 101, 32, 116, 104, 101, 
           32, 115, 117, 115, 112, 101, 99, 116, 115, 63]
for number in message:
    print(chr(number), end="") # who are the suspects?
# chr(number) converts each numeric code back into its character. 
print() # Space

"The ord function takes a character and returns its code. Let's try it out."

reply = "abcxyz"
for charcter in reply:
    number = ord(charcter)
# ord(character) gives the numeric code for that letter — so ord('a') returns 97, ord('b') returns 98, and so on.
    print(charcter, number)
# a 97
# b 98
# c 99
# x 120
# y 121
# z 122
print() # Space

"Characters are commonly encoded as numbers."
"Unicode is a standard way to represent characters using numbers. The lowercase letters 'a'-'z' have Unicode numbers 97-122."

"Let's use those Unicode numbers."
"Write a function that returns the alphabet position of a letter, where 'a' is at position 0 and 'z' is at 25."

def position_of(letter):
    alphabet_start = ord('a')
    return ord(letter) - alphabet_start

reply = "abcxyz"
for letter in reply:
    position = position_of(letter)
    print(letter, position)
print() # Space

"Write a function that does the reverse. Given an alphabet position, return the letter."

def letter_at(position):
    alphabet_start = ord('a')
    return chr(position + alphabet_start)
# Since ord("a") gives the code point of a, adding position to alphabet_start shifts that code point by the right amount — so position 0 maps to a, position 1 to b, and so on.
message = [19, 17, 0, 13, 18, 15, 14, 17, 19, 8, 13, 6]
# clue: numbers are alphabet positions
for number in message:
    print(letter_at(number), end = "")
print() # Space

"Now, use both functions together. Encode the message and decode the reply."

message = "careful"
reply = [17, 14, 6, 4, 17]
# clue: numbers are alphabet positions
for letter in message:
    print(position_of(letter), end = " ")
print() # Space
for number in reply:
    print(letter_at(number), end = "")

"You used ord and chr to convert between letters and numbers."
"Encoding letters as numbers is common in algorithms that process text."
