package second_week.tabele;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie_Tabele2 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        int[][] tab1 = new int[5][5];
        int value = 0;
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j<5 ; j++){
                tab1[i][j] = value;
                value+=5;
                System.out.println(tab1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Zadanie 2");
        int[][][][] tab2 = new int[3][3][3][3];
        int value1 = 0;
        for (int k = 0 ; k<3 ; k++){
            for (int d = 0 ; d<3 ; d++){
                for (int x = 0 ; x<3 ; x++){
                    for (int y = 0 ; y<3 ; y++){
                        tab2[k][d][x][y] = value1;
                        value1+=2;
                        System.out.println("["+k+"]"+"["+d+"]"+"["+x+"]"+"["+y+"] = "+ tab2[k][d][x][y]+ "\t");
                    }
                }
            }
        }
        System.out.println("Zadanie 3");
        int[][][][][] tab3 = new int[2][2][2][2][2];
        int value2 = 0;
        for (int w = 0 ; w<3 ; w++){
            for (int e = 0 ; e<3 ; e++){
                for (int r = 0 ; r<3 ; r++){
                    for (int t = 0 ; t<3 ; t++){
                        for (int q = 0 ; q<2 ; q++){
                            tab2[w][e][r][t][q] = value2;
                            value2+=6;
                            System.out.println("["+w+"]"+"["+e+"]"+"["+r+"]"+"["+t+"]"+"["+q+"] = "+ tab3[w][e][r][t][q]+ "\t");
                        }
                    }
                }
            }
        }
        System.out.println("Zadanie 3 - Listy");
        ArrayList<String> lista_Napojow = new ArrayList<>();
            lista_Napojow.add("Coca-Cola");
            lista_Napojow.add("Czarna Porzeczka");
            lista_Napojow.add("Fanta");
            lista_Napojow.add("Sprite");
        System.out.println(lista_Napojow);

            //Dodawanie
            lista_Napojow.add("Woda");
            lista_Napojow.add(1,"Oranżada");
        System.out.println("\n" + lista_Napojow);

            //Odejmowanie
            lista_Napojow.remove("Sprite");
            lista_Napojow.remove(0);
        System.out.println("\n" + lista_Napojow);

            //Nadpisywanie
            lista_Napojow.set(3,"Tonic");
        System.out.println("\n" + lista_Napojow);

            //Sortowanie
        Collections.sort(lista_Napojow);
        System.out.println("\n" + lista_Napojow);

            //Czyszczenie
        lista_Napojow.clear();
        System.out.println("\n" + lista_Napojow);

    }
}
