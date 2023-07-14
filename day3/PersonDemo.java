package day3;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter Income: ");
        int income = sc.nextInt();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        System.out.println(person);

        Taxcalci tax = new Taxcalci();
        tax.calculateTax(person);

        System.out.println("After tax Calculation");

        System.out.println(person);
        sc.close();
    }
}