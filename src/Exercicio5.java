// Exercício 5: Inversão com Pilha
// Autor: [William Brito]
// Data: [21-09-2025]


/* Para inverter uma lista de produtos, empilhamos todos os seus elementos e, em seguida, 
os desempilhamos de volta para a lista. A natureza LIFO (Last-In, First-Out) da pilha garante a inversão. */



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exercicio5 {

    public static void inverterComPilha(List<String> produtos) {
        Stack<String> pilha = new Stack<>();
        // Empilha todos os produtos.
        for (String produto : produtos) {
            pilha.push(produto);
        }
        // Limpa a lista original.
        produtos.clear();
        // Desempilha os produtos de volta para a lista, invertendo a ordem.
        while (!pilha.isEmpty()) {
            produtos.add(pilha.pop());
        }
    }

    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>(List.of("Notebook", "Mouse", "Teclado"));
        System.out.println("Lista Original: " + produtos);
        
        inverterComPilha(produtos);
        System.out.println("Lista Invertida com Pilha: " + produtos);
    }
}