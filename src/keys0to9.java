import java.util.Scanner;

public class keys0to9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a key");
        int key = sc.nextInt();

        switch (key) {

            case 0:
                System.out.println(" You Type key 0.");
                break;
            case 1:
                System.out.println(" You Type key 1.");
                break;
            case 2:
                System.out.println(" You Type key 2.");
                break;
            case 3:
                System.out.println(" You Type key 3.");
                break;
            case 4:
                System.out.println(" You Type key 4.");
                break;
            case 5:
                System.out.println(" You Type key 5.");
                break;
            case 6:
                System.out.println(" You Type key 6.");
                break;
            case 7:
                System.out.println(" You Type key 7.");
                break;
            case 8:
                System.out.println(" You Type key 8.");
                break;
            case 9:
                System.out.println(" You Type key 9.");
                break;
        }

    }
}

