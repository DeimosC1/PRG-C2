package sample;
import java.util.*;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("zadej string na reverum");

        Scanner revers = new Scanner(System.in);
        String str = revers.nextLine();

        StringBuilder b = new StringBuilder(str);   //stringBuilder je cool

        System.out.println("Reversed string is:");
        System.out.println(b.reverse().toString());
    }
}

