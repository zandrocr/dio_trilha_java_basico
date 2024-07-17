package challenges.challenge;

import java.util.List;

public class D7SegundoMaior {
    public static void segundoMaior(List<Integer> lista){
        int segundo = lista.stream().distinct().sorted((a,b) -> Integer.compare(b, a)).limit(2).skip(1).findFirst().orElseThrow();

        System.out.println("O segundo maior número é: " + segundo);
    }
}
