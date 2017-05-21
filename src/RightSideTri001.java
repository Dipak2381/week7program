import java.util.Scanner;

/**
 * Created by DIPAK on 3/6/2017.
 */
public class RightSideTri001
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
                System.out.print("Enter the number : ");
                int n=scn.nextInt();
                int num=0;
                for (int i = 1; i <=n; i++)
                {
                    for (int j = 0; j <i ; j++)
                    {num++;
                        System.out.print(num);
                    }
                    System.out.println(" ");
                }



    }
}
