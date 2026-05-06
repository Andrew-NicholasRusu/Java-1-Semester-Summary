"Let's trace through what happens when a recursive function runs."
# In this program, how many times does line 3 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(1)
# Answer: 1
    # When stack_coins(1) runs, n is 1, so n == 1 is true. Line 3 runs once, returning 1.

# How many times does line 4 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(1)
# Answer: 0
    # Since n == 1 is true, the function returns on line 3 and never reaches line 4. Line 4 runs 0 times.

# In this program, how many times does line 3 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(2)
# Answer: 1
    # stack_coins(2) calls stack_coins(1) on line 4. Only stack_coins(1) hits the base case on line 3. So line 3 runs once.

# How many times does line 4 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(2)
# Answer: 1
    # stack_coins(2) reaches line 4 and calls stack_coins(1). Then stack_coins(1) hits the base case (line 3) instead. So line 4 runs once.

# In this program, how many times does line 3 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(6)
# Answer: 1
    # The calls chain down: stack_coins(6) → stack_coins(5) → ... → stack_coins(1). Only stack_coins(1) hits the base case on line 3. 
    # No matter how large nn is, line 3 always runs exactly once.

# How many times does line 4 run?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(6)
# Answer: 5
    # Each call from stack_coins(6) down to stack_coins(2) reaches line 4. That's 5 calls.
    # Only stack_coins(1) skips line 4 and hits the base case instead.

# When line 6 runs, which recursive function call happens next?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(6)
# Answer: stack_coins(5)
    # Line 6 calls stack_coins(6). Since 6 ≠ 1, it reaches line 4: return stack_coins(5) + 6. 
    # The next recursive call is stack_coins(5).

# When line 6 runs, which call returns a value first?

def stack_coins(n):
    if n == 1:
        return 1
    return stack_coins(n - 1) + n
total = stack_coins(6)
# Answer: stack_coins(1)
    # The calls stack up: stack_coins(6) waits for stack_coins(5), which waits for stack_coins(4), 
    # and so on down to stack_coins(1). The base case stack_coins(1) is the first to return a value.

# When line 6 runs, in what order do the calls return a value?

def queue_coins(n):
    if n == 1:
        return 5
    return 2 * queue_coins(n - 1) + 5
total = queue_coins(3)
# Answer: First queue_coins(1), then queue_coins(2), then finally queue_coins(3).
    # The base case queue_coins(1) returns first, which allows queue_coins(2) to return, which allows queue_coins(3) to return.

"When a recursive function runs, it calls itself until it reaches the base case. Then each call returns its results back to the caller."
"This is the call stack. The calls stakc up until the base case, then unwind one by one."
"Understanding call stacks is crucial to thinking recursively."