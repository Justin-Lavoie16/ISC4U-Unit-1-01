/*
 * much logs a truck can carry if the max weight
 * it can carry is 1100 kg and each log is 20 kg/m
 * *
 * @author  Justin Lavoie
 * @version 1.0
 * @since   2024-09-20
 */

import java.util.Scanner;

/*
 * This is the program.
 */
final class checkLogLength {
    private checkLogLength() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter log length (m): ");

        static final float length = Float.parseFloat(input.nextLine());
        static final float maxLogsCarried = 1100 / (20 * length);

        System.out.println("A truck can carry " + maxLogsCarried + " " + length + " meter long logs.");

        System.out.println("\nDone.");
    }
}