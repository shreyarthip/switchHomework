import java.util.Scanner;

public class reverseString {

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter string to reverse:");
       String string = sc. nextLine();
       String reverse = "";

       for (int i = string.length() - 1; i >= 0; i--){
           reverse = reverse + string.charAt(i);

        System.out.println("Reversed string is:");
        System.out.println(reverse);
       }



        }





    }


