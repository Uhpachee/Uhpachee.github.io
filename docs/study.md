{% include navigation.html %}

# Java Study Guide

**Abstract Class**
An abstract class is a class that can only be used when inherited, it can’t be run on its own to create its own object

**Inheritance**
A class can inherit another class to gain the properties of the inherited class, the inherited class is called the “parent class”, if the class makes a method that has the same name as that of one in the parent class, it will override the code in the parent method

**Debugging**
While doing the MCQs, make sure to debug the code and see if it actually works, a lot of the time like in Q26 they give code that looks like it has a certain function but in actuality it doesn’t do anything, in Q26 they had a method that looked like it edited a parameter and changed it but in actuality it created a new array of the same name as the parameter and changed that, so the actual thing that was inputted as the parameter wasn’t changed
**
Interface**
An interface is an abstract class that can only be used when implemented by another class. It only contains empty methods that will be coded in the other class.
The methods would look like this: public static void method(int a);
Implementation would look like this: public class test implements interfaceName {

