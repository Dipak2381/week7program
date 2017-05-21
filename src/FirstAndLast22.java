import java.util.Scanner;

/**
 * Created by DIPAK on 3/8/2017.
 */
public class FirstAndLast22
{
    public static void main(String[] args)

    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any five number:");
        int n = s.nextInt();
        int last=n%10;
        int first=0;
        while(n>=1){
            first=n;
            n=n/10;
        }

        System.out.println("sum of first and last digits: "+(first+last));

    }
}
