import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class FindIndexInArray6
{


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
             int n = s.nextInt();
        int a[]= {10,20,30,40,50};

        for (int i = 0; i <a.length ; i++)
        {
           if(a[i]==n)
           {
               System.out.println(i);
               break;
           }
        }
    }


}