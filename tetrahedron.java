package sample;
import java.math.*;
public class tetrahedron {
    int strana;

public tetrahedron() {

}
public void objem(){
    int dva =2;
    int dvanact = 12;
    System.out.println(Math.sqrt(dva)/dvanact*strana*strana*strana +"cm3");
}
public void povrch(){
    System.out.println(Math.sqrt(3*Math.exp(strana)));
}
}
