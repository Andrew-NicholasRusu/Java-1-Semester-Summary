"Let’s speed up our brute-force attack using dictionaries."
"Build a dictionary to store each letter with its shifted version."
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
def decrypt (text, key):
    decrypted = ""
    for letter in text:
        decrypted += shift(letter, -1 * key)
    return decrypted
def uses_common_word(text):
    common_words = ["the", "and", "or", "for", "it", "are", "not", "at", "to", "of", "is", "be", "do"]
    for word in text.split():
        if word in common_words:
            return True
        return False

messages = ["pfqrxqflk", "ixyloxqlov", "bibzqofzfqv"]
# clue: shift forward 3
letters = "abcdefghijklmnopqrstuvwxyz"
shift_table = {}
for letter in letters:
    shift_table[letter] = shift(letter, 3)

print(shift_table)
for message in messages:
    shifted = [shift_table[letter]
               for letter in message]
    print("".join(shifted))
#     {'a': 'd', 'b': 'e', 'c': 'f', 'd': 'g', 'e': 'h', 'f': 'i', 'g': 'j', 'h': 'k', 'i': 'l', 'j': 'm', 'k': 'n', 'l': 'o', 'm': 'p', 'n': 'q', 'o': 'r', 'p': 's', 'q': 't', 'r': 'u', 's': 'v', 't': 'w', 'u': 'x', 'v': 'y', 'w': 'z', 'x': 'a', 'y': 'b', 'z': 'c'}
#       situation
#       laboratory
#       electricity
print() # Space

"Now, let's build that same dictionary in a single line. Use a comprehension."

messages = ["oggwghobqs", "waasrwohszm"]
# clue: shift backward 14
letters = "abcdefghijklmnopqrstuvwxyz"
shift_table = {letter: shift(letter, -14)
               for letter in letters} # builds a lookup table: each letter maps to its decoded version
# Makes line 49 decode messages much faster.

print(shift_table) 
for message in messages:
    shifted = [shift_table[letter] 
               for letter in message]
    print("".join(shifted))
print() # Space
# {'a': 'm', 'b': 'n', 'c': 'o', 'd': 'p', 'e': 'q', 'f': 'r', 'g': 's', 'h': 't', 'i': 'u', 'j': 'v', 'k': 'w', 'l': 'x', 'm': 'y', 'n': 'z', 'o': 'a', 'p': 'b', 'q': 'c', 'r': 'd', 's': 'e', 't': 'f', 'u': 'g', 'v': 'h', 'w': 'i', 'x': 'j', 'y': 'k', 'z': 'l'}
# assistance
# immediately

"A dictionary comprehension builds a dictionary in a single line."

"Build a dictionary to store the decrypted value of each letter."

messages = ["zfujoyvupgl", "zpnuhs"]
# clue: shift backward 7
letters = "abcdefghijklmnopqrstuvwxyz"
shift_table = {letter : shift(letter, -7)
             for letter in letters}
for message in messages:
    shifted = [shift_table[letter] for letter in message]
    print("".join(shifted))
print() # Space
# synchronize
# signal   

"Protip: .get(letter, letter) looks up letter in the dictionary. For characters not in the dictionary (like spaces), it returns letter unchanged."
"Use the dictionary to decode all the messages, leaving spaces and punctuation."

messages = [
    "wba shtw pu uvyao dpukvd",
    "shtw pzu'a dvyrpun",
    "kpk fvb wsbn pa pu?",
    "wsbn pz klmljapcl"
    ]
# clue: shift backward 7
letters = "abcdefghijklmnopqrstuvwxyz"
shift_table = {letter: shift(letter, -7)
               for letter in letters}

for message in messages:
    shifted = [shift_table.get(letter, letter) # 
               for letter in message]
    print("". join(shifted))
print() # Space

# put lamp in north window
# lamp isn't working
# did you plug it in?
# plug is defective

"Let's speed up our brute-force attack."
"Build a dictionary that maps each key from 0 to 26 to the decrypted message using that key."

message = "te oek xqlu qdo sqdtbui?"
keys_decrypted = {key: decrypt(message, key)
                  for key in range(26)}
print(keys_decrypted) # {0: 'te oek xqlu qdo sqdtbui?', 1: 'sd ndj wpkt pcn rpcsath?', 2: 'rc mci vojs obm qobrzsg?', 3: 'qb lbh unir nal pnaqyrf?', 4: 'pa kag tmhq mzk omzpxqe?', 
# 5: 'oz jzf slgp lyj nlyowpd?', 6: 'ny iye rkfo kxi mkxnvoc?', 7: 'mx hxd qjen jwh ljwmunb?', 8: 'lw gwc pidm ivg kivltma?', 9: 'kv fvb ohcl hufjhukslz?', 10: 'ju eua ngbk gte igtjrky?', 
# 11: 'it dtz mfaj fsd hfsiqjx?', 12: 'hs csy lezi erc gerhpiw?', 13: 'gr brx kdyh dqb fdqgohv?', 14: 'fq aqw jcxg cpa ecpfngu?', 15: 'ep zpv ibwf boz dboemft?', 16: 'do you have any candles?', 
# 17: 'cn xnt gzud zmx bzmckdr?', 18: 'bm wms fytc ylw aylbjcq?', 19: 'al vlr exsb xkv zxkaibp?', 20: 'zk ukq dwra wju ywjzhao?', 21: 'yj tjp cvqz vit xviygzn?', 22: 'xi sio bupy uhs wuhxfym?', 
# 23: 'wh rhn atox tgr vtgwexl?', 24: 'vg qgm zsnw sfq usfvdwk?', 25: 'uf pfl yrmv rep treucvj?'}

"Now, let's use the dictionary to crack the code. Find the keys whose messages contain common words."
print() # Space

message = "te oek xqlu qdo sqdtbui?"
jeys_decrypted = {key: decrypt(message, key)
                  for key in range(26)}
likely_keys = [key for key in range(26)
               if uses_common_word(keys_decrypted[key])]
for key in likely_keys:
    print(f"{key}: {keys_decrypted[key]}")

# 11: it dtz mfaj fsd hfsiqjx?
# 16: do you have any candles?

"You used a dictionary to speed up a brute-force attack on the shift cipher."
"Dictionary comprehensions are a common way to build lookup tables — structures that trade memory for speed by computing results once and reusing them."

