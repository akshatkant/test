package test;

public class test2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
    public static void greet(String name) {
        if (name != null && !name.isEmpty()) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
    public static void greet() {
        System.out.println("Hello, World!");
    }
    public static void greet(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            System.out.println("Hello, " + firstName + " " + lastName + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
    public static void greet(String[] names) {
        if (names != null && names.length > 0) {
            for (String name : names) {
                if (name != null && !name.isEmpty()) {
                    System.out.println("Hello, " + name + "!");
                } else {
                    System.out.println("Hello, World!");
                }
            }
        } else {
            System.out.println("Hello, World!");
        }
    }
}
