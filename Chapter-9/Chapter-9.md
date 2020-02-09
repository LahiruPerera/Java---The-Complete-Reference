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

### Default Interface Method

### Use static Methods in an Interface


