## OOP

### Private, public, protected

- they are all access modifiers we use in class fields and methods
- they define how the affected field/method can be accessed and modified
- public: can be accessed by any other code in the same assembly or in one that references it
- private: can only be accessed in the same class
- protected: can only be accessed in the same or a derived class
- when none of them are set, the default modifier is used automatically
- every method and field should have the most restricting access modifier possible, so if it's not necessary, don't leave it as public
- it's a generic rule that we set class fields to private and use getter/setter methods to modify and access them

### Encapsulation

- It describes the idea of bundling data and methods that work on that data within one unit, e.g., a class in Java
- often used to hide the internal representation, or state, of an object from the outside
	- this is called information hiding
- If you have an attribute that is not visible from the outside of an object, and bundle it with methods that provide read or write access to it, then you can hide specific information and control access to the internal state of the object
- again, this is why we tend to use getters/setters to make class fields accessible to objects/classes outside of their source class

### Static, final

- a static variable or method is associated with the class/type itself and not with instances of that class
- this means that we can reference it without ever instantiating the class itself
- final means that the value assigned to the variable cannot be changed (once initialized)
	- final vs final static: if we combine final and static, we have a variable that not only "belongs" to the class, but its value is final, thus its value is the same in all instances of the class
	- whereas, if we have a final variable, the value can differ in different instances of the class

### Inheritance

- the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order
	- subclass: the class which inherits the properties of another
	- superclass: the class whose properties are inherited
- in Java, we use the extend key word to inherit a class to a subclass

- when inheriting a class, we may need to differentiate fields and methods of the superclass, we use the super keyword for that
	- also used to invoke the superclass' constructor

### Polymorphism

- Polymorphism is the ability of an object to take on many forms
- The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
- but when we instantiate an object, we create a reference variable and declare its type, which cannot be changed later
	- just as we are unable to transform a variable of type int to a double, we can only assign its value to a variable of another type
	- we are able to do the same with polymorphic objects


### Interfaces, abstracts

- In OOP, abstraction is a process of hiding the implementation details, only the functionality will be provided to the user
- we can achieve that with abstract classes and/or interfaces
- Abstract classes:
	- can contain abstract methods (methods without a body) but also concrete methods
	- can contain fields as long as they are not static or final
	- cannot be instantiated
	- an abstract class can be inherited by another class, in this case, all the abstract methods have to be implemented
- Interfaces:
	- can only contain abstract methods
	- all methods are public
	- fields must be public, static and final
	- have to be implemented by a class to use it (implements keyword)
	- a class can implement multiple interfaces

