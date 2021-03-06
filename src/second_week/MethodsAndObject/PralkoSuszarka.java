package second_week.MethodsAndObject;



    interface Suszarka{
        void suszeniePrania();
    }

    interface Pralka{
        void praniebawelny();
        void pranieposcieli();
        void pranieUbran();
    }


public class PralkoSuszarka implements Pralka, Suszarka {

        private int czas;
        private int temperatura;
        private int wirowanie;

    @Override
    public void suszeniePrania() {
        czas = 135;
        temperatura = 30;
        wirowanie = 600;
        wlacz();
    }

    @Override
    public void praniebawelny() {
        czas = 65;
        temperatura = 30;
        wirowanie = 600;
        wlacz();
    }

    @Override
    public void pranieposcieli() {
        czas = 80;
        temperatura = 50;
        wirowanie = 1200;
        wlacz();
    }

    @Override
    public void pranieUbran() {
        czas = 120;
        temperatura = 60;
        wirowanie = 1000;
        wlacz();
    }
    private void wlacz(){
        System.out.println("Wlączam pralkoSuszarko" +
                "ustawiamy temperature na: " + temperatura
         + " stopni, wirowanie: " + wirowanie +
                "obrotów i czs trwania: " + czas + "minut");
    }

    public static void main(String[] args) {
        PralkoSuszarka pralkoSuszarka = new PralkoSuszarka();

        Suszarka szuszarka = pralkoSuszarka;
        Pralka pralka = pralkoSuszarka;

    }
}
