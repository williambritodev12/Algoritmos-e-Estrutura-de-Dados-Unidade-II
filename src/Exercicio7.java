// Exercício 7: Ordem de Chegada
// Autor: [William Brito]
// Data: [21-09-2025]


/* Simula a chegada e saída de clientes em uma loja. A ordem de atendimento respeita 
estritamente a ordem de chegada, como em uma fila real. */


import java.util.LinkedList;
import java.util.Queue;

public class Exercicio7 {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();

        // Clientes chegam e entram na fila.
        System.out.println("Clientes chegando...");
        filaClientes.add("Cliente 1");
        filaClientes.add("Cliente 2");
        filaClientes.add("Cliente 3");
        System.out.println("Fila de atendimento: " + filaClientes);

        // Clientes são atendidos e saem da fila.
        System.out.println("\nIniciando atendimento...");
        while (!filaClientes.isEmpty()) {
            System.out.println("Saiu da loja: " + filaClientes.remove());
        }
        System.out.println("Fila de atendimento vazia: " + filaClientes);
    }
}