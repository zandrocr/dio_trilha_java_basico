package challenges.challenge;

import java.util.HashSet;
import java.util.List;

public class D4RemoverOsImpares {
    public static void impares(List<Integer> lista){
        lista.stream().filter(n -> n % 2 == 0).sorted(Integer::compareTo).forEach(n ->System.out.printf("%s ",n));
    }
}
