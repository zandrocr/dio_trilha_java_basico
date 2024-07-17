package challenges.challenge;

import java.util.List;

public class D3NumerosPositivos {
    public static void positivos(List<Integer> lista){
        List resposta = lista.stream().filter(n -> n > 0).toList();
        List resposta2 = lista.stream().filter(n -> n < 0).toList();

        System.out.printf("Numeros possitivos %s %nNúmeros negativos %s %n",resposta.size(), resposta2.size());
    }
}
