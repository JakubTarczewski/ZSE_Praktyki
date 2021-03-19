package Projekt;

import java.util.Scanner;

public class Projekt_Pokoje {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Witamy w Hotelu Montana :D ");
        System.out.println("Proszę wybrać opcje (Rezerwacja, Anulowanie)");

        String hotel = skaner.next();
        switch (hotel){
            case "Rezerwacja":
                System.out.println("Proszę podać imię: ");
                String imie = skaner.next();
                System.out.println("Proszę podać nazwisko: ");
                String nazwisko = skaner.next();
                System.out.println("Proszę podać długość pobytu (dni): ");
                int dni = skaner.nextInt();
                System.out.println("Proszę podać ilość osób: ");
                int osoby = skaner.nextInt();
                System.out.println("Wybierz pokoje: " + "\n");
                System.out.println("Jednoosobowy 120 zł/dzień " + "\n" +
                                   "Dwuosobowy 200 zł/dzień " + "\n" +
                                   "Trzyosobowy 320 zł/dzień" + "\n" +
                                   "Czteroosobowy 400 zł/dzień" + "\n");
                String pokoje = skaner.next();
                int kwota = 0;
                if (pokoje.equals("Jednoosobowy")){
                     kwota = dni * 120;
                    System.out.println("Cena wynosi = " + kwota + " zł");
                }
                if (pokoje.equals("Dwuosobowy")){
                     kwota = dni * 200;
                    System.out.println("Cena wynosi = " + kwota + " zł");
                }
                if (pokoje.equals("Trzyosobowy")){
                     kwota = dni * 320;
                    System.out.println("Cena wynosi = " + kwota + " zł");
                }
                if (pokoje.equals("Czteroosobowy")){
                     kwota = dni * 400;
                    System.out.println("Cena wynosi = " + kwota + " zł");
                }
                System.out.println("Chcesz zarezerwowac jeszcze jakiś pokój ? (Tak / Nie) ");
                String pokoje1 = skaner.next();
                int kwota1 = 0;
                if (pokoje1.equals("Tak")){
                    System.out.println("Wybierz pokoje: " + "\n");
                    System.out.println("Jednoosobowy 120 zł/dzień " + "\n" +
                            "Dwuosobowy 200 zł/dzień " + "\n" +
                            "Trzyosobowy 320 zł/dzień" + "\n" +
                            "Czteroosobowy 400 zł/dzień" + "\n");
                    String pokoje2 = skaner.next();
                    if (pokoje.equals("Jednoosobowy")){
                        kwota1 = dni * 120;
                        System.out.println("Cena wynosi = " + kwota1 + " zł");
                    }
                    if (pokoje2.equals("Dwuosobowy")){
                        kwota1 = dni * 200;
                        System.out.println("Cena wynosi = " + kwota1 + " zł");
                    }
                    if (pokoje2.equals("Trzyosobowy")){
                        kwota1 = dni * 320;
                        System.out.println("Cena wynosi = " + kwota1 + " zł");
                    }
                    if (pokoje2.equals("Czteroosobowy")){
                        kwota1 = dni * 400;
                        System.out.println("Cena wynosi = " + kwota1 + " zł");
                    }
                    System.out.println("Rezerwajca przebiegła pomyślnie ");
                }
                else {
                    System.out.println("Rezerwajca przebiegła pomyślnie ");
                }
                System.out.println("Śniadanie w formie bufetu kosztuje 40zł / osoba (dzieci do lat 6 nie płacą :D) dodać do rezerwacji ? (Tak / Nie)");
                String sniad = skaner.next();
                if (sniad.equals("Tak")){
                    int sniad1 = osoby * 40;
                    int suma1 = kwota + kwota1 + sniad1;
                    System.out.println("Kwota całkowita = " + suma1);
                }
                else {
                    suma = kwota + kwota1;
                    System.out.println("Kwota całkowita = " + suma);
                }
                break;
            case "Anulowanie":
                System.out.println("Proszę podać imię ");
                String imie1 = skaner.next();
                System.out.println("Proszę podać nazwsiko ");
                String nazwisko2 = skaner.next();
                System.out.println("Jesteś pewien ,że chcesz anulować (Tak/Nie) ?");
                String wybor = skaner.next();
                if (wybor.equals("Tak")){
                    System.out.println("Rezerwacja została anulowana ");
                }
                else if (wybor.equals("Nie")){
                    System.out.println("Proces anulowania został przerwany");
                }
                break;
        }
        System.out.println("Wykonali Filip Kowalski , Damian Zaręba i Jakub Tarczewski");
    }
}
