package challenges.challenge;

import java.util.Arrays;
import java.util.List;

// Mostre a lista na ordem numérica
public class OrdemNumerica {
    public static void ordem(List<Integer> lista){
        lista.stream().sorted(Integer::compareTo).forEach(n -> System.out.printf("%s, ",n));
        System.out.println("");
    }
}
