import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        HashSet<String> ciccio = new HashSet<>();
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int nElements = Integer.parseInt(input.nextLine());
        for (int i = 0; i < nElements; i++){
        System.out.println("Inserisci una parola");
        String words = (input.nextLine());
        ciccio.add(words);
        }
        input.close();
        for (String i : ciccio) {
            System.out.println(i);
        }
            System.out.println(ciccio.size());
    }
}