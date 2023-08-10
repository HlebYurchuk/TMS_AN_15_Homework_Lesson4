import java.util.Arrays;

public class Homework_4_4 {
    public static void main(String[] args) {

        int myArray[] = new int[]{1, 2, 3, 4, 6};
        int myArray2[] = new int[]{5, 9, 2, 3, 5};

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));

        double a = Arrays.stream(myArray).sum() / (double) myArray.length;
        double b = Arrays.stream(myArray2).sum() / (double) myArray2.length;




        if (a>b){
            System.out.println("Среднее арифмитическое первого массива больше");}
        else if (a<b){
            System.out.println("Среднее арифмитическое второго массива больше");}
        else if (a==b){
            System.out.println("Среднее арифмитическое массивов равны");}

    }
}