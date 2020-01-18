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
- In a class hierarchy, constructors complete their execution in order of derivation, from superclass to subclass. 

### Method overriding
- When an overridden method is called from within its subclass, it will always refer to the version of that method defined by the subclass
- The version of the method defined by the superclass will be hidden.
- If you wish to access the superclass version of an overridden method, you can do so by using **super**. ( super.methodName() )
- Method overriding occurs only when the names and the type signatures of the two methods are identical.
- If they are not, then the two methods are simply overloaded

### Dynamic method dispatch
- Method overriding forms the basis for one of Java’s most powerful concepts: dynamic method dispatch
- Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than
  compile time. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.
- _A superclass reference variable can refer to a subclass object_.
- When different types of objects are referred to, different versions of an overridden method
  will be called. In other words, _it is the type of the object being referred to_ (not the type of the
  reference variable) that determines which version of an overridden method will be executed.

### Using abstract classes
- **Abstract methods** should be overridden by subclasses.
- Any class that contains one or more abstract methods must also be declared abstract
- Must be declared with an **abstract** keyword.
- Can have abstract and non-abstract methods (  concrete methods are also allowed in abstract classes ).
- Can not be instantiated. ( no objects of an abstract class )
- Such objects would be useless, because an abstract class is not fully defined
- Cannot declare abstract constructors, or abstract static methods
- Any subclass of an abstract class must either _implement all of the abstract methods_ in the superclass, or be _declared abstract_ itself
- Can have final methods

### Using final with inheritance

### The object class