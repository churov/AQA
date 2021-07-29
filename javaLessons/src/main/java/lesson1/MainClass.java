package src.main.java.lesson1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        isSumGreaterThan50(10,11);
        positiveOrNegative(0);
        trueOrFalse(-5);
        stringAndValue("Тут должна быть строка", 5);
        invertArray();
        massive100();
        massiveMultiply();
        massiveDiagonal(7);
        massive2Args(5, 7);
    }
    public static boolean isSumGreaterThan50(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum<=20) {
            System.out.println("tru");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static void positiveOrNegative (int a){
        if (a>=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }

    }
    public static boolean trueOrFalse (int a){
        if (a>=0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void  stringAndValue (String word, int b){
        for (int i=1;i<=b; i++) {
            System.out.println(word);
        }
    }
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Начальный массив arr[i] = " + arr[0] + arr[1] + arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else  {
                arr[i] = 0;
            }
        }
        System.out.println("Инвертированный массив arr[i] = " + arr[0] + arr[1] + arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9]);
    }

    public static void  massive100() {
        int[] arr = new int [100];
        for (int i=1; i<arr.length; i++){
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    public static void massiveMultiply(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< arr.length; i++){
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
   public static void massiveDiagonal(int d){
       int[][] arr = new int[d][d];
        for (int i=0; i<=d-1; i++){
            for (int j=0; j<=d-1; j++){
                if (j==i) {
                    System.out.print("* ");
                }
                else if(j==((d-1)-i)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }


    }
    public static void massive2Args(int len, int initialValue) {
    int [] arr = new int [len];
        for (int i=0; i<=len-1; i++){
            System.out.print(initialValue);
        }


    }
}

