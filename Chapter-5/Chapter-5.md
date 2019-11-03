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
- To allow two or more variables to control a for loop, Java permits you to include multiple statements in both the initialization and iteration portions of the for. Each
  statement is separated from the next by a comma.

### Jump Statements

    
    
