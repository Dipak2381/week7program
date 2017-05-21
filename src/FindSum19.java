import java.util.Scanner;

/**
 * Created by DIPAK on 3/7/2017.
 */
public class FindSum19
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter any five digit number:");
        int a =s.nextInt();


        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
