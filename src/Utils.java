import java.util.Scanner;

public class Utils {

    public static void hello() {
        System.out.println("Hello!");
    }

    public static boolean isPositiveInteger(String str) {
        return str.matches("[0-9]+");
    }

    public static void writeLog(String msg) {
        // write msg to logfile, simulated here with sout
        System.out.println("Log: " + msg);

    }

    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(prompt + ": ");
            try {
                String line = scanner.nextLine();
                int input = Integer.parseInt(line);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning. Vänligen ange ett heltal.");
            }
        }

    }
}