package challenges;

import challenges.challenge.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -40);

        D1OrdemNumerica.ordem(numeros);
        D2SomaDosPares.soma(numeros);
        D3NumerosPositivos.positivos(numeros);
        D4RemoverOsImpares.impares(numeros);
        D5MediaMaior5.maique(numeros);
        D6MaiorQue10.maiorQue(numeros);
        D7SegundoMaior.segundoMaior(numeros);
        D8SomarTudo.somar(numeros);
        D9NumerosDistintos.dististos(numeros);
        D10Agrupar.agrupe(numeros);
        D11SomaDosCadrados.soma(numeros);
        D12Produto.produto(numeros);
        D13FiltrarIntervalo.filtro(numeros);
        D14MaiorPrimo.maior(numeros);
        D15NumeroNegativo.negativo(numeros);
        D16ParesImpares.parImpar(numeros);
        D17Primo.primo(numeros);
        D18NumerosIguais.iguais(numeros);
        D19SomaDivisiveis3e5.soma(numeros);
    }
}
