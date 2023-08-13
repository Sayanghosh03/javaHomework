import java.util.Scanner;

public class series8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms:...\t");
        int n = sc.nextInt();
        int a = 1, sum = 0;
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            a = a * i;
            result = result + ((double) sum / a);

        }
        System.out.print("Result Of The Following Series Is:" + result);

    }
}
