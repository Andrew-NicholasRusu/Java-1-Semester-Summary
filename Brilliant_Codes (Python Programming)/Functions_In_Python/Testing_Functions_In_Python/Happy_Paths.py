"Now, let's write code to test our decryption functions."
"Choose a function call that will output 'piano status?'."

def denoise(text, key):
    new_text = ""
    for letter in text:
        if letter not in key: # The function keeps only letters that are not in the key. 
            new_text += letter
    return new_text
message = "xxxpiano status?zzz"
#  Passing "xz" as the key tells the function to remove every x and z, leaving "piano status?".
print(denoise(message, "xz")) # piano status?

#-------------------------------------------------------------------------------------------
"Now, let's test with a different message and key."

def denoise(text, key):
    new_text = ""
    for letter in text:
        if letter not in key: 
            new_text += letter
    return new_text

# test: remove every m
message = "them pimanom hams mbemen demstromymemd"
print(denoise(message, "m")) # Tests a happy path to check that denoise can remove a single letter from the input text.
# the piano has been destroyed

"A happy path is a test case where the inputs are valid and the function returns the expected output."
#-------------------------------------------------------------------------------------------
"Test a happy path with special characters."

def denoise(text, key):
    new_text = ""
    for letter in text:
        if letter not in key: 
            new_text += letter
    return new_text

# test: remove special characters
message = "i@t w#as a pri&celess ste#inway"
# every @, # and & gets skipped.
print(denoise(message, "@&#")) # it was a priceless steinway

#-------------------------------------------------------------------------------------------
"Test with upper-case letters."

def denoise(text, key):
    new_text = ""
    for letter in text:
        if letter not in key: 
            new_text += letter
    return new_text

# test: remove upper-case letters
message = "noRtH ManBymoBreD"
print(denoise(message, "ABCDEFGHIJKLMNOPQRSTUVWXYZ")) # not anymore

#-------------------------------------------------------------------------------------------
"This time the key includes spaces."

def denoise(text, key):
    new_text = ""
    for letter in text:
        if letter not in key:
            new_text += letter 
    return new_text

# test: remove s i and spaces
message = "sun if sort is uni sate"
print(denoise(message, "s i")) # unfortunate

"Testing functions on typical inputs is a routine part of software development."