## Refactor

### Clean code principles

- The clean code principles were introduced in Robert C. Martin's book Clean Code
- its generic statement is that code is clean when it is readable and understandable by others, and if it's easy to refactor 
- goal is to write clean code from the start in a project as it is the most cost-efficient
- some of the principles mentioned in Clean code are:
	- Loose Coupling: the less the different components know about each other, the better
	- Single Responsibility Principle: a class/method should fulfill one task only
	- Open Closed Principle: code should be open to extension but closed to modification
	- Name everything as carefully as you would name your children, be consistent, use descriptive names
	- Comments: do not use them, really
	- Methods should descent 1 level of abstraction, not more
	- Exception handling: throw them as early as possible, catch only specific exception and only when you can react in a meaningful way

[All the principles explained](https://www.planetgeek.ch/wp-content/uploads/2013/06/Clean-Code-V2.2.pdf)

### Styleguide

- helps improve readability of code and decrease refactoring time
- necessary as programs are usually written by more than one developer
- Styling usually involves:
	- indentation rules
	- wrapping rules
	- documentation, comment rules
	- naming conventions

### Code smells

- a code smell is any characteristic in the source code of a program that possibly indicates a deeper problem
- Common code smells are: 
	- Application-level: duplicated code, changes have to be applied to multiple classes
	- Class-level: large classes, using many methods of another class, method overrides that change the method's concept, too many literals (instead of constants)
	- Method-level: too many parameters, too long, variable naming too long or too short, excessive returns

### Refactoring code

- Boy Scout Rule: leave the campground cleaner than you found it
- Goals of refactoring:
	- eliminate code smells
	- improve readability, understandability
	- make code maintainable
	- increase cohesion and reduce coupling
- How to refactor:
	- unify similar code
	- first, isolate code that needs to be refactored, then refactor and if necessary, undo the isolation
	- use temporary duplication or temporary parallel implementations, remove the old code when no longer needed