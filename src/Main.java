import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle fonction voulez vous choisir ?");
        String choix = scanner.nextLine();

        switch(choix){
            case "discriminant":
                discriminant();
                break;
            case "parité":
                parite();
                break;
            case "max":
                max();
                break;
            case "min":
                min();
                break;
            case "Egalité string":
                egaliteStr();
                break;
            case "factorielle":
                factorielle();
                break;
            case "compte à rebour":
                countdown();
                break;
            case "carré":
                carres();
                break;
            case "Table de multiplication":
                tableMultiplication();
                break;
            case "Division":
                division();
                break;
            case "Règle":
                regle();
                break;
            case "Nombre de premier":
                nombrepremier();
                break;
            case "Initialisation de tableau":
                initialisationTableau();
                break;
            case "Inversion de tableau":
                int[] myarr = {43,54,23,65,78,85,88,92,10};
                int[] tableau_inverse = inverseTableau(myarr);
                System.out.println(tableau_inverse);
                break;
            //default:
                //System.out.println("La fonction demandé est mal orthographié ou elle n'existe pas dans notre algorithme.");

        }

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
            double x0 = (-b) / (2 * a);
            System.out.println("La racine du polynôme est " + x0);
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les racines du polynôme sont " + x1 + " et " + x2);

        } else if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle, on dois donc utiliser les formules: \nx1= (" +
                    -b + "+iMath.sqrt(" + delta + "))/2" + a + ")\n" + "et\nx2= (" +
                    -b + "-iMath.sqrt(" + delta + "))/2" + a + ")");
        }
    }

    // 3.1.2
    // Questions

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier");
        int entier = scanner.nextInt();
        if (entier % 2 == 0) {
            System.out.println("La valeur " + entier + " est pair");
        } else {
            System.out.println("La valeur " + entier + " est impair");
        }

    }
    // 3.1.3
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un première entier");
        int x1 = scanner.nextInt();
        System.out.println("Saisissez un deuxième entier");
        int x2 = scanner.nextInt();
        if (x1 > x2) {
            System.out.println(x1 + " est le maximum");
        } else if (x1 == x2) {
            System.out.println(x1 + " et " + x2 + " sont égaux");
        }
        else if (x2>x1){
            System.out.println(x2 + " est le maximum");
        }

    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un première entier");
        int x1 = scanner.nextInt();
        System.out.println("Saisissez un deuxième entier");
        int x2 = scanner.nextInt();
        if (x1 < x2) {
            System.out.println(x1 + " est le minimum");
        } else if (x1 == x2) {
            System.out.println(x1 + " et " + x2 + " sont égaux");
        }
        else if (x2<x1){
            System.out.println(x2 + " est le minimum");
        }

    }
    // 3.1.4
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une première chaîne de caractère");
        String str_1 = scanner.nextLine();
        System.out.println("Saisissez une deuxième chaîne de caractère");
        String str_2 = scanner.nextLine();
        if (str_1.equals(str_2)){
            System.out.println("Les chaînes de caractère sont identiques");
        }
        else{
            System.out.println("Les chaînes de caractère sont différentes");
        }
    }
    // 3.2
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    // 3.2.1
    public static void countdown() {
        for (int i = 10; i>=0; i-=1){
            System.out.println(i);
        }

        System.out.println("BOOM");

        }
    // 3.2.2
    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int x = scanner.nextInt();
        System.out.println("Le carré de "+x+" est "+x*x);
    }

    // 3.2.3
    public static void tableMultiplication(){
        for (int i = 1; i<=10; i+=1){
            for (int j = 1; j<=10;j+=1) {
                System.out.print(i*j + " ");
            }
            System.out.print("\n");

        }
    }

    // 3.2.5
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un numérateur");
        int numérateur = scanner.nextInt();
        int dénominateur;
        do {
            System.out.println("Veuillez saisir un dénominateur supérieur à 0 ");
            dénominateur=scanner.nextInt();
        } while (dénominateur == 0);
        System.out.println("Le résultat est égale à "+ numérateur/dénominateur);
    }

    // 3.3
    // 3.3.1
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier positif");
        int entier_pos = scanner.nextInt();
        if (entier_pos<0){
            do{
                System.out.print("Veuillez bien saisir un entier positif");
                entier_pos = scanner.nextInt();
            } while (entier_pos<0);
        }
        System.out.print("|");
        for (int i=1; i<=entier_pos; i+=1){
            System.out.print("-");
            if (i%10==0){
                System.out.print("|");
            }
        }
    }

    // 3.3.2
    public static void nombrepremier(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier positif");
        int nb = scanner.nextInt();
        int cpt = 0;
        if (nb<0){
            do{
                System.out.print("Veuillez bien saisir un entier positif");
                nb = scanner.nextInt();
            } while (nb<0);
        }
        for (int i = 2; i<nb;i+=1){
            if (nb%i==0){
                cpt+=1;
            }
        }
        if (cpt>=1){
            System.out.print("Ce chiffre n'est pas un nombre premier");
        }
        else {
            System.out.print("Ce chiffre est un nombre premier");
        }
    }

    //3.4.1
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        int somme = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
            somme+=entier;
        }
        System.out.println("La somme des éléments du tableau est "+somme);

        int min = tableau[0], max = tableau[0];
        for (int nb : tableau){
            if (nb<min){
                min = nb;
            }
            else if (nb>max) {
                max = nb;
            }

        }
        System.out.println("Le minimum du tableau est "+min);
        System.out.println("Le maximum du tableau est "+max);


        for (int i = 0; i<tableau.length;i++){
            if (tableau[i]%2==0){
                System.out.println("Les nombres pairs sont "+tableau[i]);
            }
            else if (i%2==0){
                System.out.println("Les nombres avec un indice pairs sont "+tableau[i]);
            }
        }
    }
    public static int[] inverseTableau(int[] tableau){
        int idx = tableau.length-1;
        int[] newlist = new int[tableau.length];
        int i = 0;
        while (idx>=0){
            newlist[i] = tableau[idx];
            idx-=1;
            i+=1;
        }
        return newlist;

    }
}




