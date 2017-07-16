import java.util.Scanner;
/** The main program to read and write what the user inserts. */
public class Morse {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        for (String line = scanner.nextLine(); !line.isEmpty(); line = scanner.nextLine()) {
            System.out.println(line);
        }
    }
}
