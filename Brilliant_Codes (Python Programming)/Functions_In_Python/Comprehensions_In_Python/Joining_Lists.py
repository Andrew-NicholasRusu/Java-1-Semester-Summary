"Let's use lists to process encrypted messages. Decode the message."

message = "whenadoaweabegin?"
# clue: a's hide spaces
for letter in message:
    if letter == "a":
        print(" ", end = "")
    else:
        print(letter, end = "") # when do we begin?
print() # Space

"Let's try programming the same task in a different way. Decode the message."

message = "theatimeraisasetaforanoon"
# clue; a's hide spaces
words = message.split("a")
print(words) # ['the', 'timer', 'is', 'set', 'for', 'noon']
for word in words:
    print(word, end = " ") # the timer is set for noon
print() # Space

"Decode the message. Use join to combine the words into a single string."

message = "ifealarmeiselouderuneaway"
# clue: e's hides spaces
words = message.split("e")
print(words) # ['if', 'alarm', 'is', 'loud', 'run', 'away']
decoded = " ".join(words)
print(decoded) # if alarm is loud run away
# split() turns a string into a list, and join() turns a list into a string. 
# The string before .join acts as a separator between elements.

"Strings can be converted to lists of strings and back again."
"This time the clue says 'yo' hides 'e'."

message = "whyoryo?"
# clue: yo hides e
pieces = message.split("yo")
decoded = "e".join(pieces)
print(decoded) # where?

"Using the empty string "" with join() concatenates strings, combining them with no separator."
"Decode the message."

message = "nokinotchenon"
# clue: no is noise
pieces = message.split("no")
decoded = "".join(pieces)
print(decoded) # kitchen

"Protip: The newline character '\n' makes a new line. Using '\n' as a join separator makes a multi-line string."
"Decode the list of messages."

messages = [
    "nusen then nelenvantorn",
    "chenck then kenttlen",
    "hinden then sanlt"
    ]
# clue: n is noise
results = []
for message in messages:
    pieces = message.split("n")
    decoded = "".join(pieces)
    results.append(decoded)
print("\n".join(results)) 
# use the elevator
# check the kettle
# hide the salt

"You used split and join to convert between strings and lists."
"When data is represented as a list, we can use list operations to process it."