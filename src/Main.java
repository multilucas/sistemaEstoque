
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoquePlasticos = new Estoque();

        int opcao = 666;
        while (opcao != 0) {
            opcao = estoquePlasticos.menu();
            switch (opcao) {
                case 1:
                    estoquePlasticos.adicionarProduto();
                    break;
                case 2:
                    estoquePlasticos.removerProduto();
                    break;
                case 3:
                    estoquePlasticos.exibirTodosProdutos();
                    break;
                case 0:
                    estoquePlasticos.sairDoPrograma();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}