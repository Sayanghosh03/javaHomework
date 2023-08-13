import java.util.Scanner;

public class series9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Terms To Calculate Factorial:....\t");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum = sum + fact;
        }
        System.out.print("Sum of Factorial Is:...\t" + sum);

    }

}
