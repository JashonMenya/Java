# Java

Java is a widely-used programming language known for its robust and versatile nature.

## Table of Contents

- [Java Intro](#java-intro)

  - [Module](#module)

    - [Compiling Code - Generates the 'out' Directory](#compiling-code---generates-the-out-directory)
    - [Running the Compiled Code](#running-the-compiled-code)

  - [Key-Features](#key-features)

    - [Platform-Independent](#platform-independent)
    - [Object Oriented](#object-oriented)
    - [Modularity](#modularity)
    - [Information Hiding](#information-hiding)
    - [Code Reuse](#code-reuse)
    - [Maintainability](#maintainability)

  - [Setting up A Java Development Environment](#setting-up-a-java-development-environment)

  - [Compiling and Running Java Code](#compiling-and-running-java-code)

    - [Copiling](#compiling)
    - [Running](#running)

  - [Java Class](#java-class)
  - [Abstract Classes](#abstract-classes)
  - [Access Control](#access-control)
  - [Access Modifiers](#access-modifiers)
  - [Encapsulation](#encapsulation)
  - [Conditions And Arrays](#conditions-and-arrays)
  - [Declaring Arrays](#declaring-arrays)
  - [Declaring a Two-Dimensional Array](#declaring-a-two-dimensional-array)
  - [Loops](#loops)
    - [While Loop](#while-loop)
    - [For Loop](#for-loop)
    - [Comparing Loop Constructs](#comparing-loop-constructs)
    - [Nesting Loops](#nesting-loops)
      - [Nesting for Loop](#nested-for-loops)
      - [Combining Loop Types](#combining-loop-types)

## Java intro

## Module

A module is a feature introduced in Java 9 to enhance the modularity of the Java platform. It allows you to encapsulate code, resources, and dependencies into a self-contained unit, making it easier to manage and maintain large Java applications.

The compilation process involves translating your Java source code into bytecode while taking module-related considerations into account. Here's how the compilation process works with Java modules:

### Compiling Code - Generates the 'out' Directory

```shell
javac -d out --module-source-path . $(find . -name "*.java")
```

### Running the compiled code

```shell
java --module-path out --module client/com.example.client.ClientApp
```

or

```shell
java -cp out conditionsandarrays.ifstatement.Main
```

## Key-Features

Java offers several key features that contribute to its popularity and effectiveness in software development:

### Platform-Independent

Java programs are platform-independent, which means they can run on different operating systems without modification. This feature is achieved through the use of the Java Virtual Machine (JVM), which interprets Java bytecode. Developers write Java code once and can execute it on various platforms, making Java highly portable.

### Object-Oriented

Java is an object-oriented programming (OOP) language, emphasizing the organization of code around objects, which are instances of classes. This approach promotes modularity, code reusability, and maintainability by encapsulating data and behaviors within objects.

### Modularity

Modularity in Java refers to the ability to break a program into smaller, self-contained modules or classes. Each module handles specific tasks or functions, making the code easier to understand, maintain, and extend. This promotes a cleaner and more organized codebase.

### Information Hiding

Information hiding is a principle of OOP that allows developers to hide the internal details of an object and expose only the necessary interfaces or methods. This enhances security and prevents unintended access to sensitive data, ensuring that the implementation details remain hidden from external code.

### Code Reuse

Java facilitates code reuse through inheritance and composition. Inheritance allows new classes to inherit properties and behaviors from existing classes, reducing redundancy and promoting code reuse. Additionally, developers can create reusable components using Java libraries and APIs.

### Maintainability

Java's emphasis on clean code, modularity, and strong typing contributes to the ease of maintaining Java applications over time. Well-structured Java code is more resistant to bugs and easier to debug and update, reducing maintenance efforts and costs.

Java's combination of platform independence, object-oriented design, modularity, information hiding, code reuse, and maintainability makes it a versatile and powerful programming language for a wide range of applications.

## Setting up A Java Development Environment

Setting up a Java development environment is the first step in building Java applications. Here are the essential steps you need to follow:

### Need to

1. **Install a Java Development Kit (JDK):**

   - The Java Development Kit (JDK) is required to compile and run Java applications. Download and install the appropriate JDK version for your operating system from the official Oracle or OpenJDK site.

2. **Install an Integrated Development Environment (IDE):**

   - While you can write Java code using a simple text editor and compile it using the command-line, using an Integrated Development Environment (IDE) greatly enhances your productivity. Some popular Java IDEs include Eclipse, IntelliJ IDEA, and NetBeans. Install your preferred IDE and configure it for Java development.

3. **Configure the Environment Variables:**
   - After installing the JDK, you may need to configure environment variables to ensure that your system recognizes the Java installation. On Windows, you should set the `JAVA_HOME` and add the `bin` directory to the `PATH` variable. On Unix-based systems (Linux and macOS), you can set environment variables in your shell profile (e.g., `.bashrc` or `.zshrc`).

Setting up these components forms the foundation of your Java development environment, enabling you to write, compile, and run Java programs efficiently. Once your environment is set up, you can start creating Java applications and exploring the world of Java programming.

## Compiling and Running Java Code

Once you've set up your Java development environment, you're ready to compile and run Java code. Here are the basic steps and an example to get you started:

### Compiling

To compile Java source code, you use the `javac` command followed by the name of the Java source file (e.g., `filename.java`). The `javac` command translates your human-readable Java code into bytecode that can be executed by the Java Virtual Machine (JVM). Here's the basic syntax:

```shell
javac filename.java
```

For example, if you have a Java file named HelloWorld.java, you can compile it using:

```shell
javac HelloWorld.java
```

This command will create a compiled bytecode file named HelloWorld.class in the same directory.

### Running

Once you've successfully compiled your Java code, you can run it using the java command followed by the name of the class that contains the main method. The main method serves as the entry point for your Java application. Here's the basic syntax for running a Java program:

```shell
java ClassName
```

For example, if you have a Java file named HelloWorld.java, you can compile it using:

```shell
java HelloWorld
```

## Java Class

In Java, a class is the fundamental building block of a Java application. It serves as a blueprint for creating objects, defining their structure, behavior, and properties. Here are some key aspects of a Java class:

- **Class Name:** The name of a class begins with a capital letter and follows Java naming conventions. It uniquely identifies the class.

- **Body of the Class:** The body of the class is enclosed in curly braces `{}` and contains the class's attributes (fields) and methods.

Java classes are essential for creating objects and organizing your code into reusable components.

## Abstract Classes

An abstract class in Java is a special kind of class that serves as a blueprint for other classes. It has the following characteristics:

- **Cannot Be Instantiated:** You cannot create an instance (object) of an abstract class directly. It's meant to be subclassed by other classes.

- **May Contain Concrete Methods:** An abstract class can have regular (concrete) methods with implementations.

- **May Contain Abstract Methods:** Abstract classes can also have abstract methods, which are declared without an implementation in the abstract class. Subclasses must provide implementations for these methods.

Abstract classes are used to define common behavior and structure that multiple related classes can share.

## Access Control

Access control in Java is a mechanism that allows you to control the visibility and accessibility of fields, methods, and classes within your codebase. It provides the following benefits:

- **Hide Fields and Methods:** You can use access control to hide certain fields or methods from other classes, preventing unauthorized access or modification.

- **Determine How Internal Data Gets Changed:** By controlling access, you can enforce rules and validations on how data within a class is changed, ensuring data integrity.

- **Keep Implementation Separate from the Public Interface:** Access control helps you maintain a clear separation between the public interface of a class (what other classes can see and use) and its internal implementation details (how it achieves its functionality).

### Access Modifiers

In Java, access control is managed using access modifiers, which specify the visibility of fields, methods, and classes. Here are two common access modifiers:

- **`public`:** Members (fields or methods) marked as `public` are accessible from any other class or package.

- **`private`:** Members marked as `private` are only accessible within the same class. They are not visible to other classes or packages.

### Encapsulation

Encapsulation is one of the fundamental principles of object-oriented programming (OOP) and is closely related to access control. It means hiding the internal state of an object and providing controlled access to it. In Java, encapsulation is achieved through:

- **Hiding Object Fields:** Fields (variables) of an object are declared as `private` to prevent direct access.

- **Safe Access Using Getter and Setter Methods:** To access or modify the values of private fields, getter and setter methods are provided. These methods can include additional logic for validation and control.

- **Ensuring Valid Values:** Setter methods can include code to ensure that the values being set are valid, maintaining the integrity of the object's state.

Encapsulation helps create robust and maintainable code by preventing unintended manipulation of object data and promoting controlled, safe access.

These concepts are fundamental to Java programming and are essential for creating well-structured, secure, and maintainable Java applications.

## Conditions And Arrays

In Java, conditions and arrays are essential components for controlling program flow and working with collections of data.

### If and Else Statements

Conditionals in Java are often implemented using `if` and `else` statements. These statements allow you to execute different blocks of code based on whether a specified condition is `true` or `false`. Here's the basic structure:

```java
if (<some condition is true>) {
    // do something
} else {
    // do something different
}
```

For example, you can use an if statement to check if a number is even:

```java
int number = 10;
if (number % 2 == 0) {
    System.out.println("The number is even.");
} else {
    System.out.println("The number is odd.");
}
```

## Declaring Arrays

Arrays in Java are used to store collections of elements of the same data type. You declare an array using the following syntax:

```java
type[] arrayIdentifier = {comma-separated list of values};
```

For example, you can declare an array of strings like this:

```java
String[] names = {"Mary", "Bob", "JJ"};
```

Or an array of integers:

```java
int[] ages = {25, 27, 48};
```

## Declaring a Two-Dimensional Array

In addition to one-dimensional arrays, Java supports two-dimensional arrays. Here's the syntax for declaring a 2D array:

```java
type[][] arrayIdentifier;
```

For example, you can declare a 2D array to represent yearly sales:

```java
int[][] yearlySales = new int[5][4];
yearlySales[0][0] = 1000;
```

## Loops

Loops in Java are used to execute a block of code repeatedly. Three common types of loops in Java are:

### While Loop

The while loop repeats a block of code as long as a specified condition is true. For example:

```java
while (!areWeThereYet) {
    readBook();
    argueWithSibling();
    ask("Are we there yet?");
}
```

### For Loop

The `for` loop is used to iterate a specific number of times using a counter. Here's an example:

```java
for (int i = 1; i < 5; i++) {
    System.out.print("i = " + i + "; ");
}
```

### Do-While Loop

The `do-while` loop is similar to the `while` loop, but it always executes the block of code at least once before checking the condition:

```java
do {
    fact *= target--;
} while (target > 0);
```

### Comparing Loop Constructs

Different loop constructs have specific use cases:

- Use the `while` loop to iterate indefinitely through statements and perform them zero or more times based on a condition.
- Use the standard `for` loop when you need to iterate a fixed number of times using a counter.
- Use the enhanced `for` loop to iterate through the elements of an array or ArrayList.
- Use the `do-while` loop to iterate through statements indefinitely, ensuring at least one execution of the block of code.

Understanding these loop constructs is crucial for controlling program flow and working with arrays and collections of data in Java.

### Nesting Loops

Nesting loops in Java involves placing one loop inside another loop. This technique is used to create more complex and structured iterations, especially when dealing with multi-dimensional data structures like arrays or matrices. Java allows you to nest loops of the same type (e.g., `for` inside `for`) or different types (e.g., `for` inside `while`).

#### Nested `for` Loops

One of the most common scenarios for nesting loops is with nested `for` loops. This is often used when dealing with two-dimensional data structures or grids. Here's an example of nesting `for` loops to iterate through a 2D array:

```java
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
    }
    System.out.println(); // Move to the next row
}
```

#### Nested while Loops

You can also nest while loops in a similar way. Here's an example:

```java
int i = 1;
while (i <= 3) {
    int j = 1;
    while (j <= 3) {
        System.out.println("i = " + i + ", j = " + j);
        j++;
    }
    i++;
}
```

In this example, the outer `while loop` controls the variable `i`, and the inner while loop controls the variable `j`. This results in a nested iteration, printing combinations of i and j.

#### Combining Loop Types

It's also possible to nest loops of different types. For instance, you can nest a for loop inside a while loop or vice versa, depending on your specific requirements.

When nesting loops, it's essential to be mindful of the loop termination conditions, so you don't inadvertently create infinite loops. Nested loops can be a powerful tool for solving a wide range of problems, but they should be used judiciously to maintain code readability and performance.

Nesting loops can help you process multi-dimensional data structures, traverse grids, and perform repetitive tasks efficiently in your Java programs.
