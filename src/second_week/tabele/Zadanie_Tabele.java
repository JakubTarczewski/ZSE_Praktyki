package second_week.tabele;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Zadanie_Tabele {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        char[] array1 = {'a', 'd', 'g', 'b', 'h', 'c', 'j', 'y', 'v', 't'};
        System.out.println("Nieposortowane znaki: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Posortowane znaki: " + Arrays.toString(array1));

        System.out.println("Zadanie 2");
        String[] stringArray = {"Jestem", "mam", "na", "Kuba", "17", "Tarczewski", "lat", "nazwisko", "lubię", "płatki"};
        System.out.println("Nieposortowane: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));

        System.out.println("Zadanie 3");
        Integer[] array2 = {1, 2, 3};
        Random imie = new Random();
              int rand_int1 = imie.nextInt(3);
        String[] imiona = {"Axel", "Brutal", "Pimpek"};
        System.out.println("Wylosowane imię to: " + imiona[rand_int1]);

        System.out.println("Zadanie 4");
        Integer[] snia = {1, 2, 3};
        Integer[] obia = {1, 2, 3};
        Integer[] kola = {1, 2, 3};
        Random rand = new Random();
        int rand1 = rand.nextInt(3);
        int rand2 = rand.nextInt(3);
        int rand3 = rand.nextInt(3);
        String[] stringArray1 = {"Jajecznica", "Tosty", "Parówki"};
        String[] stringArray2 = {"Pizze", "Spaghetti", "Gyros"};
        String[] stringArray3 = {"Kanapki", "Torrtilie", "Płatki"};
        System.out.println("Na śniadanie zjem: " + stringArray1[rand1] + ", na obiad zjem: " + stringArray2[rand2] +", a na kolacje zjem: " + stringArray3[rand3]);

        System.out.println("Zadanie 5");
        Integer[] zad5 = {12,13,45,54,58,54,25,52,65,14,26,32,87,54,85,95,21,44,58,23};
        Arrays.sort(zad5,0,9,Collections.reverseOrder());
        Arrays.sort(zad5,10,20);
        System.out.println("Tablica: " + Arrays.toString(zad5));
    }
}
