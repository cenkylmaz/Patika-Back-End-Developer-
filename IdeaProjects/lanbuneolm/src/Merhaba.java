import java.util.Scanner;

public class Merhaba {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz: ");
        Scanner number  = new Scanner(System.in);

        boolean isPolidrom = isPolidrom(number);


    }
    private static boolean isPolidrom(int number) {
        int originalnumber  = number;
        int reversednumber = 0;




    }
    public class Counter {
        static int count = 0;
        public static void increment() {
            count++;    }

        public static void printCount() {
            System.out.println("Count: " + count);
        }
    }

// Main method in another class

    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        Counter.printCount(); // prints "Count: 2"
    }
}
