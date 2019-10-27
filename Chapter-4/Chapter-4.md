# Operators

Operators can be divided into the four groups: 
- arithmetic
- bitwise
- relational
- logical

### Arithmetic Operators
- used in mathematical expressions in the same way that they are used in algebra
- The basic arithmetic operations—**addition**, **subtraction**, **multiplication**, and **division**
- The unary minus operator negates its single operand
- The unary plus operator simply returns the value of its operand
- **The Modulus Operator** -  %, returns the remainder of a division operation. It can be  applied to floating-point 
types as well as integer types
   - 42.5 mod 10 = 2.25
- **Arithmetic Compound Assignment Operators**
   - var = var op expression; -> var op= expression;
   - +=, *=, -=, /=, %=
   - a = a + 2; -> a += 2;
   - a = a % 2; -> a %= 2;
- **Increment and Decrement**
   - The increment operator increases its operand by one (++)
   - The decrement operator decreases its operand by one (--)
   - can appear as prefix or postfix
   
### The Bitwise Operators
- Java defines several bitwise operators that can be applied to the integer types: long, int, short,char, and byte. 
- These operators act upon the **individual bits** of their operands
-  Java uses an encoding known as two’s complement, which means that negative numbers are represented by inverting 
   (changing 1’s to 0’s and vice versa) all of the bits in a value, then adding 1 to the result.
   
#### The Bitwise Logical Operators
- The Bitwise NOT ( bitwise complement, the unary NOT operator )
   - 00101010 becomes 11010101
- The Bitwise AND
   - The AND operator, &, produces a 1 bit if both operands are also 1
   
         00101010 42
        
         &00001111 15
   
         __________
         
         00001010 10
- The Bitwise OR
   - The OR operator, |, combines bits such that if either of the bits in the operands is a 1, then
     the resultant bit is a 1
     
- The Bitwise XOR
   - The XOR operator, ^, combines bits such that if exactly one operand is 1, then the result
  is 1. Otherwise, the result is zero
  
#### The Left Shift (* by 2^n)
- The left shift operator, <<, shifts all of the bits in a value to the left a specified number of times. It has this 
    general form:
   - value << num
   - each left shift has the effect of doubling the original value ( multiplying by 2)
   - 64 << 1 = 128
   - 64 << 2 = 256
   - If you shift a 1 bit into the high-order position (bit 31 or 63), the value will become negative
   
#### The Right Shift (/ by 2^n)
- The right shift operator, >>, shifts all of the bits in a value to the right a specified number of times. Its general 
form is shown here:
   - value >> num
   - Each time you shift a value to the right, it divides that value by two—and discards any
     remainder
   
   int a = 32;
   
   a = a >> 2; // a now contains 8
   
   int a = 35;
   
   a = a >> 2; // a contains 8
   
#### The Unsigned Right Shift (>>>)
- always shifts zeros into the high-order bit

      int a = -1;
    
      a = a >>> 24;
    
      11111111 11111111 11111111 11111111 –1 in binary as an int
    
      >>> 24 

      00000000 00000000 00000000 11111111 255 in binary as an int
    
#### Bitwise Operator Compound Assignments

    a = a >> 4; // a=1
    a >>= 4;
      001
    >>100
    -------
      101
      
### Relational Operators
- ==  :arrow_right:  Equal to
- !=  :arrow_right:  Not equal to
- \>  :arrow_right:  Greater than
- <   :arrow_right:  Less than
- \>= :arrow_right:  Greater than or equal to
- <=  :arrow_right:  Less than or equal to

### Boolean Logical Operators
- & :arrow_right: Logical AND
- | :arrow_right: Logical OR
- ^ :arrow_right: Logical XOR (exclusive OR)
- || :arrow_right: Short-circuit OR
- && :arrow_right: Short-circuit AND
- ! :arrow_right: Logical unary NOT
- &= :arrow_right: AND assignment
- |= :arrow_right: OR assignment
- ^= :arrow_right: XOR assignment
- == :arrow_right: Equal to
- != :arrow_right: Not equal to
- ?: :arrow_right: Ternary if-then-else

#### Short-Circuit Logical Operators
- A && B (short circuit AND) :arrow_right: If A is true then B will be evaluated. If A is false, then B will not be
evaluated.
- A || B (short circuit OR) :arrow_right: If A is true then result will be true.(no matter what B is) If A is false then
evaluation of B will determine the final result.

### The Assignment Operator
- var = expression;
-  it allows to create a chain of assignments:
               
    
        int x, y, z;
    
        x = y = z = 100; // set x, y, and z to 100
    
### The ? Operator
- expression1 ? expression2 : expression3
   - expression1 can be any expression that evaluates to a boolean value
   - If expression1 is true, then expression2 is evaluated
   - otherwise, expression3 is evaluated
   
### Operator Precedence
- the order of precedence for Java operators, range from highest to lowest (ses the table)
- Operators in the same row are equal in precedence. 
- In binary operations, the order of evaluation is left to right (except for assignment, which evaluates right to left). 
- Although the **[ ]**, **( )**, and **.** are technically separators, can also act like operators. In that capacity, they would have the highest precedence. 
- Also, notice the arrow operator (**->**). It was added by JDK 8 and is used in lambda expressions.
    
### Using Parentheses
- using parentheses we can explicitly determine in which order, the expression should be evaluated. (altering the normal precedence of an operator)
- can be used to help clarify the meaning of an expression
- adding parentheses won't degrade the performance of the program (no negative effects)