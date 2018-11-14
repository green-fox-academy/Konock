## Testing

### Unit testing
- A level of software testing where individual units of the program are tested
- Unit: the smallest testable part of any software.
	- In OOP the smallest testable unit is a method
- Purpose: validate that each unit of the software performs as designed
- Is also called as the first level of testing
- perform prior to integration tests
- usually expected to be written by the developers
- Benefits:
	- increases confidence in maintaining code
	- code becomes more reusable (as unit tests encourage splitting up code into smaller parts, following the SOLID principles)
	- more reliable and faster than developer tests
	- cost of fixing is lesser in comparison as when the error is caught on higher levels
	- quick to run (if written well), easy debugging
- Best practices:
	- test cases should be independent from each other
	- follow clear naming conventions
	- test as you code

### Testing models, components
- is a technique in which testing is performed on each individual component separately, without integration
- usually performed by the testers
- usually performed after unit testing
- validated against use cases and test requirements
- component testing in small: the components are tested in isolation from each other
- component testing in large: the components are tested without isolation

### Integration tests, endpoint tests
- a level of testing where individual units are combined and tested as a group
- also called as the second level of testing (comes before system tests)
- purpose: to expose faults in the interaction between integrated units
- component integration testing: used to expose defects in the interfaces and interaction between components (internal components)
- system integration testing: testing the integration of systems and packages (external components)

![](https://media.giphy.com/media/3o7rbPDRHIHwbmcOBy/giphy.gif)

- Endpoint tests are necessary to make sure every endpoint returns the correct HTTP status, correct format (HTML, JSON)

### End-to-end

- in short: E2E
- testing that not only validates the software systems but also checks its integration with external interfaces
- purpose: to exercise a complete production-like scenario
	- for this, a production-like data and test environment is set up
	- build user functions, conditions and test cases
- usually executed after functional and system testing
- 

### Assertions
- an expressions, which holds some testable logic
- usually a boolean expression (assertTrue, assertFalse)

### Mocking (mock, stub, spy)
- A lot of tests rely on mock objects being created to be able to tests sections of code
- mock objects are used to fill in for the missing parts of the program
- i.e. dependency injected objects that are created during runtime