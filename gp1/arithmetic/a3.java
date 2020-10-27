import java.lang.Math;

/**
 * Write a description of class HelloWorld here.
 *
 * @author (Karmanyaah Malhotra)
 * @version (a version number or a date)
 * @assignment (stub)
 */
public class a3 {
    public static void main(String args[]) {
        // =========================== 1 ===========================
        double rand = Math.random() * 50 + 50;
        System.out.println("Random number is " + rand);

        // 2 = skip
        // double x = 5;
        // if ((1 / x) > 1.0 / 2.0)
        // System.out.println("greater");
        // else
        // System.out.println("less than or equal to");

        // =========================== 3 ===========================
        double a, b, c;
        a = 3.0;
        b = 4.0;
        c = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 1.0 / 2.0);
        System.out.printf("Side 1: %.2f; Side 2: %.2f; Hypotenuse: %.2f;%n", a, b, c);

        // =========================== 4 ===========================
        double z = 27.0;
        System.out.printf("Cube root of %.2f is %f%n", z, Math.pow(z, 1.0 / 3));

        // =========================== 5 ===========================
        int i = 9, j = 4, iResult;
        double x = 0.1, y = -7, dResult;

        iResult = (int) (y / x);
        System.out.println("a " + iResult);
        // -70

        dResult = Math.pow(y, -2);
        System.out.println("b " + dResult);
        // 0.02040816326530612

        iResult = i % j + (int) Math.sqrt(i);
        System.out.println("c " + iResult);
        // 4

        dResult = j / i - y / x;
        System.out.println("d " + dResult);
        // 70.0

    }
}
