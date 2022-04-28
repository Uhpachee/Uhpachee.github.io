# 2015 MCQ Revisions
(Due to timing issues, I just put random answers on questions 33-39, so those won't be covered)

##### Q9
A pair of number cubes is used in a game of chance. Each number cube has six sides, numbered from 1 to 6, inclusive, and there is an equal probability for each of the numbers to appear on the top side (indicating the cube's value) when the number cube is rolled. The following incomplete statement appears in a program that computes the sum of the values produced by rolling two number cubes.

`int sum = / * missing code * / ;`

Which of the following replacements for `/* missing code */` would best simulate the value produced as a result of rolling two number cubes?

Answer I put: (int) (Math.random() * 6) + (int) (Math.random() * 6)
Correct Answer: 2 + (int) (Math.random() * 6) + (int) (Math.random() * 6)
Explanation: When using Math.random() a random number from 0 to 1 is generated, then multiplied by 6, then rounded down to the nearest integer. Since it rounds down, we have to add 1 to the answer in order to make it possible to even get a value of 6 we have to add 1 to the integer. Since there are 2 die, we add 2.


##### Q
