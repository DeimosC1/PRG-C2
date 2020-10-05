package sample;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("kolik čisel budeš zadávat?");
        Scanner scanner = new Scanner(System.in);
        int cisla = scanner.nextInt();
        double[] arr = new double[cisla];
        double total = 0;


        for(int i=0; i<arr.length; i++){
            System.out.print("Zadej čislo "+(i+1)+":");
            arr[i] = (int) scanner.nextDouble();

        }
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;

        System.out.format("The average is:" + average);
    }

    }
