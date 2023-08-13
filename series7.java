import java.util.Scanner;

public class series7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms:...\t");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("   " + a);
            a = a * 10 + 1;
        }
    }
}
