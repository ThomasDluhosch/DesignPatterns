# **Design Patterns**

> Design patterns are reusable solutions to common software design problems. They provide templates or blueprints for structuring code in a way that promotes scalability, maintainability, and flexibility. These patterns encapsulate best practices and principles of object-oriented design, making it easier for developers to communicate and collaborate effectively. [_chatGPT_](https://chat.openai.com/)

# Architectural Design Patterns

## 1.1 Factory Pattern

    The Factory Pattern is a creational design pattern that provides an interface or method to create objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern decouples the object creation process from the client.

<div align="center" style="width: 100%;">

<table style="width: 100%;">
    <tr>
        <th style="text-align:center; width:50%">Advantages</th>
        <th style="text-align:center; width:50%">Disadvantages</th>
    </tr>
    <tr>
        <td align="center">Reusable</td>
        <td align="center">Increased code complexity</td>
    </tr>
    <tr>
        <td align="center">Flexible</td>
        <td align="center">More subclasses</td>
    </tr>
    <tr>
        <td align="center">Single Responsibility Principle</td>
        <td align="center"></td>
    </tr>
        <tr>
        <td align="center">Open/Closed Principle</td>
        <td align="center"></td>
    </tr>
</table>

</div>

### Structure

This pattern typically consits of the following components:

-   **Product Interface**: Abstract class to ensure a consistent interface for all product types

-   **Concrete Products**: Represents the actual objects

-   **Factory Interface**: Declares the creation methods

-   **Concrete Factories**: Implementation of creation logic for different Product types.

### Example

![UML Diagramm of the code example for the factory pattern](Assets/FactoryPattern.png)

## 1.2 Abstract Factory Pattern

## 1.3 Prototype Pattern

## 1.4 Builder Pattern

    The Builder Pattern is a creational design pattern that simplifies the creation of complex objects. It is particularly useful when an object is composed of multiple components or requires various configurations to suit different use cases.

<div align="center" style="width: 100%;">

<table style="width: 100%;">
    <tr>
        <th style="text-align:center">Advantages</th>
        <th style="text-align:center">Disadvantages</th>
    </tr>
    <tr>
        <td align="center">Construct objects step-by-step</td>
        <td align="center">Code complexity increases</td>
    </tr>
    <tr>
        <td align="center">Reuse construction code</td>
        <td align="center"></td>
    </tr>
    <tr>
        <td align="center">Single Responsibility Principle</td>
        <td align="center"></td>
    </tr>
</table>

</div>

### Structure

This pattern separates the construction process from the representation of an object. It typically consits of the following components:

-   **Builder**: Defines an interface with methods to build the object step by step
-   **Concrete Builder**: A specific implementation of the Builder interface that assembles and constructs the object
-   **Director**: Oversees and controls the building process
-   **Product**: Final object that is created by the Builder

### Example

-   The Builder.java interface defines the methods required to construct an object
-   The ComputerBuilder.java class serves as the concrete builder, implementing the Builder interface
-   The Director.java class orchestrates the building process
-   The Computer.java class represents the product

## 1.5 Singelton Pattern (DON'T)

# Structural Design Patterns

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
