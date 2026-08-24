# Write a function to decode the message

message = "psocks are still dam"
# clue: laste letter has been moved to front

def cycle1(text):
    cycled = ""
    i = 1
    while i < len(text):
        cycled += text[i]
        i += 1
    cycled += text[0]
    return cycled
print (cycle1(message)) # socks are still damp

# Now the last two letters have been moved to the front.

message = "nyuse the balco"
# clue: last 2 letters have been moved to front

def cycle2(text):
    cycled = ""
    i = 2
    # The first loop starts at i=2i=2, so it skips "ny" and copies everything from index 2 onward: "use the balco".
    while i < len(text):
        cycled += text[i]
        i += 1
    i = 0
    # The second loop grabs indices 0 and 1 (that's "ny") and appends them, giving "use the balcony".
    while i < 2:
        cycled += text[i]
        i += 1
    return cycled
print(cycle2(message)) # use the balcony

# The last three letters have been moved to the front.

reply = "inebirds on clothesl"
def cycle3(text):
    cycled = ""
    i = 3
    while i < len(text):
        cycled += text[i]
        i += 1
    i = 0
    while i < 3:
        cycled += text[i]
        i += 1
    return cycled 
print(cycle3(reply))
print() # Space 

"We can write a cycle function that takes two inputs: a text string and a number n specifying how many letters to cycle."
# Write a function to decode both the message and the reply. 

message = "nyuse the balco"
reply = "inebirds on clothesl"
def cycle4 (text, n):
    cycled = ""
    i = n 
    # The first loop (starting at i=ni=n) copies the tail back to its original position.
    while i < len(text):
        cycled += text[i]
        i += 1
    i = 0 
    # The second loop (starting at i=0i=0) appends the shifted part to the end.
    while i < n:
        cycled += text[i]
        i += 1
    return cycled
print(cycle4(message, 2))
print(cycle4(reply, 3))

# The noise letters need to be removed.

message = "suparurowus our wurenus?" # clue: u's are noise
reply = "nedidtherd, pdidgedodns" # clue: d's are noise

def remove (text, to_remove):
    new_text = ""
    for letter in text:
        if letter != to_remove:
            new_text += letter
    return new_text
print(remove (message, "u")) # sparrows or wrens?
print(remove(reply, "d")) # neither, pigeons

# Letters have been swapped. 
message = "obondan the sacks" # clue: o's and a's are swapped
reply = "pegions despirseng" # clue: i's and e's are swapped

def swap (message, letter1, letter2):
    new_msg = ""
    for letter in message:
        if letter == letter1:
            new_msg += letter2
        elif letter == letter2:
            new_msg += letter1
        else:
            new_msg += letter
    return new_msg
print(swap(message, "o", "a")) # abandon the socks
print(swap(reply, "i", "e")) # pigeons dispersing

"Functions with multiple inputs can perform a wider range of tasks."

