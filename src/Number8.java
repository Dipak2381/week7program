import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class Number8 {
    public static void main(String[] args) {

        {
            int n, num;
            int x = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of element you want in array:");
            n = scanner.nextInt();
            int a[] = new int[n + 1];
            System.out.println("Enter all elements:");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();

            }
            System.out.print("Enter the position where you want to insert elements:");

            num = scanner.nextInt();
            System.out.print("Enter the element you want to insert:");
            x = scanner.nextInt();
            for (int i = (n - 1); i >= (num - 1); i--) {
                a[i + 1] = a[i];
            }
            a[num - 1] = x;
            System.out.print("After inserting:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + ",");

            }
            System.out.print(a[n]);

        }
    }
}