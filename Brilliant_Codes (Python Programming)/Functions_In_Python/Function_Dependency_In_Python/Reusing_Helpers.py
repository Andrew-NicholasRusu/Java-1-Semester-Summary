"Let's write functions to handle encryption and decryption. Encrypt the message by shifting forward."

def position_of(letter):
    alphabet_start = ord('a')
    return ord(letter) - alphabet_start
def letter_at(position):
    alphabet_start = ord('a')
    return chr(position + alphabet_start)
def shift_number(position, n):
    return (position + n) % 26
def is_lowercase(letter):
    return letter in "abcdefghijklmnopqrstuvwxyz"
def shift(letter, n):
    if is_lowercase(letter):
        pos = position_of(letter)
        shifted = shift_number(pos, n)
        return letter_at(shifted)
    return letter

message = "green heron or scarlet ibis?"
# encrypt: shift forward 7
key = 7
encrypted = ""
# we're building a new string by adding one shifted letter at a time, so we start with an empty string, not 0.'
for letter in message:
    encrypted += shift(letter, key)
# the shift function handles everything: it checks if the letter is lowercase, shifts it forward by key, and passes through non-letters 
print(encrypted) # nyllu olyvu vy zjhysla pipz?

"Now, wrap that into a reusable function."

def encrypt(text, key):
# The function needs both the message and the shift amount, so the signature is encrypt(text, key) — two parameters.
    encrypted = ""
    for letter in text:
        encrypted += shift(letter, key) # shift it forward by key positions in the alphabet, and append the result to encrypted.
    return encrypted

message = "ibis; heron has opinions"
# encrypted: shift forward 7
print(encrypt(message, 7)) # 

"Reuse the shift helper to make a decryption function."

def decrypt(text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, -1 * key)
    return decrypted

message = "doha rpuk vm vwpupvuz?"
# decrypt: shift back 7
print(decrypt(message, 7))

"Let's test the decryption function by encrypting and then decrypting with the same key."

message = "political ones, mostly"
encrypted = encrypt (message, 11) 
# to undo a shift of +11, it shifts by −11. That only works if you use the same key (11) and pass the encrypted text, not the original message.
print(encrypted) # azwtetnlw zypd, xzdewj
print(decrypt(encrypted, 11)) # political ones, mostly

"The same helper can be used by more than one function. You reused shift to build two functions for a shift cipher."
"Reusable helpers make large programs easier to maintain and improve."