import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        if ((x > 0 && y > 0) || (x < 0 && y < 0))
            System.out.print("good");
        else
            System.out.print("ok");
    }
}