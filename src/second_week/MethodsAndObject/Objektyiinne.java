package second_week.MethodsAndObject;

import java.util.Scanner;

public class Objektyiinne {

//   static int addNumbers(int numer1, int number2 , int numeb3){
//        return numer1 + number2 + numeb3;
//    }
//        static String getName(){
//        return "Kacper";
//   }
//
//   static void printSomething(){
//       System.out.println("\nSomething");
//   }
//   static void printSomethingifNumberIsBig(int number){
//       if (number < 10){
//           return;
//       }
//       System.out.println("Wypluwam ");
//   }

    static boolean isLegal(int someAge){
        return someAge >= 16;
    }
    public static void main(String[] args) {
//        System.out.println("Wywołanie metody Dodawania");
//
//        int suma = addNumbers(5 , 6 , 2);
//        System.out.println("Wynik to: " + suma);
//
//        System.out.println("Przykładowe imię: " + getName());
//
//        printSomething();
//        Scanner skaner = new Scanner(System.in);
//
//
//        System.out.println("Podaj liczbę od 0 do 100");
//        int liczba = skaner.nextInt();
//
//        printSomethingifNumberIsBig(liczba);

        int someAge = 14;
        boolean result = isLegal(someAge);

        System.out.println("Age " + someAge + " is Legal\n That statement is: " + result);

    }
}
