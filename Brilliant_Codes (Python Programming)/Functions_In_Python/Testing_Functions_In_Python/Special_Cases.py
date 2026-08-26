"Let's explore the unmask function."
"Test that unmask can remove a single word, leaving the others unchanged."

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
            # The unmask function keeps a character only when key[i]=="1"key[i]=="1", 
            # and skips it when the key has a "0""0".
    return (new_text)
# test: remove must, leaving other words
message = "they must trust no one"
real_letters = "1111100000111111111111"

print(unmask(message, real_letters)) # they trust no one
# The message "they must trust no one" has "must" sitting at positions 5 through 8. 
# Every other word passes through unchanged, and only "must" gets dropped.

"Let's write a test that triggers an error."

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            # The message has 21 characters, so the loop runs 21 times.
            new_text += text[i]
    return (new_text)
# test: key shorter than message
message = "the bear trusts moose"
real_letters = "111" # The key "111" has only 3 characters, so when i=3, the program tries key[3], which doesn't exist. 
# That's an IndexError!
print(unmask(message, real_letters)) # IndexError: string index out of range

"When testing functions, it's important to consider special cases — especially scenarios where things don't work as expected."
"The unmask function raises an IndexError if key is shorter than text."

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
    return (new_text)
message = "bear must not" # 14 characters
real_letters = "1010" # 4 characters, INDEX ERROR
print(unmask(message, real_letters)) # ERROR

"Not all special cases raise errors. Test with extreme keys this time."

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
    return (new_text)

message = "bear must not"
print("Testing key with all o's:")
print(unmask(message, "0000000000000")) # With all 0s, no character passes the check, so the output is empty.
print("Testing key with all q's:")
print(unmask(message, "1111111111111")) # With all 1s, every character passes, so the full message prints.
# The key also needs enough digits to cover all 13 characters.

"What happens when the key is longer than the message?"

def unmask(text, key):
    new_text = ""
    for i in range(len(text)):
        if key[i] == "1":
            new_text += text[i]
    return (new_text)

message = "snort seven smo pose?"
# The loop only checks key positions 0 through len(text)−1.
real_letters = "0110110111110110011110101" # The extra key characters at the end are simply never accessed — no error, they're just ignored.
print(unmask(message, real_letters)) 

"Testing special cases helps prevent bugs, making modular programs more reliable."