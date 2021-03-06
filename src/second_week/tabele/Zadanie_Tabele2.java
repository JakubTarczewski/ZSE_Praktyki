package second_week.tabele;

public class Zadanie_Tabele2 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        int[][] tab1 = new int[5][5];
        int value = 1;
        for (int i = 0 ; i < 10 ; i+=5){
            for (int j = 0 ; j<10 ; j++){
                tab1[i][j] = value;
                value+=5;
                System.out.println(tab1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
