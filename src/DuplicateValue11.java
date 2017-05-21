import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class DuplicateValue11 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter no of Elements you want in array");
        num = s.nextInt();

        int c[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            c[i] = s.nextInt();

        }
        System.out.print("array elements\t:\t");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + ",");

        }
        System.out.println();


        for (int i = 0; i < c.length; i++)
        {
            for (int j = i + 1; j < c.length; j++)
            {
                if (c[i] == c[j])
                {
                    System.out.println(c[i]+ "=Elements more then one Time");
                }
            }

        }

    }

}