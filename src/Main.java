import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int condition;
        int i = 1;
        while (i < 2) {
            Scanner console = new Scanner(System.in);
            System.out.println("Wybierz: 1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie, 5 - KONIEC");
            condition = console.nextInt();
            if (condition == 1) {
                System.out.println();
                System.out.println("Podaj a:");
                a = console.nextInt();
                System.out.println("Podaj b:");
                b = console.nextInt();
                System.out.println("Pitagorasss to:" + (a + b));
            }
            if (condition == 2) {
                System.out.println();
                System.out.println("Podaj a:");
                a = console.nextInt();
                System.out.println("Podaj b:");
                b = console.nextInt();
                System.out.println("Pitagorasss to:" + (a - b));
            }
            if (condition == 3) {
                System.out.println();
                System.out.println("Podaj a:");
                a = console.nextInt();
                System.out.println("Podaj b:");
                b = console.nextInt();
                System.out.println("Pitagorasss to:" + (a * b));
            }
            if (condition == 4) {
                System.out.println();
                System.out.println("Podaj a:");
                a = console.nextInt();
                System.out.println("Podaj b:");
                b = console.nextInt();
                System.out.println("Pitagorasss to:" + (a / b));
            }
        }
    }
}