import java.util.InputMismatchException;
import java.util.Scanner;

public class Rzeczywiste {
    /*
    Napisz metodę pobierającą od użytkownika liczbę zmiennoprzecinkową,rozdzielającą liczbę na cechę oraz mantysę,a następnie
    zwracającą iloraz cechy i mantysy. W przypadku, gdy nie jest to możliwe wypisz komunikat i ponów pobieranie liczby.
    Załóż, że użytkownik może wprowadzić dowolny znak

     */
public static double rozdzielLiczbe() {
    Scanner sc=new Scanner(System.in);
    String wejscie;
    double liczba;
    int cecha;double mantysa;
    boolean trwa=true;
    while (trwa) {
        try {
            cecha = 0;
            mantysa = 0;
            System.out.print("Podaj liczbe:");
            wejscie = sc.nextLine();
            liczba=Double.parseDouble(wejscie);
            cecha = (int)liczba;
            mantysa = liczba - cecha;
            if (mantysa==0) {
                System.out.println("Nie dzielimy przez 0");
                continue;
            }
            System.out.printf("Podana liczba to %s, cecha %d, mantysa %5.2f, iloraz cechy i mantysy %5.2f",
                    liczba, cecha, mantysa, (double) cecha / mantysa);
            trwa = false;
            return (double) cecha / mantysa;
        } catch (NumberFormatException e) {
            System.out.println("Podana wartosc nie jest liczba!");
            System.out.println("Sporobuj ponownie!");

        }

    }
    throw new IllegalStateException("Nie udalo sie przetworzyc liczby");
}

    public static void main(String[] args) {
    rozdzielLiczbe();
    }
}
