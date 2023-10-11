package session5;

import java.util.Random;

public class StringTest {

    public static void main(String[] args) {
        // String initialization
        String s1 = "test";
        // Checking the identityHasCode of 's1';
        System.out.println("s1 = " + System.identityHashCode(s1));

        // Making s1 point to another String within the String Pool;
        s1 = "testtest";
        String s2 = "test";

        // this will print the same value printed by the first 'sout' as it points to the same value in the String Pool
        // if it was not marked for removal meanwhile by the Garbage Collector
        System.out.println("s2 = " + System.identityHashCode(s2));

        // This now points to another address in the String Pool.
        System.out.println("s1 = " + System.identityHashCode(s1));


        // This one points to where is 'hello' stored in the String Pool
        String helloStringPool = "hello";
        // This one points to a dedicated memory in Heap Space
        String helloHeapSpace = new String("hello");

        // These two lines will print different values as the variables are stored in different memory areas.
        System.out.println("helloStringPool = " + System.identityHashCode(helloStringPool));
        System.out.println("helloHeapSpace = " + System.identityHashCode(helloHeapSpace));

        // This one points to the same address as 'helloStringPool'
        String secondStringPool = "hello";
        System.out.println("secondStringPool = " + System.identityHashCode(secondStringPool));

        secondStringPool += ", Bogdan!"; // saves the String into Heap Space
        // Equivalent to:
        //secondStringPool = new String("hello, Bogdan!");

        System.out.println("secondStringPool = " + System.identityHashCode(secondStringPool));
        System.out.println("helloStringPool = " + System.identityHashCode(helloStringPool));

        String thirdStringPool = "hello, Bogdan!"; // stored in String Pool

        // won't print the same value as one points to String Pool and one points to Heap Space
        System.out.println("thirdStringPool = " + System.identityHashCode(thirdStringPool));
        System.out.println("secondStringPool = " + System.identityHashCode(secondStringPool));

//        System.out.println();
//        System.out.println();

        // manually create a copy of a String stored in Heap Space into the String Pool
        // this method doesn't have any effect on the 'secondStringPool'
        String fourthStringPool = secondStringPool.intern();

        // third and fourth stringpool will print the same value
        System.out.println("thirdStringPool = " + System.identityHashCode(thirdStringPool));
        System.out.println("secondStringPool = " + System.identityHashCode(secondStringPool));
        System.out.println("fourthStringPool = " + System.identityHashCode(fourthStringPool));

//        String test = new String("test");
//
//        String internedTest = test.intern();
//
//        // some code...


        String str1 = "dog"; // points to String Pool
        String str2 = "dog"; // points to String Pool
        String str3 = new String("dog"); // points to Heap Space
        String str4 = new String("dog"); // points to Heap Space, but in another memory address

        if (str4 == str3) {
            System.out.println("it's the same dog");
        } else {
            // will print 'different'
            System.out.println("different");
        }

        // in order to check the content equality, we can use the '.equal(String)' method
        if (str1.equals(str3)) {
            System.out.println("it's the same dog");
        } else {
            System.out.println("different");
        }


        String test = "test";

        // Methods exposed by String class
        System.out.println(test.length());
        System.out.println(test.charAt(1));
        System.out.println(test.indexOf('t'));
        System.out.println(test.substring(2));

        // retrieves the character on position 2
        String substr = test.substring(2, 3);

//       System.out.println(test.substring(2, 3));

        System.out.println(test);
        // this is not affecting the 'test' variable, a clone corresponding the toUpperCase rule is returned.
        System.out.println(test.toUpperCase());
        System.out.println(test);
//
        System.out.println(test.startsWith("t"));
        System.out.println(test.endsWith("t"));

        System.out.println(test.contains("es"));
        // again the content is not affected, a clone with replaced strings is returned
        System.out.println(test.replace("est", "tse"));
        System.out.println(test);


        String untrimmed = "   trim    mee  ";
        System.out.println(untrimmed);

        // removes the 'white spaces' before leading and trailing
        System.out.println(untrimmed.trim());
        // does the same, but with for more characters like white spaces
        System.out.println(untrimmed.strip());

        // let's say that you have to create a big string based on many conditions
        // this will lead to multiple memory allocations because each appending will create space in the Heap Space.
        String strAppend = "test";

        if (1 > 3) {
            strAppend += "something";
        }

        strAppend += ", test";

        // for such scenarios, we have StringBuilder and StringBuffer (thread-safe)
        // This won't create any string and will keep only an array of characters
        StringBuilder stringBuilder = new StringBuilder("test");

        // this will just update the array, there its always checked if the array is big enough to accommodate the new string
        stringBuilder.append(", test");
        if (2 == 2) {
            stringBuilder.append("something");
        }

        // just here a new memory area is allocated in the Heap Space
        String myString = stringBuilder.toString();

        StringBuilder sb = new StringBuilder("A");
        sb.append(" dog");
        sb.append(4);
        // methods applied on StringBuilder which modify the current string value
        sb.insert(5, " has ");
        sb.insert(1, " yo.");
        sb.reverse();

//        System.out.println(sb);

//        String s = sayHi();
//        System.out.println(s);
//        returnNothing();

        int[] grades = new int[30];
        Random random = new Random();

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(5,11);
        }

        // here we can store the value returned by a function in a variable
        float average = computeAverage(grades);
        System.out.println(average);

        // here we ignore the returned value
        // to a varargs we can either pass an array or an enumeration of numbers
        computeAverage(grades);
        // having vargargs allows us to call the methoud without parameters
        // this will be converted in an empty array; new int[0];
        computeAverage();
        computeAverage(1, 2, 3, 4, 5);

        // this line will print "hello" into the console.
        printHello();
        doSomething("test", 2, 1, 36543, 53654);

        int sum = doSum(0, grades, 0);
        System.out.println(sum);
    }

    public static void printHello() {
        System.out.println("hello");
    }

    // this will compute the average value within an array
    public static float computeAverage(int... numbers) {
        int sum = 0;

        // we can also use foreach where i is the numbers[i] equivalent, so directly the value on a specific index.
//        for (int i: numbers) {
//
//        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return ((float) sum) / numbers.length;
    }

    // this is trying to compute the average by calling the recursive function 'doSum'
    public static float computeAverageRecursive(int... numbers) {
        return ((float) doSum(0, numbers, 0)) / numbers.length;
    }

    // varargs must be placed last in the parameters' list
    public static void doSomething(String s, int x, int... numbers) {
        int number = numbers[1];
    }

    // recursive function to compute the sum
    public static int doSum(int i, int[] numbers, int sum) {
        if (i == numbers.length) {
            // if the i equals numbers.length then we return the already computed sum.
            return sum;
        }
        // this will call itself while the 'i' index is not equal to the array's length
        // each call will increment the index 'i' and will also add to the old sum the current number.
        return doSum(i + 1, numbers, sum + numbers[i]);
    }
}
