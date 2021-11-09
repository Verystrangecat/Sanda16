import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if  (! (a>b) )
            if (a>c)
                System.out.print ("1");
            else if (a<b) System.out.print ("3");
            else System.out.print ("4");
        else
            System.out.print ("5");

    }
}