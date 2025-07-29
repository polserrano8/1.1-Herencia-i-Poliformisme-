# Task S1.01. Inheritance and Polymorphism
## Introduction
Task based on performing exercises similar to the fundamentals course, where it was learned object-oriented programming, inheritance, and polymorphism.

## Getting Started

To get started with this project, follow these steps:

1. **Clone the repository**:
 git clone https://github.com/polserrano8/1.1-Herencia-i-Poliformisme

2. **Open the project in IntelliJ IDEA**:
- Launch IntelliJ IDEA.
- Select "Open" and navigate to the directory where you cloned the repository.
- Open the project.

3. **Build and run the project**:
- Ensure you are using JDK 19.
- Use the Run configurations in IntelliJ IDEA to execute the exercises.

## Level 1

### Exercise 1

In a music band, there are different types of musical instruments. There are wind, string, and percussion instruments.

All instruments have attributes for their name and price. In addition, they have a method called `play()`. This method is abstract in the `Instrument` class and, therefore, must be implemented in the child classes. If a wind instrument is being played, the method should print to the console: "A wind instrument is playing"; if a string instrument is being played: “A string instrument is playing”; and if a percussion instrument is being played: “A percussion instrument is playing”.

The class loading process only occurs once. Demonstrate that the class can be loaded either by creating the first instance of that class or by accessing a static member of it.

Search for information about initialization blocks and static blocks in Java.

### Exercise 2

Create a class called "Car" with the attributes: brand, model, and horsepower. The brand should be `static final`, the model `static`, and the horsepower `final`. Demonstrate the difference between the three. Is there any that can be initialized in the constructor of the class?

Add two methods to the "Car" class. A static method called `brake()` and a non-static method called `accelerate()`. The `accelerate()` method should print to the console: “The vehicle is accelerating”, and the `brake()` method should print: “The vehicle is braking”.

Demonstrate how to invoke the static and non-static methods from the `main()` method of the main class.

## Level 2

### Exercise 1

Create a class called "Phone" with the attributes brand and model, and the method `call()`. This method should receive a String with a phone number. The method should print a message to the console indicating that it is calling the number received as a parameter.

Create an interface called "Camera" with the method `takePhoto()`, and another interface called "Clock" with the method `alarm()`.

Create a class called "Smartphone" that is a subclass of "Phone" and also implements the "Camera" and "Clock" interfaces.

The `takePhoto()` method should print to the console: “Taking a photo”, and the `alarm()` method should print: “The alarm is ringing”.

From the application's `main()`, create a Smartphone object and call the above methods.

## Technologies Used

I have used the following technologies to develop the activities described:

- **JDK 19**: For implementing the solutions in Java.
- **IntelliJ IDEA**: As the integrated development environment (IDE) for Java programming.
