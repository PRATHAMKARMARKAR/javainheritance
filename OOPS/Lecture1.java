class Pen {
  String color;
  double tip;

  void PrintDetails() {
    System.out.println("Writting Something!");
  }

  void PrintColor() {
    System.out.println(this.color);
    System.out.println(this.tip);
  }
}

class Student {
  String name;
  int age;
  int rollno;

  // Constructor
   Student(String name, int age, int rollno) {
    this.name = name;
    this.age = age;
    this.rollno = rollno;
  }
  //Copy constructor
  Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
    this.rollno = s2.rollno;
  }
  // their is no distructor in java as java has garbage collector which automatically deallocates the memory
  // polymorphism is also not there in java as function overloading is there in java
  // their are two rule of function overloading 1. different return type(void, int etc) 2. different parameters (int, string etc)
  // function overloading is also a part of polymorphism, exampl ->
  void PrintDetails(String name) {
    System.out.println("Name: " + name);
  }
  void PrintDetails(int age) {
    System.out.println("Age: " + age);
  }
  void PrintDetails(String name, int age) {
    System.out.println("Name: " + this.name+" "+"Age: " + this.age);
  }
}
public class Lecture1 {
  public static void main(String[] args) {
    Pen Pen1 = new Pen();
    Pen1.color = "Blue";
    Pen1.tip = 0.5;
    Pen1.PrintDetails();
    Pen1.PrintColor();
    Pen Pen2 = new Pen();
    Pen2.color = "Black";
    Pen2.tip = 0.7;
    Pen2.PrintDetails();
    Pen2.PrintColor();
    Student s1 = new Student("Charlie", 21, 789);
    Student s2 = new Student(s1);
    s2.PrintDetails(s2.name);
    s2.PrintDetails(s2.age);
    s2.PrintDetails(s2.name, s2.age);
  }
}
