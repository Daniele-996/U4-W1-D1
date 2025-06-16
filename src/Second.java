import java.util.Scanner;
public class Second {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la prima parola");
        String first = scan.nextLine();
        System.out.println("Inserisci la seconda parola");
        String second = scan.nextLine();
        System.out.println("Inserisci la terza parola");
        String third = scan.nextLine();

        System.out.println(first +" "+ second +" "+ third);
        System.out.println(third +" "+ second +" "+ first);
    }
}
