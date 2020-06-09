import java.util.Scanner;

public class largestGreatest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Please Enter first number");
        x = sc.nextInt();
        System.out.println("Please Enter second number" );
        y = sc.nextInt();
        System.out.println("Please Enter third number");
        z = sc.nextInt();

        if( x > y && x > z) {
            System.out.println("Largest number is: " + x);
        }
         else if(y > z) {
            System.out.println("Largest number is:" + y);
        }
         else {
            System.out.println("Largest number is: " + z);
        }

            }


        }


