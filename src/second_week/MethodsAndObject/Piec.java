package second_week.MethodsAndObject;


    interface Piekacz{
        void pieczenieciastek();
        void pieczeniechleba();
    }

    interface Grill{
        void grillowaniekurczaka();
    }

    public class Piec implements Piekacz, Grill {

        private int czas;
        private int temperatura;

        @Override
        public void pieczenieciastek() {
        czas = 120;
        temperatura = 200;
            wlacz();
        }

        @Override
        public void pieczeniechleba() {
        czas = 180;
        temperatura = 250;
            wlacz();
        }

        @Override
        public void grillowaniekurczaka() {
        czas = 80;
        temperatura = 200;
            wlacz();
        }

        private void wlacz(){
            System.out.println("Wlączam Piec " +
                    "ustawiamy temperature na: " + temperatura
                    + " stopni i czs trwania: " + czas + "minut");
        }
        public static void main(String[] args) {
            Piec piec = new Piec();

            Piekacz piekacz = piec;
            Grill grill = piec;

            piekacz.pieczeniechleba();
            piekacz.pieczenieciastek();
            grill.grillowaniekurczaka();

        }
    }
