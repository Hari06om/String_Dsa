import java.util.*;

public class substringgs {

    public static String substring(String str , int s,int e){
        String strr = "";
        for(int i=s;i<e;i++){
            strr += str.charAt(i);
        }
        return strr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stringP: ");
        String str = sc.nextLine();

        // System.out.print(substring(str, 2,7 ));
        System.out.print(str.substring( 2,7 ));


    }
}
