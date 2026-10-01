# Java Topics

A collection of Java programs, concepts, and notes covering **Core Java** and **Object-Oriented Programming (OOP)** concepts. This repository is created for learning, practicing, and revising Java programming fundamentals.

---

# 📌 Repository Structure

```text
Java-Topics/
│
├── Operators/
│   ├── ArithmeticOperators.java
│   ├── RelationalOperators.java
│   ├── LogicalOperators.java
│   ├── BitwiseOperators.java
│   └── AssignmentOperators.java
│
├── Conditions/
│   ├── IfStatement.java
│   ├── IfElse.java
│   ├── IfElseIf.java
│   └── Switch.java
│
├── Loops/
│   ├── ForLoop.java
│   ├── WhileLoop.java
│   ├── DoWhileLoop.java
│   ├── EnhancedForLoop.java
│   ├── Break.java
│   └── Continue.java
│
├── OOP/
│   ├── ClassesAndObjects/
│   ├── Constructors/
│   ├── Polymorphism/
│   ├── Inheritance/
│   └── Encapsulation/
│
├── Packages/
│
└── README.md
```

---


---

## 📚 Topics Covered

### 1. Operators in Java

Operators are special symbols used to perform specific operations on one, two, or three operands and return a result.

#### Types of Operators

* **Arithmetic Operators** – Used to perform basic mathematical operations such as addition, subtraction, multiplication, division, and modulus.
* **Relational / Comparison Operators** – Used to compare two values and return a boolean result (`true` or `false`).
* **Logical Operators** – Used to combine multiple boolean expressions.
* **Bitwise Operators** – Used to perform operations at the bit level on integer values.
* **Assignment Operators** – Used to assign values to variables.

---

### 2. Condition Statements in Java

Condition statements are used to execute different blocks of code based on specific conditions.

#### Types of Condition Statements

1. **if Statement**
   Executes a block of code when a specified condition is `true`.

2. **if-else Statement**
   Executes one block when the condition is `true` and another block when the condition is `false`.

3. **if-else-if Statement**
   Used to evaluate multiple conditions and execute the corresponding block of code.

4. **switch Statement**
   Used to select and execute one block of code from multiple possible options.

Example:

```java
switch (variable) {
    case value1:
        // code block 1
        break;

    case value2:
        // code block 2
        break;

    default:
        // default code block
}
```

---

### 3. Loops in Java

Loops are used to execute a block of code repeatedly until a specified condition is met.

#### Types of Loops

1. **for Loop**
   Used when the number of iterations is known or controlled by a counter.

2. **while Loop**
   Executes a block of code repeatedly as long as the specified condition is `true`.

3. **do-while Loop**
   Executes the code at least once and then continues as long as the condition is `true`.

4. **Enhanced for Loop**
   Used to iterate through elements of arrays and collections.

#### Loop Control Statements

* **break** – Terminates a loop or switch statement immediately.
* **continue** – Skips the current iteration and moves to the next iteration.

---

# 🔷 Object-Oriented Programming (OOP) in Java

Java is an object-oriented programming language. The major OOP concepts covered in this repository include:

* Classes and Objects
* Constructors
* Polymorphism
* Inheritance
* Encapsulation
* Access Modifiers
* Packages
* Getters and Setters

---

## 4. Classes and Objects

### Class

A **class** is a blueprint or template used to create objects. It defines the properties (fields) and behaviors (methods) that objects can have.

### Object

An **object** is an instance of a class. Objects are created using the `new` keyword.

Example:

```java
class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

---

# 5. Constructor in Java

The meaning of a constructor can be understood as **"to construct an object."**

A constructor is a special member of a class that is used to initialize objects. It is automatically called when an object is created.

### Properties of a Constructor

* The constructor name must be the same as the class name.
* A constructor does not have a return type, not even `void`.
* A constructor is automatically called when an object is created.
* Constructors are used to initialize object attributes.

### Types of Constructors

#### 1. Default / No-Argument Constructor

A constructor that does not take any arguments.

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}
```

#### 2. Parameterized Constructor

A constructor that accepts one or more parameters.

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

#### 3. Copy Constructor

Java does not provide a built-in copy constructor like C++, but we can create a constructor that accepts an object of the same class and copies its values.

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}
```

### Destructor in Java

Java does not have a traditional destructor like C++. Java uses **Garbage Collection** to automatically manage memory and remove objects that are no longer reachable.

---

# 6. Polymorphism

The word **Polymorphism** means **"many forms."**

Polymorphism is an OOP feature that allows the same method or operation to behave differently in different situations.

Java mainly supports two types of polymorphism:

### 1. Compile-Time Polymorphism

Also known as **Method Overloading**.

Method overloading occurs when multiple methods have the **same name but different parameters**.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### 2. Runtime Polymorphism

Also known as **Method Overriding**.

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

```java
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# 7. Inheritance

Inheritance is an OOP concept that allows a **child class to inherit properties and methods from a parent class**.

The `extends` keyword is used to implement class inheritance in Java.

Example:

```java
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}
```

### Types of Inheritance

1. **Single Inheritance**
   One child class inherits from one parent class.

2. **Multilevel Inheritance**
   A class inherits from another class, and another class inherits from that child class.

3. **Hierarchical Inheritance**
   Multiple child classes inherit from a single parent class.

4. **Hybrid Inheritance**
   A combination of multiple types of inheritance.

> **Note:** Java does not support multiple inheritance through classes because it can create ambiguity. Multiple inheritance of type can be achieved through interfaces.

---

# 8. Encapsulation

Encapsulation is the process of **wrapping data and methods together inside a class** and controlling direct access to the data.

Encapsulation is commonly implemented using:

* `private` variables
* `public` getter methods
* `public` setter methods

Example:

```java
class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### Getters

A **getter** is a method used to read or retrieve the value of a private variable.

Example:

```java
public String getName() {
    return name;
}
```

### Setters

A **setter** is a method used to set or modify the value of a private variable.

Example:

```java
public void setName(String name) {
    this.name = name;
}
```

---

# 9. Access Modifiers in Java

Access modifiers are keywords used to control the accessibility of classes, methods, constructors, and variables.

### Types of Access Modifiers

| Access Modifier | Same Class | Same Package | Subclass in Other Package | Other Package |
| --------------- | ---------- | ------------ | ------------------------- | ------------- |
| `public`        | ✅          | ✅            | ✅                         | ✅             |
| `protected`     | ✅          | ✅            | ✅                         | ❌             |
| `default`       | ✅          | ✅            | ❌                         | ❌             |
| `private`       | ✅          | ❌            | ❌                         | ❌             |

### 1. Public

Members declared as `public` can be accessed from anywhere, subject to normal Java type/access rules.

```java
public int age;
```

### 2. Private

Members declared as `private` can be accessed only within the same class.

```java
private int age;
```

Private variables are commonly accessed using **getters and setters**.

### 3. Protected

Protected members can be accessed within the same package and by subclasses in other packages.

```java
protected int age;
```

### 4. Default

When no access modifier is specified, the member has **package-private (default) access**.

```java
int age;
```

It can be accessed from classes in the same package.

---

# 10. Packages in Java

A **package** is used to group related classes and interfaces together.

Packages help with:

* Organizing code
* Avoiding naming conflicts
* Controlling access
* Managing large Java applications

Example:

```java
package mypackage;

public class Student {
    
}
```

---


## 🎯 Purpose of This Repository

This repository is used to:

* Learn Core Java concepts
* Practice Java programming
* Understand OOP concepts
* Write and organize Java programs
* Revise concepts for technical interviews
* Track progress while learning Java

---

## 🛠️ Technologies

* **Java**
* **JDK**
* **VS Code**

---

## 👨‍💻 Author

**Shreyash Borkar**

GitHub: [ShreyashBorkar01](https://github.com/ShreyashBorkar01)

---

## ⭐ Progress

This repository will be continuously updated as I learn and practice additional Java concepts.

**Keep Learning • Keep Coding • Keep Improving 🚀**
