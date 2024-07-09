package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "goleng", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
//        palavras.stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String palavra) {
//                        return palavra.length() > 5;
//                    }
//                })
//                .forEach(System.out::println);

//        palavras.stream()
//                .filter(maisDeCincoCaracteres)
//                .forEach(System.out::println);

        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);

    }
}
