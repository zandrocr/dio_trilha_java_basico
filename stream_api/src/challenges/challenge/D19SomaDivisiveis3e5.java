package challenges.challenge;

import java.util.List;

public class D19SomaDivisiveis3e5 {
    public static void soma(List<Integer> lista){
        System.out.println("Numeros divisiveis por 3");
        lista.stream().filter(n -> n % 3 == 0).forEach(n -> System.out.print(n + " "));

        System.out.println("\nNumeros divisiveis por 5");
        lista.stream().filter(n -> n % 5 == 0).forEach(n -> System.out.print(n + " "));
    }
}
