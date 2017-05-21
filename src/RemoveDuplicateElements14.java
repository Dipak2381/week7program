/**
 * Created by DIPAK on 3/6/2017.
 */
public class RemoveDuplicateElements14
{
    public static void main(String[] args)
    {
        int [] arr = {1,5,6,8,6,1,7};
        int len = arr.length;

        for(int i = 0; i < len-1;i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if ((arr[i] == (arr[j])) && (i != j))
                {
                    System.out.println("Duplicates eles are: " + arr[i] + " at position " + i);
                }

            }
        }
    }

}
