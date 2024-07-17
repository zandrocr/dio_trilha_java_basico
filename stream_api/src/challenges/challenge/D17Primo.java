package challenges.challenge;

import java.util.List;

public class D17Primo {
    public static void primo(List<Integer> lista){
        System.out.println("\nLista de primos");
        lista.stream().filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + " "));
    }
}
