# Gangs of Four (GoF) Design Patterns

Gangs of Four Design Patterns is the collection of 23 design patterns from the book [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns).



## GoF Design Pattern Types

GoF Design Patterns are divided into three categories:
    
1. **Creational**: The design patterns that deal with the creation of an object.
2. **Structural**: The design patterns in this category deals with the class structure such as Inheritance and Composition.
3. **Behavioral**: This type of design patterns provide solution for the better interaction between objects, how to provide lose coupling, and flexibility to extend easily in the future.


___
## Creational Design Patterns

>* ### **Singleton**
>The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created.
>
>Approaches of Singleton pattern implementation:
>1. Eager initialization
>2. Static block initialization
>3. Lazy Initialization
>4. Thread Safe Singleton
>5. Bill Pugh Singleton Implementation
>6. Using Reflection to destroy Singleton Pattern
>7. Enum Singleton
>8. Serialization and Singleton

>* ### **Factory Method**
>In object-oriented programming (OOP), a factory is an object for creating other objects.\
>This pattern takes out the responsibility of creating objects without exposing the creation logic to the client.


>* ### **Abstract Factory**
>Allows us to create a Factory for factory classes.


>* ### **Builder**
>It is a design pattern that lets us construct complex objects step by step,
>It allows us to create an object step by step and a method to finally get the object instance.
>
>Builder pattern was introduced to solve some problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
>
>There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
>
>1. Too Many arguments to pass from client program to the Factory class that can be error-prone because most of the time, the type of arguments are same and from client side it's hard to maintain the order of the argument.
>2. Some parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
>3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
>
>
> We can solve the issues with large number of parameters by:
>* Providing a constructor with required parameters and then different setter methods to set the optional parameters.
>
>The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.
>
>* _Telescoping constructors_
>
>By providing a set of constructors where the first constructor takes only the mandatory fields; for every optional field, there is a further constructor that takes the mandatory fields plus the optional fields.\
>Every constructor calls the subsequent one by passing a null value in place of the missing parameter. Only the final constructor in the chain will set all the fields by using the values provided by the parameters.
>
>```java
>// Telescoping constructors example:
>public class Car {
>    private String brand;
>    private String model;
>    private Integer year;
>    private String color;
>    private String description;
>
>    public Car(String brand, String model) {
>        this(brand, model, null);
>    }
>
>    public Car(String brand, String model, Integer year) {
>        this(brand, model, year, null);
>    }
>    
>    public Car(String brand, String model, Integer year, String color) {
>        this(brand, model, year, color, null);
>    }
>
>    public Car(String brand, String model, Integer year, String color, String description) {
>        this.brand = brand;
>        this.model = model;
>        this.year = year;
>        this.color = color;
>        this.description = description;
>    }
>    //...
>}
>```
>
>Unfortunately, the _Telescoping constructors_ will not prevent you from having to pass null values in some cases. In addition, if you had to create a `Car` with `(brand, model, year,  description)` there is no such constructor for that cas,
> so we have to create a constructor for every useful combination of parameters which going to result in a large combination of constructors, and making the resulting code hard to read and even harder to maintain.\
> Otherwise, that may be impossible sometimes where two constructors will have the same signature and this would not work (having two constructors of the same signature cannot coexist in the same class), because the compiler would not know which one to choose.
> 
> **So the best way to solve these problems is to use the Builder pattern.**

>* ### **Prototype**
>It is a design pattern that lets us create a new object instance from another similar instance and then modify it according to our requirements.
>
> For example if we want to create an exact copy of an instance, we have to create a new object of the same class. Then we have to go through all the fields of the original instance and copy their values over to the new instance, but the problem is not all objects can be copied that way because some of the object’s fields may be private and not visible from outside the object itself.
> 
> Another problem with copying the field directly is we have to know the object’s class to create a clone of it, our code becomes dependent on that class. For example, sometimes we only know the interface that the object implement, but not its concrete class.
> 
> The **Prototype** pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. This interface lets us clone an object without coupling the code to the class of the cloned object. Usually, such an interface contains just a single `clone()` method.
> 
> The implementation of the `clone()` method is very similar in all classes. The method creates an object of the current class and carries over all the field values of the cloned object into the new one.
> 
> An object that supports cloning is called a **_prototype_**.



