package first_week.loops;

import java.util.Scanner;

public class pętle {
    /*
        postać instrukcji warunkowej
        if(warunek){
        zrobicCos1
        zrobicCos2
        .......
        zrobicCosX
        }
        else{
        zrobCosInnego1
        zrobCosInnego2
        .....
        zrobCosInnegoX
        }
        */

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

//        boolean stan = true;
//
//        if (stan){
//            System.out.println("Wykona się instrukcja IF.");
//        }
//        else {
//            System.out.println("Wykonała się instrukcja ELSE");
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek");
//        int wiek = skaner.nextInt();
//
//        if(wiek >= 18){
//            System.out.println("Jesteś pełnoletni");
//        }
//        else{
//            System.out.println("Jesteś niepoełnoletni");
//        }

//        System.out.println("Podaj liczbę: ");
//            int liczba = skaner.nextInt();
//            if (10<liczba && liczba < 20){
//                System.out.println("Liczba mieści się w zakresie");
//            }
//            else{
//                System.out.println("Liczba NIE mieści się w zakresie");
//            }

//        System.out.println("Podaj liczbę całkowitą A: ");
//            int a = skaner.nextInt();
//        System.out.println("Podaj liczbę całkowitą B: ");
//            int b = skaner.nextInt();
//
//            if (a > b){"A jest więskze od B");
//            }
//            if (a < b){
//            System.out.println("B jest więskze od A");
//            }
//            if (a == b){
//            System.out.println("A jest równe  B");
//         }
//            if (a > b){"A jest więskze od B");
//            }
//            else {
//                if (a < b) {
//                    System.out.println("B jest więskze od A");
//                }
//                else{
//                    System.out.println("A jest równe  B");
//                }
//            }

//            char charA ='A';
//            char charB ='B';
//
//            if (charA > charB){
//                System.out.println("CharA jest większy");
//            }
//            else {
//                System.out.println("CharB jest więskszy");
//            }
//
//            String hello = "hello";
//            String world = "world";
//
//            if (hello.equals(world)){
//                System.out.println("Hello jest równe world");
//            }
//            else{
//                System.out.println("Hello nie jest równe world");
//            }

//        System.out.println("Podaj swój wybór: ");
//        int x = skaner.nextInt();
//
//        switch (x){
//            case 1:
//                System.out.println("Przypadek pierwszy");
//                break;
//            case 2:
//                System.out.println("Przypadek drugi");
//                break;
//            default:
//                System.out.println("Przypadek pierwszy");
//                break;
//        }

//        System.out.println("Podaj swój wybór (A, B): ");
//        String y = skaner.next();
//
//        switch (y){
//            case "1":
//                System.out.println("Przypadek pierrwszy");
//                break;
//            case "A":
//                System.out.println("Przypadek A");
//                break;
//            case "B":
//                System.out.println("Przypadek B");
//                break;
//            default:
//                System.out.println("Przypadek pierwszy");
//                break;
//        }
        System.out.println("Podaj swój wybór (A, B): ");
        char z = skaner.next().charAt(0);

        switch (z){
            case '1':
                System.out.println("Przypadek pierrwszy");
            case 'A':
                System.out.println("Przypadek A");
            case 'B':
                System.out.println("Przypadek B");
            default:
                System.out.println("Przypadek pierwszy"
        }
    }
}
