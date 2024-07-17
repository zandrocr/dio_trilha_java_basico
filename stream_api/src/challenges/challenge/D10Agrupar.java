package challenges.challenge;

import java.util.List;

public class D10Agrupar {
    public static void agrupe(List<Integer> lista){
        System.out.println("Múltiplos de 3: " );
        lista.stream().filter(n -> n % 3 == 0)
                .forEach(n -> System.out.printf(n + " "));

        System.out.println("\nMúltiplos de 4: " );
        lista.stream().filter(n -> n % 4 == 0)
                .forEach(n -> System.out.printf(n + " "));
    }
}
