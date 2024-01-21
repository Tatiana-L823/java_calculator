import java.util.Scanner;

public class XxTaschenrechner {
    public static void main(String[] args) {
        System.out.println("Willkommen zum XxTaschenrechner!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWähle eine der vier Grundrechenarten:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Programm beenden");

            System.out.print("Deine Auswahl (1/2/3/4/5): ");
            String choice = scanner.nextLine();

            if (choice.equals("5")) {
                System.out.println("Programm wird beendet. Auf Wiedersehen!");
                break;
            }

            try {
                System.out.print("Gib die erste Zahl ein: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Gib die zweite Zahl ein: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result;

                switch (choice) {
                    case "1":
                        result = add(num1, num2);
                        System.out.println("Ergebnis der Addition: " + result);
                        break;
                    case "2":
                        result = subtract(num1, num2);
                        System.out.println("Ergebnis der Subtraktion: " + result);
                        break;
                    case "3":
                        result = multiply(num1, num2);
                        System.out.println("Ergebnis der Multiplikation: " + result);
                        break;
                    case "4":
                        result = divide(num1, num2);
                        System.out.println("Ergebnis der Division: " + result);
                        break;
                    default:
                        System.out.println("Ungültige Auswahl. Bitte wähle eine der Optionen (1/2/3/4/5).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte gib gültige Zahlen ein.");
            }
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Division durch Null ist nicht erlaubt.");
            return Double.NaN; // NaN steht für "Not a Number"
        }
    }
}
