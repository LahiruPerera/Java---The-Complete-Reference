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
- **Finally** creates a block of code that will be executed after******** a **try** /**catch** block has completed and before the code following the **try**/**catch** block. 
- The **finally** block will execute whether or not an exception is thrown. 
- If an exception is thrown, the **finally** block will execute even if no **catch** statement matches the exception.
- Any time a method is about to return to the caller from inside a **try**/**catch** block, via an uncaught exception or an explicit return
  statement, the finally clause is also executed just before the method returns.
- The **finally** clause is optional. However, each **try** statement requires at least one **catch** or a **finally** clause.

### Java's Built-in Exceptions

### Creating your own exception subclass

### Chained Exceptions

### 3 recently added exception features

### Using exceptions