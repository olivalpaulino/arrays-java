package br.com.tabelaverdade;

/**
 *
 * @author Olival Paulino
 */
public class Arrays2 {
    public static void main(String[] args) {
        int[][] array = {{1,2}, {3}, {4,5,6}};
        
        // quantidade de linhas
        for (int i = 0; i < array.length; i++) {
            // quantidade de colunas
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println("");
        }
    }
}
