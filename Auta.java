package sample;

public interface Auta {
    public static void main(String[] args) {

        auto autaak = new auto("SUV", "Volvo", true, 100, 7, "cervena", 1500000);
        System.out.println(autaak.toString());


    }
    public interface kupujicii {
        public static void koupe(String[] args) {

            kupujici bruh = new kupujici("18",182);
            System.out.println(bruh.toString());


        }

    }
}

