import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Es3 {
    public static void main(String[] args) {
        HashMap<String, Integer> rubrica = new HashMap<String, Integer>();
        rubrica.put("Fabio", 123456789);
        rubrica.put("Alberto", 987654321);
        rubrica.put("Gabriele", 5555);
        rubrica.put("Riccardo", 123);
        //System.out.println(rubrica);


        //rubrica.remove("Riccardo");
        //System.out.println(rubrica);


        int numeroConosciuto = 5555;

        Set<String> chiavi = rubrica.keySet();
        for (String chiave : chiavi) {
            int numero = rubrica.get(chiave);
            if (numeroConosciuto == numero) {
                System.out.println(numeroConosciuto + " è presente nella rubrica ed è di: " + chiave);
            }
        }

        /*String nomeConosciuto = "Fabio";
        Collection<Integer> valori = rubrica.values();
        for (Integer user : valori) {
            Integer y = rubrica.get(user);
            if (y.equals(nomeConosciuto)) {
                System.out.println(nomeConosciuto + " è presente nella rubrica e il suo numero è: " + y);
            }
            System.out.println(user);
        }*/

        //String nomeConosciuto = "Fabio";

        /*Collection<Integer> valori = rubrica.values();
        for (Integer chiave : valori) {
            if (chiave.equals(nomeConosciuto)) {
                System.out.println(nomeConosciuto + " è presente nella rubrica e il suo numero è: " + chiave);
            }
        }*/
    }
}

