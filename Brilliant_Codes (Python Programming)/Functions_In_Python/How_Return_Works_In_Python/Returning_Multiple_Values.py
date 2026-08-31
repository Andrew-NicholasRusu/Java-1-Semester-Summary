"Let's see what happens when you need to return more than one."
"Write a function to return the number of times a message uses a common word."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", "for", "not", "on", "with",
    "this", "by", "from", "they", "or", "an", "there", "is", "are"
    ]
messages = [
    "wxghe pvrryes yn vlwre",
    "launch the muffins", 
    "zhr wuezzfinv knoc rsre",
    "with raisins or nuts",
    "gy meabut ir vizpamilq"
    ]

def find_common_words(text):
    words = text.split() 
    count = 0
    for word in words:
        if word in common_words:
            count += 1
    return count
for message in messages:
    print(message, end = ":")
    print(find_common_words(message))
print() # Space

"Update the function to return a Boolean instead."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", "for", "not", "on", "with",
    "this", "by", "from", "they", "or", "an", "there", "is", "are"
    ]
messages = [
    "wxghe pvrryes yn vlwre",
    "launch the muffins", 
    "zhr wuezzfinv knoc rsre",
    "with raisins or nuts",
    "gy meabut ir vizpamilq"
    ]

def find_common_words(text):
    words = text.split()
    count = 0 
    for word in words:
        if word in common_words:
            count += 1
# The loop at count += 1 tallies how many common words appear. Then has_common = count > 0 converts that number into a Boolean: 
# if count is at least 1, it's True; if 0, it's False.
    has_common = count > 0
    return has_common
# print results
for message in messages:
    print(message, end = ":")
    print(find_common_words(message))
print() # Space

"Alright, but what if you want both?"

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", "for", "not", "on", "with",
    "this", "by", "from", "they", "or", "an", "there", "is", "are"
    ]
messages = [
    "wxghe pvrryes yn vlwre",
    "launch the muffins", 
    "zhr wuezzfinv knoc rsre",
    "with raisins or nuts",
    "gy meabut ir vizpamilq"
    ]

def find_common_words(text):
    words = text.split()
    count = 0 
    for word in words:
        if word in common_words:
            count += 1
    has_common = count > 0
# In Python, you can return multiple values by separating them with a comma — they get packed into a tuple.
    return has_common, count
# print results
for message in messages:
    print(message, end = ":")
    print(find_common_words(message))
print() # Space

"A function can return multiple values, separated by commas. The result is a tuple — a fixed bundle of values."
"Protip: When a function returns a tuple, you can unpack it into multiple variables."

"Now, unpack the tuple into separate variables and print them."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", "for", "not", "on", "with",
    "this", "by", "from", "they", "or", "an", "there", "is", "are"
    ]
messages = [
    "wxghe pvrryes yn vlwre",
    "launch the muffins", 
    "zhr wuezzfinv knoc rsre",
    "with raisins or nuts",
    "gy meabut ir vizpamilq"
    ]
def find_common_words(text):
    words = text.split()
    count = 0
    for word in words:
        if word in common_words:
            count += 1
    has_common = count > 0
    return has_common, count

for message in messages:
    found, num_found = find_common_words(message)
# found gets the boolean, and num_found gets the count — matching what each print statement needs.
    print(message)
    print("Has common word?", found)
    print("# of common word:", num_found)
print() # Space

"With tuples, order matters — they are unpacked in the same order they are returned."
"Update the function to also construct a list of common words, and return all three together."

common_words = [
    "the", "to", "of", "and", "a", "in", "that", "have", "it", "for", "not", "on", "with",
    "this", "by", "from", "they", "or", "an", "there", "is", "are"
    ]
messages = [
    "wxghe pvrryes yn vlwre",
    "launch the muffins", 
    "zhr wuezzfinv knoc rsre",
    "with raisins or nuts",
    "gy meabut ir vizpamilq"
    ]

def find_common_words(text):
    words = text.split()
    count = 0
    common_list = [] # initializes an empty list — you need a list to collect words, not the number 0. 
    for word in words:
        if word in common_words:
            count += 1
            common_list.append(word) # adds each matching word to that list.
    has_common = count > 0
    return has_common, count, common_list
# print results
for message in messages:
    print(message)
    print(find_common_words(message))
print() # Space
"Unpack the tuple and print only the messages that have common words."
for message in messages:
    found, num_found, words_found = find_common_words(message)
# So found gets the boolean, num_found gets the count, and words_found gets the list. 
    if found:
        print(message)
        print("# of common words:", num_found)
        print(words_found)

"Returning tuples lets a function bundle related results into a single, organized package."