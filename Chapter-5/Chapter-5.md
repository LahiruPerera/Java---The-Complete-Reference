# Control Statements
- A programming language uses control statements **to cause the flow of execution to advance and branch based on changes to the state of a program**
- **Control statements** can be categorized as: 
   - selection - Selection statements allow a program to choose different paths of execution based upon the outcome of an
                 expression or the state of a variable
   - iteration - Iteration statements enable program execution to repeat one or more statements (that is, iteration statements form loops)
   - jump - Jump statements allow a program to execute in a nonlinear fashion

### Java’s Selection Statements
- Java supports two selection statements:
   - **if**
   - **switch**
- allow to control the flow of the program’s execution based upon conditions known only during run time

#### if
- The if statement is Java’s conditional branch statement
- It can be used to route program execution through two different paths


    if (condition) statement1;
    
    else statement2;
    
   -  _statement_ may be a single statement or a compound statement enclosed in curly braces (that is, a _block_). The _condition_ is any expression that returns a **boolean** value. The
      **else** clause is optional.
- only one statement can appear directly after the if or the else. To include more statements, need to create a block

#### Nested ifs
- A nested if is an if statement that is the target of another if or else

   
    if(i == 10) 
    {
        if(j < 20) a = b;
        if(k > 100) c = d; // this if is
        else a = c; // associated with this else
    }
    else a = d; // this else refers to if(i == 10)

#### The if-else-if Ladder
- based upon a sequence of nested ifs


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

### Iteration Statements

### Jump Statements