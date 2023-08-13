import java.util.Scanner;

public class series6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms:...\t");
        int n = sc.nextInt();
        int x = 2;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result = result + (x * i);
            } else
                result = result - (x * i);
        }
        System.out.print("Result Of The Following Series : \t" + result);

    }
}
