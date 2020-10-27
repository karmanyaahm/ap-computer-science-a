import java.lang.Math;

/**
 * Write a description of class HelloWorld here.
 *
 * @author (Karmanyaah Malhotra)
 * @version (a version number or a date)
 * @assignment (stub)
 */
public class a4 {
    public static void main(String args[]) {
        // =========================== 1 ===========================
        int rand = (int) (Math.random() * 11 + 15);
        System.out.println("Random number is " + rand);

        // =========================== 2 ===========================
        double x = 5.0;
        if ((1.0 / (x - 2.0)) <= (1.0 / 7.0))
            System.out.println("1/7 is less than or equal to");
        else
            System.out.println("1/7 is greater than");

        // =========================== 3 ===========================
        int i = 150;
        if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))
            System.out.println("One of the factors has been found");

        // // =========================== 4 ===========================
        // // a
        // double s = s0 + v0 * t + (0.5) * g * t * t;
        // // b
        // double G = 4 * Math.pow(Math.PI, 2) * Math.pow(a, 3) / (P * P * (m1 + m2));
        // // c
        // FV = PV * Math.pow((1 + (INT / 100)), YRS);
        // // d
        // c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(y));

        // =========================== 5 ===========================
        // a
        x = 3.5;
        double y = 2;
        int j = 8;
        x += y + j;
        j = j % 3;
        y = Math.pow(3, j);
        System.out.printf("x %f, y %f, j %d\n", x, y, j);

        // b
        int a = 4, b = 9, c = 20;
        double z;
        z = a / b - c * 3 / 4;
        b *= (a * c * 5) % b;
        System.out.printf("z %f, b %d\n", z, b);
    }
}
