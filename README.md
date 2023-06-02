# Java

## Java Basics

### Module

#### Compiling code- Generates the out directory

```cmd
javac -d out --module-source-path . $(find . -name "*.java")
```

#### Running the compiled code

```cmd
java --module-path out --module client/com.example.client.ClientApp
```

### Intro To Java

- Key Features
  - Platform-independent
  - Object Oriented
    - Modularity
    - Information Hiding
    - Code Reuse
    - Maintainability

### Setting up A Java Development Environment

#### Need to:

- Install a Java Development Kit (JDK)
- Install an Integrated Development Environment (IDE)
- Configure the environment variables

#### Compiling

```cmd
javac filename.java
```

#### Running

```cmd
java filename
```
