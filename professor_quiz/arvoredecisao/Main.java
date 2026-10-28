package arvoredecisao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NoDecisao raiz = ConstrutorArvore.construir();

        NoDecisao atual = raiz;

        // Percorrendo a árvore até chegar a um resultado
        while (atual.pergunta != null) {

            System.out.println(atual.pergunta);
            System.out.print("Responda (sim/nao): ");

            String resposta = scanner.nextLine().trim();

            if (resposta.equalsIgnoreCase("sim")) {
                atual = atual.sim;

            } else if (resposta.equalsIgnoreCase("nao")) {
                atual = atual.nao;

            } else {
                System.out.println("Resposta inválida! Digite sim ou nao.");
            }
        }

        // Exibindo o resultado final
        System.out.println(atual.resultado);

        scanner.close();
    }
}