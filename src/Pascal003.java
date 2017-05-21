import java.util.Scanner;

/**
 * Created by DIPAK on 3/9/2017.
 */
public class Pascal003
{
    public static void main(String[] args)
    {
      //  int a, num;

     //   for (int i = 0; i <= 4; i++)
      //  {
      //      num = 1;
         //   a = i + 1;

         //   for (int j = 0; j <= i; j++)
         //   {
          //      if (j > 0)
          //          num = num * (a - j) / j;

          //      System.out.print(num + " ");
          //  }
          //  System.out.println();
        Scanner s =new Scanner(System.in);
        System.out.println("enter no:");
        int n =s.nextInt();
      //  System.out.println("enter row");
     //   int row = s.nextInt();
        for (int row = 0; row <n ; row++)
        {
            for (int space = 0; space <(n-row) ; space++)
            {
                System.out.println(" ");
            }
                n=1;
                for (int col = 0; col <=row ; col++)
                {
                    System.out.println(n);
                            n=n*(row-col)/(col+1);

                } System.out.println(n+" ");


            System.out.println();

        }
        }
    }


