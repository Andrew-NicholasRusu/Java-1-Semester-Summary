"Let's see what happens when a function doesn't return a value at all."
"Determine whether each message uses a common word."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", 
    "have", "it", "for", "not", "on", "with", 
    "this", "by", "from", "they", "or", "an",
    "there", "is", "are"
    ]
messages = [
    "fwqz krn vlxp dtms",
    "the flamingo is restless",
    "    ",
    "njpq cxvr tblku",
    "penguins on the roof",
    "it is not a drill"
    ]
def uses_common_word(text):
    words = text.split()
    for word in words:
        if word in common_words:
            return True
    return False
for message in messages:
    print(message, end=":")
    print(uses_common_word(message))
print() # Space

"When a function finishes without returning a value, it returns None."
"When uses_common_word finds a common word, it returns True. If it doesn't find any, it returns None."

"Instead of returning True, return the actual word that was found."

def first_common_word(text):
    words = text.split()
    for word in words:
        if word in common_words: #  checks whether the current word is one we recognize.
# We want to find common words, not skip them, so we check membership with in.
            return word
for message in messages:
    print(message, end=":")
    print(first_common_word(message)) # passes each message into our function and prints whatever it returns — either a word or None.
# We can't use word here because that variable only exists inside the function. 
print() # Space

"Protip: When you want a function to return None, it's better practice to have a return None statement."
"Update the function to return None explicitly if no common words are found."

def first_common_w0rd(text):
    words = text.split()
    for word in words:
        if word in common_words:
            return word
    return None
for message in messages:
    print(message, end=":")
    print(first_common_w0rd(message))
print() # Space

"Protip: To check if a value is None, use is None."
"Print the first common word of each message, or report that there aren't any."

for message in messages:
    word = first_common_w0rd(message)
    print(message)
    if word is not None:
#  The if branch prints the common word, so we enter it when a word was found — i.e., when word is not None.
        print(f"-> first common word: {word}")
    else:
        print("-> no common words")
print() # Space

"For each message, print the fraction of words that are common words. If a message has no words, return None and print an appropriate message."

def common_word_ratio(text):
    words = text.split()
    if len(words) == 0:
        return None
    count = 0
    for word in words:
        if word in common_words:
            count += 1
    return count / len(words)

for message in messages:
    ratio = common_word_ratio(message) # stores the result in ratio.
    print(message)
    if ratio is not None:
# checks ratio is not None to print the ratio — otherwise it prints "no words to analyze."
        print("-> common word ratio:", ratio)
    else:
        print("-> no words to analyze")
print() # Space

"You used None to signal when a function has no result to return."
"Understanding None is key to writing functions that behave predictably in every case."