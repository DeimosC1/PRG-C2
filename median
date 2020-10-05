package sample;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[]cisla={1,2,3,4};
        double median = median(cisla);
        System.out.println(median);


    }

    static double median(int[] cisla) {
        Arrays.sort(cisla);
        double median;

        int total = cisla.length;

        if (total % 2 == 0) {
            double sum = cisla[total / 2] +
                    cisla[total / 2 - 1];

            median = (sum) / 2;
        } else {

            median = (int) cisla[cisla.length / 2];
        }

        return median;
    }
}
