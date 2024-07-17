package challenges.challenge;

import java.util.List;

public class D13FiltrarIntervalo {
    public static void filtro(List<Integer> lista){
        System.out.println("Filtre entre 5 e 10: ");
        lista.stream().filter(n -> n > 5 && n < 10).forEach(System.out::print);
    }
}
