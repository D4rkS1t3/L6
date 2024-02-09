import java.util.Scanner;

public class Calkowita {
    /*
    Napisz  metodę  pobierającą  o  użytkownika  liczbę  całkowitą  z  zakresu  <99,999>.
    Zwróć sumę kwadratów jej cyfr. Załóż, że użytkownik może wprowadzić dowolny znak
     */
    public static double sumaKwadratow() {
        String wejscie;int liczba=0;int kopia=0;
        boolean trwa=true;
        int suma=0;
        Scanner sc=new Scanner(System.in);
        while (trwa) {
            try {

                System.out.print("Podaj liczbe z zakresu <99,999>:");
                wejscie = sc.nextLine();
                liczba = Integer.parseInt(wejscie);
                kopia=liczba;

                if (liczba<99 || liczba >999) {
                    System.out.println("Podana liczba nie znajduje sie w przedziale <99,999>");
                    continue;
                }
                while (liczba>0) {
                    suma+=Math.pow(liczba%10,2);
                    liczba/=10;
                }
                System.out.printf("Suma kwadaratow cyfry %d jest rowna %d\n", kopia, suma);
                trwa=false;
                return suma;
            } catch (NumberFormatException e) {
                System.out.println("Nie podano liczby!!!");
                System.out.println("Sprobuj ponownie!");
            }
        }
        throw new IllegalStateException("Nie udalo sie przetworzyc liczby");


    }

    public static void main(String[] args) {
        sumaKwadratow();
    }
}
