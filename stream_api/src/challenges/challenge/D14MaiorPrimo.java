package challenges.challenge;

import java.util.List;

public class D14MaiorPrimo {
    public static void maior(List<Integer> lista){
        System.out.println("\nMeio que 10:");
        lista.stream().filter(n -> n / 2 == 1 && n > 10).forEach(n -> System.out.print(n + " "));
    }
}
