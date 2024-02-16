This repository is to learn important **Design Patterns** in **Java**. It is splitted into 3 parts.

# Design Patterns

> Design patterns are reusable solutions to common software design problems. They provide templates or blueprints for structuring code in a way that promotes scalability, maintainability, and flexibility. These patterns encapsulate best practices and principles of object-oriented design, making it easier for developers to communicate and collaborate effectively. [_chatGPT_](https://chat.openai.com/)

## Architectural Design Patterns

### 1.1 Factory Pattern
**What is it?** 
- It provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
- Create objects without specifying the exact class of object that will be created.

**When do i use it?**
- If you want to decouple client code from the actual object creation process

**Pros**
- Avoid tight coupling between the creator and the concrete producs
- Flexible, Maintainable code that is easy to extend
- Single Responsibility Principle
- Open/Close Principle

**Cons**
- Code may become more complicated. Introduction of a lot of new subclasses to implement the pattern. 

**Example**

![UML Diagramm of the code example for the factory pattern](Assets/FactoryPattern.png)

### 1.2 Abstract Factory Pattern

### 1.3 Prototype Pattern

### 1.4 Builder Pattern

### 1.5 Singelton Pattern (DON'T)

## Structural Design Patterns

### 2.1 Adapter Pattern

### 2.2 Decorator Pattern

### 2.3 Proxy Pattern

### 2.4 Composite Pattern

### 2.5 Bridge Pattern

### 2.6 Facade Pattern

### 2.7 Flyweight (Anti) Pattern

## Behavioral Design Patterns

### 3.1 Template Method

### 3.2 Strategy Pattern

### 3.3 Null Object Pattern

### 3.4 Command Pattern

### 3.5 Observer Pattern

### 3.6 Visitor Pattern

### 3.7 State Pattern

### 3.8 Iterator Pattern
