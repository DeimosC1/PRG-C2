package sample;
import java.util.*;



public class scan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("dej mi slovo ");
        
        
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("slovo: "+words[words.length - 2]);
    }
}
