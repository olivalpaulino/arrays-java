package br.com.tabelaverdade;

/**
 * Criando uma matriz com três linhas e quantidade diferente de colunas.
 * Acessando cada elemento da matriz, as colunas, através da leitura da linha
 * @author Olival Paulino
 */
public class Arrays2 {
    
    public static void main(String[] args) {
        int[][] array = {{1,2}, {3}, {4,5,6}};
        
        // Percorre a quantidade de linhas
        for (int i = 0; i < array.length; i++) {
            // Percorre a quantidade de colunas
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println("");
        }
    }
}
