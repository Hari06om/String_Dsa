import  java.util.*;
public class LEtterSeprate {

    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name : ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;

        printLetter(fullName);
    }

}
