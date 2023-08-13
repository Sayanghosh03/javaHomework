import java.util.*;

public class series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        System.out.print("Enter Number Of Terms:...\t");
        byte n = sc.nextByte();
        System.out.print("Enter a...\t");
        int a = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + (a * i) / i;

        }
        System.out.print("Sum Of The Following Series Is: ....\t" + sum);

    }

}
