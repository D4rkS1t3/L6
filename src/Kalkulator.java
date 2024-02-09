import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
/*
Napisz prosty program konsolowy realizujący funkcjonalności kalkulatora:
Wykonywanie podstawowych działań (dodawanie, odejmowanie, mnożenie, dzielenie, pierwiastkowanie, potęgowanie)i
wyświetlanie wyniku.Zadbaj  o  odpowiednią  obsługę  wyjątków.  Załóż,  że  użytkownik
 może  wprowadzić dowolny znak (w przypadku wprowadzenia błędnych danych wyświetl komunikat i ponów prośbę o podanie danych)
 */
    public static void kalkulator() throws ArithmeticException {
        double a;double b;double wynik;
        int wybor;boolean trwa=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("   _____________________       _____________________       _____________________\n" +
                "  |  _________________  |     |  _________________  |     |  _________________  |\n" +
                "  | |              0. | |     | |              0. | |     | |              0. | |\n" +
                "  | |_________________| |     | |_________________| |     | |_________________| |\n" +
                "  |  ___ ___ ___   ___  |     |  ___ ___ ___   ___  |     |  ___ ___ ___   ___  |\n" +
                "  | | 7 | 8 | 9 | | + | |     | | 7 | 8 | 9 | | + | |     | | 7 | 8 | 9 | | + | |\n" +
                "  | |___|___|___| |___| |     | |___|___|___| |___| |     | |___|___|___| |___| |\n" +
                "  | | 4 | 5 | 6 | | - | |     | | 4 | 5 | 6 | | - | |     | | 4 | 5 | 6 | | - | |\n" +
                "  | |___|___|___| |___| |     | |___|___|___| |___| |     | |___|___|___| |___| |\n" +
                "  | | 1 | 2 | 3 | | x | |     | | 1 | 2 | 3 | | x | |     | | 1 | 2 | 3 | | x | |\n" +
                "  | |___|___|___| |___| |     | |___|___|___| |___| |     | |___|___|___| |___| |\n" +
                "  | | . | 0 | = | | ÷ | |     | | . | 0 | = | | ÷ | |     | | . | 0 | = | | ÷ | |\n" +
                "  | |___|___|___| |___| |     | |___|___|___| |___| |     | |___|___|___| |___| |\n" +
                "  |_____________________|     |_____________________|     |_____________________|\n");
        while (trwa){
            try {
                a=0;b=0;wybor=0;wynik=0;
                System.out.println("Witaj w programie kalkulator!");
                System.out.println("Podaj rodzaj dzialania jaki chcesz wykonać");
                System.out.println("Wybierz 1 jesli chcesz wykonac dodawanie");
                System.out.println("Wybierz 2 jesli chcesz wykonac odejmowanie");
                System.out.println("Wybierz 3 jesli chcesz wykonac mnozenie");
                System.out.println("Wybierz 4 jesli chcesz wykonac dzielenie");
                System.out.println("Wybierz 5 jesli chcesz wykonac potegowanie");
                System.out.println("Wybierz 6 jesli chcesz wykonac pierwiastkowanie");
                System.out.println("Wybierz 7 jesli chcesz zakonczyc dzialanie programu");
                System.out.print("Wybor:");
                wybor = sc.nextInt();

                if (wybor == 7) {
                    System.out.println("Koncze dzialanie programu");
                    trwa = false;
                    System.exit(0);
                } else if (wybor == 6) {
                    System.out.print("Podaj liczbe:");
                    a = sc.nextDouble();
                } else {
                    System.out.println("Podaj pierwsza liczbe:");
                    a = sc.nextDouble();
                    System.out.print("Podaj druga liczbe:");
                    b = sc.nextDouble();
                    if (b==0) {
                        throw new ArithmeticException("Podaj poprawny mianownik");
                    }
                }
                switch (wybor) {
                    case 1:
                        wynik = a + b;
                        break;
                    case 2:
                        wynik = a - b;
                        break;
                    case 3:
                        wynik = a * b;
                        break;
                    case 4:
                        wynik = a / b;
                        break;
                    case 5:
                        wynik = Math.pow(a, b);
                        break;
                    case 6:
                        wynik = Math.sqrt(a);
                        break;

                }
                System.out.println("Wynik operacji matematycznej to:" + wynik);
                sc.nextLine();
                sc.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Podano nie prawidlowa wartosc");
                System.out.println(e.getMessage());
                System.out.println("Sprobuj jeszcze raz");
                sc.nextLine();
            }
    }}

    public static void main(String[] args) {
        kalkulator();
    }
}
