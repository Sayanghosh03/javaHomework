import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Terms:....\t");
        int n = sc.nextInt();
        System.out.println("Following Series is:");

        for (int i = 1; i <= n; i++)

            System.out.print("   " + i * 10);

    }
}
