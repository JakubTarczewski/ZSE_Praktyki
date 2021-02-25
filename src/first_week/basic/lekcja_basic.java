package first_week.basic;

public class lekcja_basic {



    // to jest nasza metoda głowna
    public static void main(String[] args) {
        // liczby całkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;
        //Dodawnaie
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie wyniku: " + sum );

        // Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        //Mnożenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik: " + sum);

        //Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2: " + sum);

        sum = myIntC / 2;
        System.out.println("Dzielenie C = 77 przez 2: " + sum);

        // float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;

        System.out.println(sumDouble);


        // znaki (characters)
        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja Ulubiona Literka to: " + myCharA);
        System.out.println("Mój ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to: " + sumChar);

        // string ciągi znaków słowa i wyrazy
        String myStringA = "Kuba";
        String myStringB = "Lubię Dżem";
        String myStringC = ":D";

        System.out.println(myStringA + "    " + myStringB + myStringC);

        //boolean
        boolean myBoolean = true;

        System.out.println(myBoolean);
    }
}
