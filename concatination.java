import java.util.*;

public class concatination {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("the first name is : ");
        String firsstName = sc.nextLine();
        System.out.print("the last name is : ");
        String LsstName = sc.nextLine();

        String fullName = firsstName + " " + LsstName ;

        System.out.print("the full name is : " + fullName);

    }
}
