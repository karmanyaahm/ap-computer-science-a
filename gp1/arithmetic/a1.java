import java.lang.Math;

/**
 * Write a description of class HelloWorld here.
 *
 * @author (Karmanyaah Malhotra)
 * @version (a version number or a date)
 * @assignment (stub)
 */
public class a1 {
    public static void main(String args[]) {
        // 1
        int i = 0, j = 1, k = 2;
        // a
        i += j + k;
        // b
        k = (i * i) + (j * j) + (k * k);
        // c
        j = (j - k) / i;
        // d
        k = (-3 * i * i) - (j / 6) + (4 * (int) Math.pow((double) k, 3));
        /*
         * 2. Lines c and d could be different since they involve division and integers
         * round down when they divide, while doubles don't.
         */

        // 3
        double x, y, z;
        
        //a
        x = -1;
        y = 5;
        z = 0.5;
        z = 10 + y * z;
        System.out.printf("x: %f; y: %f; z: %f;%n", x, y, z);
        // x: -1.000000; y: 5.000000; z: 12.500000;

        //b
        x = -1;
        y = 5;
        z = 0.5;
        x = x / z - y / x;
        System.out.printf("x: %f; y: %f; z: %f;%n", x, y, z);
        // x: 3.000000; y: 5.000000; z: 0.500000;

        //c
        x = -1;
        y = 5;
        z = 0.5;
        y = (7 - y) / (2 * z + x);
        System.out.printf("x: %f; y: %f; z: %f;%n", x, y, z);
        // x: -1.000000; y: Infinity; z: 0.500000;
    }
}
