import java.util.Scanner;

/**
 * Created by DIPAK on 3/8/2017.
 */
public class Palindrome24 {
    public static void main(String[] args)

    {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reverse = 0, reminder, temp = n;
        while (n > 0) {
            reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n = n / 10;
        }
        if (reverse == temp)
            System.out.println("number is a Palindrome Number :" + temp);
        else
            System.out.println("number is not a Palindrome Number :" + temp);
    }


}



