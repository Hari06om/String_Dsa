public class largestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana", "grapes"};
        String largest = fruits[0];
        for (String fruit : fruits) {
            if (largest.compareTo(fruit) < 0) {
                largest = fruit;
            }
        }
        System.out.println(largest);
    }
}
