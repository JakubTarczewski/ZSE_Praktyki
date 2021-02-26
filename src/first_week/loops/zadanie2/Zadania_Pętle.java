package first_week.loops.zadanie2;

import java.util.Scanner;

public class Zadania_Pętle {
    public static void main(String[] args) {

        // Zadanie 1
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = skaner.nextInt();

        if (x > 0){
            System.out.println("Twoja liczba jest większa od 0");
        }
        else {
            System.out.println("Twoja liczba jest mniejsza od 0");
        }
    }
}
