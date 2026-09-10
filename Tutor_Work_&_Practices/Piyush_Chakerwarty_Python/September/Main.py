"Methods in the list:"

numbers = [2, 4, 6, 8, 10]
numbers.insert (2, 100)
odds = [1, 3, 5, 7, 9]
numbers.extend(odds)
print (numbers)

'Remove items from the list:'
# remove(): it can remove the item from the list directly
numbers.remove(8)
print(numbers)

# pop(): it removes the last item from the list.
numbers.pop()
print (numbers)

# pop(index): it removes the item at specified index in the list 
numbers.pop(5)
print (numbers)

# we can store the item being popped out by saving the popped item separately 
popped = numbers.pop(5) 
print("Popped Item:", popped) # Popped item: 3
print(numbers) 

# sort(): it arranges all the items sorted in ascending order 
# // Ascending order:
numbers.sort() 
print(numbers) 

# // Descending order:
numbers.sort(reverse = True)
print(numbers)

# reverse(): it reverses the current arrangement of the items in the list 
numbers.reverse()
print(numbers)

pos = numbers.index(5)
print(pos)

# count(): it counts the occureences of each item of the list
pos = numbers.count(5)
print(pos)

'Contatenation: joining 2 lists using a + operator'
numbers = [2, 4, 6, 8, 10]
nums = [1, 3, 5, 7, 9]
print(numbers + nums)

'Membership Operator (in):'
#  Check if the left hand side value is present in the list or not. 
# if it is present, it will return true. If it is not present, it will return false 

numbers = [2, 4, 6, 7, 10]
nums = [1, 3, 5, 7, 9]
print(1 in numbers) # False
print(1 in nums) # True

# clear(): it removes all the items from the list and makes the list empty
numbers. clear()
print(numbers)