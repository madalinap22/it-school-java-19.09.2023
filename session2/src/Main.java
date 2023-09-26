package session2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v = 9.5f;

        // This one doesn't work because any decimal number is promoted to 'double' by default in Java.
        // float v1 = 9.5; //compilation error

        // In order to make it work, we must use the 'f' suffix right before the semicolon.
        float f = 9.5f;

        // If we simply write down a numeric value and then assign it to a variable, the default 'intuited' type by Java is 'int'.
        // So this is why the following line is not producing any compilation error:
        long l = 10;
        int i = 10;

        // To be sure that Java will avoid any Numeric Promotion and save some time,
        // we can tell Java that we really want to have a long value by adding the 'l' suffix.
        long l1 = 10l;

        // 'char' is a special data type because it can store a single character,
        // and besides that each character is backed by a numeric value according to the ASCII Table.
        // Please refer to: https://ascii.cl/
        char c = 'a';

        char c1 = 65;
        System.out.println(c1); // Will print the corresponding Symbol from the ASCII Table, namely 'A'.

        // String is another special data type because it is not a primitive data type, but an object.
        // It acts as a primitive data type because it is not initialized as a regular Object and it looks much more as a primitive type.
        // On the other hand, String is backed by an array of char values.
        String str = "Hello";

        // There is a concept called 'overloading', so for a given context (operands) an operator can behave differently.
        // In the case of numeric values, the '+' operator does the addition of the operands.
        // For Strings, there is a process called 'concatenation' which takes place between the operands.
        String str1 = str + ", world";
        System.out.println(str1); // Will print 'Hello, world' due to concatenation.

        // Booleans can store either true or false and can be used within control flow statements as conditions.
        boolean isTrue = true;
        boolean isFlase = false;

        if (isTrue) {
            // Will always be evaluated as true since isTrue is true.
            System.out.println("It is true!!!"); // Will print "It is true!!!".
        }

        int x = 1;
        long y = 2;

        // The default behavior for integral values is to promote the smaller type to the greater time.
        long l3 = x + y;

        long l2 = 5;
        float f2 = 1.0f;

        // Even though the date type 'long' has a greater memory size occupied and maybe a greater interval of values,
        // the default behavior in Java is to promote the resulting value to the decimal one.
        float f3 = l2 + f2;

        char b = 1;
        short s = 2;

        // By default, in Java, the addition/subtraction of two interoperable data types will result in having an 'int'.
        // In order to test this behavior, write down:
        // b + x.var and then press tab, the IDE will do the job for you and initialize the resulting variable.
        int result = b + s;

        // Here we have an 'if-then-else' statement which checks either a given grade is passed, failed or unknown.
        int grade = 11;

        if (grade >= 5 && grade <= 10) {
            System.out.println("passed");
        } else {
            // This manner of having a separate block the 'else' branch, instead of in-line '} else if (condition) {'
            // can help us to add custom logic within the 'else' branch like declaring new variables, printing something etc...
            int variable = 1;

            if (grade >= 0 && grade < 5) {
                System.out.println("failed");
            } else {
                System.out.println("unknown grade");
            }
        }

        // This kind of 'if-then-else' is checking in a cleaner manner for the true condition
        // doing the business logic only when the case is found.
        // This manner is helping us in order to do something where there is no case matching.
        if (grade == 10) {
            System.out.println("something");
        } else if (grade == 11) {
            System.out.println("smth else");
        } else if (grade == 8) {
            System.out.println("anything");
        } else {
            System.out.println("done");
        }

        // The ternary operator is like a shorter 'if-then-else', but it must return a value.
        // Compared to the above 'if-then-else' statements, we were allowed to simply write something in the console.
        int year = 2003;

        // The syntax must be followed, and its structure is as follows:
        // [type] variable = (condition) ? value_if_condition_true : value_if_condition_false;
        String str2 = year < 2000 ? "Before '00" : "After '00";
        System.out.println(str2);

        // This is just an example of using a variable of type boolean as a condition in an 'if-then-else' statement.
        if (isTrue) {
            System.out.println("true");
            System.out.println("true 2");
        } else {
            System.out.println("false");
        }

        // This is an instance of Scanner.
        // The Scanner class helps us to read values from keyboard, allowing the user to provide in real-time values.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");

        // This statement is asking the user to type in an integer value.
        // If the input's data type is not the desired one, then this line of code will generate an Exception.
        // There are multiple variants of this method for all kinds of data types (short, byte, long etc...)
        int nextInt = scanner.nextInt();

        if (nextInt < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }

        System.out.println();
        System.out.println();

        System.out.print("Please type in the first number: ");
        int nr_1 = scanner.nextInt();
        System.out.print("Please type in the second number: ");
        int nr_2 = scanner.nextInt();
        System.out.print("Please type in the third number: ");
        int nr_3 = scanner.nextInt();

        // The following two solutions are equivalent in terms of finding out the greatest number between three numbers.
        // The sole difference is that we can find out if the numbers are equal to each other easier using the first approach.
        // Note that based on the precedence, the ">" operator is executed first and then the "&&" operator, while keeping the left to right evaluation.
        if (nr_1 > nr_2 && nr_1 > nr_3) {
            System.out.println("Biggest number is " + nr_1);
        } else if(nr_2 > nr_1 && nr_2 > nr_3){
            System.out.println("Biggest number is " + nr_2);
        } else if(nr_3 > nr_2 && nr_3 > nr_1) {
            System.out.println("Biggest number is " + nr_3);
        } else {
            System.out.println("a = b = c");
        }

        // Having an "if in if" and then a nested statement within the second if implies
        // that both conditions must be true, so the execution will arrive there.
        // This is why merging of these two ifs in a single one joined by '&&' operator works just fine.
        if (nr_1 > nr_2) {
            if (nr_1 > nr_3) {
                System.out.println("The greatest: " + nr_1);
            }
        }

        if (nr_2 > nr_1) {
            if (nr_2 > nr_3) {
                System.out.println("The greatest: " + nr_2);
            }
        }

        if (nr_3 > nr_1) {
            if (nr_3 > nr_2) {
                System.out.println("The greatest: " + nr_3);
            }
        }
    }
}