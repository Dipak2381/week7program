import java.util.Scanner;

/**
 * Created by DIPAK on 3/9/2017.
 */
public class TwoMetrices16
{
    public static void main(String[] args)
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Colomns:");
        m = s.nextInt();
        n = s.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int [m][n];
        int third[][] = new int [m][n];

        System.out.println("Enter First Matrix Elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                first[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter Second Matrix Elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                second[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                third[i][j] = first[i][j] + second[i][j];
            }
        }


        System.out.println("Sum of Two Matrices:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(third[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
