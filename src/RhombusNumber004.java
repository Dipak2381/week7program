/**
 * Created by DIPAK on 3/9/2017.
 */
public class RhombusNumber004 {
    public static void main(String[] args) {
        int size = 7;
        int start = 0;
        int noOfColums = 1;
        int onOfSpaces = size / 2;
        for (int i = 1; i <= size; i++)

        {
            for (int j = 1; j <= onOfSpaces; j++)
            {
                System.out.print(" ");

            }
            if (i < size / 2 + 1)
            {
                start = i;
                onOfSpaces = onOfSpaces - 1;
            } else {
                start = (size + 1) - i;
                onOfSpaces = onOfSpaces + 1;
            }
            for (int j = 1; j <= noOfColums; j++)
            {
                int midColums = noOfColums / 2 + 1;
                System.out.print(start);
                if (j <midColums)
                {
                    start--;
                } else
                    {
                    start++;
                }
                System.out.println();
                if (i < size / 2 + 1)
                {
                    noOfColums = noOfColums + 2;
                } else
                    {
                    noOfColums = noOfColums - 2;
                }

            }
        }
    }


}