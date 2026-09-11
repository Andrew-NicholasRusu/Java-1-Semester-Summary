"Let's write encryption and decryption functions using lists."
"Decode the message."

# helper functions...
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

message = "kyv mrtlld ilej rk dzuezxyk"
# clue: shift forward 9
shifted = []
for letter in message:
    new_letter = shift(letter, 9)
    shifted.append(new_letter)
decrypted = "".join(shifted)
print(decrypted) # the vacuum runs at midnight

"Let's do the same thing in a single line."
"Write a comprehension that shifts each letter of the message."

message = "kqttw mfx fqwjfid gjjs xbjuy"
# clue: shift backward 5
shifted = [shift(letter, -5) 
           for letter in message]
decrypted = "".join(shifted)
print(decrypted) # floor has already been swept

"A list comprehension builds a list with a single line of code."
"Use a comprehension to decode the message."

message = "lzw nsumme escwk fgakw"
# clue: shift forward 8
shifted = [shift(letter, 8)
           for letter in message]
decrypted = "".join(shifted)
print(decrypted) # the vacuum makes noise

"Now, let's wrap this up into reusable functions."
# shift forward by key
def encrypt(text, key):
    shifted = [shift(letter, key) # a positive shift moves each letter forward.
               for letter in text]
    return "".join(shifted)

# shift backward by key
def decrypt(text, key):
    shifted = [shift(letter, -1 * key) # negating the key shifts each letter backward, undoing the encryption.
               for letter in text]
    return "".join(shifted)

message = "deactivate vacuum"
encrypted = encrypt(message, 17)
print(encrypted) # uvrtkzmrkv mrtlld
print(decrypt(encrypted, 17)) # deactivate vacuum

"Now, there's a whole list of messages to decrypt. Use a comprehension to handle them all."

messages = [
    "chjbbt jvumpytlk vmmspul",
    "doha hivba aol kbza",
    "slhcl pa",
    "aol iyvvt pz dhajopun",
    "bzl aol ihjr zahpyz"
    ]
key = 7
decrypted = [decrypt(message, key)
             for message in messages]
print("\n".join(decrypted)) 

# vacuum confirmed offline
# yhat about the dust
# leave it
# the broom is watching
# use the back stairs

"This time you don't know the key. Decrypt the message with every key from 0 to 25."

message = "qeb arjmpqbo fp zljmoljfpba"
decrypted = [decrypt(message, key)
             for key in range(26)]
print("\n".join(decrypted))

# qeb arjmpqbo fp zljmoljfpba
# pda zqilopan eo ykilnkieoaz
# ocz yphknozm dn xjhkmjhdnzy
# nby xogjmnyl cm wigjligcmyx
# max wnfilmxk bl vhfikhfblxw
# lzw vmehklwj ak ugehjgeakwv
# kyv uldgjkvi zj tfdgifdzjvu
# jxu tkcfijuh yi secfhecyiut
# iwt sjbehitg xh rdbegdbxhts
# hvs riadghsf wg qcadfcawgsr
# gur qhzcfgre vf pbzcebzvfrq
# ftq pgybefqd ue oaybdayueqp
# esp ofxadepc td nzxaczxtdpo
# dro newzcdob sc mywzbywscon
# cqn mdvybcna rb lxvyaxvrbnm
# bpm lcuxabmz qa kwuxzwuqaml
# aol kbtwzaly pz jvtwyvtpzlk
# znk jasvyzkx oy iusvxusoykj
# ymj izruxyjw nx htruwtrnxji
# xli hyqtwxiv mw gsqtvsqmwih
# wkh gxpsvwhu lv frpsurplvhg
# vjg fworuvgt ku eqortqokugf
# uif evnqtufs jt dpnqspnjtfe
# the dumpster is compromised
# sgd ctlorsdq hr bnloqnlhrdc
# rfc bsknqrcp gq amknpmkgqcb

"You used list comprehensions to encrypt and decrypt messages."
"List comprehensions are one of the most widely-used ways to transform collections of data."