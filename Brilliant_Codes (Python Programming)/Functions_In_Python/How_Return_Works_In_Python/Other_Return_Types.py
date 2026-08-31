"Let's use functions to help decode messages."
"Count the number of times the message uses a common word."

common_words = ["the", "it", "this", "that", "is", "are"]
message = "the signal is the wombat"

words = message.split()
count = 0
for word in words:
    if word in common_words:
        count += 1
print(f"Found {count} common words") # Found 3 common words

"Now, wrap that logic in a function so you can check multiple messages."

common_words = ["the", "it", "this", "that", "is", "are"]
messages = [
    "zhr wuexfinv knoc rsreyzhing",
    "the toaster is sentient",
    "mw kdwbtufo ri ndfvtei",
    "she sheuzxtsas it wlxssiyg"
    "the cat is the mole"
    ]

def count_common_words(text):
    words = text.split()
    count = 0
    for word in words:
        if word in common_words:
            count += 1
    return count # After counting, return count sends the result back to whoever called the function.

for message in messages:
    print(message, end = ":")
    print(count_common_words(message))


"This time the function should return a Boolean instead of a count."

common_words = ["the", "it", "this", "that", "is", "are"]
messages = [
    "zhr wuexfinv knoc rsreyzhing",
    "the toaster is sentient",
    "mw kdwbtufo ri ndfvtei",
    "she sheuzxtsas it wlxssiyg"
    "the cat is the mole"
    ]

def uses_common_word(text): # The function needs a parameter — text — so it can process each message individually. 
    words = text.split()
    has_common = False
    for word in words:
        if word in common_words:
            has_common = True
            break
# the loop checks each word — if it finds one in common_words, it flips has_common to True (hole 2) and breaks.
    return has_common
for message in messages:
    print(message, end = ":")
    print(uses_common_word(message))

"A function can return any type of value."
"Now, return a list of common words instead."

common_words = ["the", "it", "this", "that", "is", "are"]
messages = [
    "zhr wuexfinv knoc rsreyzhing",
    "the toaster is sentient",
    "mw kdwbtufo ri ndfvtei",
    "she sheuzxtsas it wlxssiyg"
    "the cat is the mole"
    ]

def list_common_words(text):
    words = text.split()
    common_list = []
    for word in words:
        if word in common_words:
            common_list.append(word)
    return common_list

for message in messages:
    print(message, end = ":")
    print(list_common_words(message))


"Write a function that returns a dictionary to count how many times each common word appears."

common_words = ["the", "it", "this", "that", "is", "are"]
messages = [
    "zhr wuexfinv knoc rsreyzhing",
    "the toaster is sentient",
    "mw kdwbtufo ri ndfvtei",
    "she sheuzxtsas it wlxssiyg"
    "the cat is the mole"
    ]

def common_word_counts(text):
    common_dict = {}
    words = text.split()
    for word in words:
        if word in common_words:
            if word not in common_dict:
                common_dict[word] = 0
            common_dict[word] += 1
    return common_dict

for message in messages:
    print(message, end = ":")
    print(common_word_counts(message))

"Complex programs often use several functions with different types of return values."