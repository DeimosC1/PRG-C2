package sample;
import java.util.Scanner;

public class Tetrohedron {

    public static void main(String[] args) {
        tetrahedron bruh;
        bruh = new tetrahedron();
        Scanner myObj = new Scanner(System.in);
        bruh.strana = myObj.nextInt();
        bruh.objem();
        bruh.povrch();
    }
}
