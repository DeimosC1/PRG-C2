package sample;

import java.util.Scanner;

public class prvocisla {


    public static void main(String[] args) {
        int n, status = 1, x = 3, count, j;

        Scanner in = new Scanner(System.in);
        System.out.println("chci číslo");
        n = in.nextInt();
        if (n >= 1)
        {
            System.out.println(2);
        }

        for (count = 2; count <=n; )
        {
            for (j = 2; j <= Math.sqrt(x); j++)
            {
                if (x%j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                System.out.println(x);
                count++;
            }
            status = 1;
            x++;
        }
    }
}
//nechutne slozity musel jsem si pomoct odmocninama
