package challenges.challenge;

import java.util.List;

public class D11SomaDosCadrados {
    public static void soma(List<Integer> lista){
        int somaQuadrado = lista.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("\nSoma dos quadrados\n" + somaQuadrado);
    }
}
