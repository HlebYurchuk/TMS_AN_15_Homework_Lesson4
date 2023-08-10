import java.util.*;
import java.util.Arrays;

public class Homework_4_3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Put your size of array");
        int Number = sc.nextInt();

        double[] myArray = new double[Number];


        for(int i = 0; i < myArray.length; i++){
            myArray[i] = Math.random();
        }

        System.out.println(Arrays.toString(myArray));


        Arrays.sort(myArray);
        System.out.println("Max : " + myArray[Number - 1]);
        System.out.println("Min : " + myArray[0]);
        System.out.println("Average : " + Arrays.stream(myArray).sum() / Number);


    }
}
