import java.util.Scanner;

public class Main {
    static int printMenu() {
        System.out.println("===========================");
        System.out.println("Wybierz:");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        System.out.println("5 - KONIEC");
        System.out.println("===========================");

        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    static double[] readInput() {
        double[] arr = new double[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a:");
        arr[0] = scanner.nextDouble();
        System.out.println("Podaj b:");
        arr[1] = scanner.nextDouble();
        return arr;
    }

    public static void main(String[] args) {

        while (true) {
            int condition = printMenu();

            switch (condition) {
                case 1 -> {
                    double[] dane = readInput();
                    System.out.println("a + b = " + (dane[0] + dane[1]));
                }
                case 2 -> {
                    double[] dane = readInput();
                    System.out.println("a - b = " + (dane[0] - dane[1]));
                }
                case 3 -> {
                    double[] dane = readInput();
                    System.out.println("a * b = " + (dane[0] * dane[1]));
                }
                case 4 -> {
                    double[] dane = readInput();
                    System.out.println("a / b = " + (dane[0] / dane[1]));
                }
                case 5 -> {
                    System.out.println("KONIEC");
                    System.exit(0);
                }
            }
        }
    }
}