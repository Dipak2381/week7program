import java.util.Scanner;

/**
 * Created by DIPAK on 3/9/2017.
 */
public class PrimeNumber25
{
    public static void main(String[] args)
    {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number n");
            int n = scanner.nextInt();
            int i = 2;
            int f = 0;
            do {
                if (n != 2 && n % i == 0) {
                    f = 1;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(n));

            if (f == 0) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            }

    }

}
