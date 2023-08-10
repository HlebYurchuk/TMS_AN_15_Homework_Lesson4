import java.util.Arrays;
import java.util.Scanner;

public class Homework_4_1 {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;



        Scanner sc = new Scanner(System.in);
        System.out.println("Put your number:");

        int YourNumber = sc.nextInt();

         if (YourNumber == myArray[0] ){
             System.out.println("Bingo!");
         } else if (YourNumber == myArray[1]){
             System.out.println("Bingo!");
         } else if (YourNumber == myArray[2]){
             System.out.println("Bingo!");
         } else  if (YourNumber == myArray[3]){
             System.out.println("Bingo!");
         } else if (YourNumber == myArray[4]){
             System.out.println("Bingo!");
         } else {
             System.out.println("NoNo");
         }





    }


}

