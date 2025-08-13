package com.tka.may6;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;

        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Simple assignment
        a = b; // assigns value of b to a
        System.out.println("\nAfter a = b: a = " + a);

        // Add and assign (a = a + 3)
        a += 3;
        System.out.println("After a += 3: a = " + a);

        // Subtract and assign (a = a - 2)
        a -= 2;
        System.out.println("After a -= 2: a = " + a);

        // Multiply and assign (a = a * 4)
        a *= 4;
        System.out.println("After a *= 4: a = " + a);

        // Divide and assign (a = a / 3)
        a /= 3;
        System.out.println("After a /= 3: a = " + a);

        // Modulus and assign (a = a % 3)
        a %= 3;
        System.out.println("After a %= 3: a = " + a);

        // Bitwise AND and assign (a = a & 2)
        a &= 2;
        System.out.println("After a &= 2: a = " + a);

        // Bitwise OR and assign (a = a | 1)
        a |= 1;
        System.out.println("After a |= 1: a = " + a);

        // Bitwise XOR and assign (a = a ^ 3)
        a ^= 3;
        System.out.println("After a ^= 3: a = " + a);

        // Left shift and assign (a = a << 2)
        a <<= 2;
        System.out.println("After a <<= 2: a = " + a);

        // Right shift and assign (a = a >> 1)
        a >>= 1;
        System.out.println("After a >>= 1: a = " + a);

        // Unsigned right shift and assign (a = a >>> 1)
        a >>>= 1;
        System.out.println("After a >>>= 1: a = " + a);
    }
}

