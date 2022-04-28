{% include navigation.html %}

# 2015 MCQ Revisions
(Due to timing issues, I just put random answers on questions 33-39, so those won't be covered)

##### Q9
A pair of number cubes is used in a game of chance. Each number cube has six sides, numbered from 1 to 6, inclusive, and there is an equal probability for each of the numbers to appear on the top side (indicating the cube's value) when the number cube is rolled. The following incomplete statement appears in a program that computes the sum of the values produced by rolling two number cubes.

`int sum = / * missing code * / ;`

Which of the following replacements for `/* missing code */` would best simulate the value produced as a result of rolling two number cubes?

Answer I put: (int) (Math.random() * 6) + (int) (Math.random() * 6)

Correct Answer: 2 + (int) (Math.random() * 6) + (int) (Math.random() * 6)

Explanation: When using Math.random() a random number from 0 to 1 is generated, then multiplied by 6, then rounded down to the nearest integer. Since it rounds down, we have to add 1 to the answer in order to make it possible to even get a value of 6 we have to add 1 to the integer. Since there are 2 die, we add 2.


##### Q16
Consider the following Method.

![](https://assets.learnosity.com/organisations/537/media.academicmerit.com/1c66114d1c62420b323b901f83f53e11/original.jpg)

Which of the following best describes what is returned by the calculate method?

Answer I put: The largeset value in the two-dimensional array

Correct Answer: The column index of an element with the largest value in the two-dimensional array

Explanation: For this question, I understood the algorithm correctly and was able to figure out what it did, however what I didn't see is that instead of setting result to row[y], it sets it to just y, which was the index at which the largest value was at.


##### Q23
Consider the following code segment from an insertion sort program.

![](https://assets.learnosity.com/organisations/537/media.academicmerit.com/65c604f06409ab0b0641367b9142f98f/original.jpg)

Assume that array arr has been defined and initialized with the values {5,4,3,2,1}. What are the values in array arr after two passes of the for loop (i.e., when j = 2 at the point indicated by `/ * end of loop * /`) ?

Answer I put: {3, 5, 2, 3, 1}

Correct Answer: {3, 4, 5, 2, 1}

Explanation: In the algorithm, it starts with the 2nd value, checks if it's less than the one before it, and if it is it'll set itself to the value before it. The first iteration ends up with {4,5,3,2,1}. In the second iteration, it starts with the third value and sorts from there, so it would end up as {3,4,5,2,1}.


##### Q26
Consider the following 2 methods, which appear in a single class.

![](https://assets.learnosity.com/organisations/537/media.academicmerit.com/b95c26a3cc8f679129c850612502ca36/original.jpg)

What is printed as a result of the call start()?

Answer I put: 0 0 0 0 0 6 blackboard

Correct Answer: 1 2 3 4 5 6 blackboard

Explanation: If we look at the algorithm, the changeIt method does change a 5 int long array into all 0's, however at the beginning of the method, we see that a new array is created with the same name as the parameter. This is meant to make it confusing, but basically it means that it changes the values of that new array, instead of the inputted array in the parameter. This means that this method does nothing to affect the final output, leaving the beginning as 12345 instead of 00000.
