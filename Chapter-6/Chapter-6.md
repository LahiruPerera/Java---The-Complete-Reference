# Introducing Classes

- A class is a user defined _blueprint_ or _prototype_ from which objects are created.
- An object is an _instance_ of a class
- It represents the set of properties or methods that are common to all objects of one type.

Syntax

    class <class_name>
    {  
        field;  
        method;  
    }
    
### Class Fundamentals

#### The General Form of a Class

    class classname 
    {
     type instance-variable1;
     type instance-variable2;
      // ...
      type instance-variableN;
      
      type methodname1(parameter-list) {
      // body of method
      }
      type methodname2(parameter-list) {
      // body of method
      }
      // ...
      type methodnameN(parameter-list) {
      // body of method
      }
     }
     
- The data, or variables, defined within a **class** are called instance variables
- the methods and variables defined within a class are called **members** of the class
- Variables defined within a class are called _instance variables_ because each instance of
  the class (that is, each object of the class) contains its own copy of these variables.

#### A Simple Class

`Eg:- A class called Box that defines three instance variables: width, height, and depth.` 

    class Box {
     double width;
     double height;
     double depth;
    }
    
    Box mybox = new Box(); // create a Box object called mybox

- Every **Box** object will contain its own copies of the instance variables **width**, **height**, and **depth**. To
 access these variables, you will use the dot (.) operator.
- The dot operator can be used to access both the instance variables and the methods within an object
- Changes to the instance variables of one object have no effect on the instance variables of another

### Declaring Objects

    Box mybox = new Box();
    Box mybox; // declare reference to object
    mybox = new Box(); // allocate a Box object
    
- The **new** operator dynamically allocates memory for an object during run time
- A constructor defines what occurs when an object of a class is created.
- If no explicit constructor is specified, then Java will automatically supply a default constructor.
- For create an object of integer or character , do not need to use **new**, reason is they are primitive types and aren't 
implemented as objects. They are implemented as _normal_ variables.
- Object version of primitive type can be used in situation where we need complete objects of the primitive type.

### Introducing Methods

    General form of a method:
    
    type name(parameter-list) {
     // body of method
    }
    
- _Type_ specifies the type of data returned by the method. This can be any valid type, including class types that you create.
  If the method does not return a value, its return type must be **void**.
- The name of the method is specified by _name_
- The _parameter-list_ is a sequence of type and identifier pairs separated by commas.
- Methods that have a return type other than **void** return a value to the calling routine using the return statement.

### Constructors
- Java allows objects to initialize themselves when they are created. This automatic initialization is performed through the use of a
  constructor
- A _constructor_ initializes an object immediately upon creation
- It has the same name as the class name
- The constructor is automatically called when the object is created, before the new operator completes.
- Constructor has no return type

### The this Keyword
- Sometimes a method will need to refer to the object that invoked it. 
- To allow this, Java defines the **this** keyword. **this** can be used inside any method to refer to the current object.
- **Instance Variable Hiding**
    - when a local variable has the same name as an instance variable, the **local variable** _hides_ the
  **instance variable**.
    - If instance and local variables has the same names, then using **this** we can refer to the object

### Garbage Collection
- Objects are dynamically allocated by using the **new** operator, and such objects must be destroyed and their memory need to be released for later reallocation.
- Java handles deallocation for you automatically. The technique that accomplishes this is called _garbage collection_.
- When no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed.

### The finalize( ) Method
- Sometimes an object will need to perform some action when it is destroyed.
- To handle such situations, Java provides a mechanism called _finalization_.
- To add a finalizer to a class, you simply define the **finalize( )** method
- Right before an asset is freed, the Java run time calls the **finalize( )** method on the object.


    The finalize( ) method has this general form:
    
      {
       // finalization code here
       }     protected void finalize( )

- We cannot know when—or even if—**finalize( )** will be executed. Therefore, your program should provide other means of releasing system resources, etc., used by the object.

### A Stack Class
- The class is the mechanism by which **encapsulation** is achieved in Java.
- By creating a class, you are creating a new data type that defines both the nature of the data being manipulated and the routines used to
  manipulate it.
- A stack store data using _LIFO (Last in first out)_ order. (First in, Last out)
- To put an item on top of the stack, you will use **push**. To take an item off the stack, you will use **pop**.