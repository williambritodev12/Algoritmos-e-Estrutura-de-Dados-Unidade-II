// Exercício 1: Inversão de Lista
// Autor: [William Brito]
// Data: [21-09-2025]

/*Este programa inverte uma ArrayList de tarefas criando uma nova lista e populando-a com os elementos da original, 
da última para a primeira posição. */


import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public static List<String> inverterLista(List<String> original) {
        // Cria uma nova lista para armazenar o resultado.
        List<String> invertida = new ArrayList<>();
        // Percorre a lista original de trás para frente.
        for (int i = original.size() - 1; i >= 0; i--) {
            // Adiciona cada elemento na nova lista.
            invertida.add(original.get(i));
        }
        return invertida;
    }

    public static void main(String[] args) {
        // Lista de tarefas original.
        List<String> tarefas = new ArrayList<>(List.of("Estudar Java", "Fazer exercício", "Ir à academia"));
        System.out.println("Lista Original: " + tarefas);

        // Chama o método para inverter a lista.
        List<String> tarefasInvertidas = inverterLista(tarefas);
        System.out.println("Lista Invertida: " + tarefasInvertidas);
    }
}