# -------An Overview of Java--------

## Object-Oriented Programming
	**-two paradigms:**
		process-oriented model: characterizes a program as a series of linear steps (that is, code).
		This can be thought of as code acting on data. problems appear as programs grow larger and 
		more complex.
		
		object-oriented programming:  organizes a program around its data (that is, objects) and
		a set of well-defined interfaces to that data. These programs can be characterized as data
		controlling access to code
		
##Abstraction:

    - can hide complexity through abstraction. In Java, we use abstract class and interface
to achieve abstraction. Abstraction can be managed through the use of hierarchical classifications.
For example if we take a car, we think it as a well-defined object. We do not think about individual
parts.

Encapsulation:

    - mechanism that binds together code and the data it manipulates, and protect from outside misuse.
    - protective wrap of data and code from outside access
    - access to code and data is controlled through interface
    - A class defines the structure and behavior (data and code) that will be shared by a set of objects
    - object is as instances of a class
    - power of encapsulated code is that everyone knows how to access it and thus can use it regardless
    of the implementation details

Inheritance:

    - process by which one object acquires the properties of another object
    - it supports the concept of hierarchical classification
    - Creation of one class by extending another class, so the instances of new class automatically
    inherit the attributes and behaviours of its parent class

Polymorphism: having more than one form

    - is a feature that allows one interface to be used for a general class of actions
    - one interface, multiple methods
    - it is possible to design a generic interface to a group of related activities
    - This helps reduce complexity by allowing the same interface to be used to specify a general class of action

Two Control Statements:
    If statement:
        if(condition) statement;
        condition is a boolean expression. I f condition is true, then the statement is true.