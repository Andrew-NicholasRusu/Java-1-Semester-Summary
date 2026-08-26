"Let's use functions to decipher encrypted messages."

message = "doxezs zyoxurz zdozg zbixtex?"
# clue: x and z are noise

def denoise_xz(text):
    new_text = ""
    for letter in text: # We loop through every letter in text, checking if that letter is not in "xz".
        if letter not in "xz": # If it survives the filter, we append it with new_text += letter. 
            new_text += letter
    return new_text
print(denoise_xz(message)) # does your dog bite?

"Update the function so it works for any noise letters."

reply = "noya kofa coyukrase knoat"
# clue: y a k are noise

def denoise(text, noise): # The function needs a second parameter — noise — so it can accept any string 
    # of noise letters, not just hardcoded ones. That's why denoise(text, noise) is the right signature.
    new_text = ""
    for letter in text:
        if letter not in noise:
            new_text += letter
    return new_text
print(denoise(reply, "yak")) # no of course not

"A decryption function takes an encrypted message and a key as input and returns the decoded message."
"The denoise function decrypts the message text by removing all the letters in the key noise."

message = "torucah! shoe ablito umpen"
real_letters = "01011011101011010110101010"
# clue: keep letters where key has 1

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
    return new_text
print(unmask(message, real_letters)) # ouch! he bit me

"This encryption works with words instead of individual characters."

longReply = "ashes ahead by. slice pasta up. honey floated cat in. come pay up. cody took cages"
# clue: take the 3rd letter of each word
letter_index = 2 # the 3rd letter is at index 22 — that's why letter_index = 2.

def word_letter (text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key] # The function splits the text into individual words, loops through each one, 
        # and pulls out word[key] — the letter at that index.
    return new_text
print(word_letter(longReply, letter_index)) # he.is.not.my.dog

"Keys have been used to encrypt and decrypt messages since the early days of cryptography."