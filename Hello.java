// // class Hello{
// //     public static void main(String[] args) {
// //         System.out.println("Hello, World!");
// //     }
// // }

// // class Hello {
// //     public static void main(String[] args) {
// //         System.out.println("Hello, World!");
// //         System.out.println("Hello, World!");
// //     }
// // }

// -----------------------------------------------------------------------------
// ------------------------------ Operators in Java ------------------------------------
// Operators are special symbols that perform specific operations on one, two, or three operands, 
//                                          and then return a result.
// There are different types of operators in Java, such as arithmetic operators, relational operators, 
//                                          logical operators, bitwise operators, assignment operators, and more.
// 1. Arithmetic Operators: These operators are used to perform basic arithmetic operations like addition, 
//                                            subtraction, multiplication, division, and modulus.
// 2. Relational/Comparison Operators: These operators are used to compare two values and return a boolean 
//                                              result (true or false).
// 3. Logical Operators: These operators are used to combine multiple boolean expressions and return a boolean result.
// 4. Bitwise Operators: These operators are used to perform bit-level operations on integer values.
// 5. Assignment Operators: These operators are used to assign values to variables.


// class Hello {
//     public static void main(String args []){
    // int a=10;
    // int b=0;

    // b = a++;


    //  System.out.println("A :" + a);
    //  System.out.println("B :" + b);

// -----------------------------------------------------------------------------
    
    //  int a=10;
    // int b=0;

    // b = a--;


    //  System.out.println("A :" + a);
    //  System.out.println("B :" + b);


    // -----------------------------------------------------------------------------

    //  int a=20;
    // int b=30;

    //  System.out.println("A :" + a);
    //  System.out.println("B :" + b);

    //  System.out.println(a==b);
    //  System.out.println(a!=b);

    //  System.out.println(a>b);
    //  System.out.println(a<b);
    //  System.out.println(a<=b);
    //  System.out.println(a>=b);

// -----------------------------------------------------------------------------
//     int a=25;
//     int b=35;
//     int c= 45;
//     int d=55;

//     System.out.println("And :" + (a<b  &&  c<d));
//     System.out.println("And :" + ( a>b  && c>d));


//     System.out.println("Not :" +(!(a<b )));
//     System.out.println("NOT :" +(!(a>d)));



//     System.out.println("OR :" + (a<b || c<d));
//     System.out.println("OR :" + (a>b || c>b));

// }}


//  ----------------------------------------------------------------------------------------------------------
// ---------------------------------------------Condition Statements in Java-------------------------------------------
// Condition statements are used to perform different actions based on different conditions.
// There are different types of condition statements in Java, such as if statement, if-else statement,
//                                 if-else-if statement, switch statement.


//   1. If Statement: The if statement is used to execute a block of code if a specified condition is true.
//   2. If-Else Statement: The if-else statement is used to execute one block of code if a specified condition is true, 
//                                    and another block of code if the condition is false.
//   3. If-Else-If Statement: The if-else-if statement is used to execute one of several blocks of code based on the evaluation of multiple conditions.
//   4. Switch Statement: The switch statement is used to select one of many code blocks to be executed.
//                         it is used when there are multiple possible values for a variable, and we want to execute different code based on the value of that variable. 
//                         It has syntax such as switch(variable) { case value1: // code block 1 break; case value2: // code block 2 break; ... default: // code block n }
//   

// import java.util.*;
// public class Hello {

//     public static void main(String args[])
//     {
    //    Scanner sc = new Scanner(System.in); 
        // int age =sc.nextInt();

        // if (age >= 18)  {
        //     System.out.println("Adult");
        // } 
        // else {
        //     System.out.println("Not Adult");
        // }  
// ------------------------------------------------------------------------------
    // Even Odd 
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();

    // if (x%2 == 0){
    //     System.out.println("Even");
    // } else {
    //     System.out.println("Odd");
    // }
// ------------------------------------------------------------------------------
    //   comparing two numbers
    // Scanner sc = new Scanner (System.in);
    // int A = sc.nextInt();
    // int B = sc.nextInt();

    // if (A == B){
    //     System.out.println("A is equal to B");
    //     }
    //     else {
    //         if(A<B){
    //             System.out.println("A is lesser then B");

    //         }else {
    //             System.out.println("A is greater than B");
    //         }
    //     }
// ------------------------------------------------------------------------------
    // making above code more readable using else if statement
    //  if --- else-if  -- else
    
//         Scanner sc = new Scanner (System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         if (A ==B){
//             System.out.println("A is equal to B");
//         }
//     else if (A< B) {
//         System.out.println(" A is smaller than B");
//     }
//     else{ System.out.println("A is greater than B");
// }
// ------------------------------------------------------------------------------
//    Switch case statement
        // Scanner sc = new Scanner(System.in); 
        // int day = sc.nextInt();

        // switch (day){

        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("WEDNESDAY");
        //         break;
        //     case 4:
        //         System.out.println("THURSDAY");             
        //         break;
        //     case 5:
        //         System.out.println("FRIDAY");
        //         break;
        //     case 6:
        //         System.out.println("SATURDAY");
        //         break;
        //     case 7:
        //         System.out.println("SUNDAY");
        //         break;  
        //     default:
        //         System.out.println("Invalid day");
        //         break;

        // } }    }
// ------------------------------------------------------------------------------
//  ------------------------------ VOWEL OR NOT ---------------------------------------------
    //   import java.util.*;
    //   public class Hello{
    //     public static void main(String args[]){
    //          System.out.println("Enter a character to check whether it is vowel or not");
    //         Scanner sc = new Scanner (System.in);
    //         char ch = sc.next().charAt(0);

    //         if (ch == 'a' || ch == 'e'|| ch == 'i' || ch =='o' || ch == 'u') {
                
    //             System.out.println("Vowel");
    //         } 
    //         else {
    //             System.out.println("Not Vowel");
    //         }
    //  }  }



//         // ------------------------------------------------------------------------------
// //  ------------------------------ CALCULATOR USING SWITCH CASE ---------------------------------------------
// import java.util.*;

// public class Hello {

//     public static void main(String args[])
//     {            
//    System.out.println("Welcome to calculator");
//           Scanner sc =  new Scanner (System.in);
//           System.out.println("Enter first numbers");
//           int A = sc.nextInt();
//           System.out.println("Enter second number");
//           int B = sc.nextInt();
//             System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division, 5 for Modulas");
//           int calculator = sc.nextInt();
//           switch (calculator){

//             case 1:
//                 System.out.println("Addition = " + (A + B));
//                 break;
//             case 2:
//                 System.out.println("Subtraction = " + (A-B));
//                 break;
//             case 3:
//                 System.out.println("Multiplication = " + (A * B));
//                 break;
//             case 4:
//                 System.out.println("Division = " + (A / B));
//                 break;
//             case 5:
//                 System.out.println("Modulus = " + (A % B));
//                 break;
//           } }  }



// ---------------------------------------------------------------------------------------------------------------------------------
// -----------------------------------------------Loops in Java------------------------------------------------------------
// Loops are used to execute a block of code repeatedly until a specified condition is met.
// There are different types of loops in Java, such as for loop, while loop, do-while loop, and enhanced for loop. 


// 1. For Loop: The for loop is used to execute a block of code a specified number of times.
// 2. While Loop: The while loop is used to execute a block of code repeatedly as long as a specified condition is true.
// 3. Do-While Loop: The do-while loop is used to execute a block of code at least once, and then repeatedly as long as a specified condition is true.  
// 4. Enhanced For Loop: The enhanced for loop is used to iterate over the elements of an array or a collection.
// 5. Break Statement: The break statement is used to exit a loop or a switch statement prematurely.
// 6. Continue Statement: The continue statement is used to skip the current iteration of a loop and move on to the next iteration.
// 

//  Example-->   For Loop: The for loop is used to execute a block of code a specified number of times.
// public class Hello{
//       public static void main(String arge[]){
//         for (int i = 0; i<5; i++){
//             System.out.println(i+" ");
//      } } }


     //  Example-->   While Loop: The while loop is used to execute a block of code repeatedly as long as a specified condition is true.

    //  public class Hello{
    //     public static void main(String args[]){
    //         int i = 0;
    //         while (i > -8){
    //             System.out.println(i);
    //             i--;  // i = i - 1;
    //         }  } }

// Example-->   Do-While Loop: The do-while loop is used to execute a block of code at least once, and then repeatedly as long as a specified condition is true.

//  public class Hello{
//     public static void main(String args[]){
//         int i = 0;
//          do{
//             System.out.println(i);
//             i++;
//          }
//          while (i < 5);
//     }
//  }


// ---------------------------------------------------------------------------------------------------------------------------------

//  Printing table with the help of for loop:

// import java.util.*;
// public class Hello{
//     public static void main(String args[]){
//         System.out.print("Write a N number: "  + " ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<=10; i++){
//             System.out.println(n + " x " + i + " = " + (i * n));

//         } }  }

// ---------------------------------------------------------------------------------------------------------------------------------


//   Code for Sum of First N Natural Numbers using For Loop, While Loop and Do-While Loop.   

//  For loop--->   n = 8

// import java.util.*;
// public class Hello{
//     public static void main(String args[]){
//            System.out.print("Write a N number: "  + " ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum = sum + i;
//         }  
//     System.out.println(sum);
// } }
// -----------------------------------------------------------------------------
//  while loop --->  n = 9
  
// public class Hello{
//     public static void main (String args[]){
//         int n = 1;
//         int sum = 0;
//         while (n <=9) { 
//             sum = sum + n;
//             n++;
//         } System.out.println(sum);
//     }  }
// -----------------------------------------------------------------------------
//  Do-while Loop ------>  n = 10

// public class Hello{
//     public static void main(String args[]){
//         int n = 1;
//         int sum = 0;
//         do { 
//             sum = sum + n;
//             n++;
//         } while (n<=10);
//           System.out.println(sum);
//                       }   }
    


//  ----------------------------------------------------------------------------------------------------------
//  ---------------------------------------------Classes and Objects in Java-------------------------------------------

// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println(" Writting Some Research Paper");
//     }

//     public void print(){
//         System.out.println(this.color);
//     }
// }

// ----------------------------------------------------------------------------------------------------------

// class Student{
//     String Name;
//     int Age;


// public void studentinfo(){
//     System.out.println(this.Name);
//     System.out.println(this.Age);
// }

// Student() {
//     System.out.println("Constructor is Calles");
//  } 

//  Student(String name, int Age){
//     this.Name = name;
//     this.Age = Age;
//  }

//  Student(Student s2){
//     this.Name = s2.Name;
//     this.Age = s2.Age;
//  }

//  Student(){

//  }
// }

 

// public class Hello {
//     public static void main(String args[]) {
//         // Pen pen1 = new Pen();
//         // pen1.color = "Blue";
//         // pen1.type = "Gel";
//         // pen1.write();

//         // Pen pen2 = new Pen();
//         // pen2.color = "Black";
//         // pen2.type = "Ballpen";

//         // pen1.print();
//         // pen2.print();


//         Student s1 = new Student();
//         s1.Name = "SHreyash";
//         s1.Age = 23;



//         Student s2 = new Student(s1);
//         // s1.Name = "Rohit";
//         // s1.Age = 22;

//         s1.studentinfo();

//     }
// }
//  -------------------------------------------------------------------------------------------------


//   ---------Constructor ---------
//         Meaning of Constructor is "To Construct an Object". 
//    It is a special type of method that is used to initialize the object. 
//    It is called when an object of a class is created. 
//    It can be used to set initial values for object attributes. 


// Distructor is a special type of method that is used to destroy the object.
// In Java, there is no concept of destructor because Java has automatic garbage collection.


//       -------Properties of Constructor: ------
//   - Constructor name is same as class name
//   - Constructor has no return type( not even void and int, string etc)
//   - Constructor is called automatically when an object of a class is created 
//           and called only once during the lifetime of an object.


// Types of Constructor:
// 1. Default Constructor: A constructor that takes no arguments is called a default constructor.
// 2. Parameterized Constructor: A constructor that takes arguments is called a parameterized constructor.  
// 3. Copy Constructor: A constructor that takes an object of the same class as an argument is called a copy constructor.


// ------------------------------------------------------------------------------------------------------------------


// 1.Defoult Constructor example: 

// class Student{
//     String name;
//      int age; 

//      Student(){
//         System.out.println("Hii this is Shreyash");
//      }
// }

// public class Hello{
//     public static void main(String args[]){
//         Student s1 = new Student();
//     }
// }
// ----------------------------------------------------------------------------------------------------


// 2. Parameterized Constructor example:


// class Student{
//     String Name;
//     int Age;

//     public void Printinfo(){
//         System.out.println(this.Name);
//         System.out.println(this.Age);
//     }

//     Student(String name, int age){
//         this.Name = name;          // Here "Name" is object and "name" is parameter of constructor.  
//         this.Age = age;
//     }

// class Hello{
//     public static void main(String args[]){
//          Student s1 = new Student("Shreyash",  24);
//          s1.Printinfo();
//     }
// }
//  ---------------------------------------------------------------------------------------------------------


// 3. Copy Constructor example: 

// In Java, a copy constructor is a constructor that creates a new object as a copy of an existing object. 
// It takes an object of the same class as a parameter and initializes the new object's attributes with the values of the existing object's attributes. 


// class Student{
//     String Name; 
//     int Age;


// public void studentinfo(){
//     System.out.println(this.Name);
//     System.out.println(this.Age);
// }

//  Student(Student s2){
//     this.Name = s2.Name;
//     this.Age = s2.Age;
//  }

//  Student(){
    
//  }
// }

// public class Hello {
//     public static void main(String args[]) {
        
//         Student s1 = new Student();
//         s1.Name = "SHreyash";
//         s1.Age = 23;



//         Student s2 = new Student(s1);
//         s1.studentinfo();
//     }
// }  


// -------------------------------------------------------------------------------------------------------

//   -----  Polymorphism -----  ->


//  Meaning of Polymorphism is "Many Forms".
//    It is a feature of OOPs that allows us to perform a single action in different ways. 
//   There are two types of polymorphism in Java: Compile-time polymorphism and Runtime polymorphism.



//  The compile-time polymorphism is also known as method overloading.
// The runtime polymorphism is also known as method overriding.



//  Types of Polymorphism:
// 1. Compile-time polymorphism (Method Overloading): 
//  Meaning of Method Overloading is "More than one method with same name but different parameters".

// 2. Runtime polymorphism (Method Overriding):
//  Meaning of Method Overriding is "More than one method with same name and same parameters".

// -------------------------------------------------------------------------------------------------------------------------------------  


// Example of Compile-time polymorphism (Method Overloading):


// class Student{
//     String name;
//     int age;
     
//      public void printinfo(String name){
//         System.out.println(name);
//      }

//      public void printinfo(int age) {
//         System.out.println(age);
//      }

//      public void printinfo(String name, int age){
//         System.out.println(name + " " + age);
//      }
// }
// class Hello{
//     public static void main(String args[]){
//         Student s1 = new Student();
//           s1.name = "Shreyash";  
//           s1.age = 24;

//     s1.printinfo(s1.name);
//     s1.printinfo(s1.age); 

//     }
// }
// -------------------------------------------------------------------------------------------------------------------

//  ------------------Inheritance------------------>

//  Meaning of Inheritance is "To Inherit the Properties of Parent Class to Child Class".
//  It is a feature of OOPs that allows us to create a new class from an existing class.

//  Types of Inheritance:
//  1. Single Inheritance: When a child class inherits from a single parent class.  
//  2. Multilevel Inheritance: When a child class inherits from a parent class and then another child class inherits from the first child class.
//  3. Hierarchical Inheritance: When multiple child classes inherit from a single parent class.
//  4. Hybrid Inheritance: When a combination of two or more types of inheritance is used.

//   -----------------------------------------------------------------------

// Example of Inheritance:

// class Shape{
//     String color;
// }
//     class Triangle extends Shape{
       
//     }

// public class Hello{
//     public static void main(String args[]){
//         Circle c1 = new Circle();
//         c1.color = "Blue";
//     }
// }

//  --------------------------------------------------------------------------------------------------------------------------------

// 1. Single Inheritance Example:

// class Shape{
//     public void area(){
//         System.out.println("Area is displayed  ");
//     }
// }

// class Rectangle extends Shape{
//     public void area( int length, int width){
//   System.out.println(length * width);
//     }
// }

// public class Hello{
//     public static void main(String arge[]){
//         Rectangle r1 = new Rectangle();
//         r1.area(5, 10);
//     }
// }

//  -----------------------------------------------------------------------------------------------------

// 2. Multilevel Inheritance Example:     base class -> derived class -> derived class


// class Shape{
//     public void area(){
//         System.out.println("Area is displayed  ");
//     }
// }

// class Rectangle extends Shape{
//     public void area( int length, int width){
//   System.out.println(length * width);
//     }
// }

// class Square extends Rectangle{
//     public void area(int side){
//         System.out.println(side * side);
//     }
// }

// public class Hello{
//     public static void main(String arge[]){
//         Rectangle r1 = new Rectangle();
//         r1.area(5, 10);

//         Square s1 = new Square();
//         s1.area(5);
//     }
// }


// -----------------------------------------------------------------------------------------------------------------

// 3. Hierarchical Inheritance Example:   base class -> derived class 1, derived class 2, derived class 3


// class Shape{
//     public void area(){
//         System.out.println("Area is displayed  ");
//     }
// }

// class Rectangle extends Shape{
//     public void area( int length, int width){
//   System.out.println(length * width);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14 *r * r);
//     }
// }

// class Triangle extends Shape{
//     public void area(int b, int l){
//         System.out.println(0.5 * b * l);
//     }
// }


// public class Hello{
//     public static void main(String arge[]){
//         Rectangle r1 = new Rectangle();
//         r1.area(5, 10);

//         Circle c1 = new Circle();
//         c1.area(5);

//         Triangle t1 = new Triangle();
//         t1.area(5, 10);
//     }
// }

// ------------------------------------------------------------------------------------------------

// 4. Hybrid Inheritance Example: 
// It is a combination of two or more types of inheritance.
//    parent class -> derived class 1 -> derived class 2, derived class 3



// ---------------------------Encapsulation-------------------->


//   --------Package and Access Modifiers in Java:---------


  // To learn encaplsulation, you need to understand the concept of access modifiers in Java.


//  Access Modifier:->  It is a keyword that is used to set the access level of a class, method, or variable.

//  Types of Access Modifiers in Java:
// 1. Public: The class, method, or variable is accessible from any other class
// 2. Private: The class, method, or variable is accessible only within the same class.
//                 and to accesss this private access modifier we use getters & setters concept function.
//         Getters:- getters meaning taking OR reading the data.
//         Setters:-  Putting data OR Setting any value is called setters
// 3. Protected: The class, method, or variable is accessible within the same package and in another package only sub-class can access.
// 4. Default: The class, method, or variable is accessible only within the same package, other packages cannot access it.





// import bank;
// class Shape{
//     public void area(){
//         System.out.println("Area is displayed  ");
//     }
// }

// class Rectangle extends Shape{
//     public void area( int length, int width){
//   System.out.println(length * width);
//     }
// }

// class Square extends Rectangle{
//     public void area(int side){
//         System.out.println(side * side);
//     }
// }

// public class Hello{
//     public static void main(String arge[]){
//         Rectangle r1 = new Rectangle();
//         r1.area(5, 10);

//         Square s1 = new Square();
//         s1.area(5);

//         bank.Account account1 = new bank.Account();
//         account1 = "customer1";
//     }
// }








