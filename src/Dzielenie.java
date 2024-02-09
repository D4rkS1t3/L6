import java.util.InputMismatchException;
import java.util.Scanner;

public class Dzielenie {

    public static double dzielenie1() throws ArithmeticException{
        Scanner sc =new Scanner(System.in);
        double x;
        double y;
        System.out.print("Podaj x:");
        x=sc.nextDouble();
        System.out.print("Podaj y:");
        y=sc.nextDouble();
        if (y==0) {
            throw new ArithmeticException ("Nie dzielimy przez 0 koncze program");
        }
        else {
            System.out.printf("wynik:%5.2f",x/y);
            return x/y;
        }
    }

    public static void main(String[] args) {
        dzielenie2();
        System.out.println(123);
    }

    public static double dzielenie2() {
        Scanner sc = new Scanner(System.in);
        double x, y, wynik = 0; // Zainicjalizuj wynik wartością domyślną na początku
        while(true) { // Pętla nieskończona, która zapewnia, że metoda zawsze coś zwróci
            try {
                System.out.print("Podaj x: ");
                x = Double.parseDouble(sc.nextLine());
                System.out.print("Podaj y: ");
                y = Double.parseDouble(sc.nextLine());
                if(y == 0) {
                    throw new ArithmeticException("Nie można dzielić przez zero.");
                }
                wynik = x / y;
                return wynik; // Zwraca wynik, jeśli dzielenie przebiegło pomyślnie
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Niepoprawne dane wejściowe, spróbuj ponownie.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + " Spróbuj ponownie.");
            }
        }
    }

}
