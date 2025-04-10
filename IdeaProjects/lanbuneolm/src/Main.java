//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


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