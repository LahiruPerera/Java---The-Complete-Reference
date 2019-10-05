# The history and evolution of Java

- Java is related to C++(which is a direct descendant of C)
- Java derived its syntax from C.
- Java's Object Oriented feature from C++.

- C is the first structured, efficient, high-level language.
- C is a language designed by and for programmers.
- C++ extends C by adding object-oriented features.

## Java Applets
   - An applet is a special kind of Java program that is designed to be transmitted over the Internet and automatically 
   executed by a Java-compatible web browser. (small programs)
   - Applet allows some functionality to be moved from the server to the client.
   - Applets dynamically extend the functionality of a web browser
   - Security : by limiting an applet to the Java execution environmentand not allowing it access to other parts of the 
   computer
   - Portability : java compiler generates the bytecode. The bytecode is platform independent.
	(can run on any platform or machine) HotSpot provides a Just-In-Time (JIT) compiler for bytecode.
	
## Servlets
   - A servlet is a small program that executes on the server. 
   - Servlets dynamically extend the functionality of a web server
   - Servlets are used to create dynamically generated content that is then served to the client.
	
### The Java Buzzwords

- **Simple** : 

    Java is very easy to learn, and its syntax is simple, clean and easy to understand. (most features are inherited 
from C/C++)
	
- **Object-Oriented** :

    Java is an object-oriented programming language. Everything in Java is an object. Object-oriented means we organize 
    our software as a combination of different types of objects that incorporates both data and behavior.
    
	*Basic concepts of OOPs* are:
	
		- Object
		- Class
		- Inheritance
		- Polymorphism
		- Abstraction
		- Encapsulation

- **Robust** :

    *program must execute reliably.* Java is robust because:
    
		- It uses strong memory management.
		- There is a lack of pointers that avoids security problems.
		- There is automatic garbage collection in java which runs on the Java Virtual Machine to get rid of objects 
		which are not being used by a Java application anymore.
		- There are exception handling and the type checking mechanism in Java. All these points make Java robust.
		
- **Architecture neutral** :

	Java is architecture neutral because there are no implementation dependent features, for example, the size of
	primitive types is fixed.
	
- **Interpreted & High Performance** :

    Java is faster than other traditional interpreted programming languages because Java bytecode is "close" to native 
    code.
	
- **Multithreaded** :

    A thread is like a separate program, executing concurrently. Multithreaded  allows you to write programs that do many
    things simultaneously. The main advantage of multi-threading is that it doesn't occupy memory for each thread. It 
    shares a common memory area.
	
- **Distributed** :

    It facilitates users to create distributed applications.RMI and EJB are used for creating distributed applications. 
    This feature enables a program to invoke methods across a network
	
- **Dynamic** :

    Java is a dynamic language. It supports dynamic loading of classes. It means classes are loaded on demand.
	
Java supports dynamic compilation and automatic memory management (garbage collection).

Few important features provided by **JAVA 8**:

   - Lambda expressions
   - Method references
   - Functional interfaces
   - Stream API
   - Default methods
