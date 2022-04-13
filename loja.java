
/*
* 
* Crie uma um programa para trabalhar com estoque de uma loja, o programa
* deverá
* trabalhar com Collection do tipo List do Java para manipular os dados desse
* estoque, o
* programa deverá atender as seguintes funcionalidades:
* Armazenar dados da List
* Remover dados da list;
* Atualizar dados da list.
* Apresentar todos os dados da list.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * loja
 */

public class loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("        Menu de Opções        ");
            System.out.println("==============================");

            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("==============================");
                    System.out.println("        Cadastrar Produto      ");
                    System.out.println("==============================");

                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.next();
                    System.out.print("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    Produto p = new Produto(nome, preco, quantidade);
                    lista.add(p);

                    System.out.println();
                    break;
                case 2:
                    System.out.println("==============================");
                    System.out.println("        Remover Produto        ");
                    System.out.println("==============================");

                    boolean encontrado = false;
                    System.out.print("Digite o nome do produto: ");
                    String nome2 = sc.next();

                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getNome().equals(nome2)) {
                            lista.remove(i);
                            encontrado = true;
                            System.out.println("Produto removido com sucesso!");
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("        Atualizar Produto      ");
                    System.out.println("==============================");

                    System.out.print("Digite o nome do produto: ");
                    String nome3 = sc.next();

                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getNome().equals(nome3)) {
                            System.out.print("Digite o novo preço do produto: ");
                            double preco2 = sc.nextDouble();
                            System.out.print("Digite a nova quantidade do produto: ");

                            int quantidade2 = sc.nextInt();
                            lista.get(i).setPreco(preco2);
                            lista.get(i).setQuantidade(quantidade2);
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("        Lista Produtos        ");
                    System.out.println("==============================");

                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).toString());
                    }

                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
}