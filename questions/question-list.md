A Few Java Questions

1. Name the four pillars of OOP?
    * Abstration
    * Encapsulation
    * Polymorphism
    * Inheritance

2. What is meant by platform independence of Java?
    * Has a large library of useable code and an execution evirionment Java Virtual Machine

3. What is the JVM?
    * JVM stands for Java Virtual Machine
        * converts bytecode to machine specific code.
        * Provides memory managment, garbage collection.
        * Provides an interface that does not depend on the operating system

4. What is the difference between JDK and JVM?
    * JDK stands for Java Development Kit
        * the tools, language, etc.
        * JVM is part of the JDK 
    * JVM stands for Java Virtual Machine.
        * is the machine that allows Java to run anywhere

5. What is the difference between JVM and JRE?
    * JVM stands for Java Virtual Machine
        * provides platform independence by changing bytecode
    * JRE stands for Java Runtime Environment
        * allows java programs to be ran in an isolated (virtualized) environemnt

6. Which class is the superclass of all classes?
    * `Object` is the superclass of all other java classes.

7. Why Java doesn't support multiple inheritance?
    * multiinheritance can create inexplicit overriding of methods; making behavior unexpected or less predictable.

8. Why is Java not a pure Object Oriented language?
    * Because primitives are not objects, the language is not considered a _pure_ OOP language.

9. What is difference between path and classpath variables?
    * path variables deal with the PATH environment and allow the OS to run the executable from any directory.
    * Classpath variables is a system environment variable used by the Java compiler and JVM

10. What is the importance of `main` method in Java?
    * The `main` method is used to start the program in JVM.

11. What is _overloading_?
    * overloading is the same method signature but different parameters.

12. What is _overriding_?
    * is the same method signature and parameters but different implementation

13. Can we overload the `main` method?
    Yes

13. Can we have multiple public classes in a java source file? Yes, it can. However, there can only be one public class per .java file, as public classes must have the same name as the source file. One Java file can consist of multiple classes with the restriction that only one of them can be public.
14. What is a Java Package and which package is imported by default? Encapsulates a group of classes, subclasses, and interfaces. java.lang is imported by default. It provides classes that are needed to the design of Java programming
15. What are the access modifiers? An access modifier restricts the access of a class, constructor, data member and method in another class. Public = all subclasses have access. Private = scope is limited to the class itself. Protected = only access available to classes and subclasses in that package. Default = only accessed by those in the package only
16. What is the final keyword? final variable = constant variable/ final method = cannot be overridding/ final classe = cannot be extended(no inheritance)
17. What is the static keyword? Belongs to the class and an instance does not have to be created to be accessed
18. What is finally and finalize in java? Finally means that the code will be ran whether an exception is handled or not. Finalized is used for garbage collections
Can we declare a class as static? Only if the class is nested within another. Superclass cannot be static
19. What is a multi-catch block in java? Catching multiplie errors within a catch block
20. What is a static block? Static block is a set of statements, which will be executed by the JVM before execution of main method. A class has to be loaded in main memory before we start using it. Static block is executed during class loading. 
21. What is an interface? A contract that a class must implement. Has abstract methods
22. What is an abstract class? A template used by subclasses. Can have private and non-private variables along with abstract and non-abstrac methods
23. What is the difference between abstract class and interface? Interfaces have abstract methods while abstract classes have abstract and non-abstract methods. Abstract methods have to be implemented.
24. Can an interface implement or extend another interface? No but a class can implement more than one interface
25. What are Wrapper classes? A wrapper classes turns a primitive into an object. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
26. What is an Enum in Java? A special "class" that represents a group of constants (unchangeable variables, like final variables)
27. What are Java Annotations? Annotations are used to provide supplement information about a program. Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
28. What is the Java Reflection API? Why it's so important to have? Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, without knowing the names of the classes, methods etc. at compile time. It is also possible to instantiate new objects, invoke methods and get/set field values using reflection.
29. What is composition in java? Composition is the design technique to implement has-a relationship in classes. We can use java inheritance or Object composition for code reuse. Java composition is achieved by using instance variables that refers to other objects. 
30. What is the benefit of Composition over Inheritance? Composition is more flexible than inheritance. You can change implementation of class at run-time by changing included object, thus changing behavior of it, but you can't do this with inheritance, you can't change behavior of base class at run-time. Inheritance breaks encapsulation. By inheriting from a class you're coupling child class with number of potential implementation details of the parent.
31. How can one sort a collection of custom Objects in Java? Collections.sort
32. What is inner class in java?
33. What is anonymous inner class?
34. What is the Classloader in Java?
35. What are different types of classloaders?
36. What is ternary operator in java?
37. What does super keyword do? Used by the subclass to call a method defined in the superclass
38. What are break and continue statement used for? When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop. The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop.
39. What is the this keyword used for? Refers to the variable of the current object
40. What is a default constructor? A null constructor? Default means there are no arguments
41. Can we have try block without a catch block? Yes,  we can have try without catch block by using finally block.
You can use try with finally. As you know finally block always executes even if you have exception or return statement in try block except in case of System.exit().
42. What is Garbage Collection? Memory management when an object is no longer being called by a program
43. What is Serialization and Deserialization? Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
44. How does one run a JAR file through command prompt?
45. What is the use of System class, name an example? System class are standard input, standard output, and error output streams; access to externally defined properties and environment variables; a means of loading files and libraries; and a utility method for quickly copying a portion of an array. It extends class Object.
46. What is instanceof keyword? It is a binary operator used to test if an object (instance) is a subtype of a given Type.
47. Can we use String with switch case? Yes, since Java 7
48 .Is Java a Pass-by-Value or Pass-by-Reference language? Explain the difference? Pass by Value Pass by Value: The method parameter values are copied to another variable and then the copied object is passed, that’s why it’s called pass by value. Pass by Reference: An alias or reference to the actual parameter is passed to the method, that’s why it’s called pass by reference.
49. What is the difference between Heap and Stack Memory? The main difference between heap and stack is that stack memory is used to store local variables and function call while heap memory is used to store objects in Java.

#### Loops
1. Describe the features of Java for controlling the repeated execution of a block of code.
2. Show how general uses of for, while and do could all be emulated using only loops that start of while (true).

#### Exception
1. Describe some circumstances where it is useful for functions to return errors as exception, and some where it is not. Give an example of an algorithm which is simplified by the use of exceptions.



* List the eight Java primitive data types. Boolean, char, int, short, byte, long, float, double
* What is a class?  Templates that are used to create objects, and to define object data types and methods.
* Name the java access modifies for instance variable, classes and methods. Private, protected, default, public
* What can an abstract class do that an interface cannot? Have final and non-final variables as well as abstract and non-abstract methods
* What result will be printed if the following fragment of Java code is executed? Why?
		System.out.println('h'+'e'+"llo worl"+'d')
* What result will be printed if the following fragment of Java code is executed? Why? 

```java
public static void main(String[] args) {
    double d = 6.6;
    try {
        d=1.0/0.0; 
    } finally {
        System.out.println("d = " + d);
    }
}
```