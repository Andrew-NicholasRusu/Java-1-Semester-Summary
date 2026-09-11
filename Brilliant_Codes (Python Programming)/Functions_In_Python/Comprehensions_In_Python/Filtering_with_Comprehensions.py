"Let’s analyze some decryption results. Decrypt the list of messages."

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
    shifted = [shift(letter, -1 * key) 
               for letter in text]
    return "".join(shifted)

messages = [
    "kyv kfrjkvi zj fe kyv tflekvi",
    "nyviv zj kyv scveuvi?",
    "evok kf kyv kfrjkvi",
    "dfezkfi kyv jzklrkzfe",
    "kyv kfrjkvi zj nridzex"
    ]
key = 17
decrypted = [decrypt(message, key)
            for message in messages] #  loops through each encrypted message
print("\n".join(decrypted))
print() # Space
'The comprehension applies decrypt to every message using the same key, building the decrypted list.'

# the toaster is on the counter
# where is the blender?
# next to the toaster
# monitor the situation
# the toaster is warming

"Now, let's search the decrypted messages for specific information."

key = 17
decrypted = [decrypt(message, key)
             for message in messages]
toaster_msgs = [message # keeps the messages in decrypted that contain "toaster".
                for message in decrypted
                if "toaster" in message] # Python's in checks whether the left string appears inside the right string.
print("\n".join(toaster_msgs))
print() # Space
'We search decrypted — not messages — because messages holds the encrypted text, and "toaster" only appears after decrypting.'

# the toaster is on the counter
# next to the toaster
# the toaster is warming

"Adding an if condition to a comprehension filters for elements that match the condition."

"We've included a Boolean function that checks a message for common words."
"Filter for messages that use at least one common word."

def uses_common_word(text):
    common_words = ["the", "and", "or", "for", "it", "are", "not", 
                    "at", "to", "of", "is", "be", "do"]
    for word in text.split():
        if word in common_words:
            return True
    return False

messages = [
    "ju jt hfuujoh ipu",
    "it is getting hot",
    "hs hr fdsshmf gns"
    ]
filtered = [message
            for message in messages
            if uses_common_word(message)]
print("\n".join(filtered)) # it is getting hot
print() # Space

"Now, let's combine brute force with filtering. Try every key, then print only the results that use a common word."

message = "tyvtb zk wfi sivru"
decrypted = [decrypt(message, key)
             for key in range(26)]
maybe_english = [
    msg for msg in decrypted
    if uses_common_word(msg)]
print("\n".join(maybe_english))
print() # Space
# check it for bread
# xczxf do ajm wmzvy

"Now, use a filter comprehension to find the likely keys directly."

message = "vy wwulyzof! ohjfoa cn zclmn"
likely_keys = [key for key in range(26) if
               uses_common_word(decrypt(message, key))]
print(likely_keys) # [7, 20, 25]
print() # Space

"Now, use those likely keys to see the actual messages."

message = "vy wwulyzof! ohjfoa cn zclmn"
likely_keys = [key for key in range(26) if
               uses_common_word(decrypt(message, key))]
results = [decrypt(message, key)
           for key in likely_keys]
print(likely_keys)
print("\n".join(results))

# [7, 20, 25]
# or ppnershy! hacyht vg svefg
# be ccareful! unplug it first
# wz xxvmzapg! pikgpb do admno

"You used comprehensions to find the key that cracks a shift cipher."
"Filtering with comprehensions is a powerful way to search through a collection of data."