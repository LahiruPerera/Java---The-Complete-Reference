# A Closer Look at Methods and Classes

### Overloading Methods
- In Java it is possible to define two or more methods within the same class that has same name, but with different parameter declarations.
- **Method overloading** is one of the ways that Java supports **polymorphism**
- When an overloaded method is invoked, Java uses the type and/or number of arguments as its guide to determine which 
version of the overloaded method to actually call
- overloaded methods must differ in the _type and/or number of their parameters_
-  In some cases, Java’s automatic type conversions can play a role in overload resolution.
- Method overloading supports polymorphism because it is one way that Java implements the “one interface, multiple methods” paradigm

#### Overloading Constructors
- In addition to overloading normal methods, you can also overload constructor methods.

### A Closer Look at Argument Passing

- call-by-value - This approach copies the value of an argument into the formal
                  parameter of the subroutine. Therefore, changes made to the parameter of the subroutine
                  have no effect on the argument.
                  
- call-by-reference - In this approach, a reference to an argument (not the value of the argument) is passed to
                      the parameter. Inside the subroutine, this reference is used to access the actual argument
                      specified in the call.
                      
- When you pass a **primitive type** to a method, it is **passed by value**. Thus, a copy of the argument is made, and what occurs
to the parameter that receives the argument has no effect outside the method
- When you pass an **object** to a method, the objects are passed by what is effectively **call-by-reference**

### Introducing Access Control

- Encapsulation provides another important attribute: **access control**
- How a member can be accessed is determined by the **Access modifier**
- Java’s access modifiers are **public**, **private**, and **protected**. Java also defines a **default** access level.
    - **Public** -  that member can be accessed by any other code
    - **Private** - that member can only be accessed by other members of its class
    - **Default** - the member of a class is public within its own package, but cannot be accessed outside of its package

### Static Keyword
- When a member is declared **static**, it can be accessed before any objects of its class are created
- **main()** is declared as **static** because it must be called before any objects exist
- When objects of its class are declared, no copy of a **static** variable is made. Instead, all instances of the class
 share the same **static** variable.
- Methods declared as **static** have several restrictions:
    - They can only directly call other static methods.
    - They can only directly access static data.
    - They cannot refer to this or super in any way
- **Static** methods and variables can be used outside of the class in which they are defined
    
### Introducing final
- A field can be declared as **final**. Doing so prevents its contents from being modified (making it a constant)
- It is a common coding convention to choose all uppercase identifiers for **final** fields
- Declaring a parameter **final** prevents it from being changed within the 
- Declaring a local variable **final** prevents it from being assigned a value more than once
- If a method is **final** then sub classes can not override it.

### Nested and Inner Classes
- There are two types of nested classes: _static_ and _non-static_
- A static nested class is one that has the static modifier applied. Because it is static, it must access the non-static members
  of its enclosing class through an object.
- An inner class is a non-static nested class. It has access to all of the variables and methods of its outer class and may refer
  to them directly in the same way that other non-static members of the outer class do.
- Inner class can access member variables of outer class, vice versa is not true.

### The String Class
- Every string you create is actually an object of type **String**
- objects of type **String** are immutable
- two options to change strings:
    - create a new one that contains the modifications
    - using **StringBuffer** and **StringBuilder**, which allow strings to be altered
- Strings can be constructed in a variety of ways.
    - Easiest way is: String myString = "this is a test";
- The **+** Operator is used to concatenate two strings
- The String class contains several methods:
    - **equals()** - test two strings for equality
    - **length()** - can obtain the length of a string
    - **charAt( )** - can obtain the character at a specified index within a string
    
### Command-Line Arguments
- Sometimes you will want to pass information into a program when you run it. This is accomplished by passing _command-line arguments_ to **main( )** method.
- A command-line argument is the information that directly follows the program’s name on the command line when it is executed.
- They are stored as strings in a **String** array passed to the **args** parameter of **main( )**.
- To pass command line arguments: java _classname_ _arg1 arg2 arg3_
- All command-line arguments are passed as strings.

### Varargs: Variable-Length Arguments
- Java included this feature, beginning with **JDK 5**.
- _variable-length arguments (varargs)_ - a feature that simplifies the creation of methods that need to take a variable number of arguments
- A method that takes a variable number of arguments is called a _variable-arity method_, or simply a _varargs method_.
- A variable-length argument is specified by three periods (**…**)
- A method can have “normal” parameters along with a variable-length parameter. However, the **variable-length parameter** must be the _last parameter_ declared by the method