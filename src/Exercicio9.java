// Exercício 9: Mesclar Mapas
// Autor: [William Brito]
// Data: [21-09-2025]


/* Esta função mescla dois mapas de produtos. Se uma chave (código do produto) existir em ambos, 
a quantidade do segundo mapa sobrescreve a do primeiro. */




import java.util.HashMap;
import java.util.Map;

public class Exercicio9 {
    public static void main(String[] args) {
        // Mapa do inventário 1.
        Map<String, Integer> inventario1 = new HashMap<>();
        inventario1.put("Maçã", 50);
        inventario1.put("Banana", 30);

        // Mapa do inventário 2.
        Map<String, Integer> inventario2 = new HashMap<>();
        inventario2.put("Banana", 40); // Chave conflitante
        inventario2.put("Laranja", 60);

        System.out.println("Inventário 1: " + inventario1);
        System.out.println("Inventário 2: " + inventario2);
        
        // Mescla o inventário2 no inventário1.
        // O método putAll() lida com os conflitos, sobrescrevendo os valores.
        inventario1.putAll(inventario2);

        System.out.println("Inventário Mesclado: " + inventario1);
    }
}