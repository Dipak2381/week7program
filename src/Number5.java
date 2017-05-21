import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class Number5
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Input number");
        int n =s.nextInt();

       int a[] = {10,20,30,40,50};
        if (a[0]==n||a[1]==n||a[2]==n||a[3]==n)
        {
            System.out.println("Input value in array");

        }else
            {
                System.out.println("input value is not in array");

             }
    }
}
