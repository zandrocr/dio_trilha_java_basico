package challenges.challenge;

import java.util.List;

public class D5MediaMaior5 {
    public static void maique(List<Integer> lista){
        int resposta = lista.stream().filter(n -> n > 5).reduce(0, Integer::sum);
        List<Integer> total = lista.stream().filter(n -> n > 5).toList();
        System.out.printf("%nO média total dos números: %s", resposta / total.size());
    }
}
