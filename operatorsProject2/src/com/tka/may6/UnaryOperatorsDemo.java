package com.tka.may6;

public class UnaryOperatorsDemo {
    public static void main(String[] args) {

        int a = 5;
        boolean flag = true;

        System.out.println("Initial value of a: " + a);

        // Unary plus (+)
        int plus = +a;
        System.out.println("Unary plus (+a): " + plus);

        // Unary minus (-)
        int minus = -a;
        System.out.println("Unary minus (-a): " + minus);

        // Pre-increment (++a)
        System.out.println("Pre-increment (++a): " + (++a)); // a becomes 6 before printing

        // Post-increment (a++)
        System.out.println("Post-increment (a++): " + (a++)); // prints 6, then a becomes 7
        System.out.println("Value of a after post-increment: " + a);

        // Pre-decrement (--a)
        System.out.println("Pre-decrement (--a): " + (--a)); // a becomes 6 before printing

        // Post-decrement (a--)
        System.out.println("Post-decrement (a--): " + (a--)); // prints 6, then a becomes 5
        System.out.println("Value of a after post-decrement: " + a);

        // Logical NOT (!)
        System.out.println("Logical NOT (!flag): " + (!flag));

        // Bitwise complement (~)
        int bitwise = ~a;
        System.out.println("Bitwise complement (~a): " + bitwise);
    }
}
