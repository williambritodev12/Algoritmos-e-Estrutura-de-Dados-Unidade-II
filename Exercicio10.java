// Exercício 10: Implementação de Algoritmo de Ordenação (Bubble Sort)
// Autor: [William Brito]
// Data: [21-09-2025]


/*Implementamos o Bubble Sort para ordenar uma lista de produtos com base no número de vendas, em ordem decrescente. 
O algoritmo compara pares de elementos adjacentes e os troca de posição se estiverem na ordem errada, repetindo o processo até que a lista esteja ordenada. */



import java.util.ArrayList;
import java.util.List;

// Classe auxiliar para representar um produto com nome e vendas.
class Produto {
    String nome;
    int vendas;
    Produto(String nome, int vendas) {
        this.nome = nome;
        this.vendas = vendas;
    }
    @Override
    public String toString() {
        return nome + " (" + vendas + " vendas)";
    }
}

public class Exercicio10 {
    public static void bubbleSortDecrescente(List<Produto> produtos) {
        int n = produtos.size();
        // Itera sobre a lista.
        for (int i = 0; i < n - 1; i++) {
            // Compara elementos adjacentes e os troca se estiverem fora de ordem.
            for (int j = 0; j < n - i - 1; j++) {
                // Para ordem decrescente, troca se o da esquerda for MENOR que o da direita.
                if (produtos.get(j).vendas < produtos.get(j + 1).vendas) {
                    Produto temp = produtos.get(j);
                    produtos.set(j, produtos.get(j + 1));
                    produtos.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Fone de Ouvido", 120));
        produtos.add(new Produto("Smartphone", 350));
        produtos.add(new Produto("Carregador", 80));
        produtos.add(new Produto("Smartwatch", 210));

        System.out.println("Lista Desordenada: " + produtos);
        
        bubbleSortDecrescente(produtos);
        System.out.println("Lista Ordenada (Mais Vendidos): " + produtos);
    }
}