# Control Statements
- A programming language uses control statements **to cause the flow of execution to advance and branch based on changes to the state of a program**
- **Control statements** can be categorized as: 
   - **selection** - Selection statements allow a program to choose different paths of execution based upon the outcome of an
                 expression or the state of a variable
   - **iteration** - Iteration statements enable program execution to repeat one or more statements (that is, iteration statements form loops)
   - **jump** - Jump statements allow a program to execute in a nonlinear fashion

### Java’s Selection Statements
- Java supports two selection statements:
   - **if**
   - **switch**
- allow to control the flow of the program’s execution based upon conditions known only during run time

#### if
- The **if** statement is Java’s conditional branch statement
- It can be used to route program execution through two different paths


        if (condition) statement1;
        else statement2;
    
   -  _statement_ may be a single statement or a compound statement enclosed in curly braces (that is, a _block_). The _condition_ is any expression that returns a **boolean** value. The
      **else** clause is optional.
- only one statement can appear directly after the **if** or the **else**. To include more statements, need to create a _block_

#### Nested ifs
- A _nested_ **if** is an **if** statement that is the target of another **if** or **else**

   
        if(i == 10) 
        {
            if(j < 20) a = b;
            if(k > 100) c = d; // this if is
            else a = c; // associated with this else
        }
        else a = d; // this else refers to if(i == 10)

#### The if-else-if Ladder
- based upon a sequence of _nested ifs_


        if(condition)
         statement;
        else if(condition)
         statement;
        else if(condition)
         statement;
        .
        .
        .
        else
         statement;

- The **if** statements are executed from the top down
- As soon as one of the conditions controlling the **if** is true, the statement associated with that **if** is executed, and the rest of the ladder is bypassed.
- If none of the conditions is true, then the final **else** statement will be executed.
- The final **else** acts as a default condition; that is, if all other conditional tests fail, then the last **else** statement is performed.

#### switch
- The **switch** statement is Java’s multi-way branch statement
- It provides an easy way to dispatch execution to different parts of your code based on the value of an expression
- A better alternative than a large series of if-else-if statements


        switch (expression) {
         case value1:
         // statement sequence
         break;
         case value2:
         // statement sequence
         break;
        .
        .
        .
         case valueN :
         // statement sequence
         break;
         default:
         // default statement sequence
        }
        
- The value of the **expression** is compared with each of the values in the **case statements**.
- If a match is found, the code sequence following that **case statement** is executed.
- If none of the constants matches the value of the expression, then the **default** statement is executed.
- However, the **default** statement is optional.
- The **break** statement is used inside the switch to terminate a statement sequence.
- When a break statement is encountered, execution pass to the first line of code that follows the entire switch statement (_jumping out of the switch_)
- If you omit the break, execution will continue on into the next case
- switching on **strings** can be more expensive than switching on integers
- don’t use strings in a switch unnecessarily
- The switch differs from the if in that switch can only test for equality, whereas if can evaluate any type of Boolean expression
- When Java compiler compiles a switch statement, the Java compiler will inspect each of the case constants and create a
“jump table” that it will use for selecting the path of execution depending on the value of the expression. 
 
### Iteration Statements
- Java's iteration statements:
   - for
   - while
   - do-while

#### while

    while(condition) {
     // body of loop
    }
    
- The condition can be any Boolean expression.
- The body of the loop will be executed as long as the conditional expression is true.
- When condition becomes false, control passes to the next line of code immediately following the loop
- If the condition is false then body of the while loop will not execute even once

#### do-while
- even if the conditional expression is false, execute the body of a loop at least once
- test the termination expression at the end of the loop rather than at the beginning

    do {
         // body of loop
        } while (condition);
        
#### for
- Two forms of **for** loop:
   - **for**
   - **for-each**

#### for

    for(initialization; condition; iteration) {
     // body
    }
    
- initialization - sets the value of the loop control variable, which acts as a counter that controls the loop
- condition - must be a boolean expression, tests the loop control variable against a target value. If true, then body of the loop is executed.
Else, the loop terminates.
- iteration - an expression that increments or decrements the loop control variable
- Can declare Loop Control Variables inside or outside of the for Loop
- To allow two or more variables to control a for loop, Java permits you to include multiple statements in both the initialization and iteration portions of the **for**. Each
  statement is separated from the next by a comma.
  
#### The For-Each Version of the for Loop
- This was introduced by beginning with JDK 5.
- A for-each style loop is designed to cycle through a collection of objects, such as an array, in strictly sequential fashion, from start to finish.
- The for-each style of for is also referred to as the enhanced for loop

    
    General form of for each
    for(type itr-var : collection) statement-block
    type - the type
    itr-var - the name of an iteration variable
    collection - the collection being cycled through
    
-  With each iteration of the loop, the next element in the collection is retrieved and stored in itr-var. 
- The loop repeats until all elements in the collection have been obtained
- The iteration variable of for-each loop is _read-only_.
- the **for** can cycle through the elements of any collection of objects


- **Nested Loops** - apply one loop inside another loop

### Jump Statements
- Java supports three jump statements: **break**, **continue**, and **return**. These statements transfer
 control to another part of the program
 
#### Break
- the **break** statement has three uses:
    - it terminates a statement sequence in a **switch** statement
    
    - it can be used to exit a loop :
        - By using break, can force immediate termination of a loop, bypassing the conditional expression and any remaining code in the body of the loop
        - When a **break** statement is encountered inside a loop, the loop is terminated and program control resumes at the next statement following the loop
        - The **break** statement can be used with any of Java’s loops, including intentionally infinite loops
        - When used inside a set of nested loops, the **break** statement will only break out of the innermost loop
        
    - it can be used as a “civilized” form of goto
        - Java does not have a goto statement because it provides a way to branch in an arbitrary and unstructured manner. 
        This usually makes goto-ridden code hard to understand and hard to maintain. It also prohibits certain compiler optimizations
        - By using this form of **break**, you can, break out of one or more blocks of code. These blocks need not be part of a
          **loop** or a **switch**. They can be any block. Further, you can specify precisely where execution
          will resume, because this form of **break** works with a label.
        - General form: `break label;`
        - can use a labeled break statement to exit from a set of nested blocks. But you cannot use break to transfer control out of a block
          that does not enclose the break statement

#### Continue
#### Return

    
    
