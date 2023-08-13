import java.util.*;

public class series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Terms...\t");
        byte n = input.nextByte();
        System.out.print("Enter a2:....\t");
        float a2 = input.nextFloat();
        float sum = 0.0f;
        for (int i = 1; i <= n; i++) {
            sum = sum + (a2 / i);

        }
        System.out.println("Sum of the Following Series is: " + sum);

    }

}
