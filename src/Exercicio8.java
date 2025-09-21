// Exercício 8: Contagem de Palavras
// Autor: [William Brito]
// Data: [21-09-2025]




/* O programa utiliza um HashMap para contar a frequência de cada palavra em uma frase. 
Cada palavra é uma chave, e seu valor correspondente é o número de ocorrências.  */


import java.util.HashMap;
import java.util.Map;

public class Exercicio8 {
    public static void main(String[] args) {
        String frase = "o java é uma linguagem de programação e o java é popular";
        // Remove pontuações e converte para minúsculas.
        frase = frase.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        // Divide a frase em palavras.
        String[] palavras = frase.split("\\s+");
        
        // Cria um mapa para armazenar a frequência.
        Map<String, Integer> frequencia = new HashMap<>();
        // Itera sobre as palavras.
        for (String palavra : palavras) {
            // Se a palavra já existe no mapa, incrementa a contagem. Senão, adiciona com valor 1.
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Frequência de palavras: " + frequencia);
    }
}
