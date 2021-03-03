package second_week.loops.zadanie;

public class Zadanie_Loops {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        for (int i = 0 ; i <= 20 ; i+=2){
            System.out.println(i);
        }

        System.out.println("Zadanie 2");
        for (int x = 30 ; x >= 0 ; x-=3){
            System.out.println(x);
        }

        System.out.println("Zadanie 4");
        for (int a =-40; a <= 40;a++){
            if (a % 4 == 0){
                System.out.println(a);
            }
        }

        System.out.println("Zadanie 5");
        System.out.println("Przeróbka zadania 1");

        int z = 0;
        while (z <= 20){
            System.out.println(z);
            z+=2;
        }
        System.out.println("Przeróbka zadania 2");
        int c = 30;
        do {
            System.out.println(c);
            c -= 3;
        }
        while (c >= 0);
    }
}
