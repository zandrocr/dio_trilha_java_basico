package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

//        List<String> listaSuadacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(5).toList();

//         Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSuadacoes = Stream.generate(saudacao).limit(5).toList();

        // Imprimir as saudações geradas
        listaSuadacoes.forEach(System.out::println);
    }
}
