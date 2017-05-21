import java.util.Arrays;

/**
 * Created by DIPAK on 3/9/2017.
 */
public class SecondLargest15
{
    public static void main(String[] args)
    {

        int a[]= {80,20,30,10,50};

            Arrays.sort(a);
          System.out.println("Second Largest Number: "+a[a.length-2]);
       }
}