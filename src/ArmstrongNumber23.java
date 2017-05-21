import java.util.Scanner;

/**
 * Created by DIPAK on 3/8/2017.
 */
public class ArmstrongNumber23
{
    public static void main(String[] args)
    {       Scanner s = new Scanner(System.in);
        System.out.println("Enter Any number:");
        int n =s.nextInt();
        int c=0,a,temp;
        temp=n;
        while(n>0)
                {
                    a=n%10;
                    n=n/10;
                    c=c+(a*a*a);
                }
                if(temp==c)
                    System.out.println("armstrong number");
                else
                    System.out.println("Not armstrong number");


    }
}
