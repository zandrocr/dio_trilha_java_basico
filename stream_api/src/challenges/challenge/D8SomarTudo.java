package challenges.challenge;

import java.util.List;

public class D8SomarTudo {
    public static void somar(List<Integer> lista){
        Integer resultado = lista.stream().reduce(0, Integer::sum);
        System.out.printf("%nTotal dos numeros: %s %n",resultado);
    }
}
