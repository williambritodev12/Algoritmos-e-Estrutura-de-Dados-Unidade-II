// Exercício 2: Remoção de Elementos Duplicados
// Autor: [William Brito]
// Data: [21-09-2025]


/* Programa para remover contatos duplicados, percorremos a lista e adicionamos 
cada contato a uma nova lista apenas se ele ainda não existir nela.
 */


import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

    public static List<String> removerDuplicados(List<String> contatos) {
        // Cria uma nova lista para os contatos únicos.
        List<String> unicos = new ArrayList<>();
        // Itera sobre a lista original.
        for (String contato : contatos) {
            // Adiciona o contato na nova lista apenas se ele não existir nela.
            if (!unicos.contains(contato)) {
                unicos.add(contato);
            }
        }
        return unicos;
    }

    public static void main(String[] args) {
        // Lista com contatos duplicados.
        List<String> contatos = new ArrayList<>(List.of("Ana", "João", "Ana", "Maria", "João"));
        System.out.println("Lista Original: " + contatos);

        // Remove as duplicatas.
        List<String> contatosUnicos = removerDuplicados(contatos);
        System.out.println("Lista sem Duplicados: " + contatosUnicos);
    }
}