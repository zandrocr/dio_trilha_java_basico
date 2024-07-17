package challenges.challenge;

import java.util.List;

public class D12Produto {
    public static void produto(List<Integer> lista){
        int response = lista.stream().reduce(1, (a,b) -> a * b);
        System.out.println("Produto \n" + response);
    }
}
