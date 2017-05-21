/**
 * Created by DIPAK on 3/5/2017.
 */
public class AvreageValue4
{
    public static void main(String[] args)
    {
        double a[]={5,7.5,4,6,5};
        double sum=0;

        for (int i = 0; i < a.length ; i++)
        {
            sum=sum + a[i]/a.length;
        }
        System.out.println("Total avreage value:"+sum);

    }
}
