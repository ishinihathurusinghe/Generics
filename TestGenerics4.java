public class TestGenerics4 {

    // Generic method that takes an array of any type E and prints its elements
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of Integers
        Integer[] intArray = { 10, 20, 30, 40, 50 };

        // Create an array of Characters
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };

        // Print the Integer array using the generic printArray method
        System.out.println("Printing Integer Array:");
        printArray(intArray);

        // Print the Character array using the generic printArray method
        System.out.println("Printing Character Array:");
        printArray(charArray);
    }
}

