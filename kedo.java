public class kedo {
    
}class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class 1
class Student extends Person {
    int grade;

    // Constructor using super
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method
    void study() {
        System.out.println(name + " is studying.");
    }

    // Method overriding
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Child class 2
class Teacher extends Person {
    String subject;

    // Constructor using super
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method
    void teach() {
        System.out.println(name + " teaches " + subject);
    }

    // Method overriding
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student("Ali", 20, 10);
        s1.displayInfo();
        s1.study();

        System.out.println("-------------------");

        // Create Teacher object
        Teacher t1 = new Teacher("Mr. John", 40, "Math");
        t1.displayInfo();
        t1.teach();
        System.out.println("hello kedja")
    }
}
