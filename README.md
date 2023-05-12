# Java

Java Basics

# module

Compiling code- Generates the out directory

```cmd
javac -d out --module-source-path . $(find . -name "*.java")
```

Running the compiled code

```cmd
java --module-path out --module client/com.example.client.ClientApp
```
