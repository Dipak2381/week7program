
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by DIPAK on 3/6/2017.
 */
public class ArrayCommonElements13
{
    public static void main(String[] args)
    {

            int[] arr1 = {40,7,3,9,2,11};
            int[] arr2 = {22,12,9,40,32,4,11};
            for(int i=0;i<arr1.length;i++)
            {
                for (int j = 0; j < arr2.length; j++)
                {
                    if (arr1[i] == arr2[j])
                    {
                        System.out.println(+arr1[i]);
                    }
                }
            }

    }
}
