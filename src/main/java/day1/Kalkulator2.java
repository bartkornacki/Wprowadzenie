package day1;

public class Kalkulator2 {

    public static double oblicz(int a, int b, String znak) {
        if (znak.equals("+")) {
            return a + b;
        } else if (znak.equals("-")) {
            return a - b;
        } else if (znak.equals("*")) {
            return a * b;
        } else if (znak.equals("/")) {
            return (double) a / b;
        } else {
            System.out.println("Nieprawidłowe dane w znaku");
            return 0.0;
        }
    }

    public static double oblicz1(int a, int b, String znak) {
        double result = 0.0;
        if (znak.equals("+")) {
            return result = a + b;
        } else if (znak.equals("-")) {
            return result = a - b;
        } else if (znak.equals("*")) {
            return result = a * b;
        } else if (znak.equals("/")) {
            return result = (double) a / b;
        } else {
            System.out.println("Nieprawidłowe dane w znaku");
        }
        return result;
    }

    public static double oblicz2(int a, int b, String znak) {
        double result = 0.0;
        switch (znak) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (double) a / b;
                break;
            default:
                System.out.println("Nieprawidłowe dane w znaku");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(oblicz(2, 3, "+"));
        System.out.println(oblicz(2, 3, "-"));
        System.out.println(oblicz(2, 3, "*"));
        System.out.println(oblicz(2, 3, "/"));
        System.out.println(oblicz(2, 3, "d"));

        System.out.println(oblicz1(2, 3, "+"));
        System.out.println(oblicz1(2, 3, "-"));
        System.out.println(oblicz1(2, 3, "*"));
        System.out.println(oblicz1(2, 3, "/"));
        System.out.println(oblicz1(2, 3, "d"));

        System.out.println(oblicz2(2, 3, "+"));
        System.out.println(oblicz2(2, 3, "-"));
        System.out.println(oblicz2(2, 3, "*"));
        System.out.println(oblicz2(2, 3, "/"));
        System.out.println(oblicz2(2, 3, "d"));
    }
}
