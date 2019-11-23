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

