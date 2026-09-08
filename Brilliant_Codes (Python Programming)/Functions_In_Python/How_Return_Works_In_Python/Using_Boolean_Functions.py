"Let's use logic to filter for decoded messages."
"Determine whether each message uses at least one common word."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", 
    "for", "not", "on", "with", "this", "by", "from", "they", 
    "or", "an", "there", "is", "are"
    ]
messages = [
    "brvtiz nkwp fqsh",
    "found azure olive",
    "xlpq srwk vnt",
    "zzybgq by pkt gnwb",
    "the fox is outside",
    "hzown qretpf klvsu"
    ]

def uses_common_word(text):
    words = text.split()
    has_common = False
# We start by assuming the message has no common word, so has_common = False.
    for word in words:
        if word in common_words:
# We check each word: is it in common_words? If yes, we flip the flag to True at line 18 and break — no need to keep searching.
            has_common = True
            break
    return has_common

for message in messages:
    print (message, end = ":")
    print(uses_common_word(message))

print() # Space

"Now, use the return value of the function to control which messages get printed."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", 
    "for", "not", "on", "with", "this", "by", "from", "they", 
    "or", "an", "there", "is", "are"
    ]
messages = [
    "brvtiz nkwp fqsh",
    "found azure olive",
    "xlpq srwk vnt",
    "zzybgq by pkt gnwb",
    "the fox is outside",
    "hzown qretpf klvsu"
    ]

def uses_common_word(text):
    words = text.split()
    has_common = False
    for word in words:
        if word in common_words:
            has_common = True
            break
    return has_common

for message in messages:
    if uses_common_word(message): # calls the Boolean function uses_common_word to determine whether to print the message.
        print(message)

"A function that returns a True/False value is called a Boolean function. Boolean functions can control logic in a program."

"Most real words contain vowels, so that's another way to spot decoded messages."
"Write a Boolean function to check if each word of the text contains at least one vowel."

messages = [
    "brvtiz nkwp fqsh",
    "found azure olive",
    "xlpq srwk vnt",
    "zzybgq by pkt gnwb",
    "the fox is outside",
    "hzown qretpf klvsu"
    ]
def words_have_vowels(text): # First, the function takes text as input (hole-0) and splits it into words.
    vowels = "aeiou"
    words = text.split()
    all_have_vowel = True # we start optimistic, assuming every word has a vowel until proven wrong.
    for word in words:
        has_vowel = False 
# Fh word, we set has_vowel = False (hole-2) — we start pessimistic per word, assuming this word has no vowel.
        for letter in word:
            if letter in vowels:
                has_vowel = True
        if not has_vowel:
            all_have_vowel = False
            break
# if has_vowel is still False (hole-4), that word has no vowel — so we set all_have_vowel = False (hole-5) and break to stop checking more words.
    return all_have_vowel
# print results
for message in messages:
    print(message, end = ":")
    print(words_have_vowels(message))
print() # Space

"Now, use that function to filter. Print only the messages where every word has a vowel."

for message in messages:
    if words_have_vowels(message):
        print(message)
print() # Space

"You have two Boolean functions. Print only the messages that satisfy both conditions."

for message in messages:
    if uses_common_word(message) and words_have_vowels(message):
        print(message)
print() # Space

"Boolean functions help make program logic clean and readable."