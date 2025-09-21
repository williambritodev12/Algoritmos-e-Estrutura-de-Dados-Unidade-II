// Exercício 6: Implementação de um Sistema de Fila de Espera
// Autor: [William Brito]
// Data: [21-09-2025]


/* Este programa simula uma fila de atendimento de uma clínica. 
Pacientes são adicionados ao fim da fila e o atendimento sempre remove o paciente do início, seguindo a lógica FIFO (First-In, First-Out). */


import java.util.LinkedList;
import java.util.Queue;

public class Exercicio6 {
    public static void main(String[] args) {
        // Usa LinkedList como implementação da interface Queue.
        Queue<String> filaPacientes = new LinkedList<>();

        // Adiciona pacientes à fila.
        filaPacientes.add("João");
        filaPacientes.add("Maria");
        filaPacientes.add("Pedro");
        System.out.println("Fila de espera atual: " + filaPacientes);

        // Atende o próximo paciente.
        String pacienteAtendido = filaPacientes.poll();
        System.out.println("\nPaciente atendido: " + pacienteAtendido);
        System.out.println("Próximo paciente a ser atendido: " + filaPacientes.peek());
        System.out.println("Fila de espera atualizada: " + filaPacientes);
    }
}