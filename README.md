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

  - [Client-Server Architecture](#client-server-architecture)

    - [Key Components:](#key-components)
      - [1. Client](#1-client)
      - [2. Server](#2-server)
    - [How Client-Server Architecture Works:](#how-client-server-architecture-works)
    - [Advantages of Client-Server Architecture:](#advantages-of-client-server-architecture)
    - [Use Cases:](#use-cases)

  - [Java Strings](#java-strings)

    - [What is a String?](#what-is-a-string)
    - [Immutability](#immutability)
    - [Common Methods](#common-methods)

  - [StringBuilder Class](#stringbuilder-class)
    - [Why Use StringBuilder?](#why-use-stringbuilder)
    - [Creating a StringBuilder](#creating-a-stringbuilder)
    - [Common Methods](#common-methods-1)
    - [Conclusion](#conclusion)

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

## Client-Server Architecture

Client-server architecture is a fundamental design pattern in computer networking that defines the roles and interactions of two distinct types of programs or devices: clients and servers. This architectural model is widely used in various computing applications, including web services, email systems, online gaming, and more.

### Key Components

#### 1. Client

A client is a program or device that requests services or resources from a server. Clients are typically end user devices, such as computers, mobile phones, or tablets. They are responsible for:

- Sending requests to the server.
- Receiving responses from the server.
- Rendering or processing the received data for the user.

Clients interact with servers through communication protocols, such as HTTP for web clients, SMTP for email clients, or FTP for file transfer clients.

#### 2. Server

A server is a program or device that provides services or resources to clients. Servers are typically powerful computers or specialized hardware optimized for handling multiple client requests simultaneously. They are responsible for:

- Listening for incoming client requests.
- Processing client requests.
- Sending responses back to the clients.

Servers host various services, such as web servers, email servers, database servers, and more. Each server specializes in handling specific types of requests.

### How Client-Server Architecture Works

1. **Client Request:** A client initiates communication by sending a request to a server. The request specifies the type of service or data it needs.

2. **Server Response:** Upon receiving the client's request, the server processes it and generates a response. The response contains the requested data or the result of the requested service.

3. **Data Transfer:** The server sends the response back to the client through the network.

4. **Client Processing:** The client receives the response and processes the data, which may involve rendering a web page, displaying an email, or performing other actions based on the received information.

### Advantages of Client-Server Architecture

- **Scalability:** Servers can handle multiple client requests simultaneously, making it easy to scale the system as the number of clients grows.

- **Centralized Management:** Centralized servers provide a single point of control and maintenance, simplifying system management and updates.

- **Resource Sharing:** Clients can access shared resources, such as databases, files, or services, provided by the server.

- **Security:** Servers can implement access control and authentication mechanisms to protect sensitive data and services.

- **Flexibility:** Different clients (e.g., web browsers, mobile apps, desktop applications) can interact with the same server, providing cross-platform compatibility.

### Use Cases

- **Web Applications:** Sites often use client-server architecture, with web browsers (clients) communicating with web servers to retrieve web pages and content.

- **Email Systems:** Email clients (e.g., Outlook, Gmail) communicate with email servers to send, receive, and store email messages.

- **Online Gaming:** Multiplayer online games rely on client-server architecture to manage player interactions and game state.

- **Cloud Computing:** Cloud services use client-server models to provide resources and data storage to remote clients.

Client-server architecture is a versatile and widely adopted model that underlies many of the applications and services we use daily, enabling efficient and distributed computing across networks.

### What is a String?

In Java, a `String` is an object that represents a sequence of characters. It is one of the most commonly used data types in Java.

Example:

```java
String hello = "Hello, World!";
```

### Immutability

Strings in Java are immutable, meaning once they are created, they cannot be altered. When you perform operations like concatenation or trimming, a new String object is created.

### Common Methods

Here are some of the commonly used methods:

`length()`:Returns the length of the string.

`charAt(int index)`: Returns the character at the specified index.

`substring(int beginIndex, int endIndex)`: Returns a new string that is a substring of the original string.

`toLowerCase():` Converts the string to lowercase.

`toUpperCase()`: Converts the string to uppercase.

`trim()`: Removes leading and trailing white spaces.

`startsWith(String prefix)`: Checks if the string starts with the specified prefix.

`endsWith(String suffix)`: Checks if the string ends with the specified suffix.

## StringBuilder Class

The `StringBuilder` class in Java is used to create mutable (modifiable) strings. Unlike Java strings, which are immutable, a `StringBuilder` object can be altered as many times as needed without creating a new object.

### Why Use StringBuilder?

1. **Efficiency**: It is more memory-efficient and faster when you have to make multiple modifications to a string.
2. **API Methods**: Provides an API compatible with `String`, but with extra functionality for manipulation.

### Creating a StringBuilder

You can create a `StringBuilder` object using its constructors.

```java
StringBuilder sb = new StringBuilder(); // Empty StringBuilder
StringBuilder sbWithInitialCapacity = new StringBuilder(50); // With initial capacity
StringBuilder sbWithString = new StringBuilder("Hello"); // With initial content
```

### Common Methods

Here are some commonly used methods:

`append(...)`: Appends the given data type to the existing string.

`insert(int offset, ...)`: Inserts the given data type at the specified position.

`delete(int start, int end)`: Deletes the substring from the start index to the end index.

`reverse():` Reverses the characters of the StringBuilder.

`toString():` Converts the mutable StringBuilder to an immutable String.
Examples

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // "Hello World"
sb.insert(0, "Greetings, "); // "Greetings, Hello World"
sb.delete(0, 10); // "Hello World"
sb.reverse(); // "dlroW olleH"
String str = sb.toString(); // Converts to String, "dlroW olleH"
```

### Conclusion

The StringBuilder class is especially useful when you need to make multiple modifications to a string. It is faster and more memory-efficient than using immutable String objects for the same purpose.
