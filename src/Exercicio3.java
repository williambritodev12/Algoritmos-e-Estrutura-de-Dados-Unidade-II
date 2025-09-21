// Exercício 3: Mesclar Listas
// Autor: [William Brito]
// Data: [21-09-2025]


/* Esta função intercala os elementos de duas listas de convidados em uma nova lista, 
adicionando um de cada vez até o fim da menor lista e, depois, adicionando os elementos restantes da maior. */


import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

    public static List<String> mesclarListas(List<String> lista1, List<String> lista2) {
        List<String> mesclada = new ArrayList<>();
        // Define o tamanho da menor lista para a intercalação inicial.
        int tamanhoMenor = Math.min(lista1.size(), lista2.size());

        // Intercala os elementos até o final da menor lista.
        for (int i = 0; i < tamanhoMenor; i++) {
            mesclada.add(lista1.get(i));
            mesclada.add(lista2.get(i));
        }

        // Adiciona os elementos restantes da lista maior.
        if (lista1.size() > tamanhoMenor) {
            mesclada.addAll(lista1.subList(tamanhoMenor, lista1.size()));
        } else {
            mesclada.addAll(lista2.subList(tamanhoMenor, lista2.size()));
        }
        return mesclada;
    }

    public static void main(String[] args) {
        List<String> convidados1 = new ArrayList<>(List.of("Carlos", "Beatriz"));
        List<String> convidados2 = new ArrayList<>(List.of("Ana", "Daniel", "Fernanda"));

        // Chama a função para mesclar as listas.
        List<String> listaFinal = mesclarListas(convidados1, convidados2);
        System.out.println("Lista Mesclada: " + listaFinal); // Saída: [Carlos, Ana, Beatriz, Daniel, Fernanda]
    }
}