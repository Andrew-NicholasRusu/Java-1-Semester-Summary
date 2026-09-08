"Let's use alphabet positions to decode messages."

def position_of(letter):
    alphabet_start = ord('a')
    return ord(letter) - alphabet_start

message = "swiztuvaztiwony"
# clue: alphabet positions above 20 are noise
for letter in message:
    pos = position_of(letter)
    if pos <= 20:
        print(letter, end = "") # We want to print the actual letter, not its position number. So print(letter) outputs the decoded character.
print() # Space

"This time the message has spaces to keep."

message = "crown malkzest xmubstinc"
# clue: only even alphabet positions are real
for letter in message:
    if letter == " ":
# When the letter is a space, we print it (to keep spaces in the message) and then use continue to skip to the next letter — no position check needed.
        print(letter, end = "")
        continue
    pos = position_of(letter)
    if pos in [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24]:
        print(letter, end = "")
print() # Space

"Protip: % 2 gives the remainder when dividing by 2."
"Even numbers have remainder 0. Decode the message."

message = "mopuste twaps medsbsyz"
# clue: only even alphabet positions are real.
for letter in message:
    if letter == " ":
        print(letter, end = "")
        continue
    pos = position_of(letter)
    if pos % 2 == 0: # When pos is even, pos % 2 is 0. When pos is odd, pos % 2 is 1.
        print(letter, end = "")
print() # Space

"The mod operator % gives the remainder after dividing by a number. Modding by nn gives a number between 0 and n−1"

"The noise pattern is different this time."

message = "adopg zwilal prefstokare foraderp"
# clue: alphabet positions 0, 5, 10, 15, 20, 25 are noise.
for letter in message:
    if letter == " ":
        print(letter, end = "")
        continue
    pos = position_of(letter)
    if pos % 5 > 0: # identifies a noise letter.
# The modulo operation pos % 5 is a handy way to detect any repeating pattern every 55 letters. 
        print(letter, end = "")
print() # Space

"Modding works on negative numbers too. Mod each number to get a result between 0 and 9."
numbers = [-1, 26, -7, 34, -8]
for number in numbers:
    modded = number % 10
    print(f"{number} -> {modded}")
print() # Space

"Now, the message uses negative numbers as letter codes. Decode it."

def letter_at(position):
    alphabet_start = ord('a')
    return chr(position + alphabet_start)

message = [-8, 0, -7, 8, -8, 5, 0, 2, -7, 14, 17, -2]
# clue: mod by 26 to get letter positions
for number in message:
    pos = number % 26 # The % (modulo) operator divides by 2626 and gives you the remainder, which always falls in the range 0 to 25. 
    print(letter_at(pos), end = "")
print() # Space

"Modular arithmetic is a powerful tool used in many applications of computing."