public class Bhaskara {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        a = 1;
        b = -4;
        c = 3;

        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("delta = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
