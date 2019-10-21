# Data Types, Variables, and Arrays

## Java Is a Strongly Typed Language

- Java's safety and robustness comes from this fact
- every variable has a type, every expression has a type, and every type is strictly defined
- all assignments, whether explicit or via parameter passing in method calls, are checked for type compatibility
- Any type mismatches are errors that must be corrected before the compiler will finish compiling the class.

## The Primitive Types

Java defines eight primitive types of data: **byte**, **short**, **int**, **long**, **char**, **float**, **double**, and **boolean**

- **Integers** : byte, long, int, long (whole-values signed numbers)
- **Floating-point numbers** : float and double (numbers with fractional precision)
- **Characters** : char (symbols in a character set)
- **Boolean** : boolean (true | false values)
- The primitive types represent single values—not complex objects

### Integers

- Java defines four integer types: byte, short, int, and long. All of these are signed, positive and negative values
   - byte : smallest integer type, signed 8-bit type that has a range from –128 to 127. especially useful when working 
   with a stream of data from a network or file.
   - short : short is a signed 16-bit type. It has a range from –32,768 to 32,767. It is probably the leastused Java type
   - int : signed 32-bit type, use for control loops and to index arrays. Best option when integer is needed
   - long : long is a signed 64-bit type and is useful for those occasions where an int type is not large enough to hold
   the desired value.
   
### Floating-Point Types

- Floating-point numbers (real numbers) - used when evaluating expressions that require fractional precision.
- two types: **float** and **double**
   - float : specifies a single precision value, will become imprecise when the values are either very large or very small
   - double : Double precision is actually faster than single precision on some modern processors
           
### Characters

- **char** data type used to store characters
- Java uses Unicode to represent characters
- char is a 16-bit type
- no negative chars, eg:- char ch1 = 88; (ch1 -> X)

### Booleans
- boolean is a primitive type (for logical values)
- can have only one of two possible values, **true** or **false**
- return type of _relational operators_ is boolean, (a < b)
- boolean is also type required by the _conditional expression_

### A Closer Look at Literals
- #### Integer Literals
   - decimal(base 10), octal(base 8), hexadecimal(base 16) and etc.
   - Octal values are denoted in Java by a leading zero
   - specify hexadecimal constant with a leading zero-x, (0x or 0X) : 0 to 15, A through F ( a through f) are substitutes for 10 -15
   - Integer literals create an int value, which in Java is a 32-bit integer value.
   - When a literal value is assigned to a byte or short variable, no error is generated if the literal value is within the range of the target type.
  An integer literal can always be assigned to a long variable.
   - To denote literal types of long append an upper or lower case L to the literal (eg:- 0x7ffffffffffffffL)
   - JDK 7, can specify integer literals using binary. To do so, prefix the value with 0b or 0B (decimal 10 - 0b1010)
   - In JDK 7, can embed one or more underscores in an integer literal, easy to read large numbers (when compiling, underscores are discarded)
       - int x = 123_456_789; [ Underscores can only be used to separate digits. They cannot come at the beginning or the end of a literal ]
       - can use more than one underscore between two digits (int x = 123___456___789;)
       
- #### Floating-Point Literals
   - represent decimal values with a fractional component
   - Standard notation: eg:- 2.0 , 3.141223
   - Scientific notation: 6.022E23, 314159E–05, and 2e+100
   - Floating-point literals in Java default to double precision
   - To specify a float literal, must append an F or f to the constant
   - double literal by appending a D or d
   - JDK 7, can embed one or more underscores in a floating-point literal
       - double num = 9_423_497_862.0;
       - double num = 9_423_497.1_0_9;
       
- #### Boolean Literals
   - can have only two values : True or False
   
- #### Character Literals
   - Characters in Java are indices into the Unicode character set
   - entered inside the quotes : 'a', 'z', and '@'
   
- #### String Literals
   - eg:- "Hello World"
   
### Variables
- is the basic unit of storage
- A variable is defined by the combination of an identifier, a type, and an optional initializer
- all variables have a scope and lifetime, must be declared before used
- _type identifier [ = value ][, identifier [= value ] …];_
- variables can br initialized by constants or else dynamic initialization
- variable can br declared within any block ( A block defines a scope)
- scope determines visibility and lifetime of objects
- In Java, the two major scopes are those defined by a class and those defined by a method.
- variables declared inside a scope are not visible (that is, accessible) to code that is defined outside that scope
- Scopes can be nested. For example, each time you create a block of code, you are creating a new, nested scope.
- variables are created when their scope is entered, and destroyed when their scope is left
- The lifetime of a variable is limit to its scope

### Type Conversion and Casting
#### **Automatic type conversions**

   - will take place if the following two conditions are met
       - The two types are compatible
       - The destination type is larger than the source type
       
#### Casting Incompatible Type
   - A cast is simply an explicit type conversion. It has this general form: (target-type) value
       - eg:- (int) 12.5
   - Floating point values to integer: truncation (discard the factional component). If the size of the whole number component
    is too large to fit into the target integer type, then that value will be reduced modulo the target type’s range.

### Automatic Type Promotion in Expressions
   - If the precision required of an intermediate value will sometimes exceed the range of either operand. To handle this kind of problem, 
   Java automatically promotes each **byte, short**, or **char** operand to **int** when evaluating an expression.
   - In cases where you understand the consequences of overflow, you should use an explicit
     cast, such as
     
    byte b = 50;
    b = (byte)(b * 2);
    
#### The Type Promotion Rules
   - all **byte**, **short**, and **char** values are promoted to **int**
   - if one operand is a **long**, the whole expression is promoted to **long**
   - If one operand is a **float**, the entire expression is promoted to **float**. 
   - If any of the operands are **double**, the result is **double**.
   
### Arrays
#### 1-D Arrays
- a list of like-typed variables
- declaration: int age[]; ( just an array variable, no actual array exists)
- using new , can allocate memory and assign it to array variable
   - age = new int[10];  
- The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false
  (for boolean), or null (for reference types)
- In Java all arrays are dynamically allocated
- An array initializer is a list of comma-separated expressions surrounded by curly braces.
   - int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
- Java runtime will check to be sure that all array indexes are in the correct range.

#### N-D Arrays (Multidimensional Arrays)
- arrays of arrays
- 2-D array: int twoD[][] = new int[4][5];
- when allocating memory, need only specify the memory for the first (leftmost) dimension, can allocate the remaining dimensions separately.
 
      int twoD[][] = new int[4][];
      twoD[0] = new int[5];
      twoD[1] = new int[5];
      twoD[2] = new int[5];
      twoD[3] = new int[5];
      
- can create uneven (or irregular) multidimensional arrays
 


     
     