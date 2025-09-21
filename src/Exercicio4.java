// Exercício 4: Verificação de Expressões (Parênteses Balanceados)
// Autor: [William Brito]
// Data: [21-09-2025]


/*/**
     * Verifica se os parênteses em uma expressão matemática estão balanceados.
     * @param expressao A string contendo a expressão a ser verificada.
     *  @return true se os parênteses estiverem balanceados, false caso contrário.
*/



import java.util.Stack;

public class Exercicio4 {

    public static boolean verificarParenteses(String expressao) {
        // A Pilha (Stack) armazena os parênteses de abertura '(' encontrados.
        Stack<Character> pilha = new Stack<>();

        // Itera sobre cada caractere da expressão.
        for (char caractere : expressao.toCharArray()) {
            
            // Se o caractere for um parêntese de abertura, ele é empilhado.
            if (caractere == '(') {
                pilha.push(caractere);
            } 
            // Se for um parêntese de fechamento...
            else if (caractere == ')') {
                // ...verificamos se a pilha está vazia.
                // Se estiver, significa que há um ')' sem um '(' correspondente.
                if (pilha.isEmpty()) {
                    return false; // Erro: parêntese de fechamento sem um de abertura.
                }
                // Se a pilha não estiver vazia, removemos o último '(' que foi adicionado.
                // Isso forma o "par" balanceado.
                pilha.pop();
            }
        }

        // Ao final, a expressão só é válida se a pilha estiver vazia.
        // Se sobrar algum '(', significa que ele não foi fechado.
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressaoCorreta = "((1 + 2) * (3 - 4)) / 5";
        String expressaoIncorreta1 = "((1 + 2) * 3) - 4)"; // Tem um ')' a mais
        String expressaoIncorreta2 = "((1 + 2) * (3 - 4)";  // Falta fechar um '('

        System.out.println("A expressão '" + expressaoCorreta + "' está balanceada? " + verificarParenteses(expressaoCorreta));
        System.out.println("A expressão '" + expressaoIncorreta1 + "' está balanceada? " + verificarParenteses(expressaoIncorreta1));
        System.out.println("A expressão '" + expressaoIncorreta2 + "' está balanceada? " + verificarParenteses(expressaoIncorreta2));
    }
}