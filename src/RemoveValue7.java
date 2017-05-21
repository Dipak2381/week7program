import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DIPAK on 3/5/2017.
 */
public class RemoveValue7
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index remove number:");
        int x = s.nextInt();
        ArrayList a = new ArrayList();
        a.add(0, 10);
        a.add(1, 20);
        a.add(2, 30);
        a.add(3, 40);
        a.add(4, 50);

        ArrayList b = new ArrayList();
        a.remove(x);
        System.out.println(" New elements"+a);
    }
}
