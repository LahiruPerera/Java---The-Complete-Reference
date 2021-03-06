# Packages and Interfaces
- _Packages_ are containers for classes.
- A class can implement more than one interface.
- A class can only inherit a single superclass. ( Java does not support multiple inheritance )

### Packages
- The package is both a naming and a visibility control mechanism.
- To create a package is quite easy: simply include a package command as the first statement in a Java source file.
- A package hierarchy must be reflected in the file system of your Java development system. (packages are mirrored by directories) 

### Access Protection
- There are four types of Java access modifiers:
    - **Private**: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    - **Default**: The access level of a default modifier is only within the package (subclass and non-subclass within the same package). 
    It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    - **Protected**: The access level of a protected modifier is within the package and outside the package through child class. 
    If you do not make the child class, it cannot be accessed from outside the package.
    - **Public**: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
    within the package and outside the package.
    
    
   | Access modifier | within class | within package | outside package subclass | outside package non-subclass |
   | :---            |     :---     |     :---       |     :---                 |          :---                |
   | private         | y            | n              | n                        | n                            |
   | default         | y            | y              | n                        | n                            |
   | protected       | y            | y              | y                        | n                            |
   | public          | y            | y              | y                        | y                            |

### Importing Packages
- This is the general form of the import statement:


        import pkg1 [.pkg2].(classname | *);

- All of the standard Java classes included with Java are stored in a package called **java**.
- The basic language functions are stored in a package inside of the java package called **java.lang**.
- **java.lang** is implicitly imported by the compiler for all programs.
- when a package is imported, only those items within the package declared as public will be available to non-subclasses in the importing code

### Interfaces
- Using the keyword **interface**, you can fully abstract a class’ interface from its implementation.
- Using interface, you can specify what a class must do, but not how it does it.
- These are syntactically similar to classes, but they lack instance variables, and their methods are declared without any body.
- Any number of classes can implement an interface. (  one class can implement any number of interfaces )
- By providing the **interface** keyword, Java allows you to fully utilize the “one interface, multiple methods” aspect of polymorphism.
- Interfaces are designed to support dynamic method resolution at run time.
- For interfaces with default access, the interface is only available to other members of the package in which it is declared
- When it is declared as public, the interface can be used by any other code.
- In JDK 8, it is possible to add a _default implementation_ to an interface method.
- The addition of default methods does not change a key aspect of interface.
- The default method implementation by a class is optional.

### Use static Methods in an Interface
- JDK 8 added another new capability to **interface**: the ability to define one or more **static** methods
- No implementation of the interface is necessary, and no instance of the interface is required, in order to call a static method
- Static interface methods are not inherited by either an implementing class or a subinterface.

