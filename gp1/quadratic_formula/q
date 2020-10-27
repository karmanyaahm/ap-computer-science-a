import java.io.*;
import java.math.*;

public class QuadraticFormula

{
    public static void main(String args[]) throws IOException {

        double a, b, c; // the coefficients of your quadratic formula

        // create buffered reader for reading keyboard input

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str; // stores the input as text

        // this section reads in the coefficient of the x square term
        System.out.println("Enter the coefficient of x^2: ");

        str = br.readLine();

        try {
            a = Double.parseDouble(str);
        }

        catch (NumberFormatException exc) {
            System.out.println("Invalid format");
            a = 0;
        }
        /////////////////////////////////////////////////////////////////////////

        // this section reads in the coefficient of the x term/////////////////

        System.out.println("Enter the coefficient of x: ");

        str = br.readLine();

        try {
            b = Double.parseDouble(str);
        }

        catch (NumberFormatException exc) {
            System.out.println("Invalid format");
            b = 0;
        }
        ///////////////////////////////////////////////////////////////

        // this section reads in the constant term/////////////////////
        System.out.println("Enter the constant term: ");

        str = br.readLine();

        try {
            c = Double.parseDouble(str);
        }

        catch (NumberFormatException exc) {
            System.out.println("Invalid format");
            c = 0;
        }
        ////////////////////////////////////////////////////////////////

        // BEGIN STUDENT CODE HERE
        // Remember to check that x squared has a non-zero coefficient

        System.out.printf("You entered %.2fx^2 + %.2fx + %.2f%n", a, b, c);

        if (a == 0) {
            System.out.println("That's not a quadratic it seems like a linear equation!!!!!");
            System.out.println("Exiting...");
            System.exit(1);
        }

        double discriminant = Math.pow(b, 2) - (4 * a * c); // b^2 - 4ac the quadratic formula discriminant

        if (discriminant < 0) {
            System.out.println("This equation will have two complex roots which this program cannot compute.");
            System.exit(2);
        } else if (discriminant == 0) {
            System.out.println("This equation has one real root.");
            double ans = (-1 * b) / (2 * a);
            System.out.printf("The one real root to this equation is %.3f%n", ans);

        } else if (discriminant > 0) {
            System.out.println("This equation has two real roots.");
            double ans1 = (-1 * b + discriminant) / (2 * a);
            double ans2 = (-1 * b - discriminant) / (2 * a);
            System.out.printf("The two real roots of this equation are %.3f and %.3f%n", ans1, ans2);

        }
    } // end main
} // end class