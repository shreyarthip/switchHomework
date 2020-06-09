import java.util.Scanner;

public class cityNameAtoF {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter alphabet from a to f:");
        char alphabet = sc.next().charAt(0);

        switch(alphabet)
        {

            case 'a':
                System.out.println("Amritsar");
                break;
            case 'b':
                System.out.println("Bombay");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Egypt");
                break;
            case 'f':
                System.out.println("Florida");
                break;
        }

    }
}
