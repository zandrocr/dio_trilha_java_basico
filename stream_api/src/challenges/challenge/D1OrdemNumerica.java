package challenges.challenge;

import java.util.List;

// Mostre a lista na ordem numérica
public class D1OrdemNumerica {
    public static void ordem(List<Integer> lista){
        System.out.println("Lista dos numero");
        lista.stream().sorted(Integer::compareTo).forEach(n -> System.out.printf("%s ",n));
    }
}
