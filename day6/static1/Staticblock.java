package day6.static1;

public class Staticblock {
	static {
        System.out.println("Inside static block of AnotherClass");
    }

    public static void main(String[] args) {
        System.out.println("Inside AnotherClass main() method");
    }
}