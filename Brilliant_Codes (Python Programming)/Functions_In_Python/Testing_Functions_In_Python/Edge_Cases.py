"Let's test the word_letter function."
"Test that word_letter can return the first letter of each word."

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text

# test: keep only first letter of each word
message = "cold avocado tasting"
print(word_letter(message, 0)) # cat

"Now, test that it can return the last letter of each word."

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text

# test: keep only last letter of each word.
message = "cold avocado tasting"
print(word_letter(message, -1)) # dog

"Python supports negative indexing — negative indices count from the end of a string."
"word[-1] grabs the last character of each word: "
"cold → d,"
"avocado → o,"
"tasting → g"
"Spells out dog."

"It is important to test functions on edge cases — inputs at extreme or borderline scenarios."
"The word_letter function returns the first letter of each word when the key is 0, and returns the last letter when the key is -1."

# Now, punctuation can change the last letter of a word.

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text

print("Test without punctuation:")
print(word_letter("watch the corn", -1)) # hen
print("Test with punctuation:")
print(word_letter("watch the corn!", -1)) # he!

"Edge cases can sometimes cause errors, when the input is just beyond the valid range."

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text
# test: key is too large for message
message = "pig elk gnu"
print(word_letter(message, 3)) # INDEX ERROR
# When you pass key=3key=3, line 5 tries to access word[3]word[3] — the 4th letter of a 3-letter word. 
# That doesn't exist, so Python raises an IndexErrorIndexError.

"Choose an edge case that makes the program raise an error"

def word_letter(text, key):
    new_text = ""
    words = text.split()
    for word in words:
        new_text += word[key]
    return new_text
# test: key is too large for message
message = "zebra tiger shark"
print(word_letter(message, 5)) # INDEX ERROR

"Exploring edge case behavior is key to building error-free programs."


