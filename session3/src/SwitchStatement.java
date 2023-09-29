import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // if-then-else vs switch
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the week day: ");
        int weekDay = scanner.nextInt();

        // If we have particular values and we want to do something for each case
        // using if statements will lead in a long and messy code.

        // Also, even the best practices recommend that if you have more than two conditions
        // you should replace the if statement with the switch statement.
        if (weekDay == 1) {
            System.out.println("It's Monday");
        } else if (weekDay == 2) {
            System.out.println("It's Tuesday");
        } else if (weekDay == 3) {
            System.out.println("It's Wednesday");
        } else if (weekDay == 4) {
            System.out.println("It's Thursday");
        } //...etc

        // Before Java 14
        // Even though this code seems longer, it also prevents the programmer from messing around with the cases.
        // If-then-else statements can cause problems because you can easily insert bugs
        // Switch is providing this isolation between cases just by its syntax.

        // If we don't add the "break" statement, when weekDay will match a case, it will continue to run until
        // it will find a break statement meaning that it will execute the lines of code corresponding other cases.

        // The default case works like a fallback mechanism, if none of the above case caught the value, then we rely on the default statement.
        // Default is not mandatory in the switch statement.
        switch (weekDay) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        // Java 14+
        // Features: break; is not required anymore;
        //          arrow operator instead of a curly braces
        //          in-line return statement instead of repeating return in each case.
        switch (weekDay) {
            case 1, 2, 3, 4 -> System.out.println("It's a sad day..");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Unknown day");
        }

        // If we need to repeat some lines of codes, we do have repetitive structures.
        // The easiest structure is the "while loop" statement
        int x = 1;

        // Between parentheses, we do have a condition which is checked before each iteration.
        // We can also have while in while like we saw in the 'ifs' statements.
        while (x <= 10) {
            System.out.println("x = " + x);

            // Don't forget to update the value used in the condition in order to avoid infinite looping.
            x++;
        }

        // Another variant of 'while' statement is the 'do-while' statement.
        // Its less common used in real-life scenarios,
        // but what it does is that you can be sure that the lines of code are executed at least once.
        int y = 1;

        // this will print y even though the condition is not true;
        // dont forget to update the variable used in condition, this is just an example;
        do {
            System.out.println("y = " + y);
        } while (y != 1); // don't forget to add the semicolon for 'do-while'

        // The most common repetitive structure is the 'for loop'
        // it provides a structure composed by an initialization statement, a condition and an update statement.

        // This will print all numbers starting from 0 to 9 inclusive.
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // We can also forget about any of those statements present in the structure like this:
        int it = 1;

        for (; it < 10; it++) {
            System.out.println("it = " + it);
        }

        // or
        // this will cause infinite loop so don't forget to exit the loop manually if the condition is missing from the 'for' structure
        for (;; it++) {
            System.out.println("it = " + it);
            if (it == 10) {
                // this will force quit the closest 'for' statement.
                break;
            }
        }

        // we can also have this kind of for which will just execute the containing lines of code indefinitely
        /*for (;;) {
            System.out.println("here");
        }*/

        // We can also break a specific repetitive structure
        // this will print:
        // i = 0
        // j = 0
        // j = 1
        // and then will stop
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                if (j == 1) {
                    // this won't break the closest 'for', but the one marked with the 'outer' label.
                    break outer;
                }
            }
        }

        // There is also another jump statement called 'continue'
        // This will stop the execution and continue with the next iteration.

        // This will print only the odd numbers.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        // this will print:
        // i = 0
        // j = 0
        // j = 1
        // i = 1
        // j = 0
        // j = 1
        // etc...
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                if (j == 1) {
                    // this won't continue the closest 'for', but the one marked with the 'outer' label.
                    continue outer;
                }
            }
        }
    }
}