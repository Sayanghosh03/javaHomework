import java.util.Scanner;

public class series5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms:...\t");
        int n = sc.nextInt();
        System.out.print("Enter x:...\t");
        int x = sc.nextInt();
        float result = 0.0f;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %d*%d/%d -", x, i, a);
                result = result + ((float) (x * i) / a);
            } else
                System.out.printf("%d*%d/%d +", x, i, a);
            result = result - ((float) (x * i) / a);
            a += 2;
        }
        System.out.print("\nResult Of The Following Series :  " + result);
    }

}