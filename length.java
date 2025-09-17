import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        int length = name.length();
        System.out.println("The length of the string is: " + length);
        sc.close();
    }
}
