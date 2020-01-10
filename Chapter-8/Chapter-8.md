# Inheritance
- It allows the creation of hierarchical classifications.
- A class that is inherited is called a _superclass_.
- The class that does the inheriting is called a _subclass_.
- Therefore, a **subclass** is a specialized version of a **superclass**.
- It inherits _all of the members_ defined by the superclass and adds its own, _unique elements_.
- This OOP concept promote **code re-usability**.

### Inheritance Basics

- The subclass has access to all **public members**(attributes and methods) of its superclass.


        The general form of a class declaration that inherits a superclass is shown here:
        class subclass-name extends superclass-name {
         // body of class
        }

- Subclass cannot access those members of the superclass that have been declared as **private**.
- In a class hierarchy, private members remain private to their class. ( accessible only inside the class )
- A class member that has been declared as private will remain private to its class. It is not
  accessible by any code outside its class, including subclasses.
  
#### A Superclass Variable Can Reference a Subclass Object
- A reference variable of a superclass can be assigned a reference to any subclass derived
  from that superclass.
- If we assign a subclass object to a superclass reference, then using that **superclass reference** we **can not access** member 
  variables which are **specific to subclass**.
- We have access only to parts which are defined by the superclass.
- Superclass has no knowledge about what a subclass add to it.  
  
### Using super

### Creating a multilevel hierarchy

### When constructors are executed

### Method overriding

### Dynamic method dispatch

### Using abstract classes

### Using final with inheritance

### The object class