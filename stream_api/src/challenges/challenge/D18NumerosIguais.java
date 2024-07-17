package challenges.challenge;

import java.util.List;

public class D18NumerosIguais {
    public static void iguais(List<Integer> lista){
        boolean todosIguais = lista.stream().allMatch(num -> num.equals(lista.get(0)));

        if (todosIguais) {
            System.out.println("\nTodos os números na lista são iguais.");
        } else {
            System.out.println("\nHá números diferentes na lista.");
        }
    }
}
