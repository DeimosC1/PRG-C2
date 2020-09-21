package sample;

public class prvocisla {
    public static void main(String[] args) {
        for (int i = 2; i <= 30; i++) {
            boolean prvocislo = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prvocislo = false;
                    break;
                }
            }
            if (prvocislo) {
                System.out.println(i);
            }
        }
    }
}
