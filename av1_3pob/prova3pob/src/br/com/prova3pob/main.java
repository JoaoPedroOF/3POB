package br.com.prova3pob;

	import java.util.Scanner;
	import java.util.ArrayList;

public class main {

	public main(String[] args) {
	
    Scanner dados = new Scanner(System.in);
    Scanner dados1 = new Scanner(System.in);
    Scanner dados2 = new Scanner(System.in);
    Scanner dados3 = new Scanner(System.in);
    Scanner dados4 = new Scanner(System.in);
    Scanner dados5 = new Scanner(System.in);
    Scanner dados6 = new Scanner(System.in);
    Scanner dados7 = new Scanner(System.in);
    Scanner dados8 = new Scanner(System.in);
    ControlaProduto produtoController = new ControlaProduto();
    Produto c1 = new Produto();

	int id = 0;
    String codigoBarras = "";
    String sku = "";
    String nome = "";
    String descricao = "";
    String categoria = "";
    double peso = 0;
    double preco = 0;
    String fabricante  = "";


    System.out.println("Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n 4-Dinheiro\n");
    int numopc = 0;

    System.out.print("nº: ");

    numopc = dados.nextInt();

    while (numopc
            == 1) {

        switch (numopc) {

            case 1:
                System.out.println("ID do produto: ");
                id = dados.nextInt();
                c1.setId(id);

                System.out.println("Código de barras do produto: ");
                codigoBarras = dados1.nextLine();
                c1.setCodigoBarras(codigoBarras);

                System.out.println("SKU do produto: ");
                sku = dados3.nextLine();
                c1.setSku(sku);

                System.out.println("Nome do produto: ");
                nome = dados.nextLine();
                c1.setNome(nome);

                System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
                numopc = dados.nextInt();

                produtoController.adicionar(c1);
                c1 = new Produto();
                break;

            case 2:
                break;
        }

    }

    ControlaProduto.listaProdutos();
}
}

}	
	

