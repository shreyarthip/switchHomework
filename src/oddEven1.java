import java.util.Scanner;

public class oddEven1 {


    public static void main(String[] args) {
        int number;
        System.out.println("Please Enter the number");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        switch (number%2)
        {
            case 0:
                System.out.println(number + " is a Even number");
                break;
            case 1:
                    System.out.println(number + " is odd number");
                break;

        }
    }
}