package challenges.challenge;

import java.util.List;

public class SomaDosPares {
    public static void soma(List<Integer> lista){
        int resultado = lista.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println(resultado);
    }
}
