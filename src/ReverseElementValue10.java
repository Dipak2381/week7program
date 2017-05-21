import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class ReverseElementValue10
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a =new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);

        Collections.reverse(a);

        System.out.println(a);
    }
}
