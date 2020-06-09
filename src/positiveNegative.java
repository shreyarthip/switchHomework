import java.util.Scanner;

public class positiveNegative {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);  // Scanner class to read value
        System.out.println("Please Enter any integer number");
        num = sc.nextInt();

        if (num > 0)    // Please check condition for + positive, - negative and Zero
        System.out.println(num + " is Positive Number");

        else if(num < 0)
            System.out.println(num + "is negative number");
        else
            System.out.println("It's Zero.");
}

    }
