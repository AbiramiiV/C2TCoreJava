package day4;

public class Constructor_class {
    void print() {
        System.out.println("Normal method");
    }

    // Default constructor
    public Constructor_class() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    public Constructor_class(int a) {
        System.out.println("Parameterized Constructor");
        System.out.println(a);
    }
}