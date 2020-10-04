package sample;
public class auto {
    String typ;
    String znacka;
    boolean pojizdne;
    int dojezd;
    int pocetSedadel;
    String barva;
    int cena;

    public auto(String typ, String znacka, boolean pojizdne, int dojezd, int pocetSedadel, String barva, int cena) {
        this.typ = typ;
        this.znacka = znacka;
        this.pojizdne = pojizdne;
        this.dojezd = dojezd;
        this.pocetSedadel = pocetSedadel;
        this.barva = barva;
        this.cena = cena;
    }

    public auto(String jmeno, String prijmeni, int vek, int vyska, boolean ridicskyPrukaz) {
    }

    public void stats() {


        System.out.println("Auto : " + typ);
        System.out.println("znacka : " + znacka);
        System.out.println("pojizdnost : " + pojizdne);
        System.out.println("dojezd : " + dojezd);
        System.out.println("pocet sedadel : " + pocetSedadel);
        System.out.println("barva : " + barva);
        System.out.println("cena : " + cena);

}

 

        @Override
        public String toString() {
            return "auto" +
                    "typ = " + typ + '\'' +
                    ", znacka = " + znacka + '\'' +
                    ", pojizdne = " + pojizdne +
                    ", dojezd = " + dojezd +
                    ", pocetSedadel = " + pocetSedadel +
                    ", barva=" + barva + '\'' +
                    ", cena=" + cena;

        }
    }



class kupujici{
    int vek;
    int vyska;

    public kupujici(String vek, int vyska) {
    }


    public void bruh(int vek, int vyska, boolean prukaz){
        this.vek=vek;
        this.vyska=vyska;
        
    }
    public kupujici(int vek,int vyska,boolean prukaz){

    }
    public void hoomanstats() {


        System.out.println("vek : "+ vek);
        System.out.println("vyska : "+ vyska);

      
    }
    @Override
    public String toString() {
        return "tejpek" +
                "Vek = " + vek + '\'' +
                ", Vyska = " + vyska;

    }
}



