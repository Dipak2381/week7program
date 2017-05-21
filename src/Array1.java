import java.util.Arrays;

/**
 * Created by DIPAK on 3/6/2017.
 */
public class Array1
{
    public static void main(String[] args)
    {
        int[] array1 = {1789, 2035, 1899, 1456, 2013,};

        String[]array2 = {"Java", "Python", "PHP", "C++"};

        System.out.println("Original numeric array : "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(array1));

        System.out.println("Original string array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : "+Arrays.toString(array2));
    }
}
