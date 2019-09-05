## Language Agnostic OOP Questions

1. Name the four pillars of OOP?
    * Abstration
    * Encapsulation
    * Polymorphism
    * Inheritance

2. What is _overloading_?
    * overloading is the same method signature but different parameters.

3. What is _overriding_?
    * is the same method signature and parameters but different implementation

4. What is an interface?
    * A contract that a class must implement.
    * Declares abstract methods

20. What is a `static` block?
    * set of statements, which will be executed by the JVM before execution of main method.
    * A class has to be loaded in main memory before we start using it.
    * Static block is executed during class loading. 

5. What is an `abstract` class?
    * A template used by subclasses.
    * Can have private and non-private variables along with abstract and non-abstrac methods

6. What is the difference between `abstract` class and interface?
    * Interfaces 
        * couples a class to a behavior
        * declare `abstract` methods
    * abstract classes
        * couples a class to a construction.
        * declare `abstract` methods.
        * define concrete method
        * define constructors
        * declare fields
        * assgin field-values

7. What are Wrapper classes?
    * Wrapper classes are _decorations_ of primitive types.
    * Wrapper classes enable all of the expected behaviors of a primitive type, but add additional behaviors.

8. What is composition in OOP?
    * Composition is the design technique to implement `has-a` relationship in classes.
    * Java composition is achieved by using instance variables that refers to other objects.

9. What is the benefit of Composition over Inheritance?
    * Composition is more flexible than inheritance.
    * You can change implementation of class at run-time by changing included object, thus changing behavior of it. Inheritance violates encapsulation by exposing all of the inherited members. By inheriting from a class you're coupling child class with number of potential implementation details of the parent.
