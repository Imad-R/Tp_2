import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // 3.1.1
    // Questions

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta == 0) {
            double x0 = (-b)/(2*a);
            System.out.println("La racine du polynôme est "+x0);
        }
        else if (delta > 0){
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Les racines du polynôme sont "+x1+" et "+x2);

        }

        else if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle, on dois donc utiliser les formules: \nx1= (" +
                    -b + "+iMath.sqrt(" + delta + "))/2" + a + ")\n" + "et\nx2= (" +
                    -b + "-iMath.sqrt(" + delta + "))/2" + a + ")");
        }
    }
}