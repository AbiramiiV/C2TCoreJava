package day6.static1;

public class Staticmain {
    public static void main(String[] args) {
        System.out.println("Inside StaticMain main() method");

        // Calling static method from StaticMethods class
        Staticmethods.staticMethod();
    }
}