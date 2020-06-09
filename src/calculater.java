import java.util.Scanner;

public class calculater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter two number"); //char operator = reader.next().CharAT(0);
        double first = sc.nextInt();
        double second = sc.nextInt();
        System.out.println("Please Enter operator (+, -, *, /,): ");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Error operator is not correct");
                break;
        }
    }
}













