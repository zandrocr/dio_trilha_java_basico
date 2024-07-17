package challenges.challenge;

import java.util.List;

public class D9NumerosDistintos {
    public static boolean dististos(List<Integer> lista) {
        System.out.print("Distintos ");

        boolean se = lista.stream().distinct().count() == lista.size();
        return System.out.printf(String.valueOf(se)).checkError();
    }
}
