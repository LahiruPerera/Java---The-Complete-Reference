# Exception Handling

### Exception handling fundamentals
- A Java exception is an object that describes an exceptional (that is, error) condition that has occurred in a piece of code.
- Java exception handling is managed via five keywords: **try**, **catch**, **throw**, **throws**, and **finally**
- System-generated exceptions are automatically thrown by the Java runtime system. To manually throw an exception, use the keyword **throw**.
- The general form of an exception-handling block:


            try {
             // block of code to monitor for errors
             }
             catch (ExceptionType1 exOb) {
             // exception handler for ExceptionType1
             }
             catch (ExceptionType2 exOb) {
             // exception handler for ExceptionType2
             }
             // ...
             finally {
             // block of code to be executed after try block ends
             }


### Exception Types
- All exception types are subclasses of the built-in class **Throwable**.


                        Throwable
                           / \
                          /   \                          
                 Exception     Error
                      |
                      |
           RuntimeException
                  
                  
                  
### Uncaught Exception
- Any exception that is not caught by your program will ultimately be processed by the default handler.
- The default handler displays a string describing the exception, prints a stack trace from the point at which the exception occurred, and terminates the program.

### Using try and catch
- To guard against and handle a run-time error, simply enclose the code that you want to monitor inside a **try** block. 
- Immediately following the try block, include a catch clause that specifies the exception type that you wish to catch.

### throw
- It is possible for your program to throw an exception explicitly, using the **throw** statement.
- There are two ways to obtain a Throwable object: 
    - using a parameter in a catch clause
    - creating one with the new operator

### throws
- A **throws** clause lists the types of exceptions that a method might throw. This is necessary for all exceptions, except those
of type **Error** or **RuntimeException**, or any of their subclasses. All other exceptions that a method can throw must be declared in the **throws** clause.

### finally
- **Finally** creates a block of code that will be executed after a **try** /**catch** block has completed and before the code following the **try**/**catch** block. 
- The **finally** block will execute whether or not an exception is thrown. 
- If an exception is thrown, the **finally** block will execute even if no **catch** statement matches the exception.
- Any time a method is about to return to the caller from inside a **try**/**catch** block, via an uncaught exception or an explicit return
  statement, the finally clause is also executed just before the method returns.
- The **finally** clause is optional. However, each **try** statement requires at least one **catch** or a **finally** clause.

### Creating your own exception subclass
- Just define a subclass of Exception
- Your subclasses don’t need to actually implement anything — it is their existence in the type system that allows you to use them as exceptions
- The Exception class does not define any methods of its own. It does, of course, inherit those methods provided by Throwable. 
- Thus, all exceptions, including those that you create, have the methods defined by Throwable available to them.

### Chained Exceptions
- Introduced with JDK 1.4.
- The chained exception feature allows you to associate another exception with an exception. This second exception describes the cause of the first exception.
- To allow chained exceptions, two constructors and two methods were added to **Throwable**. The constructors are shown here:
    - Throwable(Throwable causeExc)
    - Throwable(String msg, Throwable causeExc)
- These 2 constructors have also been added to the **Error**, **Exception**, and **RuntimeException** classes.
- The chained exception methods supported by **Throwable** are **getCause( )** and initCause( ).
- The **getCause( )** method returns the exception that underlies the current exception. If there is no underlying exception, null is returned.
- The **initCause( )** method associates _causeExc_ with the invoking exception and returns a reference to the exception. Thus, you
  can associate a cause with an exception after the exception has been created. However, the cause exception can be set only once. 
  Thus, you can call initCause( ) only once for each exception object.
- Chained exceptions can be carried on to whatever depth is necessary.

### 3 recently added exception features
- The first automates the process of releasing a resource, such as a file, when it is no longer needed. It is based on an expanded form of the **try** statement called
  _try-with-resources_.
- The second feature is called _multi-catch_.
    - The multi-catch feature allows two or more exceptions to be caught by the same **catch** clause.
    - Instead of having to catch each exception type individually, you can use a single **catch** clause to handle all of the
      exceptions without code duplication.
    - To use a multi-catch, separate each exception type in the **catch** clause with the **OR** operator.

- Third is sometimes referred to as _final rethrow_ or _more precise rethrow_.
    - This feature restricts the type of exceptions that can be rethrown to only those checked exceptions that the associated 
    try block throws, that are not handled by a preceding catch clause, and that are a subtype or supertype of the parameter.

### Using exceptions
- Java’s exception-handling statements should not be considered a general mechanism for nonlocal branching.