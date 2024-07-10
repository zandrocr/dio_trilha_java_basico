package challenges;

import challenges.challenge.OrdemNumerica;
import challenges.challenge.SomaDosPares;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OrdemNumerica.ordem(numeros);
        SomaDosPares.soma(numeros);
    }
}
