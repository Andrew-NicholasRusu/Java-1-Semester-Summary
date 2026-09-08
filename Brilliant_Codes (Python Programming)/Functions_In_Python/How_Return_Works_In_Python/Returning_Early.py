"You've been using Boolean functions to control logic. Now, let's make those functions more efficient."
"Print only the messages that contain at least one common word."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", 
    "have", "it", "for", "not", "on", "with", 
    "this", "by", "from", "they", "or", "an",
    "there", "is", "are"
    ]
messages = [
    "kxptn fzwx blst gnvru",
    "the teacup is vibrating",
    "vqsh nkrz twlp cdrx", 
    "parrots are on alert", 
    "start marshmallow sequence",
    "mxbw crxptx fnklo spbrq"
    ]
def uses_common_word(text):
    words = text.split()
    has_common = False
# The function uses_common_word uses a flag — a variable that tracks whether we've found something.
# We start with has_common = False because we assume no common word exists until we find one.
    for word in words:
        if word in common_words:
            has_common = True
            break
    return has_common

for message in messages:
    if uses_common_word(message):
        print(message)  # the teacup is vibrating
                        # parrots are on alert
print() # Space

"Now, simplify the function. Instead of tracking a variable, exit as soon as you have the answer."

def uses_common_word(text):
    words = text.split()
    for word in words:
        if word in common_words:
            return True
# When the loop finds a word that's in common_words, the if condition is true — that's the moment we've found a match.
    return False

for message in messages:
    if uses_common_word(message):
        print(message) # the teacup is vibrating
                      # parrots are on alert
print() # Space
"A return statement exits a function immediately."
"As soon as this function finds a common word, line 5 exits and returns True. If the loop finishes without finding one, line 6 returns False."

"Compute the fraction of words that are common words, and handle the case where the text has no words."

def common_word_ratio(text):
    words = text.split()
    if len(words) == 0:
        return 0.0
# we check if len(words) == 0 and return 0.0 early to handle that case safely.
    count = 0
    for word in words:
        if word in common_words:
            count += 1
    return count / len(words) # gives the fraction of words that are common.
# print results
for message in messages:
    print(message, end = ":")
    print(common_word_ratio(message))

"Print only the messages that have at least one vowel in each word. Use early returns this time."

def words_have_vowels(text):
    vowels = "aeiou"
    words = text.split()
    for word in words:
        has_vowel = False
        for letter in word:
            if letter in vowels:
                has_vowel = True
        if not has_vowel:
            return False
    return True
for message in messages:
    if words_have_vowels(message):
        print(message)
print() # Space

"Print the messages that look encrypted, meaning they have at least one word without vowels."

def looks_encrypted(text):
    vowels = "aeiou"
    words = text.split()
    for word in words:
        has_vowel = False
        for letter in word:
            if letter in vowels:
                has_vowel = True
        if not has_vowel:
            return True
# if the loop finishes checking every word and never hit return True, that means every word had at least one vowel. 
    return False
for message in messages:
    if looks_encrypted(message):
        print(message)
# After checking all letters, if has_vowel is still False, that word has no vowels — so the message looks encrypted, and we return True (hole-2).
print() # Space

"Returning early lets a function exit as soon as it has an answer, preventing unnecessary computations."