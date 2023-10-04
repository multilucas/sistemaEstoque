import java.util.Scanner;
public class Estoque {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);

    private final String[] produtos = new String[100];
    private final int[] quantidades = new int[100];

    int qtdProdutosNoEstoque = 0;

    public int menu() {
       System.out.println("Sistema de estoque\n" +
           "1 - Adicionar produto\n" +
           "2 - Remover produto\n" +
           "3 - Listar produtos\n"   +
           "0 - Sair\n" +
               "Digite sua escolha: ");
        return scanner.nextInt();

    }

    public void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nomeDoProduto = scanner2.nextLine();
        System.out.print("Digite a quantidade: ");
        int qtdProduto = scanner.nextInt();
        scanner.nextLine();

        produtos[qtdProdutosNoEstoque] = nomeDoProduto;
        quantidades[qtdProdutosNoEstoque] = qtdProduto;
        qtdProdutosNoEstoque++;
        System.out.println("Produto adicionado com sucesso!");
    }

   public void removerProduto() {
       System.out.print("Digite o nome do produto que deseja retirar: ");
       String produtoParaRemover = scanner2.nextLine();
       boolean produtoEncontrado = false;

       for(int i = 0;i < qtdProdutosNoEstoque; i++) {
           if(produtos[i].equalsIgnoreCase(produtoParaRemover)) {
               //removendo itens com shifting elements
               for(int j = i; j < qtdProdutosNoEstoque - 1; j++) {
                   produtos[j] = produtos[j + 1];
                   quantidades[j] = quantidades[j + 1];
               }
               qtdProdutosNoEstoque--;
               produtoEncontrado = true;
               System.out.println("Produto removido com sucesso!");
               break;
           }
       }
       if(!produtoEncontrado) {
           System.out.println("Produto não encontrado");
       }
   }
   public void exibirTodosProdutos() {
        System.out.println("Estoque atual: ");
        for(int i = 0; i < qtdProdutosNoEstoque; i++) {
            System.out.println(produtos[i] + " : " + quantidades[i]);
        }
    }
    public void sairDoPrograma() {
        scanner.close();
        System.exit(0);
    }

}
