My plan for this week:

Hack 1: Work on early in the week, finish by Tuesday. Should be the easiest one to complete.

Hack 2: I haven't really been able to go over object references very much so I might need to research a little bit, however I think I'll be able to figure everything out and complete it by Wednesday or Thursday.

Hack 3: This one sounds kind of difficult to navigate but the actual plan seems simple, this means I'll have to work a little bit longer on this one but I'll figure it out by Friday, if not I'll finish it by the weekend.

# Linked Lists
Linked lists are a linear collection of data elements whose order is not given by their physical placement in memory.

# Generic T
Can be used for any "type" and represents a generic class.

# Key Learnings (Calculator)
I learned about how stacks work using the java.util.Stack import, as well as various functions like the switch, pop, and peek functions.
```
while (tokenStack.peek() != null) {
            reverse_polish.add((String)tokenStack.pop());
        }
```
The code snippet above includes both the peek and pop functions. The peek function allows us to view the topmost value on the Stack and the pop allows us to take out a value from the stack and use it as a variable.

Calculator code: https://github.com/Uhpachee/uhpachee.github.io/blob/main/src/main/java/Calculator.java

# Week 3
Selection Sort - Finds the minimum value in the unsorted array and adds it to the sorted array so that the final array is sorted in that array. Selection Sort Big O notation will always be O(n^2) since it uses 2 arrays.
Insertion Sort - Takes each value and if it's less than the one before it inserts it to the correct place in the array, essentially checks value by value and inserts each one in the correct place until the sort is complete. Insertion Sort Big O notation is equal to O(n) since it only loops through the list once.
Bubble Sort - Bubble sorts basically compares 2 adjacent values and switches them, then it'll check the entire array to see if it's all working, if it is then it'll stop iterating. Bubble Sort Big O notation changes but it can range anywhere from O(n^2) to O(n).
Merge Sort - Original array is split in half and then it merges the halves back together after they are sorted, basically keeps splitting arrays and merging them again until everything is sorted. Big O notation is O(n * log(n)), the time is a logarithmic function because the time it takes depends on how many merges and combinations it needs.
