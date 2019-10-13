# An Overview of Java

## Object-Oriented Programming

**two paradigms:**

*process-oriented model:*

   characterizes a program as a series of linear steps (that is, code).This can be thought of as code acting on data. 
   problems appear as programs grow larger and more complex.
	
*object-oriented programming:*
  
   organizes a program around its data (that is, objects) and a set of well-defined interfaces to that data. These 
   programs can be characterized as data controlling access to code
		
### Abstraction:

   - can hide complexity through abstraction. In Java, we use abstract class and interface to achieve abstraction. 
Abstraction can be managed through the use of hierarchical classifications. For example if we take a car, we think it as
a well-defined object. We do not think about individual parts.

### Encapsulation:

   - mechanism that binds together code and the data it manipulates, and protect from outside misuse.
   - protective wrap of data and code from outside access
   - access to code and data is controlled through interface
   - A class defines the structure and behavior (data and code) that will be shared by a set of objects
   - object is as instances of a class
   - power of encapsulated code is that everyone knows how to access it and thus can use it regardless of the 
   implementation details

### Inheritance:

   - process by which one object acquires the properties of another object
   - it supports the concept of hierarchical classification
   - Creation of one class by extending another class, so the instances of new class automatically inherit the attributes
    and behaviours of its parent class

### Polymorphism: *having more than one form*

   - is a feature that allows one interface to be used for a general class of actions
   - one interface, multiple methods
   - it is possible to design a generic interface to a group of related activities
   - This helps reduce complexity by allowing the same interface to be used to specify a general class of action

### Two Control Statements:

   **If statement**:
   
   *if(condition) statement;*
   
   - condition is a boolean expression. If condition is true, then the statement is executed. If condition is false, then
   the statement is bypassed.
   
   **The for Loop**:
   
   *for(initialization; condition; iteration) statement;*
   
   - *initialization* portion of the loop sets a loop control variable to an initial value.
   - *condition* is a boolean tha tests the loop control variable. If it is true, then continues to iterate. If it is 
   false, the loop terminate.
   - iteration determines how the loop control variable is changed each time when the loop iterate

### Using blocks of code

   - two or more statements can be grouped into *blocks of code (code blocks)*
   
### Lexical Issues

   - atomic elements of Java
   - Java programs are a collection of whitespace, identifiers, literals, comments, operators, separators, and keywords
   
   **Whitespace**
   
   - Java is a free-form language. ( no need to follow any special indentation rules )
   - In Java, whitespace is a space, tab, or newline
   
   **Identifiers**
   
   - Identifiers are used to name things, such as classes, variables, and methods
   - must not begin with a number
   - Java is case-sensitive, so VALUE is a different identifier than Value
   - NOTE Beginning with JDK 8, the use of an underscore by itself as an identifier is not recommended.

   **Literals**
   
   - A constant value in Java is created by using a literal representation of it
   - A literal can be used anywhere a value of its type is allowed.
   
   **Comments**
   
   - Three types of comments:
       - single-line
       - multiline
       - documentation comment (/** */)
   
   **Separators**
   
   - Parentheses - ()
   - Braces - {}
   - Brackets - []
   - Semicolon - ;
   - Comma - ,
   - Period - .
   - Colons - :: - used to create a method or constructor reference (Added by JDK 8)
   
   **The java Keywords**
   
   - There are 50 keywords currently defined in Java
   - These keywords cannot be used as identifiers. Thus, they cannot be used as names for a variable, class, or method
   - also reserves true, false and null