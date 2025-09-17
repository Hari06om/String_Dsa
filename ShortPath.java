import java.util.*;
import java.util.Scanner;
public class ShortPath {

        public static float ShortPathss(String path){
            int n = path.length();
            int x =0;
            int y =0;
            for(int i=0;i<n;i++){
                int dir = path.charAt(i);
                switch (dir) {
                    case 'S':
                        y--;
                        break;
                    case 'N':
                        y++;
                        break;
                    case 'E':
                        x++;
                        break;
                    case 'W':
                        x--;
                        break;
                    default:
                        break;
                }
                
            }
            int x2 = x*x;
            int y2 =y*y;

            return (float)Math.sqrt(x2+y2);
        }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string  : ");
        String path =sc.nextLine();
        System.out.print(ShortPathss(path));
    }
}
