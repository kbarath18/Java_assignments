import java.util.Scanner;

public class SmallerLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Smaller number: " + Math.min(a, b));
        System.out.println("Larger number: " + Math.max(a, b));

        sc.close();
    }
}
