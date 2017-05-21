import java.util.Scanner;

/**
 * Created by DIPAK on 3/9/2017.
 */
public class MultiplicationTable27
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number you want print Multiplication Table:");
        int s1 =s.nextInt();
        int i = 1;
        do {
            int value = s1 * i;
            System.out.println(s1 + " * " + i + " = " + value);
            i++;
        } while ( i <= 10 );
    }
}
