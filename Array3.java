package br.com.tabelaverdade;

/**
 * Somar todos os elementos de um array e tirar a media
 * @author Olival Paulino
 */
public class Array3 {
    public static void main(String[] args) {
        // declarando variaveis e inicializando-as
        int[] notas = new int[4];
        int total = 0;
        int media = 0;
        
        // atribuindo valores aos elementos do array
        notas[0] = 5;
        notas[1] = 9;
        notas[2] = 7;
        notas[3] = 6;
        
        // percorrendo o array para calcular o total
        for (int nota : notas) {
            total += nota;
        }
        
        // calculando a media
        media = total / notas.length;
        
        // apresentando a media
        System.out.println("Média: "+media);
    }
}
