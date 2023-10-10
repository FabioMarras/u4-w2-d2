import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Es2 {
    public static void main(String[] args) {
        //  funzione1();
        // funzione2();
        funzione3();
    }

    public static void funzione1() {
        Random rndm = new Random();
        int numeroCasuale = rndm.nextInt(11);
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < numeroCasuale; i++) {
            int numeroCasuale1 = rndm.nextInt(101);
            numList.add(numeroCasuale1);
        }
        for (Integer i : numList) {
            System.out.println(i);
        }
    }

    public static void funzione2() {
        Random rndm = new Random();
        User Rambo = new User("John", "Rambo", rndm.nextInt());
        User Rocky = new User("Rocky", "Balboa", rndm.nextInt());
        User Chuck = new User("Chuck", "Norris", rndm.nextInt());
        User[] pgUser = {Rambo, Rocky, Chuck};
        ArrayList<User> numList = new ArrayList<>(Arrays.asList(pgUser));
        for (User user : numList) {
            System.out.println(user);
        }
        for (int i = numList.size() - 1; i >= 0; i--) {
            User user = numList.get(i);
            System.out.println(user);
        }
    }

    public static void funzione3() {
        Random rndm = new Random();
        User Rambo = new User("John", "Rambo", rndm.nextInt());
        User Rocky = new User("Rocky", "Balboa", rndm.nextInt());
        User Chuck = new User("Chuck", "Norris", rndm.nextInt());
        User[] pgUser = {Rambo, Rocky, Chuck};
        ArrayList<User> numList = new ArrayList<>(Arrays.asList(pgUser));
        boolean x = numList.size() % 2 != 0;
        if (x) {
            /*for (User user : numList) {
                if (user.getId() % 2 == 0) {
                    System.out.println("PARI: " + user);
                }
            }
        else {for (User user : numList) {
            if (user.getId() % 2 != 0) {
                System.out.println("DISPARI: " + user);
            }
        }*/
            for (int i = 0; i < numList.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println("PARI: " + numList.get(i));
                } }} else {
                    for (int i = 0; i < numList.size(); i++) {
                        if (i % 2 != 0) {
                            System.out.println("DISPARI: " + numList.get(i));
           }
                    }
        }
    }
}
