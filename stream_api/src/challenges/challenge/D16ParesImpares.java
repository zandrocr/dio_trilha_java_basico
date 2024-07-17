package challenges.challenge;

import java.util.List;

public class D16ParesImpares {
    public static void parImpar(List<Integer> lista){
        System.out.println("Lista impart");
        lista.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista par");
        lista.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
    }
}
