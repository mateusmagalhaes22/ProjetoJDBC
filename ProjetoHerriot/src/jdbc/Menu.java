package jdbc;

import java.util.Scanner;

public class Menu {
	public Menu() {
		int r = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("\n\n|| GERENCIAMENTO DE ESTOQUE ||");
			System.out.println("1- Adicionar vendedor\n" + "2- Remover vendedor\n" + "3- Visualizar vendedor\n"
					+ "4- Atualizar vendedor\n" + "5- Adicionar produto\n" + "6- Remover produto\n"
					+ "7- Visualizar produto\n" + "8- Atualizar produto\n" + "9- Adicionar venda\n"
					+ "10- Remover venda\n" + "11- Visualizar venda\n" + "12- Atualizar venda\n" + "13- Finalizar\n");
			System.out.print("Digite o número da operação que deseja efetuar: ");
			r = in.nextInt();
			System.out.print("\n");
			switch (r) {
			case 1:
				if(VendedorController.addVendedor()) {
					System.out.println("vendedor adicionado");
				}
				break;
			case 2:
				if(VendedorController.removeVendedor()) {
					System.out.println("vendedor removido");
				}
				break;
			case 3:
				VendedorController.visualizaVendedor();
				break;
			case 4:
				if(VendedorController.atualizaVendedor()) {
					System.out.println("vendedor atualizado");
				}
				break;
			case 5:
				if(ProdutoController.addProduto()) {
					System.out.println("produto adicionado");
				}
				break;
			case 6:
				if(ProdutoController.removeProduto()) {
					System.out.println("produto removido");
				}
				break;
			case 7:
				ProdutoController.visualizaProduto();
				break;
			case 8:
				if(ProdutoController.atualizaProduto()) {
					System.out.println("produto atualizado");
				}
				break;
			case 9:
				if(VendaController.addVenda()) {
					System.out.println("venda adicionada");
				}
				break;
			case 10:
				if(VendaController.removeVenda()) {
					System.out.println("venda removida");
				}
				break;
			case 11:
				if(VendaController.atualizaVenda()) {
					System.out.println("venda atualizada");
				}
				break;
			case 12:
				VendaController.visualizaVenda();
				break;
			default:
				System.out.printf("o valor %i é invalido", r);
				break;
			}
		}while (r != 13);
	}
}
