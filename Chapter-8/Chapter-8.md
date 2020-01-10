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
- Whenever a subclass needs to refer to its immediate superclass, it can do so by use of the keyword **super**
- **super** has two general forms. 
    - Using super to Call Superclass Constructors
        - A subclass can call a constructor defined by its superclass by use of the following form of
          super:
          _super(arg-list);_
        - When a subclass calls **super( )**, it is calling the constructor of its immediate superclass.
        - **super( )** must always be the first statement executed inside a subclass constructor.
        
    - The second is used to access a member of the superclass that has been hidden by a member of a subclass.
        - It always refers to the superclass of the subclass in which it is used
        - _super.member_ - member can be either a method or an instance variable
        - when member names of a subclass hide members by the same name in the superclass

### Creating a multilevel hierarchy
- For example, given three classes called A, B, and C, C can be a subclass of B, which
  is a subclass of A. When this type of situation occurs, each subclass inherits all of the traits
  found in all of its superclasses. In this case, C inherits all aspects of B and A.
  
  
                A
               / 
              B
             /
            C

### When constructors are executed

### Method overriding

### Dynamic method dispatch

### Using abstract classes

### Using final with inheritance

### The object class