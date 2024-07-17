package challenges.challenge;

import java.util.List;

public class D15NumeroNegativo {
    public static void negativo(List<Integer> lista){
        System.out.println("\nNúmeros negativos");
        lista.stream().filter(n -> n < 0).forEach(n -> System.out.println(n + ""));
    }
}
