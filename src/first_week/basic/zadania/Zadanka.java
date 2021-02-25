package first_week.basic.zadania;

public class Zadanka {
    public static void main(String[] args) {
    // Zadanie 1
        String StringA = "Jestem Kuba i mam ";
        int intA = 17;
        String StringB = " lat moja średnia to ";
        double doubleA = 4.44;
        String StringC = " a mój ulubiony znak to ";
        char charA = '$';
        System.out.println(StringA + intA + StringB + doubleA + StringC + charA);

    // Zadanie 2
        int a = 5;
        int b = 2;
        int sum = a*a + b*b;
        System.out.println("Wynik = " + sum);

    //Zadanie 3
        double sqrt = Math.sqrt(3);
        int bok = 7;
        double wynik = bok*bok * sqrt /4;
        System.out.println("Pole trójkąta jest równe: " + wynik);
    //Zadanie 4
        String imie = "Jakub";
        String nazwisko = "Tarczewski :D";
        System.out.println("Nazywam się " + imie +" " + nazwisko);
    }
}
