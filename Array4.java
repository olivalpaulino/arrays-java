package br.com.tabelaverdade;

import java.util.Scanner;

/**
 * Criando arrays multidimensionais em tempo de execução com quantidade de colunas diferentes
 * @author Olival paulino
 */
public class Array4 {
    public static void main(String[] args) {
        // inicializando um array que tem 2 linhas, mas
        int[][] array = new int[2][]; // sem informar o número de colunas
        
        // adicionando o número de colunas em tempo de execução
        array[0] = new int[5]; // na primeira linha teremos 5 colunas
        array[1] = new int[3]; // na segunda linha teremos 3 colunas
        
        // tambem poderiamos criar esse array dinamicamente, utilizando a classe Scanner
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        
        // adicionando a quantidade de linhas dinamicamente
        int[][] array2 = new int[linhas][];
        
        // adicionando a quantidade de colunas dinamicamente
        for (int i=0; i<linhas; i++) {
            int colunas = sc.nextInt();
            array2[i] = new int[colunas];
        }
        
    }
}
