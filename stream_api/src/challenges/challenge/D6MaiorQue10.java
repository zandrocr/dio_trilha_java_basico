package challenges.challenge;

import java.util.List;

public class D6MaiorQue10 {
    public static void maiorQue(List<Integer> lista){
        System.out.println("\nNúmeros maiores que 10: ");
        lista.stream().filter(n -> n > 10).forEach(n -> System.out.printf(" "+n));
    }
}
