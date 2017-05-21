import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class MaxMin9 {
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

        int min = c[0];
        for (int i = 1; i < c.length; i++)
            if (min > c[i])
                min = c[i];
        System.out.println("minmun value of an elements in array:" + min);

        int max = c[0];
        for (int i = 1; i < c.length; i++)
            if (min < c[i])
                min = c[i];
        System.out.println("minmun value of an elements in array:" + max);


    }
}
